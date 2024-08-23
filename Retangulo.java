package entidades;

public class Retangulo extends Forma{

	public Retangulo(double base, double largura, double altura, String forma) {
		super(base, largura, altura, forma);
		
	}
	public double calcularArea(double largura, double altura) {
		return largura * altura;
		
	}

}
