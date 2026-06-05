package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzwo implements zzvg {
    private final zzgi zza;
    private int zzb;
    private final zzwn zzc;
    private final zzzq zzd;

    public zzwo(zzgi zzgiVar, zzwn zzwnVar) {
        zzzq zzzqVar = new zzzq(-1);
        this.zza = zzgiVar;
        this.zzc = zzwnVar;
        this.zzd = zzzqVar;
        this.zzb = 1048576;
    }

    public final zzwo zza(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzwq zzb(zzap zzapVar) {
        zzapVar.zzb.getClass();
        return new zzwq(zzapVar, this.zza, this.zzc, zzsh.zza, this.zzd, this.zzb, 0, null, null, null);
    }
}
