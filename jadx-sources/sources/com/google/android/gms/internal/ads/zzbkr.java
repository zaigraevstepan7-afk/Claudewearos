package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbkr implements zzbks {
    final /* synthetic */ zzcai zza;

    public zzbkr(zzbkt zzbktVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zza(String str) {
        this.zza.zzd(new zzboj(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
