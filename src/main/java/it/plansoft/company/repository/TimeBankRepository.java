package it.plansoft.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.plansoft.company.model.TimeBank;

public interface TimeBankRepository extends JpaRepository<TimeBank, Long>{

}