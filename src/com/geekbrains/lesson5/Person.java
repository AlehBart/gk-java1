package com.geekbrains.lesson5;

public class Person {
    public static void main(String[] args) {
        Person[] persCorp = new Person[5];
        persCorp[0] = new Person ("Ivan Ivanov", "ivivan@mailbox.com", "892312312", 30000, 30);
        persCorp[1] = new Person("Gonzo Gonzov",  "gonzo@mailbox.com", "000000001",  30000,  25);
        persCorp[2] = new Person("Christo Grozev", "grozev@mailbox.com",  "000000002",  40000,  45);
        persCorp[3] = new Person( "Vito Corleone",  "vitobambino@mailbox.com",  "000000003",  90000,  70);
        persCorp[4] = new Person( "Tomas Nepotrebko",  "tomas@mailbox.com",  "000000004",  30000,  41);

        for (Person person : persCorp) {
            if (person.getAge() > 40)
                System.out.println(person);
        }
    }
    private String name;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person (String name, String email, String phone, int salary, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}
