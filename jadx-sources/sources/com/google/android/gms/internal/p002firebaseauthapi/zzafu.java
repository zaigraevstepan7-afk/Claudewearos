package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ud.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzafu {
    private List<zzafv> zza;

    public zzafu() {
        this.zza = new ArrayList();
    }

    public static zzafu zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzafv() : new zzafv(f.a(jSONObject.optString("federatedId", null)), f.a(jSONObject.optString("displayName", null)), f.a(jSONObject.optString("photoUrl", null)), f.a(jSONObject.optString("providerId", null)), null, f.a(jSONObject.optString("phoneNumber", null)), f.a(jSONObject.optString("email", null))));
        }
        return new zzafu(arrayList);
    }

    private zzafu(List<zzafv> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.EMPTY_LIST;
        }
    }

    public final List<zzafv> zza() {
        return this.zza;
    }
}
