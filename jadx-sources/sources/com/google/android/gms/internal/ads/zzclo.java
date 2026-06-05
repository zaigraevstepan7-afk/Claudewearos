package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import mc.n;
import nc.t;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzclo implements zzclb {
    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkG)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((o0) n.D.f11582h.zzi()).d(Boolean.parseBoolean(str));
    }
}
