package br.com.projescolaweb.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projescolaweb.domain.Classe;

@Repository
public interface ClasseDao extends JpaRepository<Classe, Integer> {

}
