package es.studium.banco;

public class testBanco
{
	//Definimos constantes para los valores que se utilizan en el código

	
    private static final int SALDO_INICIAL = 100;
    private static final int TRANSFERENCIA_BEATRIZ_A_ANTONIO = 50;
    private static final int GANANCIA_SORTEO_ANTONIO = 100;
    private static final int PAGO_HACIENDA_BEATRIZ = 30;
    private static final int TRANSFERENCIA_ANTONIO_A_BEATRIZ = 50;

	public static void main(String[] args)
	{
	
		//Creamos a los clientes
		
		cliente antonio = new cliente ("123456789Z", "Antonio Alonso", "Av. Pueblo Saharahui s/n");
		cliente beatriz = new cliente ("987654321A", "Beatriz Benitez", "Calle Sol 4");

		
		//Creamos las cuentas de Antonio y Beatriz con sus saldos iniciales

		
		cuenta cuentaAntonio = new cuenta(48151, SALDO_INICIAL, antonio);
		cuenta cuentaBeatriz = new cuenta(62342, SALDO_INICIAL, beatriz);

		// Consultamos los saldos de las cuentas
		
		consultarSaldos(cuentaAntonio, cuentaBeatriz);

		// Beatriz transfiere 50 euros a la cuenta de Antonio
		
		transferirDinero(cuentaBeatriz, cuentaAntonio, TRANSFERENCIA_BEATRIZ_A_ANTONIO);

		// Consultamos los saldos de las cuentas después de la transferencia
		
		consultarSaldos(cuentaAntonio, cuentaBeatriz);

		 // Antonio ingresa 100 euros que ha ganado en un sorteo/rifa
		
		cuentaAntonio.ingresarDinero(GANANCIA_SORTEO_ANTONIO);

		// Beatriz paga 30 euros a Hacienda
		
		cuentaBeatriz.retirarDinero(PAGO_HACIENDA_BEATRIZ);

		// Consultamos los saldos de las cuentas después de los ingresos y pagos
		
		consultarSaldos(cuentaAntonio, cuentaBeatriz);

		// Antonio transfiere 50 euros a Beatriz
		
		transferirDinero(cuentaAntonio, cuentaBeatriz, TRANSFERENCIA_ANTONIO_A_BEATRIZ);

		// Consultamos los saldos de las cuentas después de la última transferencia
		
		consultarSaldos(cuentaAntonio, cuentaBeatriz);
	}

		 // Método para consultar los saldos de las cuentas
	
    private static void consultarSaldos(cuenta cuenta1, cuenta cuenta2) {
        System.out.println("La cuenta de " + cuenta1.getCliente().getNombre() + " tiene " + cuenta1.getSaldo() + " euros." );
        System.out.println("La cuenta de " + cuenta2.getCliente().getNombre() +  " tiene " +  cuenta2.getSaldo() + " euros.");
    }
		
		// Método para transferir dinero de una cuenta a otra
		
    private static void transferirDinero(cuenta cuentaOrigen, cuenta cuentaDestino, int cantidad) {
        cuentaOrigen.retirarDinero(cantidad);
        cuentaDestino.ingresarDinero(cantidad);
    }
}

