public class Persona {
    private String name;
    private String surname;
    private String age;

    public Persona ()
    {
        name="";
        surname="";
        age="";
    }
    public Persona(String name, String surname, String age)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
