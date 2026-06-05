package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzye extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    public zzye(int i10, zzbm zzbmVar, int i11, zzyi zzyiVar, int i12, boolean z2, zzfvf zzfvfVar, int i13) {
        int i14;
        int iZzc;
        int iHashCode;
        int iZzc2;
        boolean z10;
        super(i10, zzbmVar, i11);
        this.zzh = zzyiVar;
        int i15 = 1;
        int i16 = true != zzyiVar.zzP ? 16 : 24;
        this.zzg = zzyu.zzh(this.zzd.zzd);
        this.zzi = zzmb.zza(i12, false);
        int i17 = 0;
        while (true) {
            int size = zzyiVar.zzp.size();
            i14 = f.API_PRIORITY_OTHER;
            if (i17 >= size) {
                iZzc = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzyu.zzc(this.zzd, (String) zzyiVar.zzp.get(i17), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzk = i17;
        this.zzj = iZzc;
        this.zzl = zzyu.zzb(this.zzd.zzf, 0);
        zzz zzzVar = this.zzd;
        int i18 = zzzVar.zzf;
        this.zzm = i18 == 0 || (i18 & 1) != 0;
        this.zzp = 1 == (zzzVar.zze & 1);
        String str = zzzVar.zzo;
        this.zzw = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i19 = zzzVar.zzG;
        this.zzq = i19;
        this.zzr = zzzVar.zzH;
        int i20 = zzzVar.zzj;
        this.zzs = i20;
        this.zzf = (i20 == -1 || i20 <= zzyiVar.zzs) && (i19 == -1 || i19 <= zzyiVar.zzr) && zzfvfVar.zza(zzzVar);
        String str2 = zzex.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = zzex.zzE(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iZzc2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = zzyu.zzc(this.zzd, strArrSplit[i22], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.zzn = i22;
        this.zzo = iZzc2;
        int i23 = 0;
        while (true) {
            if (i23 >= zzyiVar.zzt.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzyiVar.zzt.get(i23))) {
                i14 = i23;
                break;
            }
            i23++;
        }
        this.zzt = i14;
        this.zzu = (i12 & 384) == 128;
        this.zzv = (i12 & 64) == 64;
        zzyi zzyiVar2 = this.zzh;
        if (zzmb.zza(i12, zzyiVar2.zzR) && ((z10 = this.zzf) || zzyiVar2.zzK)) {
            int i24 = zzyiVar2.zzu.zzb;
            if (zzmb.zza(i12, false) && z10 && this.zzd.zzj != -1 && ((zzyiVar2.zzT || !z2) && (i16 & i12) != 0)) {
                i15 = 2;
            }
        } else {
            i15 = 0;
        }
        this.zze = i15;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzye zzyeVar) {
        boolean z2 = this.zzf;
        zzfzq zzfzqVarZza = (z2 && this.zzi) ? zzyu.zzc : zzyu.zzc.zza();
        zzfxu zzfxuVarZzc = zzfxu.zzj().zzd(this.zzi, zzyeVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzfzq.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zzd(this.zzp, zzyeVar.zzp).zzd(this.zzm, zzyeVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzfzq.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zzd(z2, zzyeVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzfzq.zzc().zza());
        boolean z10 = this.zzh.zzB;
        zzfxu zzfxuVarZzc2 = zzfxuVarZzc.zzd(this.zzu, zzyeVar.zzu).zzd(this.zzv, zzyeVar.zzv).zzd(this.zzw, zzyeVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zzfzqVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zzfzqVarZza);
        if (Objects.equals(this.zzg, zzyeVar.zzg)) {
            zzfxuVarZzc2 = zzfxuVarZzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zzfzqVarZza);
        }
        return zzfxuVarZzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        String str;
        int i10;
        zzye zzyeVar = (zzye) zzypVar;
        boolean z2 = this.zzh.zzN;
        zzz zzzVar = this.zzd;
        int i11 = zzzVar.zzG;
        if (i11 == -1) {
            return false;
        }
        zzz zzzVar2 = zzyeVar.zzd;
        return i11 == zzzVar2.zzG && (str = zzzVar.zzo) != null && TextUtils.equals(str, zzzVar2.zzo) && (i10 = zzzVar.zzH) != -1 && i10 == zzzVar2.zzH && this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
    }
}
