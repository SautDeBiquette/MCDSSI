package ssii.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ssii.entity.Personne;

// This will be AUTO IMPLEMENTED by Spring

public interface ParticipationRepository extends JpaRepository<Personne, Integer> {

}