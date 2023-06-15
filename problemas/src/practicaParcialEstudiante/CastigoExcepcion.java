package practicaParcialEstudiante;

public class CastigoExcepcion extends Exception{
    public CastigoExcepcion (String mensaje)
    {
        super(mensaje);
        System.out.println("");
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
