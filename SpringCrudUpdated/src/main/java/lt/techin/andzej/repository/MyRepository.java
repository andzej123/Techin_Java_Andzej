package lt.techin.andzej.repository;

import lt.techin.andzej.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<User, Long> {
}
