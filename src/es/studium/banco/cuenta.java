package es.studium.banco;

/**
 * * Clase POJO cuenta
 * clase que genera la cuenta
 * @author Pablo FernÃ¡ndez De Los Rios Mesa
 * @version v3
 */

public class cuenta
{
//Los atributos
	/**
	 * Son los elementos que definen la clase cuenta.
	 */
	
	public int tipo;
	public int saldo;
	private cliente cliente;
	
//Constructor vacio
	
	/**
	 * Constructor por defecto
	 */
	
	public cuenta()
	{
		tipo= 0;
		saldo= 0;
		cliente = new cliente();
	}
	
	//El constructor por parametros (metodos get y set)
	
	/**
	 * Constructor con todos los parametros
	 * @param tipo Se asigna al atributo tipo
	 * @param saldo Se asigna al atributo saldo
	 * @param cliente Se asigna al atributo cliente
	 */
	

	public cuenta(int tipo, int saldo, es.studium.banco.cliente cliente)
	{
		this.tipo = tipo;
		this.saldo = saldo;
		this.cliente = cliente;
		
		
	}

	/**
	 * Metodo get del atributo tipo
	 * @return Devuelve el valor del atributo tipo
	 */
	
	public int getTipo()
	{
		return tipo;
	}

	/**
	 * 	Metodo set del atributo tipo
	 * @param tipo Se asigna al atributo tipo
	 */
	public void setTipo(int tipo)
	{
		this.tipo = tipo;
	}
	/**
	 * Metodo get del atributo saldo
	 * @return Devuelve el valor del atributo saldo
	 */
	public int getSaldo()
	{
		return saldo;
	}
	/**
	 * Metodo set del atributo saldo
	 * @param saldo Se asigna al atributo saldo
	 */


	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
	
	/**
	 * MÃ©todo get del atributo cliente
	 * @return Devuelve el valor del atributo cliente
	 */

	public cliente getCliente()
	{
		return cliente;
	}
	
	/**
	 * MÃ©todo set del atributo cliente
	 * @param cliente  Se asigna al atributo cliente
	 */

	public void setCliente(cliente cliente)
	{
		this.cliente = cliente;
	}

	public void ingresarDinero(int gananciaSorteoAntonio)
	{
		
		
	}

	public void retirarDinero(int pagoHaciendaBeatriz)
	{
		// TODO Auto-generated method stub
		
	}
	
}

	
	
	
	
}
