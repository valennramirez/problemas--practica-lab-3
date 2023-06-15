package practicaParcialEstudiante;

import java.util.HashSet;
import java.util.Iterator;

public class MetodosColecciones_Generica <T extends Object>{
    private T obj;
    private HashSet<T> set;

    public MetodosColecciones_Generica ()
    {
        this.set=new HashSet<>();
    }

    public boolean agregar(T obj, String mensaje) throws CastigoExcepcion {
        boolean flag=false;

        if(!set.contains(obj))
        {
            set.add(obj);
            flag=true;
        }
        else
        {
            throw new CastigoExcepcion(mensaje);
        }

        return flag;
    }

    public boolean eliminar(T obj)
    {
        boolean flag=false;

        if(!set.contains(obj))
        {
            set.remove(obj);
            flag=true;
        }

        return flag;
    }

    public void listar()
    {
        Iterator<T> it=set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
    }

    public int contar()
    {
        Iterator<T> it=set.iterator();

        int i=0;

        while(it.hasNext())
        {
            it.next();
            i++;
        }

        return i;
    }

    public HashSet<T> getSet() {
        return set;
    }
}
