package nd;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class k extends w5.p {
    public Dialog C0;
    public DialogInterface.OnCancelListener D0;
    public AlertDialog E0;

    @Override // w5.p
    public final Dialog N() {
        Dialog dialog = this.C0;
        if (dialog != null) {
            return dialog;
        }
        this.f18717t0 = false;
        if (this.E0 == null) {
            Context contextM = m();
            e0.i(contextM);
            this.E0 = new AlertDialog.Builder(contextM).create();
        }
        return this.E0;
    }

    @Override // w5.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
