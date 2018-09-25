import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		//Variables
		int salarioBase, antiguedad, salarioBruto, numeroQuinquenios, numeroAnyos, pagoQuinquenios
		,pagoAnyos;
		double salarioNeto, descuentos;
		
		//Constantes
		final int COMPLEMENTO_QUINQUENIO=60,  COMPLEMENTO_ANUAL=6;
		
		//Para que pueda leer datos
		Scanner entrada = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Introduce el salario base del trabajador: ");
		salarioBase = entrada.nextInt();
		System.out.println("Introduce la anriguedad del trabajador en años: ");
		antiguedad = entrada.nextInt();
		
		//Cálculo de salario bruto
		
		
		//Imprimir por pantalla el salarioNeto
		System.out.println("El salario Neto del trabajador es: "`+salarioNeto);

		
	}

}
