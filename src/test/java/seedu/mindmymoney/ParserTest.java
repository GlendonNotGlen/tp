package seedu.mindmymoney;

import org.junit.jupiter.api.Test;
import seedu.mindmymoney.command.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    public static final int TEST_PRICE = 1; //arbitrary number for testing
    public static final int TEST_INDEX = 0; //arbitrary number for testing

    /**
     * Checks Parser.parseCommand() that it returns a Command object for each test input
     */
    @Test
    void parseCommand_normalInput_expectCorrectCommandObject() {
        String testInput = "help";
        assertTrue(new Parser(testInput).parseCommand() instanceof HelpCommand);

        testInput = "add description " + TEST_PRICE;
        assertTrue(new Parser(testInput).parseCommand() instanceof AddCommand);

        testInput = "update " + TEST_INDEX + " description " + TEST_PRICE;
        assertTrue(new Parser(testInput).parseCommand() instanceof UpdateCommand);

        testInput = "list";
        assertTrue(new Parser(testInput).parseCommand() instanceof ListCommand);

        testInput = "delete " + TEST_INDEX;
        assertTrue(new Parser(testInput).parseCommand() instanceof DeleteCommand);
    }

    /**
     * Invalid input by user should return a HelpCommand object
     * and print an invalid command message
     */
    @Test
    void parseCommand_invalidInput_expectHelpCommand() {
        Parser testParser = new Parser("");
        assertTrue(testParser.parseCommand() instanceof HelpCommand);
    }
}
