package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenf implements zzetu {
    private final Executor zza;
    private final zzbzq zzb;

    public zzenf(Executor executor, zzbzq zzbzqVar) {
        this.zza = executor;
        this.zzb = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzde)).booleanValue() ? zzgdb.zzh(new zzeng(null)) : zzgdb.zzm(this.zzb.zzk(), new zzfut() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzeng(arrayList);
            }
        }, this.zza);
    }
}
