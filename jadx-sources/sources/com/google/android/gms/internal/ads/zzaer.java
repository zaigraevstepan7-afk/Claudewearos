package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzaer implements zzaes {
    private final long zza;
    private final zzaeq zzb;

    public zzaer(long j, long j4) {
        this.zza = j;
        zzaet zzaetVar = j4 == 0 ? zzaet.zza : new zzaet(0L, j4);
        this.zzb = new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return false;
    }
}
