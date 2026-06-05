package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbox implements zzbks {
    final /* synthetic */ zzboy zza;
    private final zzboa zzb;
    private final zzcai zzc;

    public zzbox(zzboy zzboyVar, zzboa zzboaVar, zzcai zzcaiVar) {
        this.zza = zzboyVar;
        this.zzb = zzboaVar;
        this.zzc = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzboj());
            } else {
                this.zzc.zzd(new zzboj(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zzb();
            throw th2;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
