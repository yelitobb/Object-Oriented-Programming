
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class MatrizFloat extends Matriz{
	
	float array[][];

	public MatrizFloat(int renglones, int columnas){
		super(renglones, columnas);
		array =  new float[renglones][columnas];
	}

	public void iniciarMatFloat(){
		Random gen = new Random();
		for(int i = 0; i < this.renglones; i++)
			for( int j = 0; j< this.columnas; j++)
				this.array[i][j] = (float)(gen.nextFloat(10));
		
	}

	//imprimir en Consola
	public void imprimirMatFloat(){
		for(int i = 0; i< this.renglones; i++){
			for( int j = 0; j< this.columnas; j++){
				System.out.print(this.array[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	//imprimir en Grafico
	public void imprimirMatFloatG(){
		DecimalFormat df = new DecimalFormat(".0000");
		String cadena="";
		for(int i=0; i<this.renglones; i++) {
			for (int j=0; j<this.columnas; j++) {
				cadena += df.format(array[i][j]);
				cadena += "  ";
			}
			cadena += "\n";
		}
		
		JOptionPane.showMessageDialog(null,cadena);
	}

}//fin clase MatrizInt
