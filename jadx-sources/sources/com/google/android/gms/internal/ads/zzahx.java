package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzahx {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzadu zzaduVar) {
        int i10;
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        int i11 = 0;
        zzadjVar.zzm(zzenVar.zzN(), 0, 1, false);
        int i12 = zzenVar.zzN()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzadjVar.zzm(zzenVar.zzN(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzenVar.zzN()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzadu zzaduVar) throws EOFException, InterruptedIOException {
        long jZzd = zzaduVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        zzadjVar.zzm(zzenVar.zzN(), 0, 4, false);
        this.zzb = 4;
        for (long jZzu = zzenVar.zzu(); jZzu != 440786851; jZzu = ((jZzu << 8) & (-256)) | (zzenVar.zzN()[0] & 255)) {
            int i10 = (int) j;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzadjVar.zzm(zzenVar.zzN(), 0, 1, false);
        }
        long jZzb = zzb(zzaduVar);
        long j4 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j10 = j4 + jZzb;
            if (jZzd == -1 || j10 < jZzd) {
                while (true) {
                    long j11 = this.zzb;
                    if (j11 < j10) {
                        if (zzb(zzaduVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaduVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzadjVar.zzl(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j11 == j10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
