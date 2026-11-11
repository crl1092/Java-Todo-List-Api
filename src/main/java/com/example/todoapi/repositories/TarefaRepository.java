package com.example.todoapi.repositories;

import com.example.todoapi.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
}
