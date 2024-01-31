package es.studium.banco;
/**
 * Clase POJO testBanco
 * @author Pablo FernÃ¡ndez De Los RÃ­os Mesa
 * @version v3
 */
public class testBanco
{


	public static void main(String[] args)
	{
		//Antonio y Beatriz se hacen clientes del banco
		
		cliente antonio = new cliente ("123456789Z", "Antonio Alonso", "Av. Pueblo Saharahui s/n");
		cliente beatriz = new cliente ("987654321A", "Beatriz Benitez", "Calle Sol 4");
		
		// Las cuentas por defecto dsiponen de un saldo de 100 euros
		
		cuenta cuentaAntonio = new cuenta(48151, 100, antonio);
		cuenta cuentaBeatriz = new cuenta(62342, 100, beatriz);
		
		//Los dos consultan sus saldos
		
		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + "tiene " + cuentaAntonio.getSaldo() + " euros." );
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() +  "tiene " +  cuentaBeatriz.getSaldo() + " euros.");
		
		// Beatriz le transfiere 50 euros a la cuenta de Antonio
		
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()-50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()+50);
		
		// A continuaciÃ³n ambos consultan los saldos
		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + "tiene " + cuentaAntonio.getSaldo() + " euros." );
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() +  "tiene " +  cuentaBeatriz.getSaldo() + " euros.");
		
		// Antonio gana 100 euros en un sorteo rifa y lo ingresa en cuenta
		
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()+100);
		
		// Beatriz tiene que pagar 30euros a hacienda 
		
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()-30);
		
		// Vuelven a consultar los saldos ya que son desconfiados
		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + "tiene " + cuentaAntonio.getSaldo() + " euros." );
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() +  "tiene " +  cuentaBeatriz.getSaldo() + " euros.");
		
		// Antonio transfiere 50 euros a Beatriz y ambos consultan sus saldos
		
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo()-50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo()+50);
		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + "tiene " + cuentaAntonio.getSaldo() + " euros." );
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() +  "tiene " +  cuentaBeatriz.getSaldo() + " euros.");
		
	}

}

