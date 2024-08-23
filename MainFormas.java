package principal;
import java.util.*;
import entidades.Forma;
import entidades.Triangulo;
import entidades.Retangulo;

public class MainFormas {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Qual forma quer calcular? \n1 - Para Retangulo \n2 - Para Triangulo");
		int opcao = x.nextInt();
		
		if(opcao == 1) {
			System.out.println("Insira o valor da largura: ");
			double largura = x.nextDouble();
			System.out.println("Insira a altura: ");
			double altura = x.nextDouble();
			Retangulo r = new Retangulo(altura, largura, 0, null);
			Forma a = new Forma(0, largura, altura, null);
			
			System.out.println("Área: " + a.calcularAreaR() + "Info: " + a.mostrarInfoR());
		}
		else if(opcao == 2) {
			System.out.println("Ensira o valor da base: ");
			double base = x.nextDouble();
			System.out.println("Ensira o valor da altura: ");
			double altura = x.nextDouble();
			Triangulo t = new Triangulo(base, altura, 0, null);
			Forma a = new Forma(altura, 0, base, null);
			System.out.println("Área: " + a.calcularAreaT() + "\nInfo - " + a.mostrarInfoT());
		}
		
		

	}
}
