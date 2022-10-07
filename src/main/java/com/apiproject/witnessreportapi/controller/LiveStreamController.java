package com.apiproject.witnessreportapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {
    LiveStreamRepository repository;

    public LiveStreamController(){
        repository new LiveStreamRepository();
    }
    @GetMapping
    public List<LiveStream> findAll(){
        return null;
    }
}
