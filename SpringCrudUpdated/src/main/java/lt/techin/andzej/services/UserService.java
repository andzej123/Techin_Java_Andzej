package lt.techin.andzej.services;

import lt.techin.andzej.UserNotFoundException;
import lt.techin.andzej.model.User;
import lt.techin.andzej.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    MyRepository myRepository;

    @Autowired
    public UserService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<User> getAllUsers() {
        return myRepository.findAll();
    }

    public User getById(Long id) throws UserNotFoundException {
        return myRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User saveUser(User user) {
        myRepository.save(user);
        return user;
    }

    public void deleteUser(Long id) {
        myRepository.deleteById(id);
    }

    public User updateUser(Long id, UserCreationDTO user) throws UserNotFoundException {
        User newUser = myRepository.findById(id).orElseThrow(UserNotFoundException::new);
        newUser.setUsername(user.getUsername());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        myRepository.save(newUser);
        return newUser;


    }
}
