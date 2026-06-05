package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import mc.n;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjt implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzcfeVar.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                editorEdit.remove(jSONArray.getString(i10));
            }
            editorEdit.apply();
        } catch (JSONException e10) {
            n.D.f11582h.zzw(e10, "GMSG clear local storage keys handler");
        }
    }
}
