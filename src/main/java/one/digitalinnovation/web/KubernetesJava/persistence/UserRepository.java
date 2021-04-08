package one.digitalinnovation.web.KubernetesJava.persistence;

import org.springframework.data.repository.CrudRepository;
import one.digitalinnovation.web.KubernetesJava.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {

}

