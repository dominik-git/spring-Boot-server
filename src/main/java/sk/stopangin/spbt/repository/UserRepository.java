package sk.stopangin.spbt.repository;

import org.springframework.data.repository.CrudRepository;
import sk.stopangin.spbt.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
    User findById(Long id);
    User save(User user);
    Iterable<User> findAll();
}
