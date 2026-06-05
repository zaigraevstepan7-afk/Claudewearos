package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuv implements zzett {
    private final kc.a zza;
    private final String zzb;
    private final zzfrr zzc;

    public zzeuv(kc.a aVar, String str, zzfrr zzfrrVar) {
        this.zza = aVar;
        this.zzb = str;
        this.zzc = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectX = hj.a.X((JSONObject) obj, "pii");
            kc.a aVar = this.zza;
            if (aVar != null) {
                String str = aVar.f9508a;
                if (!TextUtils.isEmpty(str)) {
                    jSONObjectX.put("rdid", str);
                    jSONObjectX.put("is_lat", aVar.f9509b);
                    jSONObjectX.put("idtype", "adid");
                    zzfrr zzfrrVar = this.zzc;
                    if (zzfrrVar.zzc()) {
                        jSONObjectX.put("paidv1_id_android_3p", zzfrrVar.zzb());
                        jSONObjectX.put("paidv1_creation_time_android_3p", zzfrrVar.zza());
                        return;
                    }
                    return;
                }
            }
            String str2 = this.zzb;
            if (str2 != null) {
                jSONObjectX.put("pdid", str2);
                jSONObjectX.put("pdidtype", "ssaid");
            }
        } catch (JSONException e10) {
            l0.l("Failed putting Ad ID.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
