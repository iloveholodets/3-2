package org.example;

public class Person {
    private int id;             // Идентификатор
    private String name;        // Имя
    private String gender;      // Пол
    private String birthDate;   // Дата рождения
    private Division division;     // Подразделение
    private int salary;      // Зарплата

    public Person(int id, String name, String gender, String birthDate, String division, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = new Division(division);
        this.salary = salary;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDivision() {
        return division.getName();
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", division='" + division + '\'' +
                ", salary=" + salary +
                '}';
    }
}