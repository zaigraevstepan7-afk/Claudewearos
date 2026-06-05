package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzys extends zzyp {
    private final boolean zze;
    private final zzyi zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzys(int r5, com.google.android.gms.internal.ads.zzbm r6, int r7, com.google.android.gms.internal.ads.zzyi r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzys.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzys zzysVar, zzys zzysVar2) {
        zzfzq zzfzqVarZza = (zzysVar.zze && zzysVar.zzh) ? zzyu.zzc : zzyu.zzc.zza();
        zzfxu zzfxuVarZzj = zzfxu.zzj();
        boolean z2 = zzysVar.zzf.zzB;
        return zzfxuVarZzj.zzc(Integer.valueOf(zzysVar.zzk), Integer.valueOf(zzysVar2.zzk), zzfzqVarZza).zzc(Integer.valueOf(zzysVar.zzj), Integer.valueOf(zzysVar2.zzj), zzfzqVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzys zzysVar, zzys zzysVar2) {
        zzfxu zzfxuVarZzc = zzfxu.zzj().zzd(zzysVar.zzh, zzysVar2.zzh).zzc(Integer.valueOf(zzysVar.zzm), Integer.valueOf(zzysVar2.zzm), zzfzq.zzc().zza()).zzb(zzysVar.zzn, zzysVar2.zzn).zzb(zzysVar.zzo, zzysVar2.zzo).zzd(zzysVar.zzp, zzysVar2.zzp).zzb(zzysVar.zzq, zzysVar2.zzq).zzd(zzysVar.zzi, zzysVar2.zzi).zzd(zzysVar.zze, zzysVar2.zze).zzd(zzysVar.zzg, zzysVar2.zzg).zzc(Integer.valueOf(zzysVar.zzl), Integer.valueOf(zzysVar2.zzl), zzfzq.zzc().zza());
        boolean z2 = zzysVar.zzs;
        zzfxu zzfxuVarZzd = zzfxuVarZzc.zzd(z2, zzysVar2.zzs);
        boolean z10 = zzysVar.zzt;
        zzfxu zzfxuVarZzd2 = zzfxuVarZzd.zzd(z10, zzysVar2.zzt);
        if (z2 && z10) {
            zzfxuVarZzd2 = zzfxuVarZzd2.zzb(zzysVar.zzu, zzysVar2.zzu);
        }
        return zzfxuVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        zzys zzysVar = (zzys) zzypVar;
        if (!Objects.equals(this.zzd.zzo, zzysVar.zzd.zzo)) {
            return false;
        }
        boolean z2 = this.zzf.zzJ;
        return this.zzs == zzysVar.zzs && this.zzt == zzysVar.zzt;
    }
}
