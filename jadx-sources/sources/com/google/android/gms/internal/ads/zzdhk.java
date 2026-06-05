package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdhk implements zzhfy {
    private final zzdhi zza;

    public zzdhk(zzdhi zzdhiVar) {
        this.zza = zzdhiVar;
    }

    public static JSONObject zza(zzdhi zzdhiVar) {
        JSONObject jSONObjectZzd = zzdhiVar.zzd();
        zzhgg.zzb(jSONObjectZzd);
        return jSONObjectZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
