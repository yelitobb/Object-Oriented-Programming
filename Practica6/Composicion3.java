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

class Chasis{
	String num_serie;
	String color;
	int num_accesorios;
	int num_golpes;

	void setChasis(String num_serie, String color, int num_accesorios, int num_golpes){
		this.num_serie = num_serie;
		this.color = color;
		this.num_accesorios = num_accesorios;
		this.num_golpes = num_golpes;
		}
	}

class Automovil {
	String marca;
	int modelo;
	Motor motor = new Motor();
	Transmision transm = new Transmision();
	Chasis chas = new Chasis();
	
	void setMarca (String marca) {
		this.marca = marca;
	}
	void setModelo(int modelo){
		this.modelo = modelo;
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
		auto.setMarca("Yamaha");
		auto.setModelo(1995);
		System.out.println("Modelo : " + auto.modelo + "\n Marca : " + auto.marca);
		auto.transm.setTransmision("Manual");
		System.out.println("Transmision : " + auto.transm.tipo);
		auto.chas.setChasis("19385E4F92","Fiusha",17,2);
		System.out.println("No.Serie : " + auto.chas.num_serie);
		System.out.println("Color : "+ auto.chas.color);
		System.out.println("Numero de Accesorios: "+ auto.chas.num_accesorios);
		System.out.println("Numero de Golpes : " + auto.chas.num_golpes);
	}
}//fin clase Composicion3