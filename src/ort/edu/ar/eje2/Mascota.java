package ort.edu.ar.eje2;

public class Mascota {
private String nombre;
private String tipo;
public Mascota(String nombre, String tipo) {
	super();
	this.nombre = nombre;
	this.tipo = tipo;
}
@Override
public String toString() {
	return "\n"+ nombre + ", " + tipo + "]";
}

}
