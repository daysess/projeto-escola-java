package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ClasseAlunoPk implements Serializable{	
	private static final long serialVersionUID = 1L;

	@Column(name = "id_aluno")
	private Integer idAluno;
	
	@ManyToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;

	public ClasseAlunoPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseAlunoPk(Integer idAluno, Classe classe) {
		super();
		this.idAluno = idAluno;
		this.classe = classe;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
}
