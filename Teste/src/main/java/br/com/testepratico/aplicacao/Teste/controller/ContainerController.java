/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testepratico.aplicacao.Teste.controller;

import br.com.testepratico.aplicacao.Teste.model.Container;
import br.com.testepratico.aplicacao.Teste.repository.ContainerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author franc
 */
@RestController

public class ContainerController {

    @Autowired
    private ContainerRepository containerRepository;

    @GetMapping("/containers")
    public List<Container> getContainers() {
        List<Container> lista = new ArrayList<>();

        containerRepository.findAll().forEach(c -> {
            lista.add(c);
        });

        return lista;
    }

    @CrossOrigin("http://localhost:8080")
    @PostMapping("/cadastrarContainer/")
    public void newContainer(@RequestBody Container json) {

        containerRepository.save(json);
    }

    @PutMapping("/editarContainer/")
    public void putContainer(@RequestBody Container json) {

        containerRepository.save(json);
    }

    @DeleteMapping("/deletarContainer/{id}")
    public void deleteContainer(@PathVariable Long id) {

        containerRepository.deleteById(id);

    }
}
