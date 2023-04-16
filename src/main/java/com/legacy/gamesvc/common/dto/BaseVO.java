package com.legacy.gamesvc.common.dto;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BaseVO {
    private LocalDateTime dataInputDttm = LocalDateTime.now();
    private LocalDateTime dataUpdateDttm = LocalDateTime.now();
}
