package recursividad;

public class Potencia {

	int potencia (int numero, int potencia) 
	{
		if (potencia == 1) {
			return numero;
		}
		
		return numero * potencia (numero, potencia - 1);
	}

}
