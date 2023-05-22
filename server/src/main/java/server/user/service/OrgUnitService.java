package server.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.user.entity.OrgUnit;
import server.user.repo.OrgUnitRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrgUnitService {

    private final OrgUnitRepository repository;

    public List<OrgUnit> getAllOrgUnits() {
        return repository.findAll();
    }
}
