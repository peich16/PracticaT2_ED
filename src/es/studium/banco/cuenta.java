package es.studium.banco;

public class cuenta
{
    //Los atributos
    public int tipo;
    public int saldo;
    private cliente cliente;

    //Constructor vacío
    public cuenta()
    {
        tipo= 0;
        saldo= 0;
        cliente = new cliente();
    }

    //El constructor por parámetros (métodos get y set)
    public cuenta(int tipo, int saldo, es.studium.banco.cliente cliente)
    {
        this.tipo = tipo;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }

    public cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(cliente cliente)
    {
        this.cliente = cliente;
    }

    // Método para ingresar dinero en la cuenta
    public void ingresarDinero(int cantidad) {
        this.saldo += cantidad;
    }

    // Método para retirar dinero de la cuenta
    public void retirarDinero(int cantidad) {
        this.saldo -= cantidad;
    }
}
