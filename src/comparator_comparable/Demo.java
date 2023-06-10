package src.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
Link -> https://www.javamadesoeasy.com/2015/04/comparable-vs-comparator-differences.html
 */

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Demo {
    public static void main(String[] args) {

        //To write your own logic for sort use comparator which
        // is a functional Interface

        // Normally
        /*
        Comparator<Student> ocom = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age > o2.age)
                    return 1;
                else
                    return -1;
            }
        };
        */

        // By using Lambda Expression
        Comparator<Student> ocom = (i, j) -> i.age > j.age? 1 : -1;

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(18, "Clarke"));
        stud.add(new Student(21, "Bruce"));
        stud.add(new Student(39, "Diana"));
        stud.add(new Student(24, "Barry"));

        Collections.sort(stud); // -> to call comparable, use this
        Collections.sort(stud, ocom); // -> to call Comparator, use this
        // But what if we need the natural sorting, like we dont wanna sent exta param like "ocm"
        // then we have to implement Comparable to the Student class
        // If we go to the Intger class it will be extending Comparble hence, .sort is sorting int
        // to make Student sortable we need to make it as a comparble

        stud.stream().forEach(System.out::println);

    }
}
