package server.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.user.entity.OrgUnit;

@Repository
public interface OrgUnitRepository extends JpaRepository<OrgUnit, Long> {
}
