package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.g;
import mc.k;
import mc.n;
import nc.s;
import nc.t;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import pc.i;
import qc.k0;
import qc.l0;
import qc.m0;
import qc.r0;
import t.m1;
import u6.v;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
final class zzcgd extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfe {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcgg zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbgb zzE;
    private zzbfz zzF;
    private zzbao zzG;
    private int zzH;
    private int zzI;
    private zzbdo zzJ;
    private final zzbdo zzK;
    private zzbdo zzL;
    private final zzbdp zzM;
    private int zzN;
    private i zzO;
    private boolean zzP;
    private final k0 zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbca zzY;
    private boolean zzZ;
    private final zzcgx zzb;
    private final zzavs zzc;
    private final zzfcs zzd;
    private final zzbej zze;
    private final rc.a zzf;
    private k zzg;
    private final mc.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfbt zzk;
    private zzfbw zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfm zzo;
    private i zzp;
    private zzecz zzq;
    private zzecx zzr;
    private zzcgy zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcgd(zzcgx zzcgxVar, zzcgy zzcgyVar, String str, boolean z2, boolean z10, zzavs zzavsVar, zzbej zzbejVar, rc.a aVar, zzbdr zzbdrVar, k kVar, mc.a aVar2, zzbca zzbcaVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzfcs zzfcsVar) throws PackageManager.NameNotFoundException {
        zzfbw zzfbwVar2;
        super(zzcgxVar);
        boolean z11 = false;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcgxVar;
        this.zzs = zzcgyVar;
        this.zzt = str;
        this.zzw = z2;
        this.zzc = zzavsVar;
        this.zzd = zzfcsVar;
        this.zze = zzbejVar;
        this.zzf = aVar;
        this.zzg = kVar;
        this.zzh = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        r0 r0Var = n.D.f11577c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.zzi = displayMetrics;
        this.zzj = displayMetrics.density;
        this.zzY = zzbcaVar;
        this.zzk = zzfbtVar;
        this.zzl = zzfbwVar;
        this.zzQ = new k0(zzcgxVar.zza(), this, this);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlP)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            int i10 = l0.f13401b;
            rc.k.e("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbct zzbctVar = zzbdc.zzlO;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        boolean zBooleanValue = ((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue();
        int i11 = 2;
        if (zBooleanValue) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zznq)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        n nVar = n.D;
        settings.setUserAgentString(nVar.f11577c.y(zzcgxVar, aVar.f14321a));
        Context context = getContext();
        v.m0(context, new g(i11, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgk(this, new zzcgj(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbdp zzbdpVar = new zzbdp(new zzbdr(true, "make_wv", this.zzt));
        this.zzM = zzbdpVar;
        Context contextCreatePackageContext = null;
        zzbdpVar.zza().zzc(null);
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzca)).booleanValue() && (zzfbwVar2 = this.zzl) != null && zzfbwVar2.zzb != null) {
            zzbdpVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdpVar.zza();
        zzbdo zzbdoVarZzf = zzbdr.zzf();
        this.zzK = zzbdoVarZzf;
        zzbdpVar.zzb("native:view_create", zzbdoVarZzf);
        this.zzL = null;
        this.zzJ = null;
        if (p7.k.f12811c == null) {
            p7.k.f12811c = new p7.k(20, z11);
        }
        p7.k kVar2 = p7.k.f12811c;
        kVar2.getClass();
        l0.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzcgxVar);
        if (!defaultUserAgent.equals((String) kVar2.f12813b)) {
            AtomicBoolean atomicBoolean = nd.i.f12283a;
            try {
                contextCreatePackageContext = zzcgxVar.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                zzcgxVar.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(zzcgxVar)).apply();
            }
            kVar2.f12813b = defaultUserAgent;
        }
        l0.k("User agent is updated.");
        nVar.f11582h.zzt();
    }

    private final synchronized void zzba() {
        zzfbt zzfbtVar = this.zzk;
        if (zzfbtVar != null && zzfbtVar.zzam) {
            int i10 = l0.f13401b;
            rc.k.b("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            int i11 = l0.f13401b;
            rc.k.b("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i12 = l0.f13401b;
        rc.k.b("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        n.D.f11582h.zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void zzbd(boolean z2) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z2 ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            r0.f13445l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfy
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcgd zzcgdVar = this.zza;
                    String str3 = this.zzb;
                    super/*android.webkit.WebView*/.loadUrl("about:blank");
                }
            });
        } catch (Throwable th2) {
            n.D.f11582h.zzw(th2, "AdWebViewImpl.loadUrlUnsafe");
            int i10 = l0.f13401b;
            rc.k.h("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final void zzbg() {
        zzbdj.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcdl) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void zzbi() {
        zzbdp zzbdpVar = this.zzM;
        if (zzbdpVar == null) {
            return;
        }
        zzbdr zzbdrVarZza = zzbdpVar.zza();
        zzbdh zzbdhVarZzg = n.D.f11582h.zzg();
        if (zzbdhVarZzg != null) {
            zzbdhVarZzg.zzf(zzbdrVarZza);
        }
    }

    private final synchronized void zzbj() {
        Boolean boolZzl = n.D.f11582h.zzl();
        this.zzy = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void destroy() {
        View decorView;
        try {
            zzbi();
            k0 k0Var = this.zzQ;
            k0Var.f13398e = false;
            Activity activity = k0Var.f13395b;
            if (activity != null && k0Var.f13396c) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = k0Var.f13399f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                k0Var.f13396c = false;
            }
            i iVar = this.zzp;
            if (iVar != null) {
                iVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzl();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            n.D.B.zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkZ)).booleanValue()) {
                l0.k("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activityZza = this.zzb.zza();
            if (activityZza != null && activityZza.isDestroyed()) {
                l0.k("Destroying the WebView immediately...");
                zzX();
            } else {
                l0.k("Initiating WebView self destruct sequence in 3...");
                l0.k("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            int i10 = l0.f13401b;
            rc.k.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzla)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcad.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzl();
                        n.D.B.zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            int i10 = l0.f13401b;
            rc.k.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzaE()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i10 = l0.f13401b;
                    rc.k.g("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            int i10 = l0.f13401b;
            rc.k.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcga
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.loadUrl(str);
                }
            });
        } catch (Throwable th2) {
            n.D.f11582h.zzw(th2, "AdWebViewImpl.loadUrl");
            int i11 = l0.f13401b;
            rc.k.h("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, nc.a
    public final void onAdClicked() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z2 = true;
            if (!zzaE()) {
                k0 k0Var = this.zzQ;
                k0Var.f13397d = true;
                if (k0Var.f13398e) {
                    k0Var.a();
                }
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z10 = this.zzC;
            zzcfm zzcfmVar = this.zzo;
            if (zzcfmVar == null || !zzcfmVar.zzW()) {
                z2 = z10;
            } else {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
            }
            zzbd(z2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfm zzcfmVar;
        View decorView;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    k0 k0Var = this.zzQ;
                    k0Var.f13397d = false;
                    Activity activity = k0Var.f13395b;
                    if (activity != null && k0Var.f13396c) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = k0Var.f13399f;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                        k0Var.f13396c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcfmVar = this.zzo) != null && zzcfmVar.zzW() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlo)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            r0 r0Var = n.D.f11577c;
            r0.q(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            String strB = f.b("Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i10 = l0.f13401b;
            rc.k.b(strB);
            n.D.f11582h.zzw(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zZzaZ = zzaZ();
        i iVarZzL = zzL();
        if (iVarZzL != null && zZzaZ && iVarZzL.E) {
            iVarZzL.E = false;
            iVarZzL.f12843c.zzaa();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgd.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmN)).booleanValue() && mk.b.w("MUTE_AUDIO")) {
                int i10 = l0.f13401b;
                rc.k.b("Muting webview");
                int i11 = o7.e.f12424a;
                if (!p7.n.f12819e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebViewProviderBoundaryInterface) o7.e.a(this).f5001a).setAudioMuted(true);
            }
        } catch (Exception e10) {
            int i12 = l0.f13401b;
            rc.k.e("Could not pause webview.", e10);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmQ)).booleanValue()) {
                n.D.f11582h.zzw(e10, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmN)).booleanValue() && mk.b.w("MUTE_AUDIO")) {
                int i10 = l0.f13401b;
                rc.k.b("Unmuting webview");
                int i11 = o7.e.f12424a;
                if (!p7.n.f12819e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebViewProviderBoundaryInterface) o7.e.a(this).f5001a).setAudioMuted(false);
            }
        } catch (Exception e10) {
            int i12 = l0.f13401b;
            rc.k.e("Could not resume webview.", e10);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmQ)).booleanValue()) {
                n.D.f11582h.zzw(e10, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdL)).booleanValue() && this.zzo.zzT();
        if ((!this.zzo.zzW() || this.zzo.zzU()) && !z2) {
            zzavs zzavsVar = this.zzc;
            if (zzavsVar != null) {
                zzavsVar.zzd(motionEvent);
            }
            zzbej zzbejVar = this.zze;
            if (zzbejVar != null) {
                zzbejVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbgb zzbgbVar = this.zzE;
                    if (zzbgbVar != null) {
                        zzbgbVar.zzd(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfe
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfm) {
            this.zzo = (zzcfm) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            int i10 = l0.f13401b;
            rc.k.e("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzA(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzC(zzcgg zzcggVar) {
        if (this.zzB == null) {
            this.zzB = zzcggVar;
        } else {
            int i10 = l0.f13401b;
            rc.k.d("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcev
    public final zzfbt zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgr
    public final zzavs zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzbao zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzbgb zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized i zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized i zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final /* synthetic */ zzcgw zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgq
    public final synchronized zzcgy zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzecx zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized zzecz zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgh
    public final zzfbw zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final zzfcs zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final mf.a zzT() {
        zzbej zzbejVar = this.zze;
        return zzbejVar == null ? zzgdb.zzh(null) : zzbejVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzW(zzfbt zzfbtVar, zzfbw zzfbwVar) {
        this.zzk = zzfbtVar;
        this.zzl = zzfbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzX() {
        l0.k("Destroying WebView!");
        zzbb();
        r0.f13445l.post(new zzcgc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzY() {
        zzbg();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f14321a);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzZ(int i10) {
        if (i10 == 0) {
            zzbdp zzbdpVar = this.zzM;
            zzbdj.zza(zzbdpVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        zzbdp zzbdpVar2 = this.zzM;
        zzbdpVar2.zza();
        zzbdpVar2.zza().zzd("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.zzf.f14321a);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaA(String str, ud.e eVar) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzS(str, eVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaD(final boolean z2, final int i10) {
        destroy();
        zzbbz zzbbzVar = new zzbbz() { // from class: com.google.android.gms.internal.ads.zzcfz
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                int i11 = zzcgd.zza;
                zzbch.zzbl.zza zzaVarZzb = zzbch.zzbl.zzb();
                boolean zZzf = zzaVarZzb.zzf();
                boolean z10 = z2;
                if (zZzf != z10) {
                    zzaVarZzb.zzd(z10);
                }
                zzaVarZzb.zze(i10);
                zzaVar.zzab(zzaVarZzb.zzbr());
            }
        };
        zzbca zzbcaVar = this.zzY;
        zzbcaVar.zzb(zzbbzVar);
        zzbcaVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaJ(pc.e eVar, boolean z2, boolean z10, String str) throws NumberFormatException {
        this.zzo.zzv(eVar, z2, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaK(String str, String str2, int i10) throws NumberFormatException {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaL(boolean z2, int i10, boolean z10) throws NumberFormatException {
        this.zzo.zzx(z2, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaM(boolean z2, int i10, String str, String str2, boolean z10) throws NumberFormatException {
        this.zzo.zzz(z2, i10, str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzaN(boolean z2, int i10, String str, boolean z10, boolean z11) throws NumberFormatException {
        this.zzo.zzA(z2, i10, str, z10, z11);
    }

    public final zzcfm zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaV(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
        } else {
            int i10 = l0.f13401b;
            rc.k.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaW(String str) {
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaV(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            int i10 = l0.f13401b;
            rc.k.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        n.D.f11582h.zzy(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r11.zzV != r10) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaZ() throws org.json.JSONException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzcfm r0 = r11.zzo
            boolean r0 = r0.zzV()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcfm r0 = r11.zzo
            boolean r0 = r0.zzW()
            if (r0 == 0) goto L96
        L11:
            nc.s r0 = nc.s.f12202f
            rc.e r2 = r0.f12203a
            android.util.DisplayMetrics r2 = r11.zzi
            int r3 = r2.widthPixels
            float r3 = (float) r3
            float r4 = r2.density
            float r3 = r3 / r4
            int r5 = java.lang.Math.round(r3)
            rc.e r3 = r0.f12203a
            int r3 = r2.heightPixels
            float r3 = (float) r3
            float r4 = r2.density
            float r3 = r3 / r4
            int r6 = java.lang.Math.round(r3)
            com.google.android.gms.internal.ads.zzcgx r3 = r11.zzb
            android.app.Activity r3 = r3.zza()
            r4 = 1
            if (r3 == 0) goto L5f
            android.view.Window r7 = r3.getWindow()
            if (r7 != 0) goto L3d
            goto L5f
        L3d:
            mc.n r7 = mc.n.D
            qc.r0 r7 = r7.f11577c
            int[] r3 = qc.r0.n(r3)
            rc.e r7 = r0.f12203a
            r7 = r3[r1]
            float r7 = (float) r7
            float r8 = r2.density
            float r7 = r7 / r8
            int r7 = java.lang.Math.round(r7)
            rc.e r0 = r0.f12203a
            r0 = r3[r4]
            float r0 = (float) r0
            float r3 = r2.density
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            r8 = r0
            goto L61
        L5f:
            r7 = r5
            r8 = r6
        L61:
            mc.n r0 = mc.n.D
            qc.r0 r0 = r0.f11577c
            android.view.WindowManager r0 = r11.zzX
            android.view.Display r0 = r0.getDefaultDisplay()
            int r10 = r0.getRotation()
            int r0 = r11.zzS
            if (r0 != r5) goto L97
            int r0 = r11.zzR
            if (r0 != r6) goto L97
            int r0 = r11.zzT
            if (r0 != r7) goto L97
            int r0 = r11.zzU
            if (r0 != r8) goto L97
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzah
            nc.t r3 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r3 = r3.f12230c
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L96
            int r0 = r11.zzV
            if (r0 == r10) goto L96
            goto L97
        L96:
            return r1
        L97:
            int r0 = r11.zzS
            if (r0 != r5) goto Lb5
            int r0 = r11.zzR
            if (r0 != r6) goto Lb5
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzah
            nc.t r3 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r3 = r3.f12230c
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb6
            int r0 = r11.zzV
            if (r0 == r10) goto Lb6
        Lb5:
            r1 = r4
        Lb6:
            r11.zzS = r5
            r11.zzR = r6
            r11.zzT = r7
            r11.zzU = r8
            r11.zzV = r10
            com.google.android.gms.internal.ads.zzbss r4 = new com.google.android.gms.internal.ads.zzbss
            java.lang.String r0 = ""
            r4.<init>(r11, r0)
            float r9 = r2.density
            r4.zzj(r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgd.zzaZ():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbdp zzbdpVar = this.zzM;
            zzbdj.zza(zzbdpVar.zza(), this.zzK, "aes2");
            zzbdpVar.zza();
            zzbdo zzbdoVarZzf = zzbdr.zzf();
            this.zzJ = zzbdoVarZzf;
            zzbdpVar.zzb("native:view_show", zzbdoVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f14321a);
        zzd("onshow", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzcfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzab() {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 3
            r0.<init>(r1)
            mc.n r2 = mc.n.D
            qc.b r3 = r2.f11583i
            monitor-enter(r3)
            boolean r4 = r3.f13336a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "app_muted"
            r0.put(r4, r3)
            qc.b r2 = r2.f11583i
            float r2 = r2.a()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "app_volume"
            r0.put(r3, r2)
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            if (r2 != 0) goto L35
            goto L43
        L35:
            int r3 = r2.getStreamMaxVolume(r1)
            int r1 = r2.getStreamVolume(r1)
            if (r3 == 0) goto L43
            float r1 = (float) r1
            float r2 = (float) r3
            float r1 = r1 / r2
            goto L44
        L43:
            r1 = 0
        L44:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "device_volume"
            r0.put(r2, r1)
            java.lang.String r1 = "volume"
            r5.zzd(r1, r0)
            return
        L53:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgd.zzab():void");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzac(boolean z2) {
        this.zzo.zzm(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzad() {
        k0 k0Var = this.zzQ;
        k0Var.f13398e = true;
        if (k0Var.f13397d) {
            k0Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzae(String str, String str2, String str3) throws Throwable {
        Throwable th2;
        String str4;
        try {
            try {
                if (zzaE()) {
                    int i10 = l0.f13401b;
                    rc.k.g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) t.f12227d.f12230c.zzb(zzbdc.zzae);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (JSONException e10) {
                    int i11 = l0.f13401b;
                    rc.k.h("Unable to build MRAID_ENV", e10);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcgp.zzb(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaf() {
        if (this.zzL == null) {
            zzbdp zzbdpVar = this.zzM;
            zzbdpVar.zza();
            zzbdo zzbdoVarZzf = zzbdr.zzf();
            this.zzL = zzbdoVarZzf;
            zzbdpVar.zzb("native:view_load", zzbdoVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzag(String str, zzbkd zzbkdVar) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzB(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzah() {
        l0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzai(i iVar) {
        this.zzp = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaj(zzcgy zzcgyVar) {
        this.zzs = zzcgyVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzak(zzbao zzbaoVar) {
        this.zzG = zzbaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzal(boolean z2) {
        this.zzz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzan(Context context) {
        zzcgx zzcgxVar = this.zzb;
        zzcgxVar.setBaseContext(context);
        this.zzQ.f13395b = zzcgxVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzao(boolean z2) {
        i iVar = this.zzp;
        if (iVar != null) {
            iVar.z(this.zzo.zzV(), z2);
        } else {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzap(zzbfz zzbfzVar) {
        this.zzF = zzbfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaq(boolean z2) {
        try {
            boolean z10 = this.zzw;
            this.zzw = z2;
            zzba();
            if (z2 != z10) {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaf)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbss(this, "").zzl(true != z2 ? "default" : "expanded");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzar(zzbgb zzbgbVar) {
        this.zzE = zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzas(zzecx zzecxVar) {
        this.zzr = zzecxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzat(zzecz zzeczVar) {
        this.zzq = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzau(int i10) {
        i iVar = this.zzp;
        if (iVar != null) {
            iVar.n(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzav(boolean z2) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzaw(i iVar) {
        this.zzO = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzax(boolean z2) {
        i iVar;
        int i10 = this.zzH + (true != z2 ? -1 : 1);
        this.zzH = i10;
        if (i10 > 0 || (iVar = this.zzp) == null) {
            return;
        }
        synchronized (iVar.F) {
            try {
                iVar.I = true;
                ah.d dVar = iVar.H;
                if (dVar != null) {
                    m0 m0Var = r0.f13445l;
                    m0Var.removeCallbacks(dVar);
                    m0Var.post(iVar.H);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final synchronized void zzay(boolean z2) {
        if (z2) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i iVar = this.zzp;
        if (iVar != null) {
            if (z2) {
                iVar.D.setBackgroundColor(0);
            } else {
                iVar.D.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzaz(String str, zzbkd zzbkdVar) {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzR(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzb(String str, String str2) {
        zzaW(gk.b.n(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzd(String str, Map map) {
        try {
            zze(str, s.f12202f.f12203a.k(map));
        } catch (JSONException unused) {
            int i10 = l0.f13401b;
            rc.k.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, mc.k
    public final synchronized void zzdg() {
        k kVar = this.zzg;
        if (kVar != null) {
            kVar.zzdg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, mc.k
    public final synchronized void zzdh() {
        k kVar = this.zzg;
        if (kVar != null) {
            kVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzdi() {
        i iVarZzL = zzL();
        if (iVarZzL != null) {
            iVarZzL.D.f12838b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        boolean z2;
        synchronized (this) {
            z2 = zzazaVar.zzj;
            this.zzC = z2;
        }
        zzbd(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbM = m1.m("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbM.toString();
        int i10 = l0.f13401b;
        rc.k.b("Dispatching AFMA event: ".concat(string));
        zzaW(sbM.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbz
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final mc.a zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzbdo zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final zzbdp zzl() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzcbz
    public final rc.a zzm() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final zzcbo zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized zzcdl zzo(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcdl) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzp(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized zzcgg zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized String zzr() {
        zzfbw zzfbwVar = this.zzl;
        if (zzfbwVar == null) {
            return null;
        }
        return zzfbwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzt(String str, zzcdl zzcdlVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcdlVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzcfm zzcfmVar = this.zzo;
        if (zzcfmVar != null) {
            zzcfmVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv(boolean z2, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z2 ? "0" : "1");
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzw() {
        zzbfz zzbfzVar = this.zzF;
        if (zzbfzVar != null) {
            final zzdms zzdmsVar = (zzdms) zzbfzVar;
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmq
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmsVar.zzd();
                    } catch (RemoteException e10) {
                        int i10 = l0.f13401b;
                        rc.k.i("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzz(boolean z2) {
        this.zzo.zzF(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcgt
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzy(int i10) {
    }
}
