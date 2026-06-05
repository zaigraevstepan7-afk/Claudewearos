package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3600b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3601c;

    public x0(m mVar, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f3600b = taskCompletionSource;
        this.f3601c = mVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        this.f3600b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        this.f3600b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(g0 g0Var) throws DeadObjectException {
        try {
            h(g0Var);
        } catch (DeadObjectException e10) {
            a(y0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(y0.e(e11));
        } catch (RuntimeException e12) {
            this.f3600b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final boolean f(g0 g0Var) {
        m6.a.q(g0Var.f3540f.get(this.f3601c));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final nd.d[] g(g0 g0Var) {
        m6.a.q(g0Var.f3540f.get(this.f3601c));
        return null;
    }

    public final void h(g0 g0Var) {
        m6.a.q(g0Var.f3540f.remove(this.f3601c));
        this.f3600b.trySetResult(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final /* bridge */ /* synthetic */ void d(b0 b0Var, boolean z2) {
    }
}
