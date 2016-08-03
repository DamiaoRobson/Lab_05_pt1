package academia;

/* Lab Testes - Parte 1: Criação de testes de unidade */
public class Exercicio {
	private String nome;
	private int cph;
	
	public Exercicio(String nome, int cph) throws Exception{
		if(nome == null){
			throw new Exception("O nome do exercicio não pode ser null");
		}
		if(cph <= 0){
			throw new Exception("Calorias por hora do exercicio nao pode ser zero ou menor do que zero");
		}
		this.nome = nome;
		this.cph = cph;
	}

	public String getNome() {
		return nome;
	}
	
	public int getCph() {
		return cph;
	}
	
	public void setNome(String novo){
		nome = novo;
	}
	
	public void setCph(int novo)throws Exception{
		if(novo <= 0){
			throw new Exception("Calorias por hora do exercicio nao pode ser zero ou menor do que zero");
		}
		cph = novo;
	}
	
	public int calPerHoras(int horas) throws Exception{
		if(horas < 0){
			throw new Exception("O tempo passado nao pode ser negativo");
		}
		return cph * horas;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Exercicio)) {
			return false;
		}
		Exercicio e = (Exercicio) obj;
		return e.getNome().equals(getNome());
	}
	
	public String toString() {
		return getNome() + ": " + getCph() + " kcal/h";
	}
}