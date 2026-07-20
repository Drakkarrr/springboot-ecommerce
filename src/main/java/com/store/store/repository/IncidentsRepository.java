package com.store.store.repository;

import com.store.store.entity.IncidentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentsRepository extends JpaRepository<IncidentsEntity, Long> {
}
