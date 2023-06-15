package practicaParcialEstudiante;

import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Materias {
    private String nombre;
    private String docente;
    private String ayudante;
    private String[] diasDeCursada;
    private HashSet<Notas> notas;

    public Materias()
    {
        this.nombre="";
        this.docente="";
        this.ayudante="";
        this.notas=new HashSet<Notas>();

    }

    public Materias(String nombre, String docente, String ayudante, String[] diasDeCursada, HashSet<Notas> notas)
    {
        this.nombre=nombre;
        this.docente=docente;
        this.ayudante=ayudante;
        this.diasDeCursada= diasDeCursada;
        this.notas=notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAyudante(String ayudante) {
        this.ayudante = ayudante;
    }

    public void setDiasDeCursada(String[] diasDeCursada) {
        this.diasDeCursada = diasDeCursada;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }



    public String getNombre() {
        return nombre;
    }


    public String getAyudante() {
        return ayudante;
    }

    public String getDocente() {
        return docente;
    }

    public String[] getDiasDeCursada() {
        return diasDeCursada;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                ", ayudante='" + ayudante + '\'' +
                ", diasDeCursada=" + Arrays.toString(diasDeCursada) + '\n' +
                ", notas=" + notas +
                '}' + '\n';
    }
}
