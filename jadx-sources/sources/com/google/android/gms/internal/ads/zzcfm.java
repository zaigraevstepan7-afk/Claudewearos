package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import mc.n;
import nc.t;
import org.json.JSONException;
import pc.i;
import pc.m;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzcfm extends WebViewClient implements zzcgw {
    public static final /* synthetic */ int zzb = 0;
    private zzdsc zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzecd zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbxy zza;
    private final zzcfe zzc;
    private final zzbca zzd;
    private nc.a zzg;
    private m zzh;
    private zzcgu zzi;
    private zzcgv zzj;
    private zzbit zzk;
    private zzbiv zzl;
    private zzddw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private pc.c zzw;
    private zzbsr zzx;
    private mc.b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbsm zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) t.f12227d.f12230c.zzb(zzbdc.zzfR)).split(",")));

    public zzcfm(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z2, zzbsr zzbsrVar, zzbsm zzbsmVar, zzecd zzecdVar) {
        this.zzd = zzbcaVar;
        this.zzc = zzcfeVar;
        this.zzs = z2;
        this.zzx = zzbsrVar;
        this.zzG = zzecdVar;
    }

    private static WebResourceResponse zzY() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaW)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0117, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0120, code lost:
    
        if (r14.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0123, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
    
        if (r0 >= r14.length) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
    
        if (r1.length <= 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014e, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0167, code lost:
    
        if (r14.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
    
        if (r0.getKey() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        if (r0.getValue() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0187, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019d, code lost:
    
        r13 = mc.n.D.f11580f;
        r8 = r3.getResponseCode();
        r9 = r3.getResponseMessage();
        r11 = r3.getInputStream();
        r13.getClass();
        r5 = new android.webkit.WebResourceResponse(r6, r7, r8, r9, r10, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzZ(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfm.zzZ(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Map map, List list, String str) {
        if (l0.m()) {
            l0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                l0.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbkd) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(final View view, final zzbxy zzbxyVar, final int i10) {
        if (!zzbxyVar.zzi() || i10 <= 0) {
            return;
        }
        zzbxyVar.zzg(view);
        if (zzbxyVar.zzi()) {
            r0.f13445l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzac(view, zzbxyVar, i10 - 1);
                }
            }, 100L);
        }
    }

    private static final boolean zzad(zzcfe zzcfeVar) {
        return zzcfeVar.zzD() != null && zzcfeVar.zzD().zzb();
    }

    private static final boolean zzae(boolean z2, zzcfe zzcfeVar) {
        return (!z2 || zzcfeVar.zzO().zzi() || zzcfeVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    public static void zzh(zzcfm zzcfmVar) throws JSONException {
        zzcfe zzcfeVar = zzcfmVar.zzc;
        zzcfeVar.zzad();
        i iVarZzL = zzcfeVar.zzL();
        if (iVarZzL != null) {
            iVarZzL.D.removeView(iVarZzL.f12845e);
            iVarZzL.y(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw, nc.a
    public final void onAdClicked() {
        nc.a aVar = this.zzg;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        l0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzn(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.zzf) {
            try {
                zzcfe zzcfeVar = this.zzc;
                if (zzcfeVar.zzaE()) {
                    l0.k("Blank page loaded, 1...");
                    zzcfeVar.zzX();
                    return;
                }
                this.zzB = true;
                zzcgv zzcgvVar = this.zzj;
                if (zzcgvVar != null) {
                    zzcgvVar.zza();
                    this.zzj = null;
                }
                zzk();
                zzcfe zzcfeVar2 = this.zzc;
                if (zzcfeVar2.zzL() != null) {
                    if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmg)).booleanValue() || (toolbar = zzcfeVar2.zzL().N) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        l0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzn(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    nc.a aVar = this.zzg;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        zzbxy zzbxyVar = this.zza;
                        if (zzbxyVar != null) {
                            zzbxyVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzddw zzddwVar = this.zzm;
                    if (zzddwVar != null) {
                        zzddwVar.zzdf();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcfe zzcfeVar = this.zzc;
            if (zzcfeVar.zzG().willNotDraw()) {
                k.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzavs zzavsVarZzI = zzcfeVar.zzI();
                    zzfcs zzfcsVarZzS = zzcfeVar.zzS();
                    if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmk)).booleanValue() || zzfcsVarZzS == null) {
                        if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                            uriZza = zzavsVarZzI.zza(uriZza, zzcfeVar.getContext(), (View) zzcfeVar, zzcfeVar.zzi());
                        }
                    } else if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                        uriZza = zzfcsVarZzS.zza(uriZza, zzcfeVar.getContext(), (View) zzcfeVar, zzcfeVar.zzi());
                    }
                } catch (zzavt unused) {
                    k.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                mc.b bVar = this.zzy;
                if (bVar == null || bVar.b()) {
                    pc.e eVar = new pc.e("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null);
                    zzcfe zzcfeVar2 = this.zzc;
                    zzv(eVar, true, false, zzcfeVar2 != null ? zzcfeVar2.zzr() : "");
                } else {
                    bVar.a(str);
                }
            }
        }
        return true;
    }

    public final void zzA(boolean z2, int i10, String str, boolean z10, boolean z11) throws NumberFormatException {
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean zZzae = zzae(zZzaF, zzcfeVar);
        boolean z12 = true;
        if (!zZzae && z10) {
            z12 = false;
        }
        nc.a aVar = zZzae ? null : this.zzg;
        zzcfl zzcflVar = zZzaF ? null : new zzcfl(zzcfeVar, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzecd zzecdVar = null;
        zzbiv zzbivVar = this.zzl;
        boolean z13 = z12;
        zzcfl zzcflVar2 = zzcflVar;
        pc.c cVar = this.zzw;
        rc.a aVarZzm = zzcfeVar.zzm();
        zzddw zzddwVar = z13 ? null : this.zzm;
        if (zzad(zzcfeVar)) {
            zzecdVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(aVar, zzcflVar2, zzbitVar, zzbivVar, cVar, zzcfeVar, z2, i10, str, aVarZzm, zzddwVar, zzecdVar, z11));
    }

    public final void zzB(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbkdVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzC(zzcgu zzcguVar) {
        this.zzi = zzcguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzD(mc.b bVar) {
        this.zzy = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzE(int i10, int i11) {
        zzbsm zzbsmVar = this.zzz;
        if (zzbsmVar != null) {
            zzbsmVar.zze(i10, i11);
        }
    }

    public final void zzF(boolean z2) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzG(boolean z2) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzH(boolean z2) {
        synchronized (this.zzf) {
            this.zzv = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzI() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzcfm.zzh(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzJ(boolean z2) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzK(zzcgv zzcgvVar) {
        this.zzj = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzL(zzbxy zzbxyVar) {
        this.zza = zzbxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzM(zzcml zzcmlVar, zzebs zzebsVar, zzfjq zzfjqVar) {
        zzQ("/click");
        if (zzebsVar != null && zzfjqVar != null) {
            zzB("/click", new zzfcw(this.zzm, zzcmlVar, zzfjqVar, zzebsVar));
            return;
        }
        zzddw zzddwVar = this.zzm;
        zzbkd zzbkdVar = zzbkc.zza;
        zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzN(zzcml zzcmlVar) {
        zzQ("/click");
        zzddw zzddwVar = this.zzm;
        zzbkd zzbkdVar = zzbkc.zza;
        zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzO(zzcml zzcmlVar, zzebs zzebsVar, zzdsc zzdscVar) {
        zzQ("/open");
        zzB("/open", new zzbkp(this.zzy, this.zzz, zzebsVar, zzdscVar, zzcmlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzP(zzfbt zzfbtVar) {
        zzcfe zzcfeVar = this.zzc;
        if (n.D.f11599z.zzp(zzcfeVar.getContext())) {
            zzQ("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbkj(zzcfeVar.getContext(), zzfbtVar.zzaw));
        }
    }

    public final void zzQ(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzR(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbkdVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzS(String str, ud.e eVar) {
        synchronized (this.zzf) {
            try {
                List<zzbkd> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbkd zzbkdVar : list) {
                    if (eVar.apply(zzbkdVar)) {
                        arrayList.add(zzbkdVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzT() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzu;
        }
        return z2;
    }

    public final boolean zzU() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzv;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final boolean zzV() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzs;
        }
        return z2;
    }

    public final boolean zzW() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzt;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzX(nc.a aVar, zzbit zzbitVar, m mVar, zzbiv zzbivVar, pc.c cVar, boolean z2, zzbkg zzbkgVar, mc.b bVar, zzbst zzbstVar, zzbxy zzbxyVar, final zzebs zzebsVar, final zzfjq zzfjqVar, zzdsc zzdscVar, zzbkx zzbkxVar, zzddw zzddwVar, zzbkw zzbkwVar, zzbkq zzbkqVar, zzbke zzbkeVar, zzcml zzcmlVar) {
        mc.b bVar2 = bVar == null ? new mc.b(this.zzc.getContext(), zzbxyVar) : bVar;
        zzcfe zzcfeVar = this.zzc;
        this.zzz = new zzbsm(zzcfeVar, zzbstVar);
        this.zza = zzbxyVar;
        zzbct zzbctVar = zzbdc.zzbd;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            zzB("/adMetadata", new zzbis(zzbitVar));
        }
        if (zzbivVar != null) {
            zzB("/appEvent", new zzbiu(zzbivVar));
        }
        zzB("/backButton", zzbkc.zzj);
        zzB("/refresh", zzbkc.zzk);
        zzB("/canOpenApp", zzbkc.zzb);
        zzB("/canOpenURLs", zzbkc.zza);
        zzB("/canOpenIntents", zzbkc.zzc);
        zzB("/close", zzbkc.zzd);
        zzB("/customClose", zzbkc.zze);
        zzB("/instrument", zzbkc.zzn);
        zzB("/delayPageLoaded", zzbkc.zzp);
        zzB("/delayPageClosed", zzbkc.zzq);
        zzB("/getLocationInfo", zzbkc.zzr);
        zzB("/log", zzbkc.zzg);
        zzB("/mraid", new zzbkk(bVar2, this.zzz, zzbstVar));
        zzbsr zzbsrVar = this.zzx;
        if (zzbsrVar != null) {
            zzB("/mraidLoaded", zzbsrVar);
        }
        mc.b bVar3 = bVar2;
        zzB("/open", new zzbkp(bVar3, this.zzz, zzebsVar, zzdscVar, zzcmlVar));
        zzB("/precache", new zzcdm());
        zzB("/touch", zzbkc.zzi);
        zzB("/video", zzbkc.zzl);
        zzB("/videoMeta", zzbkc.zzm);
        if (zzebsVar == null || zzfjqVar == null) {
            zzB("/click", new zzbjb(zzddwVar, zzcmlVar));
            zzB("/httpTrack", zzbkc.zzf);
        } else {
            zzB("/click", new zzfcw(zzddwVar, zzcmlVar, zzfjqVar, zzebsVar));
            zzB("/httpTrack", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzfcx
                @Override // com.google.android.gms.internal.ads.zzbkd
                public final void zza(Object obj, Map map) {
                    zzcev zzcevVar = (zzcev) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i10 = l0.f13401b;
                        k.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfbt zzfbtVarZzD = zzcevVar.zzD();
                    if (zzfbtVarZzD != null && !zzfbtVarZzD.zzai) {
                        zzfjqVar.zzd(str, zzfbtVarZzD.zzax, null, null);
                        return;
                    }
                    zzfbw zzfbwVarZzR = ((zzcgh) zzcevVar).zzR();
                    if (zzfbwVarZzR == null) {
                        n.D.f11582h.zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    } else {
                        zzebs zzebsVar2 = zzebsVar;
                        n.D.f11584k.getClass();
                        zzebsVar2.zzd(new zzebu(System.currentTimeMillis(), zzfbwVarZzR.zzb, str, 2));
                    }
                }
            });
        }
        if (n.D.f11599z.zzp(zzcfeVar.getContext())) {
            Map map = new HashMap();
            if (zzcfeVar.zzD() != null) {
                map = zzcfeVar.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbkj(zzcfeVar.getContext(), map));
        }
        if (zzbkgVar != null) {
            zzB("/setInterstitialProperties", new zzbkf(zzbkgVar));
        }
        if (zzbkxVar != null && ((Boolean) zzbdaVar2.zzb(zzbdc.zzjg)).booleanValue()) {
            zzB("/inspectorNetworkExtras", zzbkxVar);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjz)).booleanValue() && zzbkwVar != null) {
            zzB("/shareSheet", zzbkwVar);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjE)).booleanValue() && zzbkqVar != null) {
            zzB("/inspectorOutOfContextTest", zzbkqVar);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjI)).booleanValue() && zzbkeVar != null) {
            zzB("/inspectorStorage", zzbkeVar);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzlL)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbkc.zzu);
            zzB("/presentPlayStoreOverlay", zzbkc.zzv);
            zzB("/expandPlayStoreOverlay", zzbkc.zzw);
            zzB("/collapsePlayStoreOverlay", zzbkc.zzx);
            zzB("/closePlayStoreOverlay", zzbkc.zzy);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzdz)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbkc.zzA);
            zzB("/resetPAID", zzbkc.zzz);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzmf)).booleanValue() && zzcfeVar.zzD() != null && zzcfeVar.zzD().zzar) {
            zzB("/writeToLocalStorage", zzbkc.zzB);
            zzB("/clearLocalStorageKeys", zzbkc.zzC);
        }
        this.zzg = aVar;
        this.zzh = mVar;
        this.zzk = zzbitVar;
        this.zzl = zzbivVar;
        this.zzw = cVar;
        this.zzy = bVar3;
        this.zzm = zzddwVar;
        this.zzA = zzdscVar;
        this.zzn = z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00bb, B:30:0x00cf, B:33:0x00e2, B:78:0x01b6, B:50:0x016a, B:97:0x029d, B:100:0x02ad, B:102:0x02b3, B:104:0x02c1, B:86:0x0225, B:87:0x024e, B:85:0x01fd, B:49:0x0145, B:32:0x00d9, B:88:0x024f, B:90:0x0259, B:92:0x025f, B:94:0x0292), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2 A[Catch: all -> 0x01a9, TryCatch #5 {all -> 0x01a9, blocks: (B:71:0x018e, B:73:0x01a0, B:77:0x01ac, B:81:0x01e0, B:83:0x01f2, B:84:0x01f9), top: B:109:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029d A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00bb, B:30:0x00cf, B:33:0x00e2, B:78:0x01b6, B:50:0x016a, B:97:0x029d, B:100:0x02ad, B:102:0x02b3, B:104:0x02c1, B:86:0x0225, B:87:0x024e, B:85:0x01fd, B:49:0x0145, B:32:0x00d9, B:88:0x024f, B:90:0x0259, B:92:0x025f, B:94:0x0292), top: B:112:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfm.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final mc.b zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final zzdsc zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue()) {
                zzcfe zzcfeVar = this.zzc;
                if (zzcfeVar.zzl() != null) {
                    zzbdj.zza(zzcfeVar.zzl().zza(), zzcfeVar.zzk(), "awfllc");
                }
            }
            zzcgu zzcguVar = this.zzi;
            boolean z2 = false;
            if (!this.zzC && !this.zzo) {
                z2 = true;
            }
            zzcguVar.zza(z2, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzbxyVar.zzf();
            this.zza = null;
        }
        zzab();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbsm zzbsmVar = this.zzz;
                if (zzbsmVar != null) {
                    zzbsmVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzm(boolean z2) {
        this.zzE = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzn(Uri uri) {
        l0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            l0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgQ)).booleanValue() || n.D.f11582h.zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i10 = zzcfm.zzb;
                    n.D.f11582h.zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        zzbct zzbctVar = zzbdc.zzfQ;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) tVar.f12230c.zzb(zzbdc.zzfS)).intValue()) {
                l0.k("Parsing gmsg query params on BG thread: ".concat(path));
                r0 r0Var = n.D.f11577c;
                r0Var.getClass();
                zzgdb.zzr(zzgdb.zzj(new h6.c(uri, 3), r0Var.f13455k), new zzcfk(this, list, path, uri), zzcad.zzf);
                return;
            }
        }
        r0 r0Var2 = n.D.f11577c;
        zzaa(r0.m(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzo() {
        zzbca zzbcaVar = this.zzd;
        if (zzbcaVar != null) {
            zzbcaVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzq() {
        this.zzD--;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzr(int i10, int i11, boolean z2) {
        zzbsr zzbsrVar = this.zzx;
        if (zzbsrVar != null) {
            zzbsrVar.zzb(i10, i11);
        }
        zzbsm zzbsmVar = this.zzz;
        if (zzbsmVar != null) {
            zzbsmVar.zzd(i10, i11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzs() {
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzcfe zzcfeVar = this.zzc;
            WebView webViewZzG = zzcfeVar.zzG();
            Field field = t4.l0.f15744a;
            if (webViewZzG.isAttachedToWindow()) {
                zzac(webViewZzG, zzbxyVar, 10);
                return;
            }
            zzab();
            zzcfj zzcfjVar = new zzcfj(this, zzbxyVar);
            this.zzH = zzcfjVar;
            ((View) zzcfeVar).addOnAttachStateChangeListener(zzcfjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzu();
        }
    }

    public final void zzv(pc.e eVar, boolean z2, boolean z10, String str) throws NumberFormatException {
        boolean z11;
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean z12 = false;
        boolean z13 = zzae(zZzaF, zzcfeVar) || z10;
        if (z13 || !z2) {
            z11 = zZzaF;
            z12 = true;
        } else {
            z11 = zZzaF;
        }
        zzy(new AdOverlayInfoParcel(eVar, z13 ? null : this.zzg, z11 ? null : this.zzh, this.zzw, zzcfeVar.zzm(), zzcfeVar, z12 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i10) throws NumberFormatException {
        zzecd zzecdVar = this.zzG;
        zzcfe zzcfeVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcfeVar, zzcfeVar.zzm(), str, str2, zzecdVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(boolean z2, int i10, boolean z10) throws NumberFormatException {
        nc.a aVar;
        zzddw zzddwVar;
        zzecd zzecdVar;
        int i11;
        nc.a aVar2;
        boolean z11;
        zzcfe zzcfeVar = this.zzc;
        boolean zZzae = zzae(zzcfeVar.zzaF(), zzcfeVar);
        boolean z12 = true;
        if (!zZzae && z10) {
            z12 = false;
        }
        if (zZzae) {
            aVar = null;
            zzddwVar = null;
        } else {
            aVar = this.zzg;
            zzddwVar = null;
        }
        m mVar = this.zzh;
        zzddw zzddwVar2 = zzddwVar;
        pc.c cVar = this.zzw;
        rc.a aVarZzm = zzcfeVar.zzm();
        zzddw zzddwVar3 = z12 ? zzddwVar2 : this.zzm;
        if (zzad(zzcfeVar)) {
            zzecdVar = this.zzG;
            z11 = z2;
            i11 = i10;
            aVar2 = aVar;
        } else {
            zzecdVar = zzddwVar2;
            i11 = i10;
            aVar2 = aVar;
            z11 = z2;
        }
        zzy(new AdOverlayInfoParcel(aVar2, mVar, cVar, zzcfeVar, z11, i11, aVarZzm, zzddwVar3, zzecdVar));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        pc.e eVar;
        zzbsm zzbsmVar = this.zzz;
        boolean zZzf = zzbsmVar != null ? zzbsmVar.zzf() : false;
        y9.a aVar = n.D.f11576b;
        y9.a.m(this.zzc.getContext(), adOverlayInfoParcel, !zZzf, this.zzA);
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            String str = adOverlayInfoParcel.E;
            if (str == null && (eVar = adOverlayInfoParcel.f3441a) != null) {
                str = eVar.f12831b;
            }
            zzbxyVar.zzh(str);
        }
    }

    public final void zzz(boolean z2, int i10, String str, String str2, boolean z10) throws NumberFormatException {
        zzcfe zzcfeVar = this.zzc;
        boolean zZzaF = zzcfeVar.zzaF();
        boolean zZzae = zzae(zZzaF, zzcfeVar);
        boolean z11 = true;
        if (!zZzae && z10) {
            z11 = false;
        }
        nc.a aVar = zZzae ? null : this.zzg;
        zzcfl zzcflVar = zZzaF ? null : new zzcfl(zzcfeVar, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzecd zzecdVar = null;
        zzbiv zzbivVar = this.zzl;
        boolean z12 = z11;
        zzcfl zzcflVar2 = zzcflVar;
        pc.c cVar = this.zzw;
        rc.a aVarZzm = zzcfeVar.zzm();
        zzddw zzddwVar = z12 ? null : this.zzm;
        if (zzad(zzcfeVar)) {
            zzecdVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(aVar, zzcflVar2, zzbitVar, zzbivVar, cVar, zzcfeVar, z2, i10, str, str2, aVarZzm, zzddwVar, zzecdVar));
    }
}
