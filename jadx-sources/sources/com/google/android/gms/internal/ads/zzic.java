package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzic implements zzma, zzmd {
    private final int zzb;
    private zzme zzd;
    private int zze;
    private zzph zzf;
    private zzdj zzg;
    private int zzh;
    private zzwz zzi;
    private zzz[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzvh zzq;
    private zzmc zzr;
    private final Object zza = new Object();
    private final zzkv zzc = new zzkv();
    private long zzm = Long.MIN_VALUE;
    private zzbl zzp = zzbl.zza;

    public zzic(int i10) {
        this.zzb = i10;
    }

    private final void zzZ(long j, boolean z2) {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z2);
    }

    public final void zzB() {
        zzmc zzmcVar;
        synchronized (this.zza) {
            zzmcVar = this.zzr;
        }
        if (zzmcVar != null) {
            zzmcVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzG() {
        zzdd.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzH(zzz[] zzzVarArr, zzwz zzwzVar, long j, long j4, zzvh zzvhVar) {
        zzdd.zzf(!this.zzn);
        this.zzi = zzwzVar;
        this.zzq = zzvhVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzzVarArr;
        this.zzk = j4;
        zzF(zzzVarArr, j, j4, zzvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzI() {
        zzdd.zzf(this.zzh == 0);
        zzkv zzkvVar = this.zzc;
        zzkvVar.zzb = null;
        zzkvVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzJ(long j) {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzL(zzmc zzmcVar) {
        synchronized (this.zza) {
            this.zzr = zzmcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzN(zzbl zzblVar) {
        if (Objects.equals(this.zzp, zzblVar)) {
            return;
        }
        this.zzp = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzO() {
        zzdd.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzP() {
        zzdd.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwz zzwzVar = this.zzi;
        zzwzVar.getClass();
        return zzwzVar.zze();
    }

    public final zzz[] zzT() {
        zzz[] zzzVarArr = this.zzj;
        zzzVarArr.getClass();
        return zzzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final int zzcU() {
        return this.zzh;
    }

    public final int zzcV(zzkv zzkvVar, zzhs zzhsVar, int i10) {
        zzwz zzwzVar = this.zzi;
        zzwzVar.getClass();
        int iZza = zzwzVar.zza(zzkvVar, zzhsVar, i10);
        if (iZza == -4) {
            if (zzhsVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhsVar.zze + this.zzk;
            zzhsVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
            return iZza;
        }
        if (iZza == -5) {
            zzz zzzVar = zzkvVar.zza;
            zzzVar.getClass();
            long j4 = zzzVar.zzt;
            if (j4 != Long.MAX_VALUE) {
                zzx zzxVarZzb = zzzVar.zzb();
                zzxVarZzb.zzal(j4 + this.zzk);
                zzkvVar.zza = zzxVarZzb.zzan();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final long zzcW() {
        return this.zzm;
    }

    public final zzin zzcX(Throwable th2, zzz zzzVar, boolean z2, int i10) {
        int iZzY = 4;
        if (zzzVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzzVar) & 7;
            } catch (zzin unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzin.zzb(th2, zzU(), this.zze, zzzVar, iZzY, this.zzq, z2, i10);
    }

    public final int zzd(long j) {
        zzwz zzwzVar = this.zzi;
        zzwzVar.getClass();
        return zzwzVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public int zze() {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzbl zzh() {
        return this.zzp;
    }

    public final zzdj zzi() {
        zzdj zzdjVar = this.zzg;
        zzdjVar.getClass();
        return zzdjVar;
    }

    public final zzkv zzk() {
        zzkv zzkvVar = this.zzc;
        zzkvVar.zzb = null;
        zzkvVar.zza = null;
        return zzkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public zzlb zzl() {
        return null;
    }

    public final zzme zzn() {
        zzme zzmeVar = this.zzd;
        zzmeVar.getClass();
        return zzmeVar;
    }

    public final zzph zzo() {
        zzph zzphVar = this.zzf;
        zzphVar.getClass();
        return zzphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzwz zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzq() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzr() {
        zzdd.zzf(this.zzh == 1);
        zzkv zzkvVar = this.zzc;
        zzkvVar.zzb = null;
        zzkvVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzs(zzme zzmeVar, zzz[] zzzVarArr, zzwz zzwzVar, long j, boolean z2, boolean z10, long j4, long j10, zzvh zzvhVar) {
        zzdd.zzf(this.zzh == 0);
        this.zzd = zzmeVar;
        this.zzq = zzvhVar;
        this.zzh = 1;
        zzy(z2, z10);
        zzH(zzzVarArr, zzwzVar, j4, j10, zzvhVar);
        zzZ(j4, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzv(int i10, zzph zzphVar, zzdj zzdjVar) {
        this.zze = i10;
        this.zzf = zzphVar;
        this.zzg = zzdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzw() {
        zzwz zzwzVar = this.zzi;
        zzwzVar.getClass();
        zzwzVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzz(long j, boolean z2) {
        throw null;
    }

    public void zzA() {
    }

    public void zzC() {
    }

    public void zzD() {
    }

    public void zzE() {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzmd zzm() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public /* synthetic */ void zzM(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public void zzu(int i10, Object obj) {
    }

    public void zzy(boolean z2, boolean z10) {
    }

    public void zzF(zzz[] zzzVarArr, long j, long j4, zzvh zzvhVar) {
    }
}
