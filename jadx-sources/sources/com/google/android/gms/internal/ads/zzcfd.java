package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import mc.n;
import pc.i;
import qc.l0;
import qc.r0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcfd extends WebChromeClient {
    private final zzcfe zza;

    public zzcfd(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcfe)) {
            return webView.getContext();
        }
        zzcfe zzcfeVar = (zzcfe) webView;
        Activity activityZzi = zzcfeVar.zzi();
        return activityZzi != null ? activityZzi : zzcfeVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfe)) {
            int i10 = l0.f13401b;
            k.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        i iVarZzL = ((zzcfe) webView).zzL();
        if (iVarZzL != null) {
            iVarZzL.zzb();
        } else {
            int i11 = l0.f13401b;
            k.g("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strH = m6.a.h(m1.m("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strH.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcfc.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            int i11 = l0.f13401b;
            k.d(strH);
        } else if (i10 == 2) {
            int i12 = l0.f13401b;
            k.g(strH);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            int i13 = l0.f13401b;
            k.f(strH);
        } else {
            int i14 = l0.f13401b;
            k.b(strH);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar.zzH() != null) {
            webView2.setWebViewClient(zzcfeVar.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j4, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j4 > j11 || j4 > 1048576) {
                j4 = 0;
            }
        } else if (j4 == 0) {
            j4 = Math.min(Math.min(131072L, j11) + j, 1048576L);
        } else {
            if (j4 <= Math.min(1048576 - j, j11)) {
                j += j4;
            }
            j4 = j;
        }
        quotaUpdater.updateQuota(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r7, android.webkit.GeolocationPermissions.Callback r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L57
            com.google.android.gms.internal.ads.zzcfe r0 = r6.zza
            mc.n r1 = mc.n.D
            qc.r0 r2 = r1.f11577c
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = qc.r0.b(r2, r3)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L24
            qc.r0 r1 = r1.f11577c
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = qc.r0.b(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r4
            goto L27
        L26:
            r0 = r3
        L27:
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zznr
            nc.t r2 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r5 = r2.f12230c
            java.lang.Object r1 = r5.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r8.invoke(r7, r3, r4)
            goto L40
        L3d:
            r8.invoke(r7, r0, r4)
        L40:
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzns
            com.google.android.gms.internal.ads.zzbda r8 = r2.f12230c
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L57
            int r7 = qc.l0.f13401b
            java.lang.String r7 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            rc.k.b(r7)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfd.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        i iVarZzL = this.zza.zzL();
        if (iVarZzL != null) {
            iVarZzL.zzg();
        } else {
            int i10 = l0.f13401b;
            k.g("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        i iVarZzL = this.zza.zzL();
        if (iVarZzL == null) {
            int i11 = l0.f13401b;
            k.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = iVarZzL.f12841a;
        FrameLayout frameLayout = new FrameLayout(activity);
        iVarZzL.f12847z = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        iVarZzL.f12847z.addView(view, -1, -1);
        activity.setContentView(iVarZzL.f12847z);
        iVarZzL.J = true;
        iVarZzL.A = customViewCallback;
        iVarZzL.f12846f = true;
        iVarZzL.n(i10);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z2) {
        zzcfe zzcfeVar;
        mc.b bVarZzd;
        try {
            zzcfeVar = this.zza;
        } catch (WindowManager.BadTokenException e10) {
            int i10 = l0.f13401b;
            k.h("Fail to display Dialog.", e10);
        }
        if (zzcfeVar != null && zzcfeVar.zzN() != null && zzcfeVar.zzN().zzd() != null && (bVarZzd = zzcfeVar.zzN().zzd()) != null && !bVarZzd.b()) {
            bVarZzd.a("window." + str + "('" + str3 + "')");
            return false;
        }
        r0 r0Var = n.D.f11577c;
        AlertDialog.Builder builderJ = r0.j(context);
        builderJ.setTitle(str2);
        if (z2) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderJ.setView(linearLayout).setPositiveButton(R.string.ok, new zzcfb(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcfa(jsPromptResult)).setOnCancelListener(new zzcez(jsPromptResult)).create().show();
        } else {
            builderJ.setMessage(str3).setPositiveButton(R.string.ok, new zzcey(jsResult)).setNegativeButton(R.string.cancel, new zzcex(jsResult)).setOnCancelListener(new zzcew(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
