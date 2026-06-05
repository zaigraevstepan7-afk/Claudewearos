package com.google.android.recaptcha.internal;

import mk.b;
import nj.e;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strO0 = e.O0(10, String.valueOf(this.zzb / this.zza));
        String strO02 = e.O0(10, String.valueOf(this.zzc));
        String strO03 = e.O0(10, String.valueOf(this.zzb));
        String strO04 = e.O0(5, String.valueOf(this.zza));
        StringBuilder sbM = m1.m("avgExecutionTime: ", strO0, " us| maxExecutionTime: ", strO02, " us| totalTime: ");
        sbM.append(strO03);
        sbM.append(" us| #Usages: ");
        sbM.append(strO04);
        return sbM.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        return b.l(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
