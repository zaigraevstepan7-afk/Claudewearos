package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import mc.n;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeoo implements zzetu {
    private final zzgdm zza;

    public zzeoo(zzgdm zzgdmVar) {
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                n nVar = n.D;
                nVar.f11584k.getClass();
                return new zzeop(System.currentTimeMillis() - ((o0) nVar.f11582h.zzi()).n().zza());
            }
        });
    }
}
