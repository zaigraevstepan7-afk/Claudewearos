package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@TargetApi(zzbch.zzt.zzm)
/* loaded from: classes.dex */
public final class zzcgn extends zzcgm {
    public zzcgn(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z2, zzecd zzecdVar) {
        super(zzcfeVar, zzbcaVar, z2, zzecdVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzY(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
