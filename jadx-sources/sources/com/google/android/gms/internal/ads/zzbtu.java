package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtu {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtu(boolean z2, String str, boolean z10) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = z10;
    }

    public static zzbtu zza(JSONObject jSONObject) {
        return new zzbtu(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
