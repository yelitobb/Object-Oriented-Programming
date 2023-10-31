class Motor {
	int cilindros;
	int potencia;
	String combustible;

	void setMotor(int cilindros, int potencia, String combustible){
		this.cilindros = cilindros;
		this.potencia = potencia;
		this.combustible = combustible;
		System.out.println("setMotor() de Motor");
	}

	void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
}//fin de clase Motor

class Transmision{
	String tipo;
	
	void setTransmision(String tipo){
		this.tipo = tipo;
		System.out.println("setTransmision() de Transmision");
	}

} //Fin clase Transmision

class Automovil {
	String marca;
	int modelo;
	Motor motor = new Motor();
	Transmision transm = new Transmision();
	
	void setMarca (String marca) {
		this.marca = marca;
	}

	void setMotor(int cilindros, int potencia, String combustible) {
		this.motor.setCilindros(cilindros);
		System.out.println("setMotor() de Automovil");
	}
	
	void setTransmision(String tipo){
		this.transm.setTransmision(tipo);
		System.out.println("setTransmision() de Automovil");
	}
	
}//fin clase Automovil

public class Composicion3{
	public static void main(String args[]){
		Automovil auto = new Automovil();
		auto.motor.setMotor(8, 15000, "Gasolina");
		System.out.println("No. cilindros: " + auto.motor.cilindros);
		System.out.println("No. caballos: " + auto.motor.potencia);
		System.out.println("Conbustible " + auto.motor.combustible);
	}
}//fin clase Composicion2