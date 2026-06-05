package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzesg implements zzetu {
    private final zzetu zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzesg(zzetu zzetuVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetuVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public static mf.a zzc(zzesg zzesgVar, Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcx)).booleanValue()) {
            zzetu zzetuVar = zzesgVar.zza;
            n.D.f11582h.zzw(th2, "OptionalSignalTimeout:" + zzetuVar.zza());
        }
        return zzgdb.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        mf.a aVarZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcy)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            aVarZzb = zzgdb.zzo(aVarZzb, j, timeUnit, this.zzc);
        }
        return zzgdb.zzf(aVarZzb, Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzesf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzesg.zzc(this.zza, (Throwable) obj);
            }
        }, zzcad.zzg);
    }
}
