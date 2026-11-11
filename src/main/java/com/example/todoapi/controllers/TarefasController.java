package com.example.todoapi.controllers;

import com.example.todoapi.dtos.TarefaRequestDTO;
import com.example.todoapi.dtos.TarefaResponseDTO;
import com.example.todoapi.entities.Tarefa;
import com.example.todoapi.repositories.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping
    public ResponseEntity<TarefaResponseDTO> save(@RequestBody @Valid TarefaRequestDTO dados, UriComponentsBuilder uriBuilder) {
        Tarefa novaTarefa = tarefaRepository.save(new Tarefa(dados));

        var uri = uriBuilder.path("/tarefas/{id}").buildAndExpand(novaTarefa.getId()).toUri();
        return ResponseEntity.created(uri).body(new TarefaResponseDTO(novaTarefa));
    }

    @GetMapping
    public ResponseEntity<List<TarefaResponseDTO>> findAll() {
        List<TarefaResponseDTO> lista = tarefaRepository.findAll().stream().map(TarefaResponseDTO::new).toList();
        return ResponseEntity.ok(lista);
    }


    @PutMapping("{id}")
    public ResponseEntity<TarefaResponseDTO> atualizar(@PathVariable Long id, @RequestBody @Valid TarefaRequestDTO dadosAtualizados) {
        return tarefaRepository.findById(id).map(tarefa -> {
            tarefa.setTitulo(dadosAtualizados.titulo());
            tarefa.setDescricao(dadosAtualizados.descricao());
            tarefa.setConcluido(dadosAtualizados.concluido());
            Tarefa atualizado = tarefaRepository.save(tarefa);
            return ResponseEntity.ok(new  TarefaResponseDTO(atualizado));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> Delete(@PathVariable Long id) {
        if (!tarefaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        tarefaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
