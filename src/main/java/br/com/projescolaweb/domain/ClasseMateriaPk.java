package br.com.projescolaweb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ClasseMateriaPk  implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_materia")
	private Integer idMateria;
	
	@ManyToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;

	public ClasseMateriaPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseMateriaPk(Integer idMateria, Classe classe) {
		super();
		this.idMateria = idMateria;
		this.classe = classe;
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	

}
