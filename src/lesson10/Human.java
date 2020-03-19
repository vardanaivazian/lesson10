package lesson10;

public class Human {

    public static int x= 5;

    private String name;
    private int age;

    public Human() {

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
