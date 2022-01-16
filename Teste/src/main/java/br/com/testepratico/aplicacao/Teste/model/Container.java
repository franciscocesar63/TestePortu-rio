/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testepratico.aplicacao.Teste.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author franc
 */
@Entity
public class Container implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String numeroContainer; //4 letras e 7 numeros
    private String tipo; //20 / 40
    private String status; // cheio / vazio
    private String categoria; //   importacao / exportacao

    public Container(String cliente, String numeroContainer, String tipo, String status, String categoria) {
        this.cliente = cliente;
        this.numeroContainer = numeroContainer;
        this.tipo = tipo;
        this.status = status;
        this.categoria = categoria;
    }

    public Container() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroContainer() {
        return numeroContainer;
    }

    public void setNumeroContainer(String numeroContainer) {
        this.numeroContainer = numeroContainer;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Container{" + "id=" + id + ", cliente=" + cliente + ", numeroContainer=" + numeroContainer + ", tipo=" + tipo + ", status=" + status + ", categoria=" + categoria + '}';
    }

}
