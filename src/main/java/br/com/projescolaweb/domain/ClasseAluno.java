package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classe_aluno")
public class ClasseAluno implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClasseAlunoPk id;

	public ClasseAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseAluno(ClasseAlunoPk id) {
		super();
		this.id = id;
	}

	public ClasseAlunoPk getId() {
		return id;
	}

	public void setId(ClasseAlunoPk id) {
		this.id = id;
	}
	
	

}
