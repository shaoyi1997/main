package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.model.Model;
import seedu.address.model.entity.body.Body;
import seedu.address.storage.ReportGenerator;

//@@author bernicechio
/**
 * Generates a PDF report for the specific body ID.
 */
public class GenReportsCommand extends Command {


    public static final String COMMAND_WORD = "genReports";

    public static final String MESSAGE_GENREPORT_SUCCESS = "Generated all reports";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Generates a PDF report for all bodies.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        List<Body> lastShownList = model.getFilteredBodyList();
        ReportGenerator.generateAll(lastShownList);
        return new CommandResult(MESSAGE_GENREPORT_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof GenReportsCommand); // instanceof handles nulls
    }
}
