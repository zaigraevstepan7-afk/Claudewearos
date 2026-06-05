package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbsl implements View.OnClickListener {
    final /* synthetic */ zzbsm zza;

    public zzbsl(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
