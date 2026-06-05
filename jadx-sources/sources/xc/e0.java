package xc;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends zzbky {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f19920a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f19921b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgdm f19922c;

    /* renamed from: d, reason: collision with root package name */
    public WebViewClient f19923d;

    public e0(WebView webView, b0 b0Var, zzgdm zzgdmVar) {
        this.f19920a = webView;
        this.f19921b = b0Var;
        this.f19922c = zzgdmVar;
    }

    public static boolean b() {
        if (((Boolean) zzbfh.zza.zze()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z2 = false;
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(e0.class.getName())) {
                        if (!z2 || !z10) {
                            z2 = true;
                        }
                    } else if (z2) {
                        z10 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a() {
        this.f19920a.evaluateJavascript(String.format(Locale.getDefault(), (String) nc.t.f12227d.f12230c.zzb(zzbdc.zzjZ), this.f19921b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        if (b()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final WebViewClient getDelegate() {
        return this.f19923d;
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (b()) {
            return;
        }
        a();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (b()) {
            return;
        }
        a();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (b()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (b()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (b()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (b()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (b()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        if (b()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (b()) {
            return;
        }
        super.onScaleChanged(webView, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbky, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
