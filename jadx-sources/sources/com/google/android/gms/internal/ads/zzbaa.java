package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import mc.n;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbaa extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazr zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbaa() {
        zzazr zzazrVar = new zzazr();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazrVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbet.zzd.zze()).intValue();
        this.zzg = ((Long) zzbet.zza.zze()).intValue();
        this.zzh = ((Long) zzbet.zze.zze()).intValue();
        this.zzi = ((Long) zzbet.zzc.zze()).intValue();
        zzbct zzbctVar = zzbdc.zzai;
        t tVar = t.f12227d;
        this.zzj = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        this.zzk = ((Integer) tVar.f12230c.zzb(zzbdc.zzaj)).intValue();
        this.zzl = ((Integer) tVar.f12230c.zzb(zzbdc.zzak)).intValue();
        this.zze = ((Long) zzbet.zzf.zze()).intValue();
        this.zzm = (String) tVar.f12230c.zzb(zzbdc.zzam);
        this.zzn = ((Boolean) tVar.f12230c.zzb(zzbdc.zzan)).booleanValue();
        this.zzo = ((Boolean) tVar.f12230c.zzb(zzbdc.zzao)).booleanValue();
        ((Boolean) tVar.f12230c.zzb(zzbdc.zzap)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = mc.n.D.f11581g.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r1 = qc.l0.f13401b;
        rc.k.b("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        mc.n.D.f11582h.zzw(r0, "ContentFetchTask.extractContent");
        r2 = qc.l0.f13401b;
        rc.k.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r1 = qc.l0.f13401b;
        rc.k.e("Error in ContentFetchTask", r0);
        mc.n.D.f11582h.zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = qc.l0.f13401b;
        rc.k.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbaa.run():void");
    }

    public final zzazz zza(View view, zzazq zzazqVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazqVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazz(this, 1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof zzcfe)) {
                    WebView webView = (WebView) view;
                    zzazqVar.zzf();
                    webView.post(new zzazy(this, zzazqVar, webView, globalVisibleRect));
                    return new zzazz(this, 0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        zzazz zzazzVarZza = zza(viewGroup.getChildAt(i12), zzazqVar);
                        i10 += zzazzVarZza.zza;
                        i11 += zzazzVarZza.zzb;
                    }
                    return new zzazz(this, i10, i11);
                }
            }
        }
        return new zzazz(this, 0, 0);
    }

    public final void zzb(View view) {
        try {
            zzazq zzazqVar = new zzazq(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = n.D.f11581g.zzb();
            if (contextZzb != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZzb.getResources().getIdentifier((String) t.f12227d.f12230c.zzb(zzbdc.zzal), "id", contextZzb.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzazz zzazzVarZza = zza(view, zzazqVar);
            zzazqVar.zzj();
            if (zzazzVarZza.zza == 0 && zzazzVarZza.zzb == 0) {
                return;
            }
            int i10 = zzazzVarZza.zzb;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.zzd.zza(zzazqVar);
            } else if (zzazqVar.zzb() == 0) {
                return;
            }
            if (this.zzd.zzc(zzazqVar)) {
                return;
            }
            this.zzd.zza(zzazqVar);
        } catch (Exception e10) {
            int i11 = l0.f13401b;
            k.e("Exception in fetchContentOnUIThread", e10);
            n.D.f11582h.zzw(e10, "ContentFetchTask.fetchContent");
        }
    }

    public final void zzc(zzazq zzazqVar, WebView webView, String str, boolean z2) {
        zzazq zzazqVar2;
        zzazqVar.zze();
        try {
            if (TextUtils.isEmpty(str)) {
                zzazqVar2 = zzazqVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazqVar2 = zzazqVar;
                    zzazqVar2.zzi(strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazqVar.zzi(webView.getTitle() + "\n" + strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzazqVar2 = zzazqVar;
                }
            }
            if (zzazqVar2.zzl()) {
                this.zzd.zzb(zzazqVar2);
            }
        } catch (JSONException unused) {
            int i10 = l0.f13401b;
            k.b("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = l0.f13401b;
            k.c("Failed to get webview content.", th2);
            n.D.f11582h.zzw(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i10 = l0.f13401b;
                    k.b("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            int i10 = l0.f13401b;
            k.b("ContentFetchThread: paused, pause = true");
        }
    }
}
