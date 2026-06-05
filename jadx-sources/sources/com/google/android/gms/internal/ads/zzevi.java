package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevi implements zzetu {
    final zzgdm zza;

    public zzevi(zzbbp zzbbpVar, zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevj(new JSONObject());
            }
        });
    }
}
