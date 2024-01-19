package software.ulpgc.kata6;

public class Board {
    private final String[] state;
    private final static char Alive = 'X';
    private final static char Dead = '.';

    public Board(String[] state) {
        this.state = state;
    }

    public Board(String state) {
        this(state.split("\n"));
    }

    public Board next() {
        return new Board(calculateNextState());
    }

    private String[] calculateNextState() {
        String[] result = new String[rows()];
        for (int i = 0; i < rows(); i++) {
            result[i] = calculateNextState(i);
        }
        return result;
    }

    private String calculateNextState(int row) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cols(); i++) {
            result.append(calculateNextState(row, i));
        }
        return result.toString();
    }

    private char calculateNextState(int row, int col) {
        return Dead;
    }

    private int cols() {
        return state[0].length();
    }

    private int rows() {
        return state.length;
    }

    public String state() {
        return  String.join("\n",state);
    }
}
