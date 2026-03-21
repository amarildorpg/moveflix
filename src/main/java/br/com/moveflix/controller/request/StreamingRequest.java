package br.com.moveflix.controller.request;

import br.com.moveflix.entity.Streaming;
import lombok.Builder;

@Builder
public record StreamingRequest(String name ) {
}
