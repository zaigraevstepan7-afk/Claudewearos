package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mc.n;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkt implements zzbkd {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbks zzbksVar = (zzbks) this.zzb.remove(str);
                if (zzbksVar == null) {
                    int i10 = l0.f13401b;
                    k.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbksVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    zzbksVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (l0.m()) {
                        l0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbksVar.zzb(jSONObject);
                } catch (JSONException e10) {
                    zzbksVar.zza(e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final mf.a zzb(zzbnk zzbnkVar, String str, JSONObject jSONObject) throws JSONException {
        zzcai zzcaiVar = new zzcai();
        r0 r0Var = n.D.f11577c;
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbkr(this, zzcaiVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbnkVar.zzp(str, jSONObject2);
            return zzcaiVar;
        } catch (Exception e10) {
            zzcaiVar.zzd(e10);
            return zzcaiVar;
        }
    }

    public final void zzc(String str, zzbks zzbksVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbksVar);
        }
    }
}
