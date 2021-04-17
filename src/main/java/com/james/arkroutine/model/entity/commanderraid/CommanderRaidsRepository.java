package com.james.arkroutine.model.entity.commanderraid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommanderRaidsRepository extends JpaRepository<CommanderRaids, Long> {
}
