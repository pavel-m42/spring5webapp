package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fhoenix on 2021/03/05.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
