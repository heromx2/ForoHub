package com.herox.forohubalura.dto;

import java.time.LocalDateTime;

public record TopicDTO(Long id,
                       String title,
                       String body,
                       String courseName,
                       String author,
                       LocalDateTime creationDate,
                       String estado ) {

}
