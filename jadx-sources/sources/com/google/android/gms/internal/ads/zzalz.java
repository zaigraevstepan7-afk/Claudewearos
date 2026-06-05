package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzalz implements zzakr {
    private final zzen zza = new zzen();

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        zzcu zzcuVarZzq;
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i11 + i10);
        zzenVar.zzL(i10);
        ArrayList arrayList = new ArrayList();
        while (zzenVar.zza() > 0) {
            zzdd.zze(zzenVar.zza() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzg = zzenVar.zzg() - 8;
            if (zzenVar.zzg() == 1987343459) {
                CharSequence charSequenceZza = null;
                zzcs zzcsVarZzb = null;
                while (iZzg > 0) {
                    zzdd.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzenVar.zzg();
                    int iZzg3 = zzenVar.zzg();
                    int i12 = iZzg - 8;
                    int i13 = iZzg2 - 8;
                    String strZzC = zzex.zzC(zzenVar.zzN(), zzenVar.zzc(), i13);
                    zzenVar.zzM(i13);
                    if (iZzg3 == 1937011815) {
                        zzcsVarZzb = zzamj.zzb(strZzC);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzamj.zza(null, strZzC.trim(), Collections.EMPTY_LIST);
                    }
                    iZzg = i12 - i13;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzcsVarZzb != null) {
                    zzcsVarZzb.zzl(charSequenceZza);
                    zzcuVarZzq = zzcsVarZzb.zzq();
                } else {
                    Pattern pattern = zzamj.zza;
                    zzamh zzamhVar = new zzamh();
                    zzamhVar.zzc = charSequenceZza;
                    zzcuVarZzq = zzamhVar.zza().zzq();
                }
                arrayList.add(zzcuVarZzq);
            } else {
                zzenVar.zzM(iZzg);
            }
        }
        zzdnVar.zza(new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
