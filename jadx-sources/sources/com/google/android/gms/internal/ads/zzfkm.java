package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkm {
    private final Object zza;
    private final long zzb;
    private final ud.a zzc;
    private final long zzd;

    public zzfkm(Object obj, ud.a aVar) {
        this.zza = obj;
        this.zzc = aVar;
        ((ud.b) aVar).getClass();
        this.zzb = System.currentTimeMillis();
        this.zzd = ((Long) t.f12227d.f12230c.zzb(zzbdc.zzD)).longValue() * 1000;
    }

    public final long zza() {
        long jMin = this.zzd + Math.min(Math.max(((Long) t.f12227d.f12230c.zzb(zzbdc.zzy)).longValue(), -900000L), 10000L);
        ((ud.b) this.zzc).getClass();
        return jMin - (System.currentTimeMillis() - this.zzb);
    }

    public final long zzb() {
        return this.zzb;
    }

    public final Object zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        long j = this.zzb;
        long j4 = this.zzd;
        ((ud.b) this.zzc).getClass();
        return System.currentTimeMillis() >= j + j4;
    }
}
