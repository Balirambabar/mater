package com.java8Feature.lamdademo;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person
{
    String name;
    String country;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Person(String name,String country) {
        this.name = name;
        this.country = country;
    }


}
public class DemoCollect {


    public static void main(String[] args) {
        Person person=new Person("Bali","INDIA");
        Person person1=new Person("RAVI","USA");
        Person person2=new Person("BHAKTI","INDIA");

        List<Person> persons = Arrays.asList(person, person1, person2);
        List<String> indian = persons.stream()
                                      .filter(p -> p.country.equals("INDIA"))
                                       .map(p->p.name)
                                       .collect(Collectors.toList());
        System.out.println(indian);

    }
}
