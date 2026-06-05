package qc;

import android.content.Context;
import nc.h2;
import nc.v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13400a;

    public l(n nVar, Context context) {
        this.f13400a = context;
    }

    @Override // nc.w1
    public final void zze(h2 h2Var) {
        if (h2Var == null) {
            return;
        }
        n.e(this.f13400a, h2Var.f12115b, true, true);
    }
}
