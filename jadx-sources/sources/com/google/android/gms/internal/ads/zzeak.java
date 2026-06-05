package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeak {
    private final zzeag zza;
    private final zzgdm zzb;

    public zzeak(zzeag zzeagVar, zzgdm zzgdmVar) {
        this.zza = zzeagVar;
        this.zzb = zzgdmVar;
    }

    public final void zza(zzffw zzffwVar) {
        final zzeag zzeagVar = this.zza;
        Objects.requireNonNull(zzeagVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeagVar.getWritableDatabase();
            }
        };
        zzgdm zzgdmVar = this.zzb;
        zzgdb.zzr(zzgdmVar.zzb(callable), new zzeaj(this, zzffwVar), zzgdmVar);
    }
}
