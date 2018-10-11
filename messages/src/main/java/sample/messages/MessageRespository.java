package sample.messages;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Rob Winch
 */
@RepositoryRestResource
public interface MessageRespository extends PagingAndSortingRepository<Message, Long> {

	@Override
	@Query("select m from Message as m, Permission as p where m.id = p.messageId and p.email = ?#{principal?.claims['email']}")
	Page<Message> findAll(Pageable pageable);
}
