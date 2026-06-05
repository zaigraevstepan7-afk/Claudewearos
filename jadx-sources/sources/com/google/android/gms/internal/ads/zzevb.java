package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevb implements zzett {
    private final String zza;

    public zzevb(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e10) {
            l0.l("Failed putting Ad ID.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
