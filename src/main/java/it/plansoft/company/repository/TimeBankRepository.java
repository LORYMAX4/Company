package it.plansoft.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.plansoft.company.model.TimeBank;

@Repository
public interface TimeBankRepository extends JpaRepository<TimeBank, Long>{

	public TimeBank findByIdEmployee(Long id);
}