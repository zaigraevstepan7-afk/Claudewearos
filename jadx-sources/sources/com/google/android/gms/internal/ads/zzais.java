package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzais implements zzaio {
    private final zzen zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzais(zzfd zzfdVar) {
        zzen zzenVar = zzfdVar.zza;
        this.zza = zzenVar;
        zzenVar.zzL(12);
        this.zzc = zzenVar.zzp() & 255;
        this.zzb = zzenVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzm();
        }
        if (i10 == 16) {
            return this.zza.zzq();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzm = this.zza.zzm();
        this.zze = iZzm;
        return (iZzm & 240) >> 4;
    }
}
