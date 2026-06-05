package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzdy;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th2) {
            zzo(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final String zzg() {
        return m1.j("task=[", this.zzc.toString(), "]");
    }
}
