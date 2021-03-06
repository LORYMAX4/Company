package it.plansoft.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.plansoft.company.model.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long>{

}