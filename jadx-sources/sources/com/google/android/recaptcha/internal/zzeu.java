package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import fj.l;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import pi.a;
import qj.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzeu extends WebViewClient {
    final /* synthetic */ zzez zza;

    public zzeu(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.INIT_NETWORK));
        long jZza = this.zza.zzn.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        zzv.zza(zzx.zzl.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @a
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzn zznVar = zzn.zze;
        zzl zzlVar = (zzl) this.zza.zzk.get(Integer.valueOf(i10));
        if (zzlVar == null) {
            zzlVar = zzl.zzY;
        }
        zzp zzpVar = new zzp(zznVar, zzlVar, null);
        this.zza.zzk().hashCode();
        zzpVar.getMessage();
        ((r) this.zza.zzk()).h0(zzpVar);
    }

    @Override // android.webkit.WebViewClient
    @a
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        zzfb zzfbVar = zzfb.zza;
        l.c(uri);
        if (!zzfb.zzb(uri) || zzfb.zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp zzpVar = new zzp(zzn.zzc, zzl.zzac, null);
        this.zza.zzk().hashCode();
        uri.toString();
        ((r) this.zza.zzk()).h0(zzpVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
