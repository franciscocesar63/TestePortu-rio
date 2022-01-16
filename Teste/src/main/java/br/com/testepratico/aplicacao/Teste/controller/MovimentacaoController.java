/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testepratico.aplicacao.Teste.controller;

import br.com.testepratico.aplicacao.Teste.model.Movimentacao;
import br.com.testepratico.aplicacao.Teste.repository.MovimentacaoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @GetMapping("/movimentacoes")
    public List<Movimentacao> getMovimentacoes() {
        List<Movimentacao> lista = new ArrayList<>();

        movimentacaoRepository.findAll().forEach(c -> {
            lista.add(c);
        });

        return lista;
    }

    @PostMapping("/cadastrarMovimentacao/")
    public void newMovimentacao(@RequestBody Movimentacao json) {

        movimentacaoRepository.save(json);
    }

    @PutMapping("/editarMovimentacao/")
    public void putMovimentacao(@RequestBody Movimentacao json) {

        movimentacaoRepository.save(json);
    }

    @DeleteMapping("/deletarMovimentacao/{id}")
    public void deleteMovimentacao(@PathVariable Long id) {

        movimentacaoRepository.deleteById(id);

    }
}
