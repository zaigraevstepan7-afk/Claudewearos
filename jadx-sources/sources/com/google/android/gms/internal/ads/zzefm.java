package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefm implements zzedg {
    private final zzdps zza;

    public zzefm(zzdps zzdpsVar) {
        this.zza = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) {
        return new zzedh(this.zza.zzc(str, jSONObject), new zzeev(), str);
    }
}
