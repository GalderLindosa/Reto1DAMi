package enunciadosReto;
import java.util.Scanner;
public class EnunciadoExtra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int longitud, altura;
		System.out.println("Introduce un numero: ");
		altura=teclado.nextInt();
		for (int i = 0; i!=altura;i++) {
			longitud=altura;
			for(int j =longitud; j!=altura-(longitud-i);j--) {
				System.out.print(j-i);
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
