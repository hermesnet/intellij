package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.dominio.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
