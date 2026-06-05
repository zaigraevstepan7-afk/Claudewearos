package com.google.android.gms.internal.ads;

import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdtg {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdtg(String str, zzdth zzdthVar) {
        this.zzb = str;
    }

    public static String zza(zzdtg zzdtgVar) throws JSONException {
        String str = (String) t.f12227d.f12230c.zzb(zzbdc.zzkk);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtgVar.zza);
            jSONObject.put("eventCategory", zzdtgVar.zzb);
            jSONObject.putOpt("event", zzdtgVar.zzc);
            jSONObject.putOpt("errorCode", zzdtgVar.zzd);
            jSONObject.putOpt("rewardType", zzdtgVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtgVar.zzf);
        } catch (JSONException unused) {
            int i10 = l0.f13401b;
            k.g("Could not convert parameters to JSON.");
        }
        return gk.b.n(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
