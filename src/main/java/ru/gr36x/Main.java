package ru.gr36x;

import ru.gr36x.db.Student;
import ru.gr36x.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void showMenu(){
        var items = new ArrayList<String>();
        items.add("0. Выход");
        items.add("1. Создать студента");
        items.add("2. Показать список студентов");
        items.add("3. Удалить студента");
        for(var i: items){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        var choice = -1;
        var r = new Scanner(System.in);
        var service = new StudentService();
        while (choice != 0){
            showMenu();
            try {
                choice = Integer.parseInt(r.nextLine());
            } catch (NumberFormatException _){ choice = -1; }
            switch (choice){
                case 0: break;
                case 1: {
                    System.out.print("Фамилия: ");
                    var surname = r.nextLine();
                    System.out.print("Имя: ");
                    var name = r.nextLine();
                    System.out.print("№ группы: ");
                    var group = r.nextLine();
                    var std = new Student(name, surname, group);
                    service.createStudent(std);
                    break;
                }
                case 2: {
                    var stds = service.getAllStudents();
                    for (var s: stds){
                        System.out.println(s);
                    }
                }

            }
        }
    }
}
