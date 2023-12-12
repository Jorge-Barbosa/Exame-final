package br.fepi.socialbooks.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Livro {	
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	private String corCamPrin;
	
	@JsonInclude(Include.NON_NULL)
	private String corCamSec;
	
	
	@JsonInclude(Include.NON_NULL)
	@Transient
	private List<Comentario> comentarios;
	
	public Livro () {
		
	}

	public Livro(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcorCamPrin() {
		return corCamPrin;
	}

	public void setcorCamPrin(String corCamPrin) {
		this.corCamPrin = corCamPrin;
	}

	public String getcorCamSec() {
		return corCamSec;
	}

	public void setcorCamSec(String corCamSec) {
		this.corCamSec = corCamSec;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
}
