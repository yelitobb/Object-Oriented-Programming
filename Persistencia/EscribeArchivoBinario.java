/*Escritura y lectura en archivos binarios

Escritura:
Para archivos binarios se hace exactamente igual, pero en vez de usar los "Reader" y
los "Writer", se usan los "InputStream" y los "OutputStream". En lugar de
los readLine() y println(), hay que usar los métodos read() y write() de array de bytes.

DataOutputStream:
A partir de un objeto FileOutputStream se puede crear un objeto DataOutputStream, que
proporciona métodos para escribir datos de tipo primitivo en el archivo.

Ejemplo 4: Programa que escribe en el archivo datosbin.dat
Leyendo los enteros ingresados por teclado. La lectura de datos acaba cuando se introduce -1.

*/
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribeArchivoBinario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		DataOutputStream salida = null;
		int n;
		try {
			fos = new FileOutputStream("datosbin.dat");
			salida = new DataOutputStream(fos);
			System.out.print("Introduce número entero. -1 para acabar: ");
			n = sc.nextInt();
			while (n != -1) {
				salida.writeInt(n); //se escribe el número entero en el archivo
				System.out.print("Introduce número entero. -1 para acabar: ");
				n = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}//end finally
	}//end main
}