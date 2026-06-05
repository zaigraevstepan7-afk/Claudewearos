package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzx {
    private zzgdm zza;
    private zzdsc zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private long zze = -1;
    private long zzf = -1;

    public static void zza(zzbzx zzbzxVar) throws InterruptedException {
        zzdsc zzdscVar;
        while (zzbzxVar.zzd.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzv
                @Override // java.lang.Runnable
                public final void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(zzbzxVar.zze);
                if (!atomicBoolean.get()) {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznI)).booleanValue() && (zzdscVar = zzbzxVar.zzb) != null) {
                        zzdsb zzdsbVarZza = zzdscVar.zza();
                        zzdsbVarZza.zzb("action", "paa");
                        zzdsbVarZza.zzi();
                    }
                }
                do {
                    try {
                        Thread.sleep(zzbzxVar.zzf);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final void zzb(zzgdm zzgdmVar, zzdsc zzdscVar) {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza = zzgdmVar;
        this.zzb = zzdscVar;
        zzbct zzbctVar = zzbdc.zznG;
        t tVar = t.f12227d;
        this.zze = ((Long) tVar.f12230c.zzb(zzbctVar)).longValue();
        this.zzf = ((Long) tVar.f12230c.zzb(zzbdc.zznH)).longValue();
    }

    public final void zzc() {
        zzgdm zzgdmVar;
        if (!this.zzc.get() || this.zze < 0 || this.zzf < 0 || !this.zzd.compareAndSet(false, true) || (zzgdmVar = this.zza) == null) {
            return;
        }
        zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzw
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                zzbzx.zza(this.zza);
            }
        });
    }
}
