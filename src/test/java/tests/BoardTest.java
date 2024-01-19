package tests;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    @Test
    public void should_return_empty_board_given_empty_board(){
        Board board = new Board("").next();
        assertThat(board.state()).isEqualTo("");
    }
}
