package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzht extends zzbl {
    private final int zzb;
    private final zzxc zzc;

    public zzht(boolean z2, zzxc zzxcVar) {
        this.zzc = zzxcVar;
        this.zzb = zzxcVar.zzc();
    }

    private final int zzw(int i10, boolean z2) {
        if (z2) {
            return this.zzc.zzd(i10);
        }
        if (i10 >= this.zzb - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z2) {
        if (z2) {
            return this.zzc.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zza(Object obj) {
        int iZza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzp = zzp(obj2);
            if (iZzp != -1 && (iZza = zzu(iZzp).zza(obj3)) != -1) {
                return zzs(iZzp) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i10, zzbj zzbjVar, boolean z2) {
        int iZzq = zzq(i10);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i10 - zzs(iZzq), zzbjVar, z2);
        zzbjVar.zzc += iZzt;
        if (z2) {
            Object objZzv = zzv(iZzq);
            Object obj = zzbjVar.zzb;
            obj.getClass();
            zzbjVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk zze(int i10, zzbk zzbkVar, long j) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i10 - iZzt, zzbkVar, j);
        Object objZzv = zzv(iZzr);
        if (!zzbk.zza.equals(zzbkVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbkVar.zzb);
        }
        zzbkVar.zzb = objZzv;
        zzbkVar.zzn += iZzs;
        zzbkVar.zzo += iZzs;
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object zzf(int i10) {
        int iZzq = zzq(i10);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i10 - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzg(boolean z2) {
        if (this.zzb != 0) {
            int iZza = z2 ? this.zzc.zza() : 0;
            while (zzu(iZza).zzo()) {
                iZza = zzw(iZza, z2);
                if (iZza == -1) {
                }
            }
            return zzu(iZza).zzg(z2) + zzt(iZza);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzh(boolean z2) {
        int i10 = this.zzb;
        if (i10 != 0) {
            int iZzb = z2 ? this.zzc.zzb() : i10 - 1;
            while (zzu(iZzb).zzo()) {
                iZzb = zzx(iZzb, z2);
                if (iZzb == -1) {
                }
            }
            return zzu(iZzb).zzh(z2) + zzt(iZzb);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzj(int i10, int i11, boolean z2) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i10 - iZzt, i11 == 2 ? 0 : i11, z2);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z2);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z2);
        }
        if (iZzw != -1) {
            return zzu(iZzw).zzg(z2) + zzt(iZzw);
        }
        if (i11 == 2) {
            return zzg(z2);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzk(int i10, int i11, boolean z2) {
        int iZzr = zzr(i10);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i10 - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx).zzh(false) + zzt(iZzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj zzn(Object obj, zzbj zzbjVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzbjVar);
        zzbjVar.zzc += iZzt;
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i10);

    public abstract int zzr(int i10);

    public abstract int zzs(int i10);

    public abstract int zzt(int i10);

    public abstract zzbl zzu(int i10);

    public abstract Object zzv(int i10);
}
