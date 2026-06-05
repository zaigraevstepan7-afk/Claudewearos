package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import qc.y;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzcgm extends zzcfm {
    public zzcgm(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z2, zzecd zzecdVar) {
        super(zzcfeVar, zzbcaVar, z2, new zzbsr(zzcfeVar, zzcfeVar.zzE(), new zzbck(zzcfeVar.getContext())), null, zzecdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzY(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcfe)) {
            int i10 = l0.f13401b;
            k.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfe zzcfeVar = (zzcfe) webView;
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzbxyVar.zze(str, map, 1);
        }
        zzfqj.zza();
        zzfqp zzfqpVar = zzfqp.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzc(str, map);
        }
        if (zzcfeVar.zzN() != null) {
            zzcfeVar.zzN().zzI();
        }
        if (zzcfeVar.zzO().zzi()) {
            str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzad);
        } else if (zzcfeVar.zzaF()) {
            str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzac);
        } else {
            str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzab);
        }
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        Context context = zzcfeVar.getContext();
        String str3 = zzcfeVar.zzm().f14321a;
        try {
            HashMap map2 = new HashMap();
            map2.put("User-Agent", nVar.f11577c.y(context, str3));
            map2.put("Cache-Control", "max-stale=3600");
            new y(context);
            String str4 = (String) y.a(0, str2, map2, null).get(60L, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            int i11 = l0.f13401b;
            k.h("Could not fetch MRAID JS.", e10);
            return null;
        }
    }
}
