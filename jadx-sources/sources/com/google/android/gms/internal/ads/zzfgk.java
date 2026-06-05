package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfgk {
    private static final mf.a zza = zzgdb.zzh(null);
    private final zzgdm zzb;
    private final ScheduledExecutorService zzc;
    private final zzfgl zzd;

    public zzfgk(zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzfgl zzfglVar) {
        this.zzb = zzgdmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfglVar;
    }

    public final zzfga zza(Object obj, mf.a... aVarArr) {
        return new zzfga(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzfgi zzb(Object obj, mf.a aVar) {
        return new zzfgi(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    public abstract String zzf(Object obj);
}
