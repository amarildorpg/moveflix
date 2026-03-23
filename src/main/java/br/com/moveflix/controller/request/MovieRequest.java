package br.com.moveflix.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(@Schema(type = "String", description = "Nome do filme")
                           @NotEmpty(message = "Nome do filme é obrigatório")
                           String title,
                           @Schema(type = "String", description = "Descrição do Filme")
                           String description,
                           @JsonFormat(shape =  JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
                           @Schema(type = "date", description = "Data do lançamento do filme. EX: '19/10/1998'")
                           LocalDate releaseDate,
                           @Schema(type = "double", description = "Score do Filme")
                           double rating,
                           @Schema(type = "array", description = "Lista de códigos de categoria")
                           List<Long> categories,
                           @Schema(type = "array", description = "Lista de códigos de Streamings")
                           List<Long> streamings) {
}
