
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class MatrizDouble extends Matriz{
	
	double array[][];

	public MatrizDouble(int renglones, int columnas){
		super(renglones, columnas);
		array =  new double[renglones][columnas];
	}

	public void iniciarMatDouble(){
		Random gen = new Random();
		for(int i = 0; i < this.renglones; i++)
			for( int j = 0; j< this.columnas; j++)
				this.array[i][j] = (double)(gen.nextDouble(10));
		
	}

	//imprimir en Consola
	public void imprimirMatDouble(){
		for(int i = 0; i< this.renglones; i++){
			for( int j = 0; j< this.columnas; j++){
				System.out.print(this.array[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	//imprimir en Grafico
	public void imprimirMatDoubleG() {
		
		DecimalFormat df = new DecimalFormat(".000000");
		String cadena="";
		for(int i=0; i<this.renglones; i++) {
			for (int j=0; j<this.columnas; j++) {
				cadena += df.format(array[i][j]) + "  ";
			}
			cadena += "\n";
		}
		
		JOptionPane.showMessageDialog(null,cadena);
	}

}//fin clase MatrizDouble
