package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtS5 extends ATcommand {
    public AtS5(Context ctx) {
        super("S5", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_s5_description);
    }
}
