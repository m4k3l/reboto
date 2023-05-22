package server.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.exception.UserAlreadyExistsException;
import server.exception.UserNotFoundException;
import server.user.entity.AppUser;
import server.user.repo.AppUserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppUserService {

    private final AppUserRepository repository;

    public AppUser getUserByUsername(String username) throws UserNotFoundException {
        return repository.findAppUserByUsername(username).orElseThrow(() -> new UserNotFoundException());
    }

    public void addNewUser(AppUser user) throws UserAlreadyExistsException {
        Optional<AppUser> userOptional = repository.findAppUserByUsername(user.getUsername());
        if (userOptional.isPresent()) {
            throw new UserAlreadyExistsException();
        }
        repository.save(user);
    }

}
