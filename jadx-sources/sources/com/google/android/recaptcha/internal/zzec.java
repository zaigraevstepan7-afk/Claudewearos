package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzec {
    public static final zzeb zza = new zzeb(null);
    private static final zzea zzb = new zzea(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzea zzc;
    private long zzd;

    public zzec(long j, long j4, zzea zzeaVar) {
        this.zzc = zzeaVar;
        this.zzd = Math.abs(j);
    }

    public final long zza() {
        zzea zzeaVar = this.zzc;
        long jLongValue = (BigInteger.valueOf(zzeaVar.zzb()).multiply(BigInteger.valueOf(this.zzd)).mod(BigInteger.valueOf(zzeaVar.zza())).longValue() + 11) % this.zzc.zza();
        this.zzd = jLongValue;
        return jLongValue % 255;
    }
}
