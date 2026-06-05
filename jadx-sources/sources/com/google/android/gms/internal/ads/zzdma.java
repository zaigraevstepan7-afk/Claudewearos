package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdma {
    private final Executor zza;
    private final zzdlv zzb;
    private final zzdrw zzc;

    public zzdma(Executor executor, zzdlv zzdlvVar, zzdrw zzdrwVar) {
        this.zza = executor;
        this.zzb = zzdlvVar;
        this.zzc = zzdrwVar;
    }

    public final mf.a zza(JSONObject jSONObject, String str) {
        mf.a aVarZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgdb.zzh(Collections.EMPTY_LIST);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzc.zza(), zzdrk.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                aVarZzh = zzgdb.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    aVarZzh = zzgdb.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    aVarZzh = "string".equals(strOptString2) ? zzgdb.zzh(new zzdlz(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgdb.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value", null), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdlx
                        @Override // com.google.android.gms.internal.ads.zzfut
                        public final Object apply(Object obj) {
                            return new zzdlz(strOptString, (zzbga) obj);
                        }
                    }, this.zza) : zzgdb.zzh(null);
                }
            }
            arrayList.add(aVarZzh);
        }
        return zzgdb.zzm(zzgdb.zzd(arrayList), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdlz zzdlzVar : (List) obj) {
                    if (zzdlzVar != null) {
                        arrayList2.add(zzdlzVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
