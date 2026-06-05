package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaeb {
    public static zzav zza(zzadu zzaduVar, boolean z2) {
        zzav zzavVarZza = new zzaej().zza(zzaduVar, z2 ? null : zzahc.zza);
        if (zzavVarZza == null || zzavVarZza.zza() == 0) {
            return null;
        }
        return zzavVarZza;
    }

    public static zzaed zzb(zzen zzenVar) {
        zzenVar.zzM(1);
        int iZzo = zzenVar.zzo();
        long jZzc = zzenVar.zzc();
        long j = iZzo;
        int i10 = iZzo / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jZzt = zzenVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZzt;
            jArrCopyOf2[i11] = zzenVar.zzt();
            zzenVar.zzM(2);
            i11++;
        }
        zzenVar.zzM((int) ((jZzc + j) - zzenVar.zzc()));
        return new zzaed(jArrCopyOf, jArrCopyOf2);
    }
}
