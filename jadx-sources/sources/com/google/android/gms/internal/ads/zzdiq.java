package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdiq extends zzdir {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdiq(zzfbt zzfbtVar, JSONObject jSONObject) {
        super(zzfbtVar);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectC0 = hj.a.c0(jSONObject, strArr);
        this.zzb = jSONObjectC0 == null ? null : jSONObjectC0.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectC02 = hj.a.c0(jSONObject, strArr2);
        this.zzc = jSONObjectC02 == null ? false : jSONObjectC02.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectC03 = hj.a.c0(jSONObject, strArr3);
        this.zzd = jSONObjectC03 == null ? false : jSONObjectC03.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectC04 = hj.a.c0(jSONObject, strArr4);
        this.zze = jSONObjectC04 == null ? false : jSONObjectC04.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectC05 = hj.a.c0(jSONObject, strArr5);
        this.zzg = jSONObjectC05 != null ? jSONObjectC05.optString(strArr5[0], "") : "";
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final zzfcr zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfcr(jSONObject) : this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final boolean zzg() {
        return this.zzf;
    }
}
