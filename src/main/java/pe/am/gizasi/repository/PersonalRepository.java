package pe.am.gizasi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.am.gizasi.model.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {

}
