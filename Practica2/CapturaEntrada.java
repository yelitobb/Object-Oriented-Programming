
import java.util.*;

public class CapturaEntrada{

	public static int capturarEntero(String msg){
		Scanner sc = new Scanner(System.in); 
		System.out.print(""+ msg+ ": "); 
		return (sc.nextInt());

	}

	public static float capturarFloat(String msg){
		Scanner sc = new Scanner(System.in); 
		System.out.print(""+ msg+ ": "); 
		return (sc.nextFloat());

	}
	
	public static double capturaDouble(String msg){
		Scanner sc = new Scanner(System.in); 
		System.out.print(""+ msg+ ": "); 
		return (sc.nextDouble());
	
	}

} //fin clase Captura
