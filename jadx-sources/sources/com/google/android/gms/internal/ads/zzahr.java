package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzahr {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahy zzc = new zzahy();
    private zzahs zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadu zzaduVar, int i10) {
        zzaduVar.zzi(this.zza, 0, i10);
        long j = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j = (j << 8) | (r0[i11] & 255);
        }
        return j;
    }

    public final void zza(zzahs zzahsVar) {
        this.zzd = zzahsVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadu r14) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zzc(com.google.android.gms.internal.ads.zzadu):boolean");
    }
}
