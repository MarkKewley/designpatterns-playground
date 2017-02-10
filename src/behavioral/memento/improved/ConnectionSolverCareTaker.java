package behavioral.memento.improved;

public class ConnectionSolverCareTaker {

    private ConnectionSolverMomento connectionSolverMomento;

    public void saveState(ConnectionSolver connectionSolver) {
        connectionSolverMomento = connectionSolver.createMomento();

    }

    public void restoreState(ConnectionSolver connectionSolver) {
        if (connectionSolverMomento != null) {
            connectionSolver.setMomento(connectionSolverMomento);
        }
    }

}
