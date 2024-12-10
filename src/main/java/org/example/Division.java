package org.example;

public class Division {
    private static int nextId = 1; // Генерация уникального ID
    private int id;                 // Идентификатор подразделения
    private String name;            // Название подразделения

    public Division(String name) {
        this.id = nextId++;        // Присваиваем текущий ID и увеличиваем счетчик
        this.name = name;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Можно добавить дополнительные методы, такие как сеттеры, если нужно
}