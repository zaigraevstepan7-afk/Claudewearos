package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdm {
    private boolean zza;

    public zzdm() {
        throw null;
    }

    public final synchronized void zza() {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z2 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc(long j) {
        if (j > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = j + jElapsedRealtime;
                if (j4 < jElapsedRealtime) {
                    zzb();
                } else {
                    boolean z2 = false;
                    while (!this.zza && jElapsedRealtime < j4) {
                        try {
                            wait(j4 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        boolean z2;
        z2 = this.zza;
        this.zza = false;
        return z2;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }

    public final synchronized boolean zzf() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public zzdm(zzdj zzdjVar) {
    }
}
