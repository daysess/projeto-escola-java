package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classe_professor")
public class ClasseProfessor implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClasseProfessorPk id;

	public ClasseProfessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseProfessor(ClasseProfessorPk id) {
		super();
		this.id = id;
	}

	public ClasseProfessorPk getId() {
		return id;
	}

	public void setId(ClasseProfessorPk id) {
		this.id = id;
	}
	
	

}
