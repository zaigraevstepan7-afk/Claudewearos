package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeva implements zzetu {
    private final Executor zza;
    private final String zzb;

    public zzeva(zzbzh zzbzhVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        mf.a aVarZzh = zzgdb.zzh(this.zzb);
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzevb((String) obj);
            }
        };
        Executor executor = this.zza;
        return zzgdb.zzf(zzgdb.zzm(aVarZzh, zzfutVar, executor), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzgdb.zzh(new zzevb(this.zza.zzb));
            }
        }, executor);
    }
}
