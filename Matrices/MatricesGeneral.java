import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;
import Primera.Matriz;
import Primera.Segunda.MatrizInt;
import Primera.Segunda.MatrizFloat;
import Primera.Segunda.MatrizD;
import Tercera.OperacionesMatrices;
import Tercera.Validaciones;
import Tercera.CapturaEntrada;
//Clase del Programa Principal

public class MatricesGeneral{

	public static void main(String args[]){
		int k;
		do{

		int i;
		i = CapturaEntrada.capturarEntero("Elija con que tipo datos quiere trabajar(escriba el numero): \n1)Enteros\n2)Flotantes\n3)Double\n4)Salir");
		switch(i){
			case 1:
			MatrizInt m1 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizInt m2 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizInt m3;
			MatrizInt m4;

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
			break;
			

			case 2:
			MatrizFloat m6 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizFloat m7 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizFloat m8;
			MatrizFloat m9;

			m6.iniciarMatFloat();
			System.out.println("Matriz 1: ");
			m6.imprimirMatFloat();
		
			m7.iniciarMatFloat();
		
			System.out.println("Matriz 2: ");
			m7.imprimirMatFloat();

			//Transpuesta 
			m9 =  OperacionesMatrices.transponerMatFloat(m6);
			System.out.println("Transpuesta Matriz 1: ");
			m9.imprimirMatFloat();

		
			//Suma de matrices
			if (Validaciones.validarCuadraturaFloat(m6,m7)){
				m8= new MatrizFloat(m6.getRenglones(), m6.getColumnas());
				m8 = OperacionesMatrices.sumarMatFloat(m6, m7);
				System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
				m8.imprimirMatFloat();
			}
			else System.out.println("No son cuadradas, no se puede realizar la suma");

			//Multiplicacion de matrices
			if (Validaciones.validarMultiplicabilidadFloat(m6,m7)){
				m8= new MatrizFloat(m6.getRenglones(), m7.getColumnas());
				m8 = OperacionesMatrices.multiplicarMatFloat(m6, m7);
				System.out.println("Matriz 3 =  Matriz 1 * Matriz 2");
				m8.imprimirMatFloat();
				m8.imprimirMatFloatG();
			}
			else System.out.println("No son multiplicables");
			
			break;
			

			case 3:
			MatrizD m11 =new MatrizD(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizD m12 =new MatrizD(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizD m13;
			MatrizD m14;

			m11.iniciarMatD();
			System.out.println("Matriz 1: ");
			m11.imprimirMatD();
		
			m12.iniciarMatD();
			System.out.println("Matriz 2: ");
			m12.imprimirMatD();

			//Transpuesta 
			m14 =  OperacionesMatrices.transponerMatD(m11);
			System.out.println("Transpuesta Matriz 1: ");
			m14.imprimirMatD();

		
			//Suma de matrices
			if (Validaciones.validarCuadraturaD(m11,m12)){
				m13= new MatrizD(m11.getRenglones(), m11.getColumnas());
				m13 = OperacionesMatrices.sumarMatD(m11, m12);
				System.out.println("Matriz 3 = Matriz 1 + Matriz 2");
				m13.imprimirMatD();
			}
			else System.out.println("No son cuadradas, no se puede realizar la suma");

			//Multiplicacion de matrices
			if (Validaciones.validarMultiplicabilidadD(m11,m12)){
				m13= new MatrizD(m11.getRenglones(), m12.getColumnas());
				m13 = OperacionesMatrices.multiplicarMatD(m11, m12);
				System.out.println("Matriz 3 =  Matriz 1 * Matriz 2");
				m13.imprimirMatD();
				m13.imprimirMatDG();
			}
			else System.out.println("No son multiplicables");
			break;
			default:
			System.out.println("Elige 1, 2 o 3 ");
		}
		
		k = CapturaEntrada.capturarEntero("Presiona 0 para salir, cualquier otro numero para repetir"); 
	}while(k != 0);
	}
}
