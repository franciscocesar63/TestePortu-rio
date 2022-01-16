/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testepratico.aplicacao.Teste.repository;

import br.com.testepratico.aplicacao.Teste.model.Container;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author franc
 */
@Repository
public interface ContainerRepository extends CrudRepository<Container, Long> {

}
