package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbl {
    public static final zzbl zza = new zzbi();

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbl)) {
            return false;
        }
        zzbl zzblVar = (zzbl) obj;
        if (zzblVar.zzc() == zzc() && zzblVar.zzb() == zzb()) {
            zzbk zzbkVar = new zzbk();
            zzbj zzbjVar = new zzbj();
            zzbk zzbkVar2 = new zzbk();
            zzbj zzbjVar2 = new zzbj();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzbkVar, 0L).equals(zzblVar.zze(i10, zzbkVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzbjVar, true).equals(zzblVar.zzd(i11, zzbjVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzblVar.zzg(true) && (iZzh = zzh(true)) == zzblVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzblVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        int iZzc = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = iZzc * 31;
            if (i11 >= zzc()) {
                break;
            }
            iZzc = i10 + zze(i11, zzbkVar, 0L).hashCode();
            i11++;
        }
        int iZzb = zzb() + i10;
        for (int i12 = 0; i12 < zzb(); i12++) {
            iZzb = (iZzb * 31) + zzd(i12, zzbjVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbj zzd(int i10, zzbj zzbjVar, boolean z2);

    public abstract zzbk zze(int i10, zzbk zzbkVar, long j);

    public abstract Object zzf(int i10);

    public int zzg(boolean z2) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z2) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzbj zzbjVar, zzbk zzbkVar, int i11, boolean z2) {
        int i12 = zzd(i10, zzbjVar, false).zzc;
        if (zze(i12, zzbkVar, 0L).zzo != i10) {
            return i10 + 1;
        }
        int iZzj = zzj(i12, i11, z2);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzbkVar, 0L).zzn;
    }

    public int zzj(int i10, int i11, boolean z2) {
        if (i11 == 0) {
            if (i10 == zzh(z2)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == zzh(z2) ? zzg(z2) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i10, int i11, boolean z2) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzbk zzbkVar, zzbj zzbjVar, int i10, long j) {
        Pair pairZzm = zzm(zzbkVar, zzbjVar, i10, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzbk zzbkVar, zzbj zzbjVar, int i10, long j, long j4) {
        zzdd.zza(i10, 0, zzc());
        zze(i10, zzbkVar, j4);
        if (j == -9223372036854775807L) {
            long j10 = zzbkVar.zzl;
            j = 0;
        }
        int i11 = zzbkVar.zzn;
        zzd(i11, zzbjVar, false);
        while (i11 < zzbkVar.zzo) {
            long j11 = zzbjVar.zze;
            if (j == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j12 = zzd(i12, zzbjVar, false).zze;
            if (j < 0) {
                break;
            }
            i11 = i12;
        }
        zzd(i11, zzbjVar, true);
        long j13 = zzbjVar.zze;
        long j14 = zzbjVar.zzd;
        if (j14 != -9223372036854775807L) {
            j = Math.min(j, j14 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzbjVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbj zzn(Object obj, zzbj zzbjVar) {
        return zzd(zza(obj), zzbjVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
