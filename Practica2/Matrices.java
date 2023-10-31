import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

//Clase del programa principal
public class Matrices{

	public static void main(String args[]){
		System.out.println("¿Qué tipo de datos tendrá su matriz? \n Presione:\n(1) para enteros \n(2) para floats \n(3) para doubles");
		int i;
		i = CapturaEntrada.capturarEntero("Respuesta");
		switch(i){
		case 1:
			MatrizInt m1 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizInt m2 =new MatrizInt(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizInt m3;
			MatrizInt m4;
			MatrizInt m5;
	
			m1.iniciarMatInt();
			System.out.println("Matriz 1: ");
			m1.imprimirMatInt();
			
			m2.iniciarMatInt();
			
			System.out.println("\nMatriz 2: ");
			m2.imprimirMatInt();
	
			//Transpuesta 
			m4 =  OperacionesMatrices.transponerMatInt(m1);
			System.out.println("\nTranspuesta Matriz 1: ");
			m4.imprimirMatInt();
	
			
			//Suma de matrices
			if (Validaciones.validarCuadraturaI(m1,m2)){
				m3= new MatrizInt(m1.getRenglones(), m1.getColumnas());
				m3 = OperacionesMatrices.sumarMatInt(m1, m2);
				System.out.println("\nMatriz 3 = Matriz 1 + Matriz 2");
				m3.imprimirMatInt();
			}
			else System.out.println("\nNo son cuadradas, no se puede realizar la suma");
	
			//Multiplicacion de matrices
			if (Validaciones.validarMultiplicabilidadI(m1,m2)){
				m3= new MatrizInt(m1.getRenglones(), m2.getColumnas());
				m3 = OperacionesMatrices.multiplicarMatInt(m1, m2);
				System.out.println("\nMatriz 4 =  Matriz 1 * Matriz 2");
				m3.imprimirMatInt();
				m3.imprimirMatIntG();
			}
			else System.out.println("\nNo son multiplicables");
	
			
		break;
		
		case 2:
			MatrizFloat mf1 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizFloat mf2 =new MatrizFloat(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizFloat mf3;
			MatrizFloat mf4;
			MatrizFloat mf5;
	
			mf1.iniciarMatFloat();
			System.out.println("Matriz 1: ");
			mf1.imprimirMatFloat();
			
			mf2.iniciarMatFloat();
			
			System.out.println("\nMatriz 2: ");
			mf2.imprimirMatFloat();
	
			//Transpuesta 
			mf4 =  OperacionesMatrices.transponerMatFloat(mf1);
			System.out.println("\nTranspuesta Matriz 1: ");
			mf4.imprimirMatFloat();
	
			
			//Suma de matrices
			if (Validaciones.validarCuadraturaF(mf1,mf2)){
				mf3= new MatrizFloat(mf1.getRenglones(), mf1.getColumnas());
				mf3 = OperacionesMatrices.sumarMatFloat(mf1, mf2);
				System.out.println("\nMatriz 3 = Matriz 1 + Matriz 2");
				mf3.imprimirMatFloat();
			}
			else System.out.println("\nNo son cuadradas, no se puede realizar la suma");
	
			//Multiplicacion de matrices
			if (Validaciones.validarMultiplicabilidadF(mf1,mf2)){
				mf3= new MatrizFloat(mf1.getRenglones(), mf2.getColumnas());
				mf3 = OperacionesMatrices.multiplicarMatFloat(mf1, mf2);
				System.out.println("\nMatriz 4 =  Matriz 1 * Matriz 2");
				mf3.imprimirMatFloat();
				mf3.imprimirMatFloatG();
			}
			else System.out.println("\nNo son multiplicables");
		
		break;
			
		case 3:
			
			MatrizDouble md1 =new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizDouble md2 =new MatrizDouble(CapturaEntrada.capturarEntero("Numero renglones"), CapturaEntrada.capturarEntero("Numero columnas"));
			MatrizDouble md3;
			MatrizDouble md4;
			MatrizDouble md5;
	
			md1.iniciarMatDouble();
			System.out.println("Matriz 1: ");
			md1.imprimirMatDouble();
			
			md2.iniciarMatDouble();
			
			System.out.println("\nMatriz 2: ");
			md2.imprimirMatDouble();
	
			//Transpuesta 
			md4 =  OperacionesMatrices.transponerMatDouble(md1);
			System.out.println("\nTranspuesta Matriz 1: ");
			md4.imprimirMatDouble();
	
			
			//Suma de matrices
			if (Validaciones.validarCuadraturaD(md1,md2)){
				md3= new MatrizDouble(md1.getRenglones(), md1.getColumnas());
				md3 = OperacionesMatrices.sumarMatDouble(md1, md2);
				System.out.println("\nMatriz 3 = Matriz 1 + Matriz 2");
				md3.imprimirMatDouble();
			}
			else System.out.println("\nNo son cuadradas, no se puede realizar la suma");
	
			//Multiplicacion de matrices
			if (Validaciones.validarMultiplicabilidadD(md1,md2)){
				md3= new MatrizDouble(md1.getRenglones(), md2.getColumnas());
				md3 = OperacionesMatrices.multiplicarMatDouble(md1, md2);
				System.out.println("\nMatriz 4 =  Matriz 1 * Matriz 2");
				md3.imprimirMatDouble();
				md3.imprimirMatDoubleG();
			}
			else System.out.println("\nNo son multiplicables");
			
		break;
		}
	}
		
		
}
