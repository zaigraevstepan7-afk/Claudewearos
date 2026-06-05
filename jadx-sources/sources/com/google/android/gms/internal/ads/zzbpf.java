package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbpf implements zzbks {
    private final zzcai zza;

    public zzbpf(zzbpg zzbpgVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzboj());
            } else {
                this.zza.zzd(new zzboj(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zza.zzd(e10);
        }
    }
}
