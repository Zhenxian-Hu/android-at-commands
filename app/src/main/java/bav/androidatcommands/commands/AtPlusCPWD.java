package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusCPWD extends ATcommand {
    public AtPlusCPWD() {
        super("+CPWD", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}