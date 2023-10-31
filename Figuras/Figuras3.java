//Clases Abstractas e Interfaces2   
abstract class Figura{
	protected double x;
	protected double y;
	
	public Figura(double x, double y){ 
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}

interface Dibujable{
	public void dibujar();
}

interface Rotable{
	public void rotar(int grados);
}

class Circulo extends Figura implements Dibujable, Rotable{
	private double radio;

	public Circulo(double x, double y, double radio){
		super(x,y);
		this.radio = radio;
	}
	
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	public double calcularPerimetro(){
		return Math.PI*radio*2;
	}

	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CIRCULO");
	}	
	
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CIRCULO");
	}	
	
}//Fin clase Circulo

class Cuadrado extends Figura implements Dibujable, Rotable{
	private double lado;
	public Cuadrado(double x, double y, double lado){
		super(x,y);
		this.lado = lado;
	}
	
	public double calcularArea(){
		return lado*lado;
	}
	public double calcularPerimetro(){
		return lado+lado+lado+lado;
	}
	
	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CUADRADO");
	}
	
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CUADRADO");
	}
} //Fin clase Cuadrado
	
class Triangulo extends Figura implements Dibujable, Rotable{
	private double base;    
	private double altura;

	public Triangulo(double x, double y, double base, double altura){
		super(x,y);
		this.base = base;
		this.altura = altura;
	}
	public double calcularArea(){
		return (base*altura)/2;
	}
	public double calcularPerimetro(){
		return base+altura+Math.sqrt((base*base)+(altura*altura));
	}
	
	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN TRIANGULO");
	}
	
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN TRIANGULO");    
	}
}//Fin clase Triangulo

public class Figuras3{
	public static void main(String args[]){
		Circulo cir = new Circulo(200.0, 235.0, 23.5);
		Cuadrado cua = new Cuadrado(200.0, 235.0, 23.5);
		Triangulo tri = new Triangulo(200.0, 235.0, 23.5, 16.5);
		System.out.println("Area del Circulo: "+ cir.calcularArea());
		cir.dibujar();
		cir.rotar(20);
		System.out.println();
		System.out.println("Area del Cuadrado: "+ cua.calcularArea());
		cua.dibujar();
		cua.rotar(20);
		System.out.println();
		System.out.println("Area del Triangulo: "+ tri.calcularArea());
		tri.dibujar();
		tri.rotar(20);
	}
}
		
