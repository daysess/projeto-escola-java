package br.com.projescolaweb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projescolaweb.domain.Classe;
import br.com.projescolaweb.model.dao.ClasseDao;

@Service
public class ClasseService {
	
	@Autowired
	private ClasseDao classeDao;

	public List<Classe> listAll() {
		List<Classe> list = this.classeDao.findAll();
		return list;
	}

}
