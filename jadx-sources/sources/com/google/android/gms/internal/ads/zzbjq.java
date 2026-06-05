package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjq implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        try {
            String str = (String) map.get("enabled");
            zzbkd zzbkdVar = zzbkc.zza;
            if (!zzfuk.zzc("true", str) && !zzfuk.zzc("false", str)) {
                return;
            }
            zzfrs.zza(zzcfeVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            n.D.f11582h.zzw(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
