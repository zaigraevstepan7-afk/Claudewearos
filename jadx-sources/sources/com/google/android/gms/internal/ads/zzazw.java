package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzazw implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbaa zzb;

    public zzazw(zzbaa zzbaaVar, View view) {
        this.zza = view;
        this.zzb = zzbaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
