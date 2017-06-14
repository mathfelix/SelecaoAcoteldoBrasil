package Controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import Entidade.Aluno;

@ManagedBean(name = "alunocad")
public class ControleAluno {

	private Aluno aluno;
	private String nascimento;
	
	public ControleAluno() {
		aluno = new Aluno();
	}
	
	public void cadastrar(){
		
		String msg = null;
		
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			aluno.setNascimento(df.parse(nascimento));
			msg = "Dados do Aluno: "+ aluno.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Erro: " +e.getMessage();
		}
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage("formCadastro", new FacesMessage(msg));
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
}
