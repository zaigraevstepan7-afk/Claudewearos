package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final d f3591b;

    public v0(int i10, d dVar) {
        super(i10);
        com.google.android.gms.common.internal.e0.j(dVar, "Null methods are not runnable.");
        this.f3591b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        try {
            this.f3591b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        try {
            this.f3591b.setFailedResult(new Status(10, m1.w(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(g0 g0Var) throws DeadObjectException {
        try {
            this.f3591b.run(g0Var.f3536b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(b0 b0Var, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) b0Var.f3507a;
        d dVar = this.f3591b;
        map.put(dVar, boolValueOf);
        dVar.addStatusListener(new a0(b0Var, dVar));
    }
}
