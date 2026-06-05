package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzanh implements zzamx {
    private zzaez zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzen zzb = new zzen(10);
    private long zze = -9223372036854775807L;

    public zzanh(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        zzdd.zzb(this.zzc);
        if (this.zzd) {
            int iZza = zzenVar.zza();
            int i10 = this.zzg;
            if (i10 < 10) {
                int iMin = Math.min(iZza, 10 - i10);
                byte[] bArrZzN = zzenVar.zzN();
                int iZzc = zzenVar.zzc();
                zzen zzenVar2 = this.zzb;
                System.arraycopy(bArrZzN, iZzc, zzenVar2.zzN(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzenVar2.zzL(0);
                    if (zzenVar2.zzm() != 73 || zzenVar2.zzm() != 68 || zzenVar2.zzm() != 51) {
                        zzea.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzenVar2.zzM(3);
                        this.zzf = zzenVar2.zzl() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZza, this.zzf - this.zzg);
            this.zzc.zzr(zzenVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 5);
        this.zzc = zzaezVarZzw;
        zzx zzxVar = new zzx();
        zzxVar.zzS(zzaolVar.zzb());
        zzxVar.zzG(this.zza);
        zzxVar.zzah("application/id3");
        zzaezVarZzw.zzm(zzxVar.zzan());
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
        int i10;
        zzdd.zzb(this.zzc);
        if (this.zzd && (i10 = this.zzf) != 0 && this.zzg == i10) {
            zzdd.zzf(this.zze != -9223372036854775807L);
            this.zzc.zzt(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }
}
