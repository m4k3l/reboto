package server.user.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.user.rest.mapper.RoleMapper;
import server.user.rest.resource.RoleResource;
import server.user.service.RoleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
public class RoleController {

    private final RoleService service;
    private final RoleMapper mapper;

    @GetMapping
    public List<RoleResource> getAllRoles() {
        return mapper.map(service.getAllRoles());
    }
}
