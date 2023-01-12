package builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setWork(String work);
    Person builder();
}
