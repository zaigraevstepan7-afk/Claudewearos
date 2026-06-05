package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewn implements zzett {
    private final String zza;

    public zzewn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.zza;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            hj.a.X(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.h("Failed putting trustless token.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
