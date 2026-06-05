package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevq implements zzetu {
    public zzevq(zzbze zzbzeVar, zzgdm zzgdmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        final mf.a aVarZzh = zzgdb.zzh(null);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfY)).booleanValue()) {
            aVarZzh = zzgdb.zzh(null);
        }
        final mf.a aVarZzh2 = zzgdb.zzh(null);
        return zzgdb.zzc(aVarZzh, aVarZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevr((String) aVarZzh.get(), (String) aVarZzh2.get());
            }
        }, zzcad.zza);
    }
}
