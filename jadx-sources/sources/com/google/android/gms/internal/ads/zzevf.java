package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevf implements zzett {
    final String zza;
    final int zzb;

    public zzevf(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        int i10;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i10 = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectX = hj.a.X(jSONObject, "pii");
            jSONObjectX.put("pvid", str);
            jSONObjectX.put("pvid_s", i10);
        } catch (JSONException e10) {
            l0.l("Failed putting gms core app set ID info.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
