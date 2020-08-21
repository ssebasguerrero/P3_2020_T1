
public class Program {

	public static void main(String[] args) {
		
		Estudiante[] arrEst = new Estudiante[5];
		Calculo cal = new Calculo();
		
		arrEst[0] = new Estudiante();
		arrEst[0].nombre = "Pipe";
		arrEst[0].pagos = 2000;
		
		arrEst[1] = new Estudiante();
		arrEst[1].nombre = "Luis";
		arrEst[1].pagos = 5000;
		
		arrEst[2] = new Estudiante();
		arrEst[2].nombre ="Daniel";
		arrEst[2].pagos = 3500;
		
		arrEst[3] = new Estudiante();
		arrEst[3].nombre = "Juan";
		arrEst[3].pagos = 7500;
		
		arrEst[4] = new Estudiante();
		arrEst[4].nombre = "Karen";
		arrEst[4].pagos = 500;
		
		
		System.out.println("La diferencia entre el promedio y el estudiante con mayor pago es: " + cal.getDiffAvg(cal.promedio(arrEst), cal.mayor(arrEst)));
	}
}
