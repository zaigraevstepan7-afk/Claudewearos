package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzqt extends zzco {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    @Override // com.google.android.gms.internal.ads.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqt.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzi(zzcl zzclVar) throws zzcm {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i10 = zzclVar.zzd;
        if (!zzex.zzK(i10)) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i11 = zzclVar.zzc;
        boolean z2 = i11 != iArr.length;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            if (i12 >= length) {
                return z2 ? new zzcl(zzclVar.zzb, length, i10) : zzcl.zza;
            }
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new zzcm(m1.j("Channel map (", Arrays.toString(iArr), ") trying to access non-existent input channel."), zzclVar);
            }
            z2 |= i13 != i12;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
