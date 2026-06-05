package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ej.c;
import fj.m;
import java.util.concurrent.CancellationException;
import pi.o;
import qj.b1;
import qj.e0;
import qj.l1;
import qj.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzi extends m implements c {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ e0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, e0 e0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            l1 l1Var = (l1) this.zzb;
            l1Var.getClass();
            Object obj2 = l1.f13598a.get(l1Var);
            if (obj2 instanceof b1) {
                throw new IllegalStateException("This job has not completed yet");
            }
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            Exception exc = tVar != null ? tVar.f13622a : null;
            if (exc == null) {
                this.zza.setResult(this.zzb.g());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = exc instanceof Exception ? exc : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(exc);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return o.f13011a;
    }
}
