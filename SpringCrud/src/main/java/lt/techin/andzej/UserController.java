package lt.techin.andzej;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) throws UserNotFoundException {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserCreationDTO userCreationDTO) {
        System.out.println(userCreationDTO);
        User user = new User(counter.incrementAndGet(), userCreationDTO.getUsername(), userCreationDTO.getFirstName(), userCreationDTO.getLastName(), userCreationDTO.getEmail());
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        System.out.println("Deleting user with Id: " + id);
        users.removeIf(user -> user.getId() == id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) throws UserNotFoundException {
        User updatedUser = users.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
        updatedUser.setUsername(user.getUsername());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        return updatedUser;
    }

}
