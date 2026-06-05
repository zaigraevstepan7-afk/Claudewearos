package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import mc.n;
import qc.m0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcaa implements Executor {
    private final Handler zza = new m0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th2) {
            r0 r0Var = n.D.f11577c;
            Context contextZzd = n.D.f11582h.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbfl.zzb.zze()).booleanValue()) {
                        ud.c.a(contextZzd, th2);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th2;
        }
    }
}
