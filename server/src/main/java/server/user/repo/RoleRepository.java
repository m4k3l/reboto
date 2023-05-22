package server.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.user.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
