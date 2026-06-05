package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzz {
    public static final /* synthetic */ int zzO = 0;
    public final int zzA;
    public final float zzB;
    public final byte[] zzC;
    public final int zzD;
    public final zzk zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    private int zzP;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzav zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzs zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzz(new zzx());
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzz.class == obj.getClass()) {
            zzz zzzVar = (zzz) obj;
            int i11 = this.zzP;
            if ((i11 == 0 || (i10 = zzzVar.zzP) == 0 || i11 == i10) && this.zze == zzzVar.zze && this.zzf == zzzVar.zzf && this.zzg == zzzVar.zzg && this.zzh == zzzVar.zzh && this.zzi == zzzVar.zzi && this.zzp == zzzVar.zzp && this.zzt == zzzVar.zzt && this.zzv == zzzVar.zzv && this.zzw == zzzVar.zzw && this.zzx == zzzVar.zzx && this.zzy == zzzVar.zzy && this.zzA == zzzVar.zzA && this.zzD == zzzVar.zzD && this.zzF == zzzVar.zzF && this.zzG == zzzVar.zzG && this.zzH == zzzVar.zzH && this.zzI == zzzVar.zzI && this.zzJ == zzzVar.zzJ && this.zzK == zzzVar.zzK && this.zzL == zzzVar.zzL && this.zzN == zzzVar.zzN && Float.compare(this.zzz, zzzVar.zzz) == 0 && Float.compare(this.zzB, zzzVar.zzB) == 0 && Objects.equals(this.zza, zzzVar.zza) && Objects.equals(this.zzb, zzzVar.zzb) && this.zzc.equals(zzzVar.zzc) && Objects.equals(this.zzk, zzzVar.zzk) && Objects.equals(this.zzn, zzzVar.zzn) && Objects.equals(this.zzo, zzzVar.zzo) && Objects.equals(this.zzd, zzzVar.zzd) && Arrays.equals(this.zzC, zzzVar.zzC) && Objects.equals(this.zzl, zzzVar.zzl) && Objects.equals(this.zzE, zzzVar.zzE) && Objects.equals(this.zzs, zzzVar.zzs) && zzd(zzzVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzP;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = this.zzc.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzav zzavVar = this.zzl;
        int iHashCode5 = iHashCode4 + (zzavVar == null ? 0 : zzavVar.hashCode());
        String str5 = this.zzn;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.zzB) + ((((Float.floatToIntBits(this.zzz) + ((((((((((((((iHashCode6 + (this.zzo != null ? r0.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31)) * 31) + this.zzA) * 31)) * 31) + this.zzD) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) - 1) * 31) - 1) * 31) + this.zzN;
        this.zzP = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzE);
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        sb2.append(this.zzn);
        sb2.append(", ");
        sb2.append(this.zzo);
        sb2.append(", ");
        sb2.append(this.zzk);
        sb2.append(", ");
        sb2.append(this.zzj);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(", [");
        sb2.append(this.zzv);
        sb2.append(", ");
        sb2.append(this.zzw);
        sb2.append(", ");
        sb2.append(this.zzz);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(this.zzG);
        sb2.append(", ");
        return m6.a.h(sb2, this.zzH, "])");
    }

    public final int zza() {
        int i10;
        int i11 = this.zzv;
        if (i11 == -1 || (i10 = this.zzw) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzx zzb() {
        return new zzx(this, null);
    }

    public final zzz zzc(int i10) {
        zzx zzxVar = new zzx(this, null);
        zzxVar.zzH(i10);
        return new zzz(zzxVar);
    }

    public final boolean zzd(zzz zzzVar) {
        List list = this.zzr;
        int size = list.size();
        List list2 = zzzVar.zzr;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzz(zzx zzxVar) {
        boolean z2;
        String str;
        this.zza = zzxVar.zza;
        String strZzE = zzex.zzE(zzxVar.zzd);
        this.zzd = strZzE;
        if (zzxVar.zzc.isEmpty() && zzxVar.zzb != null) {
            this.zzc = zzfyf.zzo(new zzab(strZzE, zzxVar.zzb));
            this.zzb = zzxVar.zzb;
        } else if (!zzxVar.zzc.isEmpty() && zzxVar.zzb == null) {
            this.zzc = zzxVar.zzc;
            List list = zzxVar.zzc;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzab) list.get(0)).zzb;
                    break;
                }
                zzab zzabVar = (zzab) it.next();
                if (TextUtils.equals(zzabVar.zza, strZzE)) {
                    str = zzabVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        } else if (zzxVar.zzc.isEmpty() && zzxVar.zzb == null) {
            z2 = true;
            zzdd.zzf(z2);
            this.zzc = zzxVar.zzc;
            this.zzb = zzxVar.zzb;
        } else {
            for (int i10 = 0; i10 < zzxVar.zzc.size(); i10++) {
                if (((zzab) zzxVar.zzc.get(i10)).zzb.equals(zzxVar.zzb)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            zzdd.zzf(z2);
            this.zzc = zzxVar.zzc;
            this.zzb = zzxVar.zzb;
        }
        this.zze = zzxVar.zze;
        zzdd.zzg(zzxVar.zzg == 0 || (zzxVar.zzf & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzxVar.zzf;
        this.zzg = zzxVar.zzg;
        int i11 = zzxVar.zzh;
        this.zzh = i11;
        int i12 = zzxVar.zzi;
        this.zzi = i12;
        this.zzj = i12 != -1 ? i12 : i11;
        this.zzk = zzxVar.zzj;
        this.zzl = zzxVar.zzk;
        this.zzm = null;
        this.zzn = zzxVar.zzl;
        this.zzo = zzxVar.zzm;
        this.zzp = zzxVar.zzn;
        this.zzq = zzxVar.zzo;
        this.zzr = zzxVar.zzp == null ? Collections.EMPTY_LIST : zzxVar.zzp;
        zzs zzsVar = zzxVar.zzq;
        this.zzs = zzsVar;
        this.zzt = zzxVar.zzr;
        this.zzu = zzxVar.zzs;
        this.zzv = zzxVar.zzt;
        this.zzw = zzxVar.zzu;
        this.zzx = zzxVar.zzv;
        this.zzy = zzxVar.zzw;
        this.zzz = zzxVar.zzx;
        this.zzA = zzxVar.zzy == -1 ? 0 : zzxVar.zzy;
        this.zzB = zzxVar.zzz == -1.0f ? 1.0f : zzxVar.zzz;
        this.zzC = zzxVar.zzA;
        this.zzD = zzxVar.zzB;
        this.zzE = zzxVar.zzC;
        this.zzF = zzxVar.zzD;
        this.zzG = zzxVar.zzE;
        this.zzH = zzxVar.zzF;
        this.zzI = zzxVar.zzG;
        this.zzJ = zzxVar.zzH == -1 ? 0 : zzxVar.zzH;
        this.zzK = zzxVar.zzI != -1 ? zzxVar.zzI : 0;
        this.zzL = zzxVar.zzJ;
        this.zzM = zzxVar.zzK;
        if (zzxVar.zzL != 0 || zzsVar == null) {
            this.zzN = zzxVar.zzL;
        } else {
            this.zzN = 1;
        }
    }
}
