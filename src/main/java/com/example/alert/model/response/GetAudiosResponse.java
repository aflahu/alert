package com.example.alert.model.response;

import com.example.alert.model.entity.Audio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAudiosResponse {
    private List<Audio> data;
}
