package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzxh implements zzvf, zzve {
    private final zzvf zza;
    private final long zzb;
    private zzve zzc;

    public zzxh(zzvf zzvfVar, long j) {
        this.zza = zzvfVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmi zzmiVar) {
        long j4 = this.zzb;
        return this.zza.zza(j - j4, zzmiVar) + j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        long j4 = this.zzb;
        return this.zza.zze(j - j4) + j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j) {
        zzwz[] zzwzVarArr2 = new zzwz[zzwzVarArr.length];
        int i10 = 0;
        while (true) {
            zzwz zzwzVarZzc = null;
            if (i10 >= zzwzVarArr.length) {
                break;
            }
            zzxg zzxgVar = (zzxg) zzwzVarArr[i10];
            if (zzxgVar != null) {
                zzwzVarZzc = zzxgVar.zzc();
            }
            zzwzVarArr2[i10] = zzwzVarZzc;
            i10++;
        }
        zzvf zzvfVar = this.zza;
        long j4 = this.zzb;
        long jZzf = zzvfVar.zzf(zzywVarArr, zArr, zzwzVarArr2, zArr2, j - j4);
        for (int i11 = 0; i11 < zzwzVarArr.length; i11++) {
            zzwz zzwzVar = zzwzVarArr2[i11];
            if (zzwzVar == null) {
                zzwzVarArr[i11] = null;
            } else {
                zzwz zzwzVar2 = zzwzVarArr[i11];
                if (zzwzVar2 == null || ((zzxg) zzwzVar2).zzc() != zzwzVar) {
                    zzwzVarArr[i11] = new zzxg(zzwzVar, j4);
                }
            }
        }
        return jZzf + j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j, boolean z2) {
        this.zza.zzh(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzc = zzveVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzvf zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        long j = zzlaVar.zza;
        long j4 = this.zzb;
        zzky zzkyVarZza = zzlaVar.zza();
        zzkyVarZza.zze(j - j4);
        return this.zza.zzo(zzkyVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
