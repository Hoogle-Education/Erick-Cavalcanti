
public class Program {
	
	public static void main(String[] args) {

		String nome = "Joao da Silva";
		double altura = 1.7, peso = 80.0;		
		String cpf = "171.225.307-79";

		double imc = peso / (altura * altura);
		
		System.out.println("Nome = " + nome);
		System.out.println("Altura = " + altura);
		System.out.println("IMC = " + imc);
		System.out.println("CPF = " + cpf);
		
	}
	
}