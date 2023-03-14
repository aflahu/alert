package com.example.alert.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "audios")
public class Audio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "detected_at")
    private Timestamp detectedAt;

    @Column(name = "machine")
    private String machine;

    @Column(name = "anomaly")
    private String anomaly;

    @Column(name = "sensor")
    private String sensor;

    @Column(name = "file_name")
    private String fileName;

}
