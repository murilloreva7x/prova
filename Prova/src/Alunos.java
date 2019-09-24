

import java.util.ArrayList;

public class Alunos {
    private String nome;
    private ArrayList<Disciplinas> notas= new ArrayList<>();

    public Alunos(String nome){
        this.setNome(nome);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Disciplinas> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Disciplinas> notas) {
		this.notas = notas;
	}
}