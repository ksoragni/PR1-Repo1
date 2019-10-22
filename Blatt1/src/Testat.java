import java.util.Scanner;

public class Testat {
	
	public static void main(String[] args) /*start of the main programm */{
	Scanner sc = new Scanner(System.in); // to read the class
	String stop="";
		while(!stop.equals('n') || !stop.equals('N')) {

		System.out.println("Geben Sie 1 oder 2 ein um die Währung zu wählen in die sie wechseln wollen");/*put the question out*/
		String convertion = sc.next();
		if(convertion.equals("1"))/* choose of one desicion*/{
			System.out.println("Geben sie den Betrag ein den Sie von Euro in Dollar Umrechnen lassen wollen an"); //put the question out
			double length = sc.nextDouble(); /* to make the point number*/
			System.out.println("\n entspricht:"+length*1.34+"$");/* to change the euro in dollar*/
		}else if (convertion.equals("2")){ /* choose the other desicion*/
			System.out.println("Geben sie den Betrag ein den Sie von Dollar in Euro Umrechnen lassen wollen an"); //put the question out
			double length = sc.nextDouble();/* to make the point number */
			System.out.println("\n entspricht:"+length*0.9+"€"); /* to change the dollar in euro*/
		}
		System.out.println("benötigen sie noch eine weitere Umrechnung");
		stop = sc.next();
	}
	}

}