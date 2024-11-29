package enunciadosReto;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num1, num2, res, elev = 1, mcm, factorial1=1, factorial2=1;
		String salir="si";
		do {
			System.out.println("----MENU--------------------------");
			System.out.print("Introducir número 1: ");
			num1 = teclado.nextDouble();
			System.out.print("Introducir número 2: ");
			num2 = teclado.nextDouble();
			while (num1 < 0 || num2 < 0) {
				System.out.println("El numero debe ser como minimo 0, vuelva a introducir un numero");
				System.out.print("Introducir número 1: ");
				num1 = teclado.nextDouble();
				System.out.print("Introducir número 2: ");
				num2 = teclado.nextDouble();
			}
			System.out.println("a) MCD");
			System.out.println("b) MCM");
			System.out.println("c) Factorial de ambos");
			System.out.println("d) División");
			System.out.println("e) Elevar el primer nº al segundo sin usar la librería Math");
			System.out.println("f) Salir");
			char menu = teclado.next().charAt(0);
			switch (menu) {
			case 'a': 
				while (num1!=num2) {
					if (num1>num2) {
						num1= num1-num2;
					}
					else {
						num2 = num2-num1;
					}
				}
				System.out.println(num1);
				System.out.println("Desea salir del programa? ");
				salir = teclado.next();
				break;




			case 'b': 
				if (num1%num2==0 || num2%num1==0) {
					if (num1>num2) {
						mcm = num1;
					}
					else {
						mcm = num2;
					}
				}
				else {
					mcm =num1*num2;
					if (mcm%2==0) {
						if ((mcm/2)%num1==0 && (mcm/2)%num2==0){
							mcm=mcm/2;
							System.out.println(mcm);
						}
						else {
							System.out.println(mcm);
						}
					}
					else {
						System.out.println(mcm);
					}
				}
				System.out.println("Desea salir del programa? ");
				salir = teclado.next();
				break;





			case 'c': 
				for (int i = 1; i <= num1; i++) {
					factorial1 = factorial1 * i;
				}
				System.out.println("El factorial del primer numero es: " +factorial1);
				for (int i = 1; i <= num2; i++) {
					factorial2 = factorial2 * i;
				}
				System.out.println("El factorial del segundo numero es: " +factorial2);
				System.out.println("Desea salir del programa? ");
				salir = teclado.next();
				break;







			case 'd': 
				if (num1 >0 && num2>0) {
					System.out.println("El resultado de la division el: "+(num1/num2));
				}
				else {
					System.out.println("No se puede dividir por 0.");
				}
				System.out.println("Desea salir del programa? ");
				salir = teclado.next();
				break;









			case 'e': 
				for(int i =1 ; i <= num2; i++) {

					elev = elev*num1;
				}
				System.out.println("El resultado de elevar el primer numero al segundo es: "+elev);
				System.out.println("Desea salir del programa? ");
				salir = teclado.next();
				break;








			case 'f': 
				System.out.println("Hasta la proxima!");
				break;

			default : System.out.println("opcion no valida");
			System.out.println("Desea salir del programa? ");
			salir = teclado.next();
			}
			
		} while (salir.equals("no"));






		
		teclado.close();
	}

}
