package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbdp {
    private final Map zza = new HashMap();
    private final zzbdr zzb;

    public zzbdp(zzbdr zzbdrVar) {
        this.zzb = zzbdrVar;
    }

    public final zzbdr zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbdo zzbdoVar) {
        this.zza.put(str, zzbdoVar);
    }

    public final void zzc(String str, String str2, long j) {
        Map map = this.zza;
        zzbdo zzbdoVar = (zzbdo) map.get(str2);
        String[] strArr = {str};
        if (zzbdoVar != null) {
            this.zzb.zze(zzbdoVar, j, strArr);
        }
        map.put(str, new zzbdo(j, null, null));
    }
}
