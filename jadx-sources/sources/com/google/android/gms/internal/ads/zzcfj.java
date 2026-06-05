package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcfj implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxy zza;
    final /* synthetic */ zzcfm zzb;

    public zzcfj(zzcfm zzcfmVar, zzbxy zzbxyVar) {
        this.zza = zzbxyVar;
        this.zzb = zzcfmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzac(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
