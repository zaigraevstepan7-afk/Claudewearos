package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzalf implements zzakr {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzale zzc = new zzale();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i11 + i10);
        zzenVar.zzL(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzen zzenVar2 = this.zzb;
        if (zzex.zzO(zzenVar, zzenVar2, this.zzd)) {
            zzenVar.zzJ(zzenVar2.zzN(), zzenVar2.zzd());
        }
        zzale zzaleVar = this.zzc;
        zzaleVar.zze();
        ArrayList arrayList = new ArrayList();
        while (zzenVar.zza() >= 3) {
            int iZzd = zzenVar.zzd();
            int iZzm = zzenVar.zzm();
            int iZzq = zzenVar.zzq();
            int iZzc = zzenVar.zzc() + iZzq;
            zzcu zzcuVarZza = null;
            if (iZzc > iZzd) {
                zzenVar.zzL(iZzd);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzale.zzd(zzaleVar, zzenVar, iZzq);
                            break;
                        case zzbch.zzt.zzm /* 21 */:
                            zzale.zzb(zzaleVar, zzenVar, iZzq);
                            break;
                        case 22:
                            zzale.zzc(zzaleVar, zzenVar, iZzq);
                            break;
                    }
                } else {
                    zzcuVarZza = zzaleVar.zza();
                    zzaleVar.zze();
                }
                zzenVar.zzL(iZzc);
            }
            if (zzcuVarZza != null) {
                arrayList.add(zzcuVarZza);
            }
        }
        zzdnVar.zza(new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
