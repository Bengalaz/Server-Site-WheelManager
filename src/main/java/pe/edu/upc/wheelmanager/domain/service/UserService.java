package pe.edu.upc.wheelmanager.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import pe.edu.upc.wheelmanager.domain.model.User;
import org.springframework.data.domain.Pageable;


public interface UserService {
    User createUser(Long corporationId, Long userProfileId, User user);
    User updateUser(Long userId, User userRequest);
    ResponseEntity<?> deleteUser(Long userId);
    Page<User> getAllUsers(Pageable pageable);
    User getUserById(Long userId);
}
