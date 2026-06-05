package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final y f3592b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f3593c;

    /* renamed from: d, reason: collision with root package name */
    public final v f3594d;

    public w0(int i10, y yVar, TaskCompletionSource taskCompletionSource, v vVar) {
        super(i10);
        this.f3593c = taskCompletionSource;
        this.f3592b = yVar;
        this.f3594d = vVar;
        if (i10 == 2 && yVar.f3603b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Status status) {
        ((h9.a) this.f3594d).getClass();
        this.f3593c.trySetException(com.google.android.gms.common.internal.e0.m(status));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(Exception exc) {
        this.f3593c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(g0 g0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f3593c;
        try {
            y yVar = this.f3592b;
            ((t) ((r0) yVar).f3585d.f3598d).accept(g0Var.f3536b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(y0.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d(b0 b0Var, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) b0Var.f3508b;
        TaskCompletionSource taskCompletionSource = this.f3593c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new b0(b0Var, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final boolean f(g0 g0Var) {
        return this.f3592b.f3603b;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final nd.d[] g(g0 g0Var) {
        return this.f3592b.f3602a;
    }
}
