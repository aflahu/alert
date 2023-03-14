package com.example.alert.repository;

import com.example.alert.model.entity.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AudiosRepository extends JpaRepository<Audio, String> {

    public List<Audio> findAll();

}

