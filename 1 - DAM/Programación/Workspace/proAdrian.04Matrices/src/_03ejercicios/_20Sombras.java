package _03ejercicios;

public class _20Sombras {
	public static void main(String[] args) {
		//Matriz con ceros y unos.
		//Cada celda representa una parcela de un camping.
		//Si tiene 0 está libre. Si tiene 1 tiene un árbol.
		//Averiguar numero de parcelas en las que podríamos colocar 
		//una tienda si queremos que tenga sombra.
		//Cada arbol da sombra debajo y debajo a la derecha
		int [][] arboles = {
			{0,0,0,0,0,0,1,1,0,0},
			{0,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,1},
			{0,0,0,0,0,1,0,0,0,0}
		};
		
		int sombras = 0;
		for (int i = 0; i < arboles.length; i++) {
			for (int j = 0; j < arboles[i].length; j++) {
				if(arboles[i][j] == 1) {
					if(i < arboles.length - 1) {
						//Si la celda de debajo esta libre, la contamos
						if(arboles[i+1][j] == 0) {
							sombras++;
						}
						//Si la celda de debajo a la derecha esta libre, la contamos
						if(j < arboles[i].length - 1 //No estamos en la ultima fila
								&& arboles[i+1][j+1] == 0  //Abajo a la derecha esta libre
								&& arboles[i][j+1] == 0) { //Al lado no hay un arbol
							sombras++;
						}
					}
				}
				
			}
		}
		System.out.println(sombras);
	}
}
