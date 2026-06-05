package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzage extends zzagd {
    private final zzen zzb;
    private final zzen zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzage(zzaez zzaezVar) {
        super(zzaezVar);
        this.zzb = new zzen(zzfv.zza);
        this.zzc = new zzen(4);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zza(zzen zzenVar) throws zzagc {
        int iZzm = zzenVar.zzm();
        int i10 = iZzm >> 4;
        int i11 = iZzm & 15;
        if (i11 != 7) {
            throw new zzagc(m6.a.d(i11, "Video format not supported: "));
        }
        this.zzg = i10;
        return i10 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzb(zzen zzenVar, long j) throws zzaz {
        int i10;
        int iZzm = zzenVar.zzm();
        long jZzh = zzenVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzen zzenVar2 = new zzen(new byte[zzenVar.zza()]);
                zzenVar.zzH(zzenVar2.zzN(), 0, zzenVar.zza());
                zzacy zzacyVarZza = zzacy.zza(zzenVar2);
                this.zzd = zzacyVarZza.zzb;
                zzx zzxVar = new zzx();
                zzxVar.zzG("video/x-flv");
                zzxVar.zzah("video/avc");
                zzxVar.zzE(zzacyVarZza.zzl);
                zzxVar.zzam(zzacyVarZza.zzc);
                zzxVar.zzQ(zzacyVarZza.zzd);
                zzxVar.zzad(zzacyVarZza.zzk);
                zzxVar.zzT(zzacyVarZza.zza);
                this.zza.zzm(zzxVar.zzan());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            zzen zzenVar3 = this.zzc;
            byte[] bArrZzN = zzenVar3.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzenVar.zza() > 0) {
                zzenVar.zzH(zzenVar3.zzN(), i12, this.zzd);
                zzenVar3.zzL(0);
                zzen zzenVar4 = this.zzb;
                int iZzp = zzenVar3.zzp();
                zzenVar4.zzL(0);
                zzaez zzaezVar = this.zza;
                zzaezVar.zzr(zzenVar4, 4);
                zzaezVar.zzr(zzenVar, iZzp);
                i13 = i13 + 4 + iZzp;
            }
            this.zza.zzt((jZzh * 1000) + j, i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
