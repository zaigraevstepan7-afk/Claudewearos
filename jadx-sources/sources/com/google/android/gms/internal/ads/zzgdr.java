package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbp;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgdr extends zzgbp.zzf implements Runnable {
    private final Runnable zza;

    public zzgdr(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzd(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        return m1.j("task=[", this.zza.toString(), "]");
    }
}
