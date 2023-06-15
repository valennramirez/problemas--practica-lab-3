public class Mascota {
    public String name;
    public int age;

    public Mascota()
    {
        this.name="";
        this.age=0;
    }

    public Mascota(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
