package practicaExcepciones;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException (String mensaje)
    {
        super(mensaje);
        System.out.println("Su saldo es insuficiente");

    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
