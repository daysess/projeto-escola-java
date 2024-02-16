package br.com.projescolaweb.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classe")
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String serie;
	
	@Column(name = "ano_letivo")
	private String anoLetivo;
	
	@OneToMany(mappedBy = "id.classe")
	private List<ClasseProfessor> professores = new ArrayList<>();
	
	@OneToMany(mappedBy = "id.classe")
	private List<ClasseAluno> alunos = new ArrayList<>();
	
	@OneToMany(mappedBy = "id.classe")
	private List<ClasseMateria> materias = new ArrayList<>();
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classe(Integer id, String nome, String serie, String anoLetivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.serie = serie;
		this.anoLetivo = anoLetivo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getAnoLetivo() {
		return anoLetivo;
	}

	public void setAnoLetivo(String anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	
	

	public List<ClasseProfessor> getProfessores() {
		return professores;
	}

	public List<ClasseAluno> getAlunos() {
		return alunos;
	}

	public List<ClasseMateria> getMaterias() {
		return materias;
	}

	@Override
	public String toString() {
		String stringProfessores = "";
		String stringAlunos = "";
		String stringMaterias = "";
		for (ClasseProfessor p : professores) {
			stringProfessores += "[nrCpfProfessor="+ p.getId().getNrCpfProfessor() +"] ";
		}
		
		for (ClasseAluno a : alunos) {
			stringAlunos += "[idAluno="+a.getId().getIdAluno()+"] ";
		}
		
		for (ClasseMateria m : materias) {
			stringMaterias += "[matérias="+m.getId().getIdMateria()+"] ";
		}
		return "CLASSE [id=" + id + ", nome=" + nome + ", serie=" + serie + ", anoLetivo=" + anoLetivo
				+ ", professores=" + stringProfessores + ", alunos=" + stringAlunos + ", matérias="+ stringMaterias + "]";
	}

	
	
}
