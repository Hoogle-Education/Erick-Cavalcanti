
public class Program {

	public static void main(String[] args) {

		double nota = 7.5;
		
		if ( nota >= 7.0 ) {
			System.out.println("Aprovado");
		} else {
			
			if ( nota >= 4.0 ) {
				System.out.println("Recupera��o");
			} else {
				System.out.println("Reprovado");
			}
		}
		
		if ( nota >= 7.0 ) {
			System.out.println("Aprovado");
		} else if ( nota >= 4.0 ) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Reprovado");
		}		
		
	}

}
