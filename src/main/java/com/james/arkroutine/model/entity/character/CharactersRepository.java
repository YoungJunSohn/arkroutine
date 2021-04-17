package com.james.arkroutine.model.entity.character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactersRepository extends JpaRepository<Characters, Long> {
}
