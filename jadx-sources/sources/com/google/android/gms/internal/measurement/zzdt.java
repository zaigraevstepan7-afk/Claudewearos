package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import ud.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    public zzdt(zzee zzeeVar, boolean z2) {
        this.zzk = zzeeVar;
        ((b) zzeeVar.zza).getClass();
        this.zzh = System.currentTimeMillis();
        ((b) zzeeVar.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzk.zzS(e10, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
