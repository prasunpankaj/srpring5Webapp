package guru.springframework.srpring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.srpring5Webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
