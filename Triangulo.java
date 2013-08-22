import java.util.Scanner;
//Probando seguimiento
public class Triangulo{
	public static void main(String args[]){
		
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		
		for(int i = 0;i < n;i++){
			for(int j = n-i;j > 0;j--){
				System.out.print(" ");
			}
			for(int k = 0;k <= i;k++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
}
//prueba

