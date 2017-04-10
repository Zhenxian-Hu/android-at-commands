package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtPlusFPR extends ATcommand {
    public AtPlusFPR(Context ctx) {
        super("+FPR", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = AVAILABLE | CURRENT;
        mDescription = ctx.getString(R.string.at_plus_fpr_description);
    }
}
