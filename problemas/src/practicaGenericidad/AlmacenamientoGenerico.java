package practicaGenericidad;

import java.util.ArrayList;

public class AlmacenamientoGenerico <T> {
    private T obj;
    private ArrayList<T> lista;

    public AlmacenamientoGenerico ()
    {
        lista=new ArrayList<>();
    }
    public boolean agregar(T obj)
    {
        lista.add(obj);
        return true;
    }

    public boolean eliminar(T obj)
    {
        lista.remove(obj);
        return true ;
    }

    public int buscar (T obj)
    {
        int encontrado=0;

        for(int i=0; i<lista.size(); i++)
        {
            if(lista.get(i).equals(obj))
            {
                encontrado=i;
            }
        }

        return encontrado;
    }

    public void verLista()
    {
        for (T obj: lista)
        {
            System.out.println(obj.toString());
        }
    }
}
