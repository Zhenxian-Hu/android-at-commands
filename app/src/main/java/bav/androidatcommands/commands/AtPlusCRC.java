package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCRC extends ATcommand {
    public AtPlusCRC() {
        super("+CRC", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}