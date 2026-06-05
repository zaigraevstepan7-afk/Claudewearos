package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdmy implements zzbgb {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdmz zzb;

    public zzdmy(zzdmz zzdmzVar, String str) {
        this.zzb = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzc() {
        zzdmz zzdmzVar = this.zzb;
        if (zzdmzVar.zzd != null) {
            zzdmzVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzd(MotionEvent motionEvent) {
    }
}
