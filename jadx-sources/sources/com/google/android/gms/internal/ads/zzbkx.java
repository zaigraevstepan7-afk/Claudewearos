package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.e0;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkx implements zzbkd {
    private final zzdvb zza;

    public zzbkx(zzdvb zzdvbVar) {
        e0.j(zzdvbVar, "The Inspector Manager must not be null");
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
