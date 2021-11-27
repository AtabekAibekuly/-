package kz.iitu;

public class User {
    private String name;
    private String Surname;
    private int id;
    private int age;
    private String pass;

    public User(int id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPass() {
        return pass;
    }

    public User(String name, String surname, int id, int age, String pass) {
        this.name = name;
        Surname = surname;
        this.id = id;
        this.age = age;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return name + " " + Surname + " " + id + " " + age + " " + pass ;
    }
}
