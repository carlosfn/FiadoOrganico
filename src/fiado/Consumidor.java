package fiado;

public class Consumidor {
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String telefone;

	public Consumidor(String nome, String telefone) {
		this.nome = nome;
		this.fiados = new int[10];
		this.telefone = telefone;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
