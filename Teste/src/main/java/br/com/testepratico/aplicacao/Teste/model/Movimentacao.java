/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testepratico.aplicacao.Teste.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author franc
 */
@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // embarque, descarga, gate in, gate out, reposicionamento, pesagem, scanner

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHoraInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHoraFim;

    public Movimentacao(Long id, String tipo, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
        this.id = id;
        this.tipo = tipo;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public Movimentacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "id=" + id + ", tipo=" + tipo + ", dataHoraInicio=" + dataHoraInicio + ", dataHoraFim=" + dataHoraFim + '}';
    }

}
