import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;
import Segunda.CapturaEntrada;
import Segunda.Validaciones;
import Segunda.OperacionesMatrices;
import Primera.Segunda.MatrizInt;

//Clase del programa principal
public class Matrices{

	public static void main(String args[]){
		MatrizInt m1 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizInt m2 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizInt m3;
		MatrizInt m4;
		MatrizInt m5;

		m1.iniciarMatInt();
		System.out.println("Matriz 1: ");
		m1.imprimirMatInt();
		
		m2.iniciarMatInt();
		
		System.out.println("Matriz 2: ");
		m2.imprimirMatInt();

		//Transpuesta 
		m4 =  OperacionesMatrices.transponerMatInt(m1);
		System.out.println("Transpuesta Matriz 1: ");
		m4.imprimirMatInt();

		
		//Suma de matrices
		if (Validaciones.validarCuadratura(m1,m2)){
			m3= new MatrizInt(m1.getRenglones(), m1.getColumnas());
			m3 = OperacionesMatrices.sumarMatInt(m1, m2);
			System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
			m3.imprimirMatInt();
		}
		else System.out.println("No son cuadradas, no se puede realizar la suma");

		//Multiplicacion de matrices
		if (Validaciones.validarMultiplicabilidad(m1,m2)){
			m3= new MatrizInt(m1.getRenglones(), m2.getColumnas());
			m3 = OperacionesMatrices.multiplicarMatInt(m1, m2);
			System.out.println("Matriz 3 =  Matriz 1 * Matriz 2");
			m3.imprimirMatInt();
			m3.imprimirMatIntG();
		}
		else System.out.println("No son multiplicables");

	}

}