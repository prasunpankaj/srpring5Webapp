package guru.springframework.srpring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.srpring5Webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
