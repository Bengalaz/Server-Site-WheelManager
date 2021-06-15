package pe.edu.upc.wheelmanager.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wheelmanager.domain.model.CorporationService;

@Repository
public interface CorporationServiceRepository extends JpaRepository<CorporationService,Long>{
}
