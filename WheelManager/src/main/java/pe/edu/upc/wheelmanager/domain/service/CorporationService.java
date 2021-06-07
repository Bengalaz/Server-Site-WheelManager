package pe.edu.upc.wheelmanager.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import pe.edu.upc.wheelmanager.domain.model.Corporation;
import org.springframework.data.domain.Pageable;

public interface CorporationService {
    Corporation createCorporation(Corporation corporation);
    Corporation updateCorporation(Long userId, Corporation corporationRequest);
    ResponseEntity<?> deleteCorporation(Long corporationId);
    Page<Corporation> getAllCorporations(Pageable pageable);
    Corporation getCorporationById(Long corporationId);
}
