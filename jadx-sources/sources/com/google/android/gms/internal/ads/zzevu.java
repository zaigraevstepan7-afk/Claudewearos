package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevu implements zzetu {
    final zzgdm zza;
    final List zzb;

    public zzevu(zzbcl zzbclVar, zzgdm zzgdmVar, List list) {
        this.zza = zzgdmVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevv(this.zza.zzb);
            }
        });
    }
}
