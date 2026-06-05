package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafz extends zzagd {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafz(zzaez zzaezVar) {
        super(zzaezVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zza(zzen zzenVar) throws zzagc {
        if (this.zzc) {
            zzenVar.zzM(1);
        } else {
            int iZzm = zzenVar.zzm();
            int i10 = iZzm >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(iZzm >> 2) & 3];
                zzx zzxVar = new zzx();
                zzxVar.zzG("video/x-flv");
                zzxVar.zzah("audio/mpeg");
                zzxVar.zzD(1);
                zzxVar.zzai(i11);
                this.zza.zzm(zzxVar.zzan());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzx zzxVar2 = new zzx();
                zzxVar2.zzG("video/x-flv");
                zzxVar2.zzah(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzxVar2.zzD(1);
                zzxVar2.zzai(8000);
                this.zza.zzm(zzxVar2.zzan());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzagc(m6.a.d(i10, "Audio format not supported: "));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzb(zzen zzenVar, long j) {
        if (this.zze == 2) {
            int iZza = zzenVar.zza();
            zzaez zzaezVar = this.zza;
            zzaezVar.zzr(zzenVar, iZza);
            zzaezVar.zzt(j, 1, iZza, 0, null);
            return true;
        }
        int iZzm = zzenVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZza2 = zzenVar.zza();
            zzaez zzaezVar2 = this.zza;
            zzaezVar2.zzr(zzenVar, iZza2);
            zzaezVar2.zzt(j, 1, iZza2, 0, null);
            return true;
        }
        int iZza3 = zzenVar.zza();
        byte[] bArr = new byte[iZza3];
        zzenVar.zzH(bArr, 0, iZza3);
        zzaco zzacoVarZza = zzacq.zza(bArr);
        zzx zzxVar = new zzx();
        zzxVar.zzG("video/x-flv");
        zzxVar.zzah("audio/mp4a-latm");
        zzxVar.zzE(zzacoVarZza.zzc);
        zzxVar.zzD(zzacoVarZza.zzb);
        zzxVar.zzai(zzacoVarZza.zza);
        zzxVar.zzT(Collections.singletonList(bArr));
        this.zza.zzm(zzxVar.zzan());
        this.zzd = true;
        return false;
    }
}
