package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzajn {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzz zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzajo[] zzl;

    public zzajn(int i10, int i11, long j, long j4, long j10, long j11, zzz zzzVar, int i12, zzajo[] zzajoVarArr, int i13, long[] jArr, long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j;
        this.zzd = j4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = zzzVar;
        this.zzh = i12;
        this.zzl = zzajoVarArr;
        this.zzk = i13;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzajn zza(zzz zzzVar) {
        return new zzajn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzzVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    public final zzajo zzb(int i10) {
        return this.zzl[i10];
    }
}
