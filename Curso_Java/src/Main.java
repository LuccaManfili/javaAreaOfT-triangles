import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Programa para calcular e comparar área de dois quadrados e ver qual a maior (SEM ORIENTAÇÃO A OBJETOS
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	      System.out.println("Escolha o número do triângulo A:");
	      double xA, xB, xC;
	      xA = sc.nextDouble();
	      xB = sc.nextDouble();
	      xC = sc.nextDouble();
	      System.out.println("Escolha o número do triângulo B:");
	      double yA, yB, yC;
	      yA = sc.nextDouble();
	      yB = sc.nextDouble();
	      yC = sc.nextDouble();
	     
	      double P = (xA + xB + xC) /2;
	      double areaA = Math.sqrt(P*(P-xA)*(P-xB)*(P-xC));
	      P = (yA + yB + yC)/2;
	      double areaB = Math.sqrt(P*(P-yA)*(P-yB)*(P-yC));
	     
	      System.out.printf("Área triângulo A: %.4f%n" , areaA);
	      System.out.printf("Área triângulo A: %.4f%n" , areaB);

	      if(areaA > areaB) {
	    	  System.out.println("A maior area é a do triangulo A");
	      }else {
	    	  System.out.println("A maior area é a do triangulo B");
	      }
	      		
	      		
	      
	      
	      sc.close();
           	}
}