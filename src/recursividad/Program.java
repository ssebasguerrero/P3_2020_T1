package recursividad;

public class Program {

	public static void main(String[] args) {
		
		// a. Dividir dos números 
		Division d = new Division();
		int division = d.division(60, 15);
		System.out.println("Reslutado de la division: " + division);
		
		// b. Potencia de un número
		Potencia p = new Potencia();
		int potencia = p.potencia(5, 2);
		System.out.println("Resultado de la potencia: " + potencia);
		
		// c. Factorial de un numero
		Factorial f = new Factorial();
		int factorial =  f.factorial(7);
		System.out.println("Resultado del factorial: " + factorial);
		
		// d. Suma de numeros en un arreglo
		SumaArr arrA = new SumaArr();
		int[] arrSum = new int[] {2, 5, 8, 4, 6};
		int suma = arrA.sumaArr(arrSum, 0);
		System.out.println("Resultado de la suma: " + suma);
		
		// e. Cantidad de numeros pares e impares
		CantNum n = new CantNum();
		int[] arrB = new int[] {2, 5, 7, 4, 8};
		int cantidadPar = n.cantidadPar(arrB, 0);
		int cantidadImpar = n.cantidadImpar(arrB, 0);
		System.out.println("Hay " + cantidadPar + " numero pares y " + cantidadImpar + " numeros impares");
	}

}
