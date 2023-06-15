package practicaParcialEstudiante;

public interface IColecciones <K, T>{

    boolean agregar(T obj, K key) throws CastigoExcepcion;
    boolean eliminar(K key);

    void listar();
    int contar();
}
