package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamq implements zzadt {
    private final zzamr zza = new zzamr(null, 0, "audio/ac4");
    private final zzen zzb = new zzen(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) {
        zzen zzenVar = this.zzb;
        int iZza = zzaduVar.zza(zzenVar.zzN(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzenVar.zzL(0);
        zzenVar.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
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
        this.zza.zzb(zzadwVar, new zzaol(Integer.MIN_VALUE, 0, 1));
        zzadwVar.zzG();
        zzadwVar.zzP(new zzaer(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws EOFException, InterruptedIOException {
        int i10;
        zzen zzenVar = new zzen(10);
        int i11 = 0;
        while (true) {
            zzadj zzadjVar = (zzadj) zzaduVar;
            zzadjVar.zzm(zzenVar.zzN(), 0, 10, false);
            zzenVar.zzL(0);
            if (zzenVar.zzo() != 4801587) {
                break;
            }
            zzenVar.zzM(3);
            int iZzl = zzenVar.zzl();
            i11 += iZzl + 10;
            zzadjVar.zzl(iZzl, false);
        }
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzadjVar2.zzm(zzenVar.zzN(), 0, 7, false);
            zzenVar.zzL(0);
            int iZzq = zzenVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzN = zzenVar.zzN();
                if (bArrZzN.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iZzq == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzadjVar2.zzl(i10 - 7, false);
            } else {
                zzaduVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzadjVar2.zzl(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
