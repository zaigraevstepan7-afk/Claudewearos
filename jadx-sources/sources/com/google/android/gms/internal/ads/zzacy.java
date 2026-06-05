package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzacy {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzacy(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzacy zza(zzen zzenVar) throws zzaz {
        String strZzc;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            zzenVar.zzM(4);
            int iZzm = (zzenVar.zzm() & 3) + 1;
            if (iZzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzenVar.zzm() & 31;
            for (int i18 = 0; i18 < iZzm2; i18++) {
                arrayList.add(zzb(zzenVar));
            }
            int iZzm3 = zzenVar.zzm();
            for (int i19 = 0; i19 < iZzm3; i19++) {
                arrayList.add(zzb(zzenVar));
            }
            if (iZzm2 > 0) {
                zzfu zzfuVarZzg = zzfv.zzg((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i20 = zzfuVarZzg.zze;
                int i21 = zzfuVarZzg.zzf;
                int i22 = zzfuVarZzg.zzh + 8;
                int i23 = zzfuVarZzg.zzi + 8;
                int i24 = zzfuVarZzg.zzj;
                int i25 = zzfuVarZzg.zzk;
                int i26 = zzfuVarZzg.zzl;
                int i27 = zzfuVarZzg.zzm;
                float f11 = zzfuVarZzg.zzg;
                strZzc = zzdk.zzc(zzfuVarZzg.zza, zzfuVarZzg.zzb, zzfuVarZzg.zzc);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strZzc = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new zzacy(arrayList, iZzm, i10, i11, i12, i13, i16, i17, i14, i15, f10, strZzc);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzaz.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzen zzenVar) {
        int iZzq = zzenVar.zzq();
        int iZzc = zzenVar.zzc();
        zzenVar.zzM(iZzq);
        return zzdk.zze(zzenVar.zzN(), iZzc, iZzq);
    }
}
