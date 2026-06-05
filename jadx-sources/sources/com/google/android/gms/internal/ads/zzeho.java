package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeho implements zzedg {
    private final Map zza = new HashMap();
    private final zzdps zzb;

    public zzeho(zzdps zzdpsVar) {
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) {
        zzedh zzedhVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzedhVar = (zzedh) map.get(str);
                if (zzedhVar == null) {
                    zzedhVar = new zzedh(this.zzb.zzc(str, jSONObject), new zzeew(), str);
                    map.put(str, zzedhVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzedhVar;
    }
}
