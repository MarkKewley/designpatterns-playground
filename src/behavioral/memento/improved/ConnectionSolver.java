package behavioral.memento.improved;


import java.awt.geom.Point2D;

public class ConnectionSolver {

    private Point2D firstPoint;

    private Point2D secondPoint;


    public void calculateLine(){

        System.out.println("Calculate line between: "+firstPoint+" and "+secondPoint);

    }

    public ConnectionSolverMomento createMomento() {
        return new ConnectionSolverMomento(firstPoint, secondPoint);
    }

    public void setMomento(ConnectionSolverMomento connectionSolverMomento) {
        firstPoint = connectionSolverMomento.getFirstPoint();
        secondPoint = connectionSolverMomento.getSecondPoint();
    }

    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }
}
