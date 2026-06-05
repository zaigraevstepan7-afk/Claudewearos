package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadx {
    public static int zza(zzadu zzaduVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iZzb = zzaduVar.zzb(bArr, i10 + i12, i11 - i12);
            if (iZzb == -1) {
                break;
            }
            i12 += iZzb;
        }
        return i12;
    }

    public static void zzb(boolean z2, String str) throws zzaz {
        if (!z2) {
            throw zzaz.zza(str, null);
        }
    }

    public static boolean zzc(zzadu zzaduVar, byte[] bArr, int i10, int i11, boolean z2) throws EOFException {
        try {
            return zzaduVar.zzm(bArr, 0, i11, z2);
        } catch (EOFException e10) {
            if (z2) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzadu zzaduVar, byte[] bArr, int i10, int i11) {
        try {
            zzaduVar.zzi(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzadu zzaduVar, int i10) {
        try {
            zzaduVar.zzk(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
