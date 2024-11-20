package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Emprunt;


@Repository
public interface IEmprunt extends JpaRepository<Emprunt, Long> {

	@Query("SELECT e FROM Emprunt e WHERE e.livre.id = 1")
	    List<Emprunt> findAllEmpruntById(Long id);
	
	@Query("SELECT e FROM Emprunt e WHERE e.livre.id = 1")
	    List<Emprunt> findAllEmpruntByIdahdreants(Long id);
	 
}
