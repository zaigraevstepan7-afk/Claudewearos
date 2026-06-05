package nd;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f12271a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f12272b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f12273c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12272b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12271a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f12273c == null) {
            Activity activity = getActivity();
            e0.i(activity);
            this.f12273c = new AlertDialog.Builder(activity).create();
        }
        return this.f12273c;
    }
}
