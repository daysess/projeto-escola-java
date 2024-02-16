package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ClasseProfessorPk implements Serializable{	
	private static final long serialVersionUID = 1L;

	@Column(name = "nr_cpf_professor")
	private String nrCpfProfessor;
	
	@ManyToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;

	public ClasseProfessorPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseProfessorPk(String nrCpfProfessor, Classe classe) {
		super();
		this.nrCpfProfessor = nrCpfProfessor;
		this.classe = classe;
	}

	public String getNrCpfProfessor() {
		return nrCpfProfessor;
	}

	public void setNrCpfProfessor(String nrCpfProfessor) {
		this.nrCpfProfessor = nrCpfProfessor;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
}
