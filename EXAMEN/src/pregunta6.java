import java.util.Scanner;
public class pregunta6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);
		
		int [] X,Y,Z;
		Z= new int[4];
	
		int dimens;
		System.out.println("ingrese la dimension de la cadena de numeros");
		dimens=reader.nextInt();
		X= new int[dimens];
		Y= new int[dimens];
		System.out.println("Ingrese los valores de la cadena");
		for (int i=0;i<dimens;i++ ) {
			X[i]=reader.nextInt();
			
		}
		
		for (int i=0;i<=(dimens-5);i++) {
			int c=(X[i]*X[i+1]*X[i+2]*X[i+3]);
			int d=(X[i+1]*X[i+2]*X[i+3]*X[i+4]);
			if(c>d) {
			Z[0]=X[i];
			Z[1]=X[i+1];
			Z[2]=X[i+2];
			Z[3]=X[i+3];
			}else {
				Z[0]=X[i+1];
				Z[1]=X[i+2];
				Z[2]=X[i+3];
				Z[3]=X[i+4];												
			}
		}
		
		System.out.println("la mayor serie es ");
		for(int a=0; a<4; a++) {
				System.out.print(Z[a]+" ");				
			} System.out.println();
	}

}
