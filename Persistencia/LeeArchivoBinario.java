/*
Lectura de archivos binarios:

Para poder leer el contenido de un archivo binario debemos conocer la estructura
interna del archivo, es decir, debemos saber cómo se han escrito: si hay enteros,
long, etc., y en qué orden están escritos en el archivo.
- Si no se conoce su estructura podemos leerlo byte a byte.

Ejemplo 6: Programa que lee el contenido del archivo creado en el Ejemplo 4.

Utilizaremos un ciclo infinito para leer los datos. Cuando se llega al final del archivo se
lanza la excepción EOFException que se utiliza para salir del bucle while.
*/

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeeArchivoBinario {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream entrada = null;
		int n;
		try {
			fis = new FileInputStream("datosbin.dat");
			entrada = new DataInputStream(fis);
			while (true) {
			n = entrada.readInt(); //se lee un entero del entero
			System.out.println(n); //se muestra en pantalla
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (EOFException e) {
			System.out.println("Fin de archivo");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} //end finally
	} //end main
}