package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzckz {
    private final Map zza;
    private final Map zzb;

    public zzckz(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfcf zzfcfVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfcd zzfcdVar : zzfcfVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfcdVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfcdVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfcdVar.zzb) != null) {
                    zzclb zzclbVar = (zzclb) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzclbVar.zza(map3);
                }
            } else {
                ((zzclc) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
