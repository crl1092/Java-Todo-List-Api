package com.example.todoapi.dtos;

import jakarta.validation.constraints.NotBlank;

public record TarefaRequestDTO(
        @NotBlank(message = "Toda tarefa tem que ter um titulo")
        String titulo,
        String descricao,
        boolean concluido
) {
}
