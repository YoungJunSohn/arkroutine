package com.james.arkroutine.model.entity.expedition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpeditionsRepository extends JpaRepository<Expeditions, Long> {
}
