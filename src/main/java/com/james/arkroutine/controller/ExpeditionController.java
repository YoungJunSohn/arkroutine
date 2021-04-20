package com.james.arkroutine.controller;

import com.james.arkroutine.model.entity.expedition.Expeditions;
import com.james.arkroutine.service.ExpeditionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/expedition")
public class ExpeditionController {

    private final ExpeditionsService expeditionsService;

    @PostMapping("")
    public void create(@RequestBody Expeditions expedition){
        expeditionsService.create(expedition);
    }

    @GetMapping("/{id}")
    public void read(@RequestParam Long id){

    }

    @PutMapping("")
    public void update(@RequestBody Expeditions expedition){


    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam Long id){

    }
}
