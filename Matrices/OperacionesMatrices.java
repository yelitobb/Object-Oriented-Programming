package Tercera;
import Primera.Segunda.MatrizInt;
import Primera.Segunda.MatrizFloat;
import Primera.Segunda.MatrizD;

public class OperacionesMatrices{

	public static MatrizInt transponerMatInt(MatrizInt m1){
		MatrizInt matTransp = new MatrizInt(m1.getColumnas(), m1.getRenglones());

		for(int i = 0; i< m1.renglones; i++){
			for( int j = 0; j< m1.columnas; j++){
				matTransp.array[j][i] = m1.array[i][j];
			}
		}
		return matTransp;
	}


	public static MatrizInt sumarMatInt(MatrizInt m1, MatrizInt m2){
		MatrizInt matResult = new MatrizInt(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< matResult.array.length; i++){
			for(int j = 0; j< matResult.array[i].length; j++){
				matResult.array[i][j]= m1.array[i][j]+ m2.array[i][j];
			}
		}
		return matResult;
	}

	public static MatrizInt multiplicarMatInt(MatrizInt m1, MatrizInt m2){
		MatrizInt matResult = new MatrizInt(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< m1.array.length; i++){
			for(int j = 0; j< m2.array[0].length; j++){
				for(int k = 0; k < m1.array[0].length; k++){
					matResult.array[i][j]+= m1.array[i][k] * m2.array[k][j];
				}
			}
		}
		return matResult;
	}
	
	public static MatrizFloat transponerMatFloat(MatrizFloat m1){
		MatrizFloat matTransp = new MatrizFloat(m1.getColumnas(), m1.getRenglones());

		for(int i = 0; i< m1.renglones; i++){
			for( int j = 0; j< m1.columnas; j++){
				matTransp.array[j][i] = m1.array[i][j];
			}
		}
		return matTransp;
	}


	public static MatrizFloat sumarMatFloat(MatrizFloat m1, MatrizFloat m2){
		MatrizFloat matResult = new MatrizFloat(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< matResult.array.length; i++){
			for(int j = 0; j< matResult.array[i].length; j++){
				matResult.array[i][j]= m1.array[i][j]+ m2.array[i][j];
			}
		}
		return matResult;
	}

	public static MatrizFloat multiplicarMatFloat(MatrizFloat m1, MatrizFloat m2){
		MatrizFloat matResult = new MatrizFloat(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< m1.array.length; i++){
			for(int j = 0; j< m2.array[0].length; j++){
				for(int k = 0; k < m1.array[0].length; k++){
					matResult.array[i][j]+= m1.array[i][k] * m2.array[k][j];
				}
			}
		}
		return matResult;
	}

	public static MatrizD sumarMatD(MatrizD m1, MatrizD m2){
		MatrizD matResult = new MatrizD(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< matResult.array.length; i++){
			for(int j = 0; j< matResult.array[i].length; j++){
				matResult.array[i][j]= m1.array[i][j]+ m2.array[i][j];
			}
		}
		return matResult;
	}
	public static MatrizD multiplicarMatD(MatrizD m1, MatrizD m2){
		MatrizD matResult = new MatrizD(m1.getRenglones(),m2.getColumnas());
		for(int i = 0; i< m1.array.length; i++){
			for(int j = 0; j< m2.array[0].length; j++){
				for(int k = 0; k < m1.array[0].length; k++){
					matResult.array[i][j]+= m1.array[i][k] * m2.array[k][j];
				}
			}
		}
		return matResult;
	}
	public static MatrizD transponerMatD(MatrizD m1){
		MatrizD matTransp = new MatrizD(m1.getColumnas(), m1.getRenglones());

		for(int i = 0; i< m1.renglones; i++){
			for( int j = 0; j< m1.columnas; j++){
				matTransp.array[j][i] = m1.array[i][j];
			}
		}
		return matTransp;
	}

}//Fin clase OperacionesMatrices