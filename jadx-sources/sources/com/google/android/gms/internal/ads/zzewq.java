package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import nc.t;
import qc.j0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewq implements zzetu {
    private final zzgdm zza;

    public zzewq(zzgdm zzgdmVar) {
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                zzbct zzbctVar = zzbdc.zzZ;
                t tVar = t.f12227d;
                String str = (String) tVar.f12230c.zzb(zzbctVar);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) tVar.f12230c.zzb(zzbdc.zzaa)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, j0.a(str2));
                        }
                    }
                }
                return new zzewr(map);
            }
        });
    }
}
