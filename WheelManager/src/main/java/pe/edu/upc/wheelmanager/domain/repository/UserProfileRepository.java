package pe.edu.upc.wheelmanager.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wheelmanager.domain.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
