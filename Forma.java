package entidades;

public class Forma {
	private double base;
	private double largura;
	private double altura;
	private String forma;

	public Forma(double base, double largura, double altura, String forma) {
		this.base = base;
		this.largura = largura;
		this.altura = altura;
		this.forma = forma;

	} 

	public double calcularAreaT() {
		return base * altura;
	}
	
	public String mostrarInfoT() {
		return "Base :" + base + ", Altura: " + altura;
	}
	
	public double calcularAreaR() {
		return largura * altura;
	}
	
	public String mostrarInfoR() {
		return "Largura: " +  largura + ", Altura: " + altura;
	}

}
