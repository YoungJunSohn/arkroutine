package com.james.arkroutine.model.entity.abyssraid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbyssRaidsRepository extends JpaRepository<AbyssRaids, Long> {
}
