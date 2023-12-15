package com.generation;

import java.util.Scanner;

//Cambiamos nombre de la clase al mismo del archivo
public class Codigo4 {
// 		Colocamos todo dentro del metodo main para que funcione
//		Cambio en nombre de variables
	public static void main(String[] args) {
	    Scanner myScan = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String player1 = myScan.nextLine();
	    
	//    Cambio en mensaje
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	//    Quitamos scanner innecesario
	//    Scanner s2 = new Scanner();
	//    Cambio nombre variables
	    String player2 = myScan.nextLine();
	    
	    if (player1.equalsIgnoreCase(player2)) {
	      System.out.println("Empate");
	    } else {
	// Cambio en nombre variables
	      int winner = 0;
	      switch(player1) {
	      
	//      Agregamos break en donde es necesario
	//      Cambiamos comparacion por uso de metodo equals
	        case "piedra":
	          if (player2.equalsIgnoreCase("tijeras")) {
	            winner = 1;
	          } else {winner = 2;}
	          break;
	// Agregamos llave faltante
	        case "papel":
	          if (player2.equalsIgnoreCase("piedra")) {
	            winner = 1;
	            }else {winner = 2;}
	          	break;
	        case "tijeras":
	          if (player2.equalsIgnoreCase("papel")) {
	            winner = 1;
	          }else {winner = 2;}
	          break;
	        default:
	        	winner = 0;
	      }
	      System.out.println("Gana el jugador " + winner);
	    }
	    
	    myScan.close();
	}
  
}