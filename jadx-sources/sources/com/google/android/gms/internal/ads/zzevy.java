package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.s;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzevy implements zzett {
    private final Bundle zza;

    public zzevy(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                hj.a.X(hj.a.X(jSONObject, "device"), "play_store").put("parental_controls", s.f12202f.f12203a.j(bundle));
            } catch (JSONException unused) {
                l0.k("Failed putting parental controls bundle.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
