package pe.edu.upc.wheelmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pe.edu.upc.wheelmanager.domain.model.User;
import pe.edu.upc.wheelmanager.domain.repository.CorporationRepository;
import pe.edu.upc.wheelmanager.domain.repository.UserProfileRepository;
import pe.edu.upc.wheelmanager.domain.repository.UserRepository;
import pe.edu.upc.wheelmanager.domain.service.UserService;
import org.springframework.data.domain.Pageable;
import pe.edu.upc.wheelmanager.exception.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CorporationRepository corporationRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;


    @Override
    public User createUser(Long corporationId, Long userProfileId,User user) {
        return corporationRepository.findById(corporationId).map(corporation -> {
            user.setCorporation(corporation);
            return userProfileRepository.findById(userProfileId).map(userProfile -> {
                user.setUserProfile(userProfile);
                return userRepository.save(user);
            }).orElseThrow(()->new ResourceNotFoundException("UserProfile","Id",userProfileId));
        }).orElseThrow(()->new ResourceNotFoundException("Corporation","Id",corporationId));
    }

    @Override
    public User updateUser(Long userId, User userRequest) {
        return userRepository.findById(userId).map(user-> {
            user.setUsername(userRequest.getUsername());
            user.setPassword(userRequest.getPassword());
            user.setEmail(userRequest.getEmail());
            user.setBusinessman(userRequest.getIsbusinessman());
            return userRepository.save(user);
        }).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
    }



    @Override
    public ResponseEntity<?> deleteUser(Long userId) {
        return userRepository.findById(userId).map(comment-> {
            userRepository.delete(comment);
            return ResponseEntity.ok().build();
        }).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
    }

    @Override
    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
    }
}
