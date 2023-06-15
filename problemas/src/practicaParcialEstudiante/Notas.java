package practicaParcialEstudiante;

public class Notas {
    private int notaNumerica;
    private String fecha;
    private String instancia;

    public Notas()
    {
        this.notaNumerica=0;
        this.fecha="";
        this.instancia="";
    }

    public Notas(int notaNumerica, String fecha, String instancia)
    {
        this.notaNumerica=notaNumerica;
        this.fecha=fecha;
        this.instancia=instancia;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }

    public int getNotaNumerica() {
        return notaNumerica;
    }

    public String getFecha() {
        return fecha;
    }

    public String getInstancia() {
        return instancia;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "notaNumerica=" + notaNumerica +
                ", fecha='" + fecha + '\'' +
                ", instancia='" + instancia + '\'' +
                '}' + '\n';
    }
}
