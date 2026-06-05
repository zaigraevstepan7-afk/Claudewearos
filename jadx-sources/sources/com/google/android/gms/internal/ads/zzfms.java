package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfms implements Runnable {
    final /* synthetic */ zzfmt zza;
    private final WebView zzb;

    public zzfms(zzfmt zzfmtVar) {
        this.zza = zzfmtVar;
        this.zzb = zzfmtVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
