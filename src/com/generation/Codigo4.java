package com.generation;

//Importas la clase Scanner para solicitar datos de entrada para iniciar el juego con los dos jugadores, por turnos
// Deben elegir entre piedra, papel o tijera
//el ciclo for permite obtener un ganador y el bloque switch evalua las respuestas elegidas por los jugadores.

import java.util.Scanner; //importe el paquete Sccaner

public class Codigo4 {
	public static void main(String[] args) { /// Agregue el método constructor
	Scanner s = new Scanner(System.in); //mencionar correctamente Scanner
	
	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); // es print o println
	String j1 = s.nextLine(); 
	
	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	Scanner s2 = new Scanner(System.in); //llamado correcto
	String j2 = s2.nextLine(); //llama a s y debe ser s2
	    
	if (j1 == j2) {
		System.out.println("Empate");
	} else {
		int g = 2;
		switch(j1) {
		case "piedra":
			if (j2.equals("tijeras")) { //cambie "==" por equals
				g = 1;
			}
			break; // agregue break, necesario en el ciclo switch
			
		case "papel":
			if (j2.equals("piedra")) { //cambie "==" por equals
				g = 1;
			} 
			break; // agregue break, necesario en el ciclo switch
				
			case "tijeras": //faltaba la letra "s"
				if (j2.equals("papel")) { // utiliza equals en lugar del "=="
					g = 1;
				}
				break; // agregue break, necesario en el ciclo switch
				
			default:
				break; // agregue break, necesario en el ciclo switch
			}
			System.out.println("Gana el jugador " + g);
		}
	 
	 
	    
	    

	}
	
	
}
