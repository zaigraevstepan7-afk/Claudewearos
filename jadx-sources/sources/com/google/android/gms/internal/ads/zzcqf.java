package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqf implements zzazb {
    private final zzcfe zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqf(zzcfe zzcfeVar, Executor executor) {
        this.zza = zzcfeVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(zzaza zzazaVar) {
        final zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmO)).booleanValue()) {
                if (zzazaVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfeVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfeVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
