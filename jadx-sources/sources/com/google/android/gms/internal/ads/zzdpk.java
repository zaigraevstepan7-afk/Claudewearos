package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdpk implements zzcwm {
    private final zzcfe zza;

    public zzdpk(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.onResume();
        }
    }
}
