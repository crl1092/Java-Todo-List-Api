package com.example.todoapi.entities;

import com.example.todoapi.dtos.TarefaRequestDTO;
import jakarta.persistence.*;

@Entity
@Table(name="tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String titulo;
    private String descricao;
    private Boolean concluido;

    public Tarefa() {

    }

    public Long getId() {
        return id;
    }

    public Tarefa(TarefaRequestDTO dados) {
        this.setTitulo(dados.titulo());
        this.setDescricao(dados.descricao());
        this.setConcluido(false);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
