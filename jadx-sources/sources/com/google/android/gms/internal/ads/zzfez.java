package com.google.android.gms.internal.ads;

import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfez {
    private final long zza;
    private long zzc;
    private final zzfey zzb = new zzfey();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfez() {
        n.D.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfey zzd() {
        zzfey zzfeyVar = this.zzb;
        zzfey zzfeyVarClone = zzfeyVar.clone();
        zzfeyVar.zza = false;
        zzfeyVar.zzb = 0;
        return zzfeyVarClone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        n.D.f11584k.getClass();
        this.zzc = System.currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
