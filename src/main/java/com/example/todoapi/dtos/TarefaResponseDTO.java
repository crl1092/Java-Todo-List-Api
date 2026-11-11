package com.example.todoapi.dtos;

import com.example.todoapi.entities.Tarefa;

public record TarefaResponseDTO(
        Long id,
        String titulo,
        String descricao,
        Boolean concluido
) {
    public TarefaResponseDTO(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getConcluido());
    }
}
