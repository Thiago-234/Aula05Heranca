package entidades;

public class Triangulo extends Forma {

	public Triangulo(double base, double largura, double altura, String forma) {
		super(base, largura, altura, forma);
		
	}
	public double calcularArea(double altura, double base) {
		return base * altura;
	}


}
