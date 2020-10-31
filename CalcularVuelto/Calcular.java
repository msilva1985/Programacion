import java.util.Scanner

public class Calcular{
	
	public static void main(String args[]){
		DarVuelto calculador= new DarVuelto();

		Scanner ingreso= new Scanner(System.in);
		System.out.println("Dinero Disponible: " );
		System.out.println("Dinero a Pagar: " );
		int disp=ingreso.nextInt();
		int pago=ingreso.nextInt();
		calculador.Vuelto(disp-pago);
		//donde disp-pago daria el monto de vuelto que tiene que dar



	}

}
