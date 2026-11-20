package block_1_4;

import java.util.Arrays;

public class Student {
    String name;
    int[] grades;

    Student(String name){
        this.name = name;
    }
    Student(String name, int...grades){
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
