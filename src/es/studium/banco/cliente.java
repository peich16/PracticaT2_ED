package es.studium.banco;

public class cliente
{
// Aquí van los atributos
	private String dni;
	private String nombre;
	private String direccion;
	
	
// Pongo el constructor vacío
	
	public cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";
	}
	// El constructor por parámetros (constructor por campos y métodos get and set)
	

public cliente(String dni, String nombre, String dirección)
{
	this.dni = dni;
	this.nombre = nombre;
	this.direccion = dirección;
}
public String getDni()
{
	return dni;
}
public void setDni(String dni)
{
	this.dni = dni;
}
public String getNombre()
{
	return nombre;
}
public void setNombre(String nombre)
{
	this.nombre = nombre;
}
public String getDireccion()
{
	return direccion;
}
public void setDireccion(String direccion)
{
	this.direccion = direccion;
}
	

	
	
	
	
}
