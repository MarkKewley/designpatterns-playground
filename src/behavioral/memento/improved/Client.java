package behavioral.memento.improved;


import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {
        ConnectionSolver connectionSolver = new ConnectionSolver();
        final ConnectionSolverCareTaker connectionSolverCareTaker = new ConnectionSolverCareTaker();


        connectionSolver.setFirstPoint(new Point2D.Double(1.0,1.0));
        connectionSolver.setSecondPoint(new Point2D.Double(5.0, 1.0));

        connectionSolverCareTaker.saveState(connectionSolver);

        connectionSolver.calculateLine();

        connectionSolver.setFirstPoint(new Point2D.Double(2.0, 2.0));
        connectionSolver.setSecondPoint(new Point2D.Double(5.0, 2.0));

        connectionSolver.calculateLine();

        ConnectionSolver newConnectionSolver = new ConnectionSolver();

        connectionSolverCareTaker.restoreState(newConnectionSolver);

        newConnectionSolver.calculateLine();
    }

}
