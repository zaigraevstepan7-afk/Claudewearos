package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzov {
    final /* synthetic */ zzow zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvh zze;
    private boolean zzf;
    private boolean zzg;

    public zzov(zzow zzowVar, String str, int i10, zzvh zzvhVar) {
        this.zza = zzowVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzvhVar == null ? -1L : zzvhVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        this.zze = zzvhVar;
    }

    public final void zzg(int i10, zzvh zzvhVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzvhVar != null) {
            zzow zzowVar = this.zza;
            long j = zzvhVar.zzd;
            if (j >= zzowVar.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i10, zzvh zzvhVar) {
        if (zzvhVar == null) {
            return i10 == this.zzc;
        }
        zzvh zzvhVar2 = this.zze;
        return zzvhVar2 == null ? !zzvhVar.zzb() && zzvhVar.zzd == this.zzd : zzvhVar.zzd == zzvhVar2.zzd && zzvhVar.zzb == zzvhVar2.zzb && zzvhVar.zzc == zzvhVar2.zzc;
    }

    public final boolean zzk(zzmp zzmpVar) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null) {
            return this.zzc != zzmpVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j4 = zzvhVar.zzd;
        if (j4 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbl zzblVar = zzmpVar.zzb;
        int iZza = zzblVar.zza(zzvhVar.zza);
        int iZza2 = zzblVar.zza(this.zze.zza);
        zzvh zzvhVar2 = this.zze;
        if (j4 < zzvhVar2.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzvhVar.zzb()) {
            int i10 = zzvhVar.zze;
            return i10 == -1 || i10 > zzvhVar2.zzb;
        }
        int i11 = zzvhVar.zzb;
        int i12 = zzvhVar.zzc;
        int i13 = zzvhVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzvhVar2.zzc;
        }
        return true;
    }

    public final boolean zzl(zzbl zzblVar, zzbl zzblVar2) {
        int i10 = this.zzc;
        if (i10 < zzblVar.zzc()) {
            zzow zzowVar = this.zza;
            zzblVar.zze(i10, zzowVar.zzc, 0L);
            for (int i11 = zzowVar.zzc.zzn; i11 <= zzowVar.zzc.zzo; i11++) {
                int iZza = zzblVar2.zza(zzblVar.zzf(i11));
                if (iZza != -1) {
                    i10 = zzblVar2.zzd(iZza, zzowVar.zzd, false).zzc;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= zzblVar2.zzc()) {
            i10 = -1;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzvh zzvhVar = this.zze;
        return zzvhVar == null || zzblVar2.zza(zzvhVar.zza) != -1;
    }
}
