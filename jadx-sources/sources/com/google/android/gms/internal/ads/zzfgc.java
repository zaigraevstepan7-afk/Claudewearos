package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfgc {
    public static final zzfgi zza(Callable callable, Object obj, zzfgk zzfgkVar) {
        return zzb(callable, zzfgkVar.zzb, obj, zzfgkVar);
    }

    public static final zzfgi zzb(Callable callable, zzgdm zzgdmVar, Object obj, zzfgk zzfgkVar) {
        return new zzfgi(zzfgkVar, obj, zzfgk.zza, Collections.EMPTY_LIST, zzgdmVar.zzb(callable));
    }

    public static final zzfgi zzc(mf.a aVar, Object obj, zzfgk zzfgkVar) {
        return new zzfgi(zzfgkVar, obj, zzfgk.zza, Collections.EMPTY_LIST, aVar);
    }

    public static final zzfgi zzd(final zzffx zzffxVar, zzgdm zzgdmVar, Object obj, zzfgk zzfgkVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffxVar.zza();
                return null;
            }
        }, zzgdmVar, obj, zzfgkVar);
    }
}
