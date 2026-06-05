package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfga {
    final /* synthetic */ zzfgk zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfga(zzfgk zzfgkVar, Object obj, List list, zzfgj zzfgjVar) {
        this.zza = zzfgkVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfgi zza(Callable callable) {
        List list = this.zzc;
        zzgcz zzgczVarZzb = zzgdb.zzb(list);
        mf.a aVarZza = zzgczVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcad.zzg);
        zzfgk zzfgkVar = this.zza;
        return new zzfgi(zzfgkVar, this.zzb, aVarZza, list, zzgczVarZzb.zza(callable, zzfgkVar.zzb));
    }
}
