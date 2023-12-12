package br.fepi.socialbooks.domain;

public class Comentario {
	
private Long id;
	
	private String nome;
	
	private String corCamPrin;
	
	private String corCamSec;
	
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

	public String getCorCamPrin() {
		return corCamPrin;
	}

	public void setCorCamPrin(String corCamPrin) {
		this.corCamPrin = corCamPrin;
	}

	public String getCorCamSec() {
		return corCamSec;
	}

	public void setCorCamSec(String corCamSec) {
		this.corCamSec = corCamSec;
	}
}
	

	