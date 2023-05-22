package server.user.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.exception.UserAlreadyExistsException;
import server.exception.UserNotFoundException;
import server.user.rest.mapper.AppUserMapper;
import server.user.rest.resource.AppUserResource;
import server.user.service.AppUserService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class AppUserController {

    private final AppUserService service;
    private final AppUserMapper mapper;

    @GetMapping
    public AppUserResource getUser(Principal principal) throws UserNotFoundException {
        return mapper.map(service.getUserByUsername(principal.getName()));
    }

    @PostMapping
    public void addNewUser(@RequestBody AppUserResource resource) throws UserAlreadyExistsException {
        service.addNewUser(mapper.map(resource));
    }

}
