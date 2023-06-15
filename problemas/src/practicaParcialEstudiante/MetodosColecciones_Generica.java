package practicaParcialEstudiante;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MetodosColecciones_Generica <K, T> implements IColecciones<K, T>{
    private T obj;
    private K key;
    private HashMap<K,T> map;

    public MetodosColecciones_Generica ()
    {
        this.map=new HashMap<>();
    }

    public boolean agregar(T obj, K key) throws CastigoExcepcion {
        boolean flag=false;

        if(!map.containsKey(key))
        {
            map.put(key, obj);
            flag=true;
        }

        return flag;
    }

    public boolean eliminar(K key)
    {
        boolean flag=false;

        if(!map.containsKey(key))
        {
            map.remove(key);
            flag=true;
        }

        return flag;
    }

    public void listar()
    {
        Iterator it=map.entrySet().iterator();

        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
    }

    public int contar()
    {
        Iterator it=map.entrySet().iterator();

        int i=0;

        while(it.hasNext())
        {
            it.next();
            i++;
        }

        return i;
    }

    public HashMap<K, T> getMap() {
        return map;
    }
}
