//http://www.edu4java.com/en/java/joptionpane-showmessagedialog-showinputdialog.html
//package Prueba;
import javax.swing.JOptionPane;

public class ShowInputDialogExample {
	public static void main(String[] args) {
		Alumno al1 = new Alumno();
		al1.setNombre(JOptionPane.showInputDialog("Type your name please"));
		JOptionPane.showMessageDialog(null, "Hello " + al1.getNombre());
		al1.setCorreo(JOptionPane.showInputDialog("Type your name mail"));
		JOptionPane.showMessageDialog(null, "Your email " + al1.getCorreo());
		al1.setMatricula(JOptionPane.showInputDialog("Type your name student-id"));
		JOptionPane.showMessageDialog(null, "Your student-id " + al1.getMatricula());
		JOptionPane.showMessageDialog(null, "Thank you. Bye " + al1.getNombre());
		System.exit(0);
	}
}

class Persona{
 String nombre;
 String correo;

 public void setNombre(String nom){
	 nombre = nom;
 }

 public void setCorreo(String corr){
	 correo = corr;
 }

 String getNombre(){
	 return nombre;
 }

 String getCorreo(){
	 return correo;
 }

}

class Alumno extends Persona{
	String matricula;

	public void setMatricula(String mat){
 	 matricula = mat;
  }

	String getMatricula(){
 	 return matricula;
  }
}
