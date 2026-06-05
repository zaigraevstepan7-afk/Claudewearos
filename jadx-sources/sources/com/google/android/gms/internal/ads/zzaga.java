package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaga implements zzadt {
    private zzadw zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafz zzo;
    private zzage zzp;
    private final zzen zza = new zzen(4);
    private final zzen zzb = new zzen(9);
    private final zzen zzc = new zzen(11);
    private final zzen zzd = new zzen();
    private final zzagb zze = new zzagb();
    private int zzg = 1;

    private final zzen zza(zzadu zzaduVar) {
        zzen zzenVar = this.zzd;
        if (this.zzl > zzenVar.zzb()) {
            int iZzb = zzenVar.zzb();
            zzenVar.zzJ(new byte[Math.max(iZzb + iZzb, this.zzl)], 0);
        } else {
            zzenVar.zzL(0);
        }
        zzenVar.zzK(this.zzl);
        zzaduVar.zzi(zzenVar.zzN(), 0, this.zzl);
        return zzenVar;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzP(new zzaer(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r15, com.google.android.gms.internal.ads.zzaep r16) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaga.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzf = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws EOFException, InterruptedIOException {
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        zzadjVar.zzm(zzenVar.zzN(), 0, 3, false);
        zzenVar.zzL(0);
        if (zzenVar.zzo() != 4607062) {
            return false;
        }
        zzadjVar.zzm(zzenVar.zzN(), 0, 2, false);
        zzenVar.zzL(0);
        if ((zzenVar.zzq() & 250) != 0) {
            return false;
        }
        zzadjVar.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        int iZzg = zzenVar.zzg();
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(iZzg, false);
        zzadjVar2.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        return zzenVar.zzg() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
