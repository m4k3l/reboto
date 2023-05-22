package server.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.user.entity.Role;
import server.user.repo.RoleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository repository;

    public List<Role> getAllRoles() {
        return repository.findAll();
    }
}
