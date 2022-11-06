package pattern.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Automovel {
	
	public static enum Modelo {
		Astra,
		Golf,
		Lancer,
		Gol,
		Eclipse
	}
	
	String nome;
	String ano;
	String marca;
	String cor;
	List<String> adicionais = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void produzindo() {
		System.out.println("Produzindo as peças do " + nome);
	}

	public void montar() {
		System.out.println("Montando seu " + nome);
	}

	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("**************************************\n");
		detalhes.append("Seu novo automóvel está pronto!\n");
		detalhes.append("**************************************\n");
		detalhes.append("Classe: " + this.getClass().getCanonicalName() +  "\n");
		detalhes.append(nome  + "\n");
		detalhes.append(ano + "\n");
		detalhes.append(cor + "\n");
		for (String adiconal : adicionais) {
			detalhes.append(adiconal + "\n");
		}
		return detalhes.toString();
	}
}