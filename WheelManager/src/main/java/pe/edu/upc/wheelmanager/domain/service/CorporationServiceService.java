package pe.edu.upc.wheelmanager.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import pe.edu.upc.wheelmanager.domain.model.CorporationService;
import org.springframework.data.domain.Pageable;

public interface CorporationServiceService {
    CorporationService createCorporationService(Long corporationId, CorporationService corporationService);
    CorporationService updateCorporationService(Long corporationServiceId, CorporationService corporationServiceRequest);
    ResponseEntity<?> deleteCorporationService(Long corporationServiceId);
    Page<CorporationService> getAllCorporationServices(Pageable pageable);
    CorporationService getCorporationServiceById(Long corporationServiceId);
}

