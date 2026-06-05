package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclt implements zzclb {
    private final zzfbs zza;

    public zzclt(zzfbs zzfbsVar) {
        this.zza = zzfbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception e10) {
            throw new IllegalStateException("Invalid render_in_browser state", e10);
        }
    }
}
