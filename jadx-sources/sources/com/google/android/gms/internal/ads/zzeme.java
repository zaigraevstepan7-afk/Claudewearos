package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeme implements zzetu {
    private final mf.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeme(mf.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzgdb.zzh(new zzemf((String) obj));
            }
        };
        mf.a aVar = this.zza;
        Executor executor = this.zzb;
        mf.a aVarZzn = zzgdb.zzn(aVar, zzgciVar, executor);
        if (((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmI)).intValue() > 0) {
            aVarZzn = zzgdb.zzo(aVarZzn, ((Integer) r3.f12230c.zzb(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgdb.zzf(aVarZzn, Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgdb.zzh(new zzemf(Integer.toString(17))) : zzgdb.zzh(new zzemf(null));
            }
        }, executor);
    }
}
