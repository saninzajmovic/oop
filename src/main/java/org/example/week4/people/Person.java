package org.example.week4.people;

public class Person {
    private String name;
    private String address;

    private int age;
    private String country;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + "\n " + address;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
    }

}
