
public class Calculo {
	
	int promedio (Estudiante[] e) {
		
		int promedio = 0;
		for (int i = 0; i < e.length; i++) {
			promedio += e[i].pagos;
		}
		
		return promedio /= e.length;
	}
	
	int mayor (Estudiante[] e) {
		
		int mayor = 0;
		for (int i = 0; i < e.length; i++) {
			if (mayor < e[i].pagos) {
				mayor = e[i].pagos;
			}
		}
		
		return mayor;
	}
	
	int getDiffAvg (int promedio, int mayor) {
		int diferencia = mayor - promedio;
		return diferencia;
	}

}
