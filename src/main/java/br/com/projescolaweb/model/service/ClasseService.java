package br.com.projescolaweb.model.service;

import java.util.List;
import java.util.Optional;

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

	public void salvar(Classe classe) {
		this.classeDao.save(classe);		
	}

	public boolean editar(Classe classe) {
		if (classe.getId() != null) {
			this.classeDao.save(classe);
			return true;
		}else {
			return false;
		}
		
	}

	public Classe pesquisarPorId(Integer id) {
		Optional<Classe> optionalClasse = this.classeDao.findById(id);
		return optionalClasse.get();
	}

	public void excluir(Integer id) {
		this.classeDao.deleteById(id);		
	}

}
