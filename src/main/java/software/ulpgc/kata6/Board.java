package software.ulpgc.kata6;

public class Board {
    private final String[] state;

    public Board(String[] state) {
        this.state = state;
    }

    public Board(String state) {
        this(state.split("\n"));
    }

    public Board next() {
        return new Board("");
    }

    public String state() {
        return  String.join("\n",state);
    }
}
