
public class Estudiante {
	
	String nombre;
	int pagos;
	
	public Estudiante(String Nombre, int Pagos) {
		String nombre = Nombre;
		int pagos = Pagos;
	}
	
	
	int getDiffAvg (int pago, int limite)
	{
		int[] pagos =  new int[limite];
		int cont = 0;
		pagos[cont] = pago;
		cont++;
		
		// Promedio
		int suma = 0;
		int promedio = 0;
		for (int i = 0; i < pagos.length; i++) {
			suma += pagos[i];
		}
		promedio = suma / pagos.length;
		
		// Pago mayor
		int mayor = 0;
		for (int i = 0; i < pagos.length; i++) {
			if (mayor > pagos[i]) {
				mayor = pagos[i];
			}
		}
		
		// Diferencia entre pago mayor y promedio
		int diferencia = 0;
		if (mayor > promedio) {
			diferencia = mayor - promedio;
		}
		else {
			diferencia = promedio - mayor;
		}
		
		return diferencia;
	}
	
	
}
