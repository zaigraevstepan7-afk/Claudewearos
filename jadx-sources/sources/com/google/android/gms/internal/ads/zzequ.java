package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzequ implements zzetu {
    private final zzgdm zza;

    public zzequ(zzgdm zzgdmVar) {
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                n nVar = n.D;
                qc.n nVar2 = nVar.f11588o;
                synchronized (nVar2.f13406a) {
                    str = nVar2.f13408c;
                }
                return new zzeqv(str, nVar.f11588o.h());
            }
        });
    }
}
