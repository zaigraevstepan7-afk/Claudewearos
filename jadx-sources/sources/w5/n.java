package w5;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18695a;

    public n(p pVar) {
        this.f18695a = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f18695a;
        Dialog dialog = pVar.x0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
