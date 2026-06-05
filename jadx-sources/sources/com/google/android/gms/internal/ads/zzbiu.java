package com.google.android.gms.internal.ads;

import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbiu implements zzbkd {
    private final zzbiv zza;

    public zzbiu(zzbiv zzbivVar) {
        this.zza = zzbivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i10 = l0.f13401b;
            k.g("App event with no name parameter.");
        }
    }
}
