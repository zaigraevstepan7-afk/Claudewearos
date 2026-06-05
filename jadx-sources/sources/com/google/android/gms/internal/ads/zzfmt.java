package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfmt extends zzfmp {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfmt(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfmp
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfms(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmp
    public final void zzi(zzflh zzflhVar, zzflf zzflfVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = zzflfVar.zzi();
        Iterator it = mapZzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzj(zzflhVar, zzflfVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfmp
    public final void zzo() {
        WebView webView = new WebView(zzfme.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmr(this));
        zzn(this.zza);
        zzfmg.zzk(this.zza, null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = Long.valueOf(System.nanoTime());
    }
}
