package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCMIPMASS extends ATcommand {
    public AtDolQCMIPMASS(Context ctx) {
        super("$QCMIPMASS", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcmipmass_description);
    }
}
