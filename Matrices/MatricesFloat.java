import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

//Clase del programa principal
public class MatricesFloat{

	public static void main(String args[]){
		MatrizFloat m1 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizFloat m2 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizFloat m3;
		MatrizFloat m4;
		MatrizFloat m5;

		m1.iniciarMatFloat();
		System.out.println("Matriz 1: ");
		m1.imprimirMatFloat();
		
		m2.iniciarMatFloat();
		
		System.out.println("Matriz 2: ");
		m2.imprimirMatFloat();

		//Transpuesta 
		m4 =  OperacionesMatrices.transponerMatFloat(m1);
		System.out.println("Transpuesta Matriz 1: ");
		m4.imprimirMatFloat();

		
		//Suma de matrices
		if (Validaciones.validarCuadraturaFloat(m1,m2)){
			m3= new MatrizFloat(m1.getRenglones(), m1.getColumnas());
			m3 = OperacionesMatrices.sumarMatFloat(m1, m2);
			System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
			m3.imprimirMatFloat();
		}
		else System.out.println("No son cuadradas, no se puede realizar la suma");

		//Multiplicacion de matrices
		if (Validaciones.validarMultiplicabilidadFloat(m1,m2)){
			m3= new MatrizFloat(m1.getRenglones(), m2.getColumnas());
			m3 = OperacionesMatrices.multiplicarMatFloat(m1, m2);
			System.out.println("Matriz 3 =  Matriz 1 * Matriz 2");
			m3.imprimirMatFloat();
			m3.imprimirMatFloatG();
		}
		else System.out.println("No son multiplicables");

	}

}