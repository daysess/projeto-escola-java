package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classe_materia")
public class ClasseMateria implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClasseMateriaPk id;

	public ClasseMateria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseMateria(ClasseMateriaPk id) {
		super();
		this.id = id;
	}

	public ClasseMateriaPk getId() {
		return id;
	}

	public void setId(ClasseMateriaPk id) {
		this.id = id;
	}
	
	
	
	
}
