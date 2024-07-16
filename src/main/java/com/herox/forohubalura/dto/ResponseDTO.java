package com.herox.forohubalura.dto;

import java.time.LocalDateTime;

public record ResponseDTO(
        String responseTitle,
        String body,
        String author,
        LocalDateTime creationDate
) {


}