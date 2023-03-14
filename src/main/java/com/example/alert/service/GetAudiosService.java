package com.example.alert.service;

import com.example.alert.model.response.GetAudiosResponse;
import com.example.alert.repository.AudiosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAudiosService {
    @Autowired
    private AudiosRepository audiosRepository;

    public GetAudiosResponse execute() {

        return GetAudiosResponse.builder()
                .data(audiosRepository.findAll(Sort.by(Sort.Order.desc("id"))))
                .build();
    }
}
