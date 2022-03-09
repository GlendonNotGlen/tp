package seedu.mindmymoney.helper;

import seedu.mindmymoney.constants.Indexes;

/**
 * Separates the user input into the command and description for easy reference.
 *
 * @return String array of user input.
 */
public class Functions {

    public static String[] parseInput(String inputCommand) {
        String[] inputAsArray = inputCommand.split(" ", Indexes.SPLIT_LIMIT);
        return inputAsArray;
    }

}
