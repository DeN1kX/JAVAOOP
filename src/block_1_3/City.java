package block_1_3;

import java.util.Arrays;

public class City {
    String name;
    Road[] roads;

    public String toString() {
        String result = "";
        for(int i = 0; i < roads.length; i++){
            result += name +"-"+  roads[i].destination.name + "=" + roads[i].cost + "  ";
        }
        return result;
    }
}
