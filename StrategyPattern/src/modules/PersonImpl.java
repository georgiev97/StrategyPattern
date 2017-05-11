package modules;

import interfaces.Person;

/**
 * Created by valentin on 12.04.17.
 */
public class PersonImpl implements Person {

    private String name;
    private Integer age;

    public PersonImpl(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}
