package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzazy implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzazq zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbaa zze;

    public zzazy(zzbaa zzbaaVar, final zzazq zzazqVar, final WebView webView, final boolean z2) {
        this.zzb = zzazqVar;
        this.zzc = webView;
        this.zzd = z2;
        this.zze = zzbaaVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazx
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.zze.zzc(zzazqVar, webView, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
