package server.user.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.user.rest.mapper.OrgUnitMapper;
import server.user.rest.resource.OrgUnitResource;
import server.user.service.OrgUnitService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orgunits")
public class OrgUnitController {

    private final OrgUnitService service;
    private final OrgUnitMapper mapper;

    @GetMapping
    public List<OrgUnitResource> getAllOrgUnits() {
        return mapper.map(service.getAllOrgUnits());
    }
}
