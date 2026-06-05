package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzboa extends zzcap {
    private final Object zza = new Object();
    private final zzbof zzb;
    private boolean zzc;

    public zzboa(zzbof zzbofVar) {
        this.zzb = zzbofVar;
    }

    public final void zzb() {
        l0.k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                l0.k("release: Lock acquired");
                if (this.zzc) {
                    l0.k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zzj(new zzbnx(this), new zzcal());
                zzj(new zzbny(this), new zzbnz(this));
                l0.k("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
