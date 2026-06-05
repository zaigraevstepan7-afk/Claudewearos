package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzern implements zzetu {
    private final zzgdm zza;
    private final zzdvb zzb;

    public zzern(zzgdm zzgdmVar, zzdvb zzdvbVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdvbVar;
    }

    public static zzero zzc(zzern zzernVar) {
        zzdvb zzdvbVar = zzernVar.zzb;
        return new zzero(zzdvbVar.zzc(), zzdvbVar.zzr(), n.D.f11588o.g(), zzdvbVar.zzp(), zzdvbVar.zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzern.zzc(this.zza);
            }
        });
    }
}
