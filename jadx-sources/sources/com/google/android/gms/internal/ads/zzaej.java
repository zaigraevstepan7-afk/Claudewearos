package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaej {
    private final zzen zza = new zzen(10);

    public final zzav zza(zzadu zzaduVar, zzaha zzahaVar) {
        zzav zzavVarZza = null;
        int i10 = 0;
        while (true) {
            try {
                zzen zzenVar = this.zza;
                zzaduVar.zzh(zzenVar.zzN(), 0, 10);
                zzenVar.zzL(0);
                if (zzenVar.zzo() != 4801587) {
                    break;
                }
                zzenVar.zzM(3);
                int iZzl = zzenVar.zzl();
                int i11 = iZzl + 10;
                if (zzavVarZza == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(zzenVar.zzN(), 0, bArr, 0, 10);
                    zzaduVar.zzh(bArr, 10, iZzl);
                    zzavVarZza = zzahc.zza(bArr, i11, zzahaVar, new zzago());
                } else {
                    zzaduVar.zzg(iZzl);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzaduVar.zzj();
        zzaduVar.zzg(i10);
        return zzavVarZza;
    }
}
