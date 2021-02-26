package it.plansoft.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.plansoft.company.model.Level;

public interface LevelRepository extends JpaRepository<Level, Long>{

}