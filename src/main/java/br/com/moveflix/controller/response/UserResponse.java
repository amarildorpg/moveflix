package br.com.moveflix.controller.response;

import lombok.Builder;

@Builder
public record UserResponse(Long id, String nome, String email){

}
