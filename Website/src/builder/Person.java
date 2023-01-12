package builder;

public class Person {
    String name;
    int age;
    String work;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }
}
