package enem;
import java.util.Scanner;
public class PrincipalScar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		for (Scar marca: Scar.values()) {
			System.out.println("============================");
			System.out.println("marca: "+marca);
			
		}
	

}
}