package Primera.Segunda;
import Primera.Matriz;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class MatrizD extends Matriz{
	
	public double array[][];

	public MatrizD(int renglones, int columnas){
		super(renglones, columnas);//palabra clave del constructor
		array =  new double[renglones][columnas];
	}

	public void iniciarMatD(){
		Random gen = new Random();
		for(int i = 0; i < this.renglones; i++){
			for( int j = 0; j< this.columnas; j++){
				this.array[i][j] = (double)(gen.nextDouble(10));
			}
		}	
	}

	//imprimir en Consola
	public void imprimirMatD(){
		for(int i = 0; i< this.renglones; i++){
			for( int j = 0; j< this.columnas; j++){
				System.out.print(this.array[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	//imprimir en Grafico
	public void imprimirMatDG() {
		
		//DecimalFormat df = new DecimalFormat("#00");
		String cadena="";
		for(int i=0; i<this.renglones; i++) {
			for (int j=0; j<this.columnas; j++) {
				cadena += Double.toString(array[i][j]) + "    ";
			}
			cadena += "\n";
		}
		
		JOptionPane.showMessageDialog(null,cadena);
	}

}//fin clase MatrizDouble