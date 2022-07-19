package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeTest {

    @Test
    public void golden_master() {

        ByteArrayOutputStream mainOutput = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(mainOutput);

        GameRunner.run(out);

        String expected = "Chet was added\n" +
                "They are player number 1\n" +
                "Pat was added\n" +
                "They are player number 2\n" +
                "Sue was added\n" +
                "They are player number 3\n" +
                "Chet is the current player\n" +
                "They have rolled a 5\n" +
                "Chet's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 0\n" +
                "Question was incorrectly answered\n" +
                "Chet was sent to the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 1\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 1 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 3\n" +
                "Sue's new location is 3\n" +
                "The category is Rock\n" +
                "Rock Question 0\n" +
                "Answer was corrent!!!!\n" +
                "Sue now has 1 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet is not getting out of the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 4\n" +
                "Pat's new location is 5\n" +
                "The category is Science\n" +
                "Science Question 2\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 2 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 0\n" +
                "Question was incorrectly answered\n" +
                "Sue was sent to the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 3\n" +
                "Chet is getting out of the penalty box\n" +
                "Chet's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 1\n" +
                "Answer was correct!!!!\n" +
                "Chet now has 1 Gold Coins.\n" +
                "Pat is the current player\n" +
                "They have rolled a 3\n" +
                "Pat's new location is 8\n" +
                "The category is Pop\n" +
                "Pop Question 2\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 3 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 5\n" +
                "Sue is getting out of the penalty box\n" +
                "Sue's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 3\n" +
                "Answer was correct!!!!\n" +
                "Sue now has 2 Gold Coins.\n" +
                "Chet is the current player\n" +
                "They have rolled a 2\n" +
                "Chet is not getting out of the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 4\n" +
                "Pat's new location is 0\n" +
                "The category is Pop\n" +
                "Pop Question 3\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 4 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 4\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet is not getting out of the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat's new location is 1\n" +
                "The category is Science\n" +
                "Science Question 4\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 5 Gold Coins.\n" +
                "Sue is the current player\n" +
                "They have rolled a 2\n" +
                "Sue is not getting out of the penalty box\n" +
                "Chet is the current player\n" +
                "They have rolled a 4\n" +
                "Chet is not getting out of the penalty box\n" +
                "Pat is the current player\n" +
                "They have rolled a 1\n" +
                "Pat's new location is 2\n" +
                "The category is Sports\n" +
                "Sports Question 0\n" +
                "Answer was corrent!!!!\n" +
                "Pat now has 6 Gold Coins.\n";

        assertEquals(mainOutput, expected);
    }
}
