package sample.messages;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Rob Winch
 */
@RepositoryRestResource
public interface PermissionRepository extends PagingAndSortingRepository<Permission, Long> {
}
