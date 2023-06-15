package practicaExcepciones;

public class calcu2 {
    private int num1;
    private int num2;

    public calcu2(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

    public int sumar()
    {
        int suma=0;
        if(num2!=0)
        {
            suma=num1+num2;
        }
        else
        {
            throw new ArithmeticException();
        }

        return suma;
    }
}