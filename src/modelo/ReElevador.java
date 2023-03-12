package modelo;

public class ReElevador {
	private String nome;
	private Boolean portaAberta;
	private int qtdPessoas;
	private int qtdMaxPessoas;
	private int andarAtual;
	private int numMaxAndares;
	private int numMaxSubsolo;
	private boolean luzAcesa;
	
	public ReElevador(String nome, int qtdMaxPessoas,
			int numMaxAndares, int numMaxSubsolo) {
		this.nome = nome;
		this.portaAberta = false;
		this.qtdPessoas = 0;
		this.qtdMaxPessoas = qtdMaxPessoas;
		this.andarAtual = 0;
		this.numMaxAndares = numMaxAndares;
		this.numMaxSubsolo = numMaxSubsolo;
		this.luzAcesa = false;
	}
	
	public void addPessoas(int numero) {
		if (!isPortaAberta()) {
			System.out.println("Abra a porta antes de adicionar.");
			return;
		}
		
		if ((getQtdPessoas()+numero)> getQtdMaxPessoas() ) {
			System.out.println("Não foi possível adicionar, o número ultrapassa a quantidade máxima");
			return;
		} else if (numero < 0 ) {
			System.out.println("Não foi possível adicionar, o número é negativo");
			return;
		}
		this.qtdPessoas += numero; 
		
		acenderLuz();
	}
	
	public void removerPessoas(int numero) {
		if (!isPortaAberta()) {
			System.out.println("Abra a porta antes de remover.");
			return;
		}
		if (numero < 0 ) {
			System.out.println("Não foi possível remover, o número é negativo");
			return;
		}
		if ((getQtdPessoas()-numero) < 0 ) {
			System.out.println("Não foi possível remover, o número ultrapassa a quantidade máxima de pessoas no elevador.");
			return;
		}
		this.qtdPessoas -= numero; 
		
		apagarLuz();	
	}
	
	public void abrirPorta() {
		portaAberta = true;
	}
	
	public void fecharPorta() {
		portaAberta = false;
	}

	// max = 8
	// subsolo = 2
	// andar = --3 > 2
	public void moverElevador(int andar) {
		if (isPortaAberta()) {
			System.out.println("Feche a porta antes de mover o elevador.");
			return;
		}
		if (andar > getNumMaxAndares()) {
			System.out.println("Andar inválido.");
			return;
		}
		
		if ((andar * -1) > getNumMaxSubsolo()) {
			System.out.println("Subsolo inválido.");
			return;
		}
		
		setAndarAtual(andar);
	}
	
	private void acenderLuz() {
		if (getQtdPessoas() > 0)
			setLuzAcesa(true);
	}
	
	private void apagarLuz() {
		if (getQtdPessoas() == 0)
			setLuzAcesa(false);
	}
	
	public void imprimir() {
		System.out.println("Elevador: "+ getNome());
		System.out.println("Andar Atual: "+ getAndarAtual());
		System.out.println("Qtd Pessoas: "+ getQtdPessoas());
		System.out.println("Porta Aberta: "+ isPortaAberta());
		System.out.println("Luz acesa: "+ isLuzAcesa());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPortaAberta() {
		return portaAberta;
	}

	public void setPortaAberta(boolean portaAberta) {
		this.portaAberta = portaAberta;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public int getQtdMaxPessoas() {
		return qtdMaxPessoas;
	}

	public void setQtdMaxPessoas(int qtdMaxPessoas) {
		this.qtdMaxPessoas = qtdMaxPessoas;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getNumMaxAndares() {
		return numMaxAndares;
	}

	public void setNumMaxAndares(int numMaxAndares) {
		this.numMaxAndares = numMaxAndares;
	}

	public int getNumMaxSubsolo() {
		return numMaxSubsolo;
	}

	public void setNumMaxSubsolo(int numMaxSubsolo) {
		this.numMaxSubsolo = numMaxSubsolo;
	}

	public boolean isLuzAcesa() {
		return luzAcesa;
	}

	public void setLuzAcesa(boolean luzAcesa) {
		this.luzAcesa = luzAcesa;
	}

}

