package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcgk {
    private final zzcgl zza;
    private final zzcgj zzb;

    public zzcgk(zzcgl zzcglVar, zzcgj zzcgjVar) {
        this.zzb = zzcgjVar;
        this.zza = zzcglVar;
    }

    public static /* synthetic */ void zza(zzcgk zzcgkVar, String str) {
        Uri uri = Uri.parse(str);
        zzcfm zzcfmVarZzaO = ((zzcgd) zzcgkVar.zzb.zza).zzaO();
        if (zzcfmVarZzaO != null) {
            zzcfmVarZzaO.zzn(uri);
        } else {
            int i10 = l0.f13401b;
            k.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            l0.k("Click string is empty, not proceeding.");
            return "";
        }
        zzcgl zzcglVar = this.zza;
        zzavs zzavsVarZzI = ((zzcgr) zzcglVar).zzI();
        if (zzavsVarZzI == null) {
            l0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzavn zzavnVarZzc = zzavsVarZzI.zzc();
        if (zzavnVarZzc == null) {
            l0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcglVar.getContext() != null) {
            return zzavnVarZzc.zze(zzcglVar.getContext(), str, ((zzcgt) zzcglVar).zzF(), zzcglVar.zzi());
        }
        l0.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcgl zzcglVar = this.zza;
        zzavs zzavsVarZzI = ((zzcgr) zzcglVar).zzI();
        if (zzavsVarZzI == null) {
            l0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzavn zzavnVarZzc = zzavsVarZzI.zzc();
        if (zzavnVarZzc == null) {
            l0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcglVar.getContext() != null) {
            return zzavnVarZzc.zzh(zzcglVar.getContext(), ((zzcgt) zzcglVar).zzF(), zzcglVar.zzi());
        }
        l0.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgi
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgk.zza(this.zza, str);
                }
            });
        } else {
            int i10 = l0.f13401b;
            k.g("URL is empty, ignoring message");
        }
    }
}
