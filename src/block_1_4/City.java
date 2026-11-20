package block_1_4;

import java.util.Arrays;

public class City {
    String name;
    City[] roads;

    City(String name){
        this.name = name;
    }
    City(String name, City...roads){
        this.name = name;
        this.roads = roads;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", roads=" + Arrays.toString(roads) +
                '}';
    }
}
