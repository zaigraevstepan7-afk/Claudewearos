package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p7.k;
import p7.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzflo {
    private final zzflq zza;
    private final WebView zzb;
    private zzfnq zzc;
    private final HashMap zzd;
    private final zzfmd zze;

    /* JADX WARN: Multi-variable type inference failed */
    private zzflo(zzflq zzflqVar, WebView webView, boolean z2) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfmd();
        zzfmz.zza();
        this.zza = zzflqVar;
        this.zzb = webView;
        if (zza() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfld) it.next()).zzd(webView);
            }
            this.zzc = new zzfnq(webView);
        }
        if (!mk.b.w("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzh();
        zzfln zzflnVar = new zzfln(this);
        WebView webView2 = this.zzb;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        int i10 = o7.e.f12424a;
        if (!n.f12817c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        d8.e eVarA = o7.e.a(webView2);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = (WebViewProviderBoundaryInterface) eVarA.f5001a;
        k kVar = new k(0, (boolean) (0 == true ? 1 : 0));
        kVar.f12813b = zzflnVar;
        webViewProviderBoundaryInterface.addWebMessageListener("omidJsSessionService", strArr, new mk.a(kVar));
    }

    public static zzflo zzb(zzflq zzflqVar, WebView webView, boolean z2) {
        return new zzflo(zzflqVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzflo zzfloVar, String str) {
        HashMap map = zzfloVar.zzd;
        zzfld zzfldVar = (zzfld) map.get(str);
        if (zzfldVar != null) {
            zzfldVar.zzc();
            map.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zze(zzflo zzfloVar, String str) {
        zzfli zzfliVar = zzfli.DEFINED_BY_JAVASCRIPT;
        zzfll zzfllVar = zzfll.DEFINED_BY_JAVASCRIPT;
        zzflp zzflpVar = zzflp.JAVASCRIPT;
        zzflh zzflhVar = new zzflh(zzfle.zza(zzfliVar, zzfllVar, zzflpVar, zzflpVar, false), zzflf.zzb(zzfloVar.zza, zzfloVar.zzb, null, null), str);
        zzfloVar.zzd.put(str, zzflhVar);
        zzflhVar.zzd(zzfloVar.zza());
        for (zzfmc zzfmcVar : zzfloVar.zze.zza()) {
            zzflhVar.zzb((View) zzfmcVar.zzb().get(), zzfmcVar.zza(), zzfmcVar.zzc());
        }
        zzflhVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        WebView webView = this.zzb;
        int i10 = o7.e.f12424a;
        if (!n.f12817c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        ((WebViewProviderBoundaryInterface) o7.e.a(webView).f5001a).removeWebMessageListener("omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        zzfnq zzfnqVar = this.zzc;
        if (zzfnqVar == null) {
            return null;
        }
        return (View) zzfnqVar.get();
    }

    public final void zzf(View view, zzflk zzflkVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfld) it.next()).zzb(view, zzflkVar, "Ad overlay");
        }
        this.zze.zzb(view, zzflkVar, "Ad overlay");
    }

    public final void zzg(zzcfv zzcfvVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfld) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzflm(this, zzcfvVar, timer), 1000L);
    }
}
