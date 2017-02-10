package behavioral.memento.improved;

import java.awt.geom.Point2D;

public class ConnectionSolverMomento {

    private Point2D firstPoint;

    private Point2D secondPoint;

    public ConnectionSolverMomento(Point2D firstPoint, Point2D secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }
}
