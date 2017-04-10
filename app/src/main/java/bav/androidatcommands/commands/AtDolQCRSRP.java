package bav.androidatcommands.commands;

import android.content.Context;
import bav.androidatcommands.R;

public class AtDolQCRSRP extends ATcommand {
    public AtDolQCRSRP(Context ctx) {
        super("$QCRSRP", DEFAULT_ANSWER_WAIT_TIMEOUT_MS);
        mAllowedCommandFormats = CURRENT;
        mDescription = ctx.getString(R.string.at_dol_qcrsrp_description);
    }
}
