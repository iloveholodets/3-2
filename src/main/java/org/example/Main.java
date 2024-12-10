package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\notch\\Desktop\\foreign_names.csv"))
                .withCSVParser(new com.opencsv.CSVParserBuilder()
                        .withSeparator(';')
                        .build())
                .build()) {
            String[] nextLine;
            reader.readNext(); // Пропускаем заголовок

            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate = nextLine[3];
                String division = nextLine[4];
                int salary = Integer.parseInt(nextLine[5]);

                Person person = new Person(id, name, gender, birthDate, division, salary);
                people.add(person);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        // Выводим список людей
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
