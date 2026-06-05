package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.e0;
import java.util.Random;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfjy {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfjy(long j, double d10, long j4, double d11) {
        this.zza = j;
        this.zzb = j4;
        zzc();
    }

    public final long zza() {
        double d10 = this.zze;
        double d11 = 0.2d * d10;
        long j = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzf.nextDouble() * ((j - r0) + 1)));
    }

    public final void zzb() {
        double d10 = this.zze;
        this.zze = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i10) {
        e0.b(i10 > 0);
        this.zzd = i10;
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzC)).intValue()) && this.zze >= this.zzb;
    }
}
