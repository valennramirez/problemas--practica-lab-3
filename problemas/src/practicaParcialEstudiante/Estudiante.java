package practicaParcialEstudiante;

import java.util.HashMap;
import java.util.HashSet;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String mail;
    private int legajo;
    private HashMap<String, Materias> materias;

    public Estudiante()
    {
        this.nombre="";
        this.apellido="";
        this.fechaDeNacimiento="";
        this.mail="";
        this.legajo=0;

        materias=new HashMap<>();
    }

    public Estudiante (String nombre, String apellido, String fechaDeNacimiento, String mail, int legajo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.mail=mail;
        this.legajo=legajo;
    }

    public Estudiante (String nombre, String apellido, String fechaDeNacimiento, String mail, int legajo, HashMap<String, Materias> materias)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.mail=mail;
        this.legajo=legajo;
        this.materias=materias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMaterias(HashMap<String, Materias> materias) {
        this.materias = materias;
    }

    public HashMap<String, Materias> getMaterias() {
        return materias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", mail='" + mail + '\'' +
                ", legajo=" + legajo +
                ", materias=" + materias +
                '}';
    }
}
