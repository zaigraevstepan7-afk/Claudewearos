package qc;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13379b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f13378a = i10;
        this.f13379b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f13378a) {
            case 0:
                ((k) this.f13379b).b();
                break;
            default:
                w5.p pVar = (w5.p) this.f13379b;
                Dialog dialog = pVar.x0;
                if (dialog != null) {
                    pVar.onCancel(dialog);
                    break;
                }
                break;
        }
    }
}
