package Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

	private Integer matricula;
	private String nome;
	private String email;
	private String genero;
	private String telefone;
	private Date nascimento;
	
	private SimpleDateFormat df;
	
	public Aluno() {
		if (df == null) {
			df = new SimpleDateFormat("dd/MM/yyyy");
		}
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	@Override
	public String toString() {
		return "Aluno de Matricula: " + matricula + " | Nome: " + nome + " | Email: " + email + " | Genero: " + genero
				+ " | Telefone: " + telefone + " | Nascimento: " + df.format(nascimento) + ".";
	}
	
	
	
}
