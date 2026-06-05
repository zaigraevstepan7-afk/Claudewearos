package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbt extends WebViewClient {
    final /* synthetic */ zzbv zza;

    public /* synthetic */ zzbt(zzbv zzbvVar, zzbu zzbuVar) {
        this.zza = zzbvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzbv zzbvVar = this.zza;
        if (zzbv.zzf(zzbvVar, str)) {
            zzbvVar.zzb.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzbv zzbvVar = this.zza;
        if (zzbvVar.zzc) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbvVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zza.zzb.zzf(i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, string)) {
            return false;
        }
        zzbvVar.zzb.zze(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, str)) {
            return false;
        }
        zzbvVar.zzb.zze(str);
        return true;
    }
}
