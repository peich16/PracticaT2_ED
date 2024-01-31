package es.studium.banco;
/**
 ** Clase POJO cliente
 * Clase que genera a los clientes
 * @author Pablo Fernández De Los Ríos Mesa
 * @version v3
 */
public class cliente
{
// Aquí van los atributos
	
	/**
	 * Son los elementos que definen la clase cliente.
	 */
	private String dni;
	private String nombre;
	private String direccion;
	
	
// Pongo el constructor vacío
	/**
	 * Constructor por defecto
	 */
	
	public cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";
	}
	// El constructor por parámetros (constructor por campos y metodos get and set)
	
	/**
	 * Constructor con todos los parámetros
	 * @param dni Se asigna al atributo dni
	 * @param nombre Se asigna al atributo nombre
	 * @param dirección Se asigna al atributo direccion
	 */
	

public cliente(String dni, String nombre, String dirección)
{
	this.dni = dni;
	this.nombre = nombre;
	this.direccion = dirección;
}

/**
 * Metodo get del atributo dni
 * @return Devuelve el valor del atributo dni
 */

public String getDni()
{
	return dni;
}

/**
 * Metodo set del atributo dni
 * @param dni Se asigna al atributo dni
 */
public void setDni(String dni)
{
	this.dni = dni;
}
/**
 * Metodo get del atributo nombre
 * @return Devuelve el valor del atributo nombre
 */
public String getNombre()
{
	return nombre;
}

/**
 * Metodo set del atributo nombre
 * @param nombre Devuelve el valor del atributo nombre
 */
public void setNombre(String nombre)
{
	this.nombre = nombre;
}

/**
 * Metodo get del atributo direccion
 * @return Devuelve el valor del atributo direccion
 */
public String getDireccion()
{
	return direccion;
}

/**
 * Metodo set del atributo direccion
 * @param direccion Devuelve el valor del atributo direccion
 */
public void setDireccion(String direccion)
{
	this.direccion = direccion;
}
	

	
	
	
	
}
