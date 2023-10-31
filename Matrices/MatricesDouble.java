import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

//Clase del programa principal
public class MatricesDouble{

	public static void main(String args[]){
		MatrizD m1 =new MatrizD(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizD m2 =new MatrizD(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
		MatrizD m3;
		MatrizD m4;
		MatrizD m5;

		m1.iniciarMatD();
		System.out.println("Matriz 1: ");
		m1.imprimirMatD();
		
		m2.iniciarMatD();
		System.out.println("Matriz 2: ");
		m2.imprimirMatD();

		//Transpuesta 
		m4 =  OperacionesMatrices.transponerMatD(m1);
		System.out.println("Transpuesta Matriz 1: ");
		m4.imprimirMatD();

		
		//Suma de matrices
		if (Validaciones.validarCuadraturaD(m1,m2)){
			m3= new MatrizD(m1.getRenglones(), m1.getColumnas());
			m3 = OperacionesMatrices.sumarMatD(m1, m2);
			System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
			m3.imprimirMatD();
		}
		else System.out.println("No son cuadradas, no se puede realizar la suma");

		//Multiplicacion de matrices
		if (Validaciones.validarMultiplicabilidadD(m1,m2)){
			m3= new MatrizD(m1.getRenglones(), m2.getColumnas());
			m3 = OperacionesMatrices.multiplicarMatD(m1, m2);
			System.out.println("Matriz 3 =  Matriz 1 * Matriz 2");
			m3.imprimirMatD();
			//m3.imprimirMatFloatG();
		}
		else System.out.println("No son multiplicables");

	}

}