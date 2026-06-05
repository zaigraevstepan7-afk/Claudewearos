package com.google.android.gms.internal.ads;

import qc.m0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzccb implements Runnable {
    private final zzcbn zza;
    private boolean zzb = false;

    public zzccb(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    private final void zzc() {
        m0 m0Var = r0.f13445l;
        m0Var.removeCallbacks(this);
        m0Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
