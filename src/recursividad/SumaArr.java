package recursividad;

public class SumaArr {
	
	int sumaArr (int[] arr, int posicion) {
		
		if (posicion < arr.length) {
			return arr[posicion] + sumaArr(arr, posicion + 1);
		}
		
		return 0;
	}

}
