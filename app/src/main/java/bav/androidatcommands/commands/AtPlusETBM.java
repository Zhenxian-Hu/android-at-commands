package bav.androidatcommands.commands;

/**
 * Created by bav on 24.03.2017.
 */

public class AtPlusETBM extends ATcommand {
    public AtPlusETBM() {
        super("+ETBM", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
    }
}