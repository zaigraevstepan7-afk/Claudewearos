package w5;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends u1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f18702e;

    public o(p pVar, r rVar) {
        this.f18702e = pVar;
        this.f18701d = rVar;
    }

    @Override // u1.b
    public final View t(int i10) {
        r rVar = this.f18701d;
        if (rVar.u()) {
            return rVar.t(i10);
        }
        Dialog dialog = this.f18702e.x0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // u1.b
    public final boolean u() {
        return this.f18701d.u() || this.f18702e.B0;
    }
}
