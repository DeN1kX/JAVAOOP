package block_1_3;

import java.util.Arrays;

public class Student {
    String name;
    int []grades;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
