package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeom implements zzetu {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final ud.a zzc;
    private final Executor zzd;
    private final zzetu zze;
    private final long zzf;
    private final zzdsc zzg;

    public zzeom(zzetu zzetuVar, long j, ud.a aVar, Executor executor, zzdsc zzdscVar) {
        this.zzc = aVar;
        this.zze = zzetuVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzeol zzeolVar;
        zzbct zzbctVar = zzbdc.zzlZ;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzlY)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcad.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeom zzeomVar = this.zza;
                        zzeomVar.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeok
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeom zzeomVar2 = zzeomVar;
                                zzeomVar2.zza.set(new zzeol(zzeomVar2.zze.zzb(), zzeomVar2.zzf, zzeomVar2.zzc));
                            }
                        });
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzeol zzeolVar2 = (zzeol) atomicReference.get();
                    if (zzeolVar2 == null) {
                        zzeol zzeolVar3 = new zzeol(this.zze.zzb(), this.zzf, this.zzc);
                        atomicReference.set(zzeolVar3);
                        return zzeolVar3.zza;
                    }
                    if (((Boolean) this.zzb.get()).booleanValue() || !zzeolVar2.zza()) {
                        zzeolVar = zzeolVar2;
                    } else {
                        mf.a aVar = zzeolVar2.zza;
                        zzetu zzetuVar = this.zze;
                        zzeol zzeolVar4 = new zzeol(zzetuVar.zzb(), this.zzf, this.zzc);
                        this.zza.set(zzeolVar4);
                        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzma)).booleanValue()) {
                            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzmb)).booleanValue()) {
                                zzdsb zzdsbVarZza = this.zzg.zza();
                                zzdsbVarZza.zzb("action", "scs");
                                zzdsbVarZza.zzb("sid", String.valueOf(zzetuVar.zza()));
                                zzdsbVarZza.zzj();
                            }
                            return aVar;
                        }
                        zzeolVar = zzeolVar4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeolVar = (zzeol) atomicReference2.get();
            if (zzeolVar == null || zzeolVar.zza()) {
                zzetu zzetuVar2 = this.zze;
                zzeol zzeolVar5 = new zzeol(zzetuVar2.zzb(), this.zzf, this.zzc);
                atomicReference2.set(zzeolVar5);
                zzeolVar = zzeolVar5;
            }
        }
        return zzeolVar.zza;
    }
}
