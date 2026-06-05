package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbis implements zzbkd {
    private final zzbit zza;

    public zzbis(zzbit zzbitVar) {
        this.zza = zzbitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i10 = l0.f13401b;
            k.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleT = null;
        if (map.containsKey("info")) {
            try {
                bundleT = hj.a.T(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                int i11 = l0.f13401b;
                k.e("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundleT != null) {
            this.zza.zza(str, bundleT);
        } else {
            int i12 = l0.f13401b;
            k.d("Failed to convert ad metadata to Bundle.");
        }
    }
}
