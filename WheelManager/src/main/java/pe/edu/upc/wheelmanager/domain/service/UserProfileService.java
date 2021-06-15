package pe.edu.upc.wheelmanager.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import pe.edu.upc.wheelmanager.domain.model.UserProfile;

public interface UserProfileService {
    UserProfile createUserProfile(UserProfile userprofile);
    UserProfile updateUserProfile(Long userprofileId, UserProfile userRequest);
    ResponseEntity<?> deleteUserProfile(Long userprofileId);
    Page<UserProfile> getAllUsersProfile(Pageable pageable);
    UserProfile getUserProfileById(Long userprofileId);
}
