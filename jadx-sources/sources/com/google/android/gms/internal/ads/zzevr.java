package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevr implements zzett {
    private final String zza;
    private final String zzb;

    public zzevr(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectX = hj.a.X((JSONObject) obj, "pii");
            jSONObjectX.put("doritos", this.zza);
            jSONObjectX.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            l0.k("Failed putting doritos string.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
