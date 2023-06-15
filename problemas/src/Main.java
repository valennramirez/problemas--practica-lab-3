import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import practicaExcepciones.CuentaBancaria;
import practicaExcepciones.SaldoInsuficienteException;
import practicaExcepciones.calcu2;
import practicaGenericidad.AlmacenamientoGenerico;
import practicaParcialEstudiante.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {

        /*AlmacenamientoGenerico<Persona> listaP=new AlmacenamientoGenerico<>();
        AlmacenamientoGenerico <Mascota> listaM=new AlmacenamientoGenerico<>();

        Persona p=new Persona("valen", "ramirez", "19");
        Mascota po=new Mascota("pochita", 2);

        listaP.agregar(p);
        listaM.agregar(po);

        listaP.verLista();
        listaM.verLista();*/

        Scanner teclado=new Scanner(System.in);


        /*calcu2 suma= new calcu2(20, 20);

        try {
            int num=suma.sumar();
            System.out.println(num);
        }
        catch(ArithmeticException e)
        {
            e.getMessage();
        }


        CuentaBancaria valen= new CuentaBancaria(2000, 2048329);

        try
        {
            valen.retirarDinero(2001);
        }
        catch(SaldoInsuficienteException e)
        {
            e.getMessage();
        }*/

        /** Practica parcial **/

        Notas not1= new Notas(10, "10/4", "primera instancia");
        Notas not2= new Notas(1, "10/4", "primera instancia");
        Notas not3= new Notas(9, "10/4", "primera instancia");

        MetodosColecciones_Generica <String, Notas> notas=new MetodosColecciones_Generica <>();

        try
        {
            notas.agregar(not1, "Primer parcial");
            notas.agregar(not2, "Segundo parcial");
            notas.agregar(not3, "Tercero parcial");

        }
        catch (CastigoExcepcion xd)
        {
            System.out.println(xd.getMessage());
        }

        HashMap<String, Notas> notasA = notas.getMap();

        String[] diasCursados={"lunes", "martes"};

        Materias mat1=new Materias("matematica", "priscila", "julieta", diasCursados, notasA);
        Materias mat2=new Materias("programacion", "priscila", "julieta", diasCursados, notasA);
        Materias mat3=new Materias("lengua", "priscila", "julieta", diasCursados, notasA);
        Materias mat4=new Materias("matematica", "priscila", "julieta", diasCursados, notasA);

        MetodosColecciones_Generica <String, Materias> materias=new MetodosColecciones_Generica <>();

        try
        {
            materias.agregar(mat1, "mat");
            materias.agregar(mat2, "prog");
            materias.agregar(mat3, "len");


        } catch (CastigoExcepcion lol)
        {
            System.out.println(lol.getMessage());
        }

        HashMap<String, Materias> materiasA = materias.getMap();

        Estudiante valen=new Estudiante("valen", "ramirez", "30/10/2003", "valennramirez@gmail.com", 101010, materiasA);

        System.out.println(valen.toString());


        //GRABARLO EN EL JSON

        JSONObject estudianteValen = new JSONObject();
        JSONArray arregloMaterias = new JSONArray();

        try{

            arregloMaterias.put(valen.getMaterias());

            estudianteValen.put("Nombre", valen.getNombre());
            estudianteValen.put("Apellido", valen.getApellido());
            estudianteValen.put("Fecha de nacimiento", valen.getFechaDeNacimiento());
            estudianteValen.put("Mail", valen.getMail());
            estudianteValen.put("Legajo", valen.getLegajo());
            estudianteValen.put("Materias", arregloMaterias);

        }
        catch(JSONException lol)
        {
            System.out.println(lol.getMessage());
        }

        JsonUtiles archivo= new JsonUtiles();

        archivo.grabar(estudianteValen, "estudiantes.dat");

        //System.out.println(archivo.leer("estudiantes.dat"));


    }
}