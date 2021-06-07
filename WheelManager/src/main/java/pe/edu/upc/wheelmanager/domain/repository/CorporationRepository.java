package pe.edu.upc.wheelmanager.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wheelmanager.domain.model.Corporation;

@Repository
public interface CorporationRepository extends JpaRepository<Corporation,Long>{

}
