package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzwq extends zzug implements zzwh {
    private final zzgi zza;
    private final zzsh zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhj zzh;
    private zzap zzi;
    private final zzwn zzj;
    private final zzzq zzk;

    public /* synthetic */ zzwq(zzap zzapVar, zzgi zzgiVar, zzwn zzwnVar, zzsh zzshVar, zzzq zzzqVar, int i10, int i11, zzz zzzVar, zzfvw zzfvwVar, zzwp zzwpVar) {
        this.zzi = zzapVar;
        this.zza = zzgiVar;
        this.zzj = zzwnVar;
        this.zzb = zzshVar;
        this.zzk = zzzqVar;
        this.zzc = i10;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z2 = this.zzf;
        boolean z10 = this.zzg;
        zzap zzapVarZzJ = zzJ();
        zzbl zzxdVar = new zzxd(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z2, false, false, null, zzapVarZzJ, z10 ? zzapVarZzJ.zzc : null);
        if (this.zzd) {
            zzxdVar = new zzwm(this, zzxdVar);
        }
        zzo(zzxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        ((zzwl) zzvfVar).zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzvf zzI(zzvh zzvhVar, zzzm zzzmVar, long j) {
        zzgj zzgjVarZza = this.zza.zza();
        zzhj zzhjVar = this.zzh;
        if (zzhjVar != null) {
            zzgjVarZza.zzf(zzhjVar);
        }
        zzak zzakVar = zzJ().zzb;
        zzakVar.getClass();
        Uri uri = zzakVar.zza;
        zzwn zzwnVar = this.zzj;
        zzb();
        return new zzwl(uri, zzgjVarZza, new zzuj(zzwnVar.zza), this.zzb, zzc(zzvhVar), this.zzk, zze(zzvhVar), this, zzzmVar, null, this.zzc, 0, null, zzex.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final synchronized zzap zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zza(long j, zzaes zzaesVar, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        boolean zZzh = zzaesVar.zzh();
        if (!this.zzd && this.zze == j && this.zzf == zZzh && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = zZzh;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzn(zzhj zzhjVar) {
        this.zzh = zzhjVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvj
    public final synchronized void zzt(zzap zzapVar) {
        this.zzi = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzz() {
    }
}
