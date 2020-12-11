package com.crud.spring.datajpa.repository;

import com.crud.spring.datajpa.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Long> {
	List<Position> findByNameContaining(String name);
}
