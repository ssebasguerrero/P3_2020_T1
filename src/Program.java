
public class Program {

	public static void main(String[] args) {
		
		Estudiante[] arrEst = new Estudiante[5];
		
		arrEst[0] = new Estudiante("Pipe", 2000);
		arrEst[1] = new Estudiante("Luis", 5000);
		arrEst[2] = new Estudiante("Daniel", 3500);
		arrEst[3] = new Estudiante("Juan", 7500);
		arrEst[4] = new Estudiante("Karen", 500);
		
		int resultado = 0;
		for (int i = 0; i < arrEst.length; i++) {
			Estudiante e = new Estudiante(arrEst[i].nombre, arrEst[i].pagos);
			resultado = e.getDiffAvg(arrEst[i].pagos, arrEst.length);
		}
			
		System.out.println(arrEst[0].nombre);
		System.out.println("La diferencia entre el promedio y el estudiante con mayor pago es: " + resultado);
	}
}
