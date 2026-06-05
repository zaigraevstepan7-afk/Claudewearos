package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzyn extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyn(int i10, zzbm zzbmVar, int i11, zzyi zzyiVar, int i12, String str, String str2) {
        int iZzc;
        super(i10, zzbmVar, i11);
        int i13 = 0;
        this.zzf = zzmb.zza(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzyiVar.zzy;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzfyf zzfyfVarZzo = str2 != null ? zzfyf.zzo(str2) : zzyiVar.zzv.isEmpty() ? zzfyf.zzo("") : zzyiVar.zzv;
        int i16 = 0;
        while (true) {
            if (i16 >= zzfyfVarZzo.size()) {
                i16 = f.API_PRIORITY_OTHER;
                iZzc = 0;
                break;
            } else {
                iZzc = zzyu.zzc(this.zzd, (String) zzfyfVarZzo.get(i16), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzc;
        int iZzb = zzyu.zzb(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int iZzc2 = zzyu.zzc(this.zzd, str, zzyu.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z2 = iZzc > 0 || (zzyiVar.zzv.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzmb.zza(i12, zzyiVar.zzR) && z2) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyn zzynVar) {
        zzfxu zzfxuVarZzc = zzfxu.zzj().zzd(this.zzf, zzynVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzynVar.zzi), zzfzq.zzc().zza());
        int i10 = this.zzj;
        zzfxu zzfxuVarZzb = zzfxuVarZzc.zzb(i10, zzynVar.zzj);
        int i11 = this.zzk;
        zzfxu zzfxuVarZzb2 = zzfxuVarZzb.zzb(i11, zzynVar.zzk).zzd(this.zzg, zzynVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzynVar.zzh), i10 == 0 ? zzfzq.zzc() : zzfzq.zzc().zza()).zzb(this.zzl, zzynVar.zzl);
        if (i11 == 0) {
            zzfxuVarZzb2 = zzfxuVarZzb2.zze(this.zzm, zzynVar.zzm);
        }
        return zzfxuVarZzb2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        return false;
    }
}
