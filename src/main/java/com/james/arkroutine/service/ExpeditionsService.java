package com.james.arkroutine.service;

import com.james.arkroutine.model.entity.expedition.Expeditions;
import com.james.arkroutine.model.entity.expedition.ExpeditionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExpeditionsService {
    private final ExpeditionsRepository expeditionsRepository;

    public void create(Expeditions expeditions){

        expeditionsRepository.save(expeditions);
    }
}
