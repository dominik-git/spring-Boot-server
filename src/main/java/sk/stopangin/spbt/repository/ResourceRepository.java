package sk.stopangin.spbt.repository;

import org.springframework.data.repository.CrudRepository;
import sk.stopangin.spbt.model.Resource;
import sk.stopangin.spbt.model.User;


public interface ResourceRepository extends CrudRepository<Resource, Long> {
    Resource findById(Long id);
    Resource save(Resource resource);
    Iterable<Resource> findAll();
}
