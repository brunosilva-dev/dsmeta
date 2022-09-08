package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

/**
 * 
 * @description Aqui será o componente responsável para acessar o banco de dados do sistema
 *
 */
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
