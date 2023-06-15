package practicaExcepciones;

public class CuentaBancaria {
    private int saldo;
    private int numeroDeCuenta;

    public CuentaBancaria(int saldo, int numeroDeCuenta)
    {
        this.saldo=saldo;
        this.numeroDeCuenta=numeroDeCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int retirarDinero (int dinero) throws SaldoInsuficienteException {

        int saldoRestante=0;

        if(dinero<saldo)
        {
            saldoRestante=saldo-dinero;
            setSaldo(saldoRestante);
        }
        else
        {
            throw new SaldoInsuficienteException("no hay plata");
        }

        return saldoRestante;
    }
}
