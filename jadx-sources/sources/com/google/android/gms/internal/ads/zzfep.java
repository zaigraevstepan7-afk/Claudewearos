package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfep {
    private final HashMap zza = new HashMap();

    public final zzfeo zza(zzfef zzfefVar, Context context, zzfdx zzfdxVar, zzfev zzfevVar) {
        HashMap map = this.zza;
        zzfeo zzfeoVar = (zzfeo) map.get(zzfefVar);
        if (zzfeoVar != null) {
            return zzfeoVar;
        }
        zzfec zzfecVar = new zzfec(zzfei.zza(zzfefVar, context));
        zzfeo zzfeoVar2 = new zzfeo(zzfecVar, new zzfex(zzfecVar, zzfdxVar, zzfevVar));
        map.put(zzfefVar, zzfeoVar2);
        return zzfeoVar2;
    }
}
