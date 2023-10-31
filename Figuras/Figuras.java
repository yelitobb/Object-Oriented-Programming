//Clases Abstractas e Interfaces
abstract class Figura{
	protected double x;
	protected double y;
	
	public Figura(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
}

interface Dibujable{
	public void dibujar();
}

interface Rotable{
	public void rotar(int grados);
} 

class Circulo extends Figura implements Dibujable{
	private double radio;
	
	public Circulo(double x, double y, double radio){
		super(x,y);
		this.radio = radio;
	}
	
	public double area(){
		return Math.PI*radio*radio;
	}
	
	public void dibujar(){
		//implementar
	}
	
}

class Cuadrado extends Figura implements Dibujable, Rotable{
	private double lado;
	
	public Cuadrado(double x, double y, double lado){
		super(x,y);
		this.lado = lado;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public void dibujar(){
		//implementar
	}
	
	public void rotar(int grados){
		//implementar
	}
}

class Triangulo extends Figura implements Dibujable, Rotable{
	private double base;
	private double altura;
	
	public Triangulo(double x, double y, double base, double altura){
		super(x,y);
		this.base = base;
		this.altura = altura;
		
	}
	
	public double area(){
		return (base*altura)/2;
	}
	
	public void dibujar(){
		//implementar
	}

	public void rotar(int grados){
		//implementar
	}
}


