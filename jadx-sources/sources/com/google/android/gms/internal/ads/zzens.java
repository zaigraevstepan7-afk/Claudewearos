package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzens implements zzetu {
    private final zzgdm zza;
    private final rc.a zzb;

    public zzens(rc.a aVar, zzgdm zzgdmVar) {
        this.zzb = aVar;
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzent.zzc(this.zza.zzb);
            }
        });
    }
}
