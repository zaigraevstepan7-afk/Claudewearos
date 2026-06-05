package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzams implements zzadt {
    private final zzamt zza;
    private final zzen zzb;
    private final zzen zzc;
    private final zzem zzd;
    private zzadw zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzams() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) {
        zzdd.zzb(this.zze);
        zzen zzenVar = this.zzb;
        int iZza = zzaduVar.zza(zzenVar.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzP(new zzaer(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzenVar.zzL(0);
        zzenVar.zzK(iZza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(zzenVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zze = zzadwVar;
        this.zza.zzb(zzadwVar, new zzaol(Integer.MIN_VALUE, 0, 1));
        zzadwVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws EOFException, InterruptedIOException {
        zzen zzenVar;
        int i10 = 0;
        while (true) {
            zzenVar = this.zzc;
            zzadj zzadjVar = (zzadj) zzaduVar;
            zzadjVar.zzm(zzenVar.zzN(), 0, 10, false);
            zzenVar.zzL(0);
            if (zzenVar.zzo() != 4801587) {
                break;
            }
            zzenVar.zzM(3);
            int iZzl = zzenVar.zzl();
            i10 += iZzl + 10;
            zzadjVar.zzl(iZzl, false);
        }
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(i10, false);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzadjVar2.zzm(zzenVar.zzN(), 0, 2, false);
            zzenVar.zzL(0);
            if (zzamt.zzf(zzenVar.zzq())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzadjVar2.zzm(zzenVar.zzN(), 0, 4, false);
                zzem zzemVar = this.zzd;
                zzemVar.zzl(14);
                int iZzd = zzemVar.zzd(13);
                if (iZzd <= 6) {
                    i13++;
                    zzaduVar.zzj();
                    zzadjVar2.zzl(i13, false);
                } else {
                    zzadjVar2.zzl(iZzd - 6, false);
                    i12 += iZzd;
                }
            } else {
                i13++;
                zzaduVar.zzj();
                zzadjVar2.zzl(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    public zzams(int i10) {
        this.zza = new zzamt(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzen(2048);
        this.zzg = -1L;
        zzen zzenVar = new zzen(10);
        this.zzc = zzenVar;
        byte[] bArrZzN = zzenVar.zzN();
        this.zzd = new zzem(bArrZzN, bArrZzN.length);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
