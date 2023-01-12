package builder;

class PersonBuilderIMPL implements  PersonBuilder{
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setWork(String work) {
        person.work = work;
        return this;
    }

    @Override
    public Person builder() {
        return person;
    }
}
