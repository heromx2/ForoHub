package com.herox.forohubalura.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthenticationUserDTO(
        @NotBlank
        String login,
        @NotBlank
        String key) {
}
