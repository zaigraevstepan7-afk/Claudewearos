package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfbs {
    private final ud.a zza;
    private final zzdsc zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfbs(ud.a aVar, zzdsc zzdscVar) {
        this.zza = aVar;
        this.zzb = zzdscVar;
    }

    private final void zze() {
        ((ud.b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) t.f12227d.f12230c.zzb(zzbdc.zzge)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzc;
        ((ud.b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i10) {
                    return;
                }
                this.zze = i11;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznk)).booleanValue()) {
            zzdsb zzdsbVarZza = this.zzb.zza();
            zzdsbVarZza.zzb("action", "mbs_state");
            zzdsbVarZza.zzb("mbs_state", true != z2 ? "0" : "1");
            zzdsbVarZza.zzj();
        }
        if (z2) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 3;
        }
        return z2;
    }

    public final boolean zzd() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 2;
        }
        return z2;
    }
}
