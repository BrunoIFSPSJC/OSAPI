/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.etl.kge.OSApiApplication.domain.repository;

import br.etl.kge.OSApiApplication.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author devsys-a
 */
@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    
    
}
