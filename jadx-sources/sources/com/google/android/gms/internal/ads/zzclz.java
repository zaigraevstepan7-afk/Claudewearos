package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclz implements zzclb {
    private final zzdvb zza;

    public zzclz(zzdvb zzdvbVar) {
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals("true"));
    }
}
