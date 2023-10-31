package Tercera;
import Primera.Segunda.*;
public class Validaciones{

	public static boolean validarCuadratura(MatrizInt m1, MatrizInt m2){
		if((m1.getRenglones()== m2.getRenglones()) && (m1.getColumnas()==m2.getColumnas()))
			return true;
			else return false;
	}

	public static boolean validarMultiplicabilidad(MatrizInt m1, MatrizInt m2){
		if(m1.getColumnas()== m2.getRenglones())
			return true;
			else return false;
	}
	public static boolean validarCuadraturaFloat(MatrizFloat m1, MatrizFloat m2){
		if((m1.getRenglones()== m2.getRenglones()) && (m1.getColumnas()==m2.getColumnas()))
			return true;
			else return false;
	}
	public static boolean validarMultiplicabilidadFloat(MatrizFloat m1, MatrizFloat m2){
		if(m1.getColumnas()== m2.getRenglones())
			return true;
			else return false;
	}
	public static boolean validarCuadraturaD(MatrizD m1, MatrizD m2){
		if((m1.getRenglones()== m2.getRenglones()) && (m1.getColumnas()==m2.getColumnas()))
			return true;
			else return false;
	}
	public static boolean validarMultiplicabilidadD(MatrizD m1, MatrizD m2){
		if(m1.getColumnas()== m2.getRenglones())
			return true;
			else return false;
	}
}