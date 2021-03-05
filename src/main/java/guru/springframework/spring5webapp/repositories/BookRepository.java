package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fhoenix on 2021/03/05.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
