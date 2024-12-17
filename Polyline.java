import java.util.*;

class Polyline {
    List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    // Текстовое представление ломаной линии
    @Override
    public String toString() {
        return "Линия " + points.toString();
    }
}

