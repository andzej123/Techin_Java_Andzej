package lt.techin.andzej.controller;

import lt.techin.andzej.model.User;
import lt.techin.andzej.services.UserCreationDTO;
import lt.techin.andzej.UserNotFoundException;
import lt.techin.andzej.repository.MyRepository;
import lt.techin.andzej.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/users")
public class UserController {


    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) throws UserNotFoundException {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserCreationDTO userCreationDTO) {
        User user = new User();
        user.setUsername(userCreationDTO.getUsername());
        user.setFirstName(userCreationDTO.getFirstName());
        user.setLastName(userCreationDTO.getLastName());
        user.setEmail(userCreationDTO.getEmail());
        userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody UserCreationDTO user) throws UserNotFoundException {
        return userService.updateUser(id, user);
    }

}
