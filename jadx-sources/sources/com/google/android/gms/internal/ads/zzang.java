package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzang implements zzamx {
    private final zzaob zza;
    private String zzb;
    private zzaez zzc;
    private zzanf zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanp zzg = new zzanp(32, 128);
    private final zzanp zzh = new zzanp(33, 128);
    private final zzanp zzi = new zzanp(34, 128);
    private final zzanp zzj = new zzanp(39, 128);
    private final zzanp zzk = new zzanp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzang(zzaob zzaobVar, String str) {
        this.zza = zzaobVar;
    }

    private final void zzf(long j, int i10, int i11, long j4) {
        this.zzd.zza(j, i10, this.zze);
        if (!this.zze) {
            zzanp zzanpVar = this.zzg;
            zzanpVar.zzd(i11);
            zzanp zzanpVar2 = this.zzh;
            zzanpVar2.zzd(i11);
            zzanp zzanpVar3 = this.zzi;
            zzanpVar3.zzd(i11);
            if (zzanpVar.zze() && zzanpVar2.zze() && zzanpVar3.zze()) {
                String str = this.zzb;
                int i12 = zzanpVar.zzb;
                byte[] bArr = new byte[zzanpVar2.zzb + i12 + zzanpVar3.zzb];
                System.arraycopy(zzanpVar.zza, 0, bArr, 0, i12);
                System.arraycopy(zzanpVar2.zza, 0, bArr, zzanpVar.zzb, zzanpVar2.zzb);
                System.arraycopy(zzanpVar3.zza, 0, bArr, zzanpVar.zzb + zzanpVar2.zzb, zzanpVar3.zzb);
                String strZzd = null;
                zzfp zzfpVarZzd = zzfv.zzd(zzanpVar2.zza, 3, zzanpVar2.zzb, null);
                zzfk zzfkVar = zzfpVarZzd.zzb;
                if (zzfkVar != null) {
                    int i13 = zzfkVar.zzf;
                    int[] iArr = zzfkVar.zze;
                    int i14 = zzfkVar.zzd;
                    strZzd = zzdk.zzd(zzfkVar.zza, zzfkVar.zzb, zzfkVar.zzc, i14, iArr, i13);
                }
                zzx zzxVar = new zzx();
                zzxVar.zzS(str);
                zzxVar.zzG("video/mp2t");
                zzxVar.zzah("video/hevc");
                zzxVar.zzE(strZzd);
                zzxVar.zzam(zzfpVarZzd.zze);
                zzxVar.zzQ(zzfpVarZzd.zzf);
                zzxVar.zzK(zzfpVarZzd.zzg);
                zzxVar.zzJ(zzfpVarZzd.zzh);
                zzi zziVar = new zzi();
                zziVar.zzc(zzfpVarZzd.zzk);
                zziVar.zzb(zzfpVarZzd.zzl);
                zziVar.zzd(zzfpVarZzd.zzm);
                zziVar.zzf(zzfpVarZzd.zzc + 8);
                zziVar.zza(zzfpVarZzd.zzd + 8);
                zzxVar.zzF(zziVar.zzg());
                zzxVar.zzad(zzfpVarZzd.zzi);
                zzxVar.zzY(zzfpVarZzd.zzj);
                zzxVar.zzZ(zzfpVarZzd.zza + 1);
                zzxVar.zzT(Collections.singletonList(bArr));
                zzz zzzVarZzan = zzxVar.zzan();
                this.zzc.zzm(zzzVarZzan);
                int i15 = zzzVarZzan.zzq;
                zzfve.zzl(i15 != -1);
                this.zza.zzf(i15);
                this.zze = true;
            }
        }
        zzanp zzanpVar4 = this.zzj;
        if (zzanpVar4.zzd(i11)) {
            int iZzc = zzfv.zzc(zzanpVar4.zza, zzanpVar4.zzb);
            zzen zzenVar = this.zzn;
            zzenVar.zzJ(zzanpVar4.zza, iZzc);
            zzenVar.zzM(5);
            this.zza.zzc(j4, zzenVar);
        }
        zzanp zzanpVar5 = this.zzk;
        if (zzanpVar5.zzd(i11)) {
            int iZzc2 = zzfv.zzc(zzanpVar5.zza, zzanpVar5.zzb);
            zzen zzenVar2 = this.zzn;
            zzenVar2.zzJ(zzanpVar5.zza, iZzc2);
            zzenVar2.zzM(5);
            this.zza.zzc(j4, zzenVar2);
        }
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        this.zzd.zzb(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    private final void zzh(long j, int i10, int i11, long j4) {
        this.zzd.zzd(j, i10, i11, j4, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i11);
            this.zzh.zzc(i11);
            this.zzi.zzc(i11);
        }
        this.zzj.zzc(i11);
        this.zzk.zzc(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        zzdd.zzb(this.zzc);
        String str = zzex.zza;
        while (zzenVar.zza() > 0) {
            int iZzc = zzenVar.zzc();
            int iZzd = zzenVar.zzd();
            byte[] bArrZzN = zzenVar.zzN();
            this.zzl += zzenVar.zza();
            this.zzc.zzr(zzenVar, zzenVar.zza());
            while (iZzc < iZzd) {
                int iZza = zzfv.zza(bArrZzN, iZzc, iZzd, this.zzf);
                if (iZza == iZzd) {
                    zzg(bArrZzN, iZzc, iZzd);
                    return;
                }
                int i10 = bArrZzN[iZza + 3] & 126;
                int i11 = 3;
                if (iZza > 0) {
                    int i12 = iZza - 1;
                    if (bArrZzN[i12] == 0) {
                        i11 = 4;
                        iZza = i12;
                    }
                }
                int i13 = iZza - iZzc;
                if (i13 > 0) {
                    zzg(bArrZzN, iZzc, iZza);
                }
                int i14 = iZzd - iZza;
                long j = this.zzl - i14;
                zzf(j, i14, i13 < 0 ? -i13 : 0, this.zzm);
                zzh(j, i14, i10 >> 1, this.zzm);
                iZzc = iZza + i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzb = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzc = zzaezVarZzw;
        this.zzd = new zzanf(zzaezVarZzw);
        this.zza.zzd(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
        zzdd.zzb(this.zzc);
        String str = zzex.zza;
        if (z2) {
            this.zza.zze();
            zzf(this.zzl, 0, 0, this.zzm);
            zzh(this.zzl, 0, 48, this.zzm);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfv.zzi(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzb();
        zzanf zzanfVar = this.zzd;
        if (zzanfVar != null) {
            zzanfVar.zzc();
        }
    }
}
