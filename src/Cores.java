
public enum Cores {
	Branco("Branco", 21),
	Preto("Preto", 22),
	Vermelho("Vermelho", 23),
	Amarelo("Vermelho", 24),
	Azul("Azul", 25);
	
	private String nomeCor;
	private int codCor;
	
	Cores(String nomeCor, int codCor){
		this.nomeCor = nomeCor;
		this.codCor = codCor;
	}
	
	public String getNomeCor(){
		return this.nomeCor;
	}
	
	public int getCodCor(){
		return this.codCor;
	}
}
