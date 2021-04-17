package com.james.arkroutine.model.entity.chaosdungeon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaosDungeonsRepository extends JpaRepository<ChaosDungeons, Long> {
}
