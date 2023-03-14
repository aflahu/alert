package com.example.alert.controller;

import com.example.alert.service.GetAudiosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("audios/v1")
@RequiredArgsConstructor
public class AudioController {

    private final GetAudiosService getAudiosService;

    @GetMapping("/")
    public ResponseEntity getAudio() {
        try {
            return new ResponseEntity(getAudiosService.execute(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
