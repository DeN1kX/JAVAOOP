package block_1_4;

import java.util.Arrays;

public class Polyline {
    Point[] points;

    Polyline(){}
    Polyline(Point[] points){
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polyline{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
