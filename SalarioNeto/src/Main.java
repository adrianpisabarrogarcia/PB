import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		int salarioBase, antiguedad, salarioBruto, numeroQuinquenios, numeroAnyos, pagoQuinquenios, pagoAnyos;
		double salarioNeto;

		// Constantes
		final int COMPLEMENTO_QUINQUENIO = 60, COMPLEMENTO_ANUAL = 6;
		final double IMPUESTOS = 0.2, SEGURO_MEDICO = 0.05;

		// Para que pueda leer datos
		Scanner entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.println("Introduce el salario base del trabajador: ");
		salarioBase = entrada.nextInt();
		System.out.println("Introduce la antiguedad del trabajador en años: ");
		antiguedad = entrada.nextInt();

		// Cálculo de salario bruto

		// Valores que añaden
		numeroQuinquenios = antiguedad / 5;
		pagoQuinquenios = numeroQuinquenios * COMPLEMENTO_QUINQUENIO;
		numeroAnyos = numeroQuinquenios + 1;
		pagoAnyos = numeroAnyos * COMPLEMENTO_ANUAL;
		// Imprimir por pantalla los datos obtenidos
		System.out.println("");
		System.out.println("EL ingreso por los años quinquenios es de: " + pagoQuinquenios + "€");
		System.out.println("El ingreso por cada año del tramo es de: " + pagoAnyos + "€");

		// Hasta aquí el salario bruto
		salarioBruto = salarioBase + pagoQuinquenios + pagoAnyos;
		System.out.println("");
		System.out.println("Suma de salario bruto: " + salarioBruto + "€");
		System.out.println("");

		// Valores que descuentan

		salarioNeto = salarioBruto - (salarioBruto * IMPUESTOS) - (salarioBruto * SEGURO_MEDICO);

		// Imprimir por pantalla el salarioNeto
		System.out.println("El salario Neto del trabajador es: " + salarioNeto + "€");

	}

}
