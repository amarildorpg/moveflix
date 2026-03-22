package br.com.moveflix.config;

import lombok.Builder;

@Builder
public record JWTUserData(Long id, String nome, String email) {
}
