package xc;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19889a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f19890b;

    /* renamed from: c, reason: collision with root package name */
    public final zzavs f19891c;

    /* renamed from: d, reason: collision with root package name */
    public final zzfcs f19892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19893e;

    /* renamed from: f, reason: collision with root package name */
    public final zzdsh f19894f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19895g;

    /* renamed from: h, reason: collision with root package name */
    public final zzgdm f19896h = zzcad.zzf;

    /* renamed from: i, reason: collision with root package name */
    public final zzfjq f19897i;
    public final g0 j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f19898k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f19899l;

    public a(WebView webView, zzavs zzavsVar, zzdsh zzdshVar, zzfjq zzfjqVar, zzfcs zzfcsVar, g0 g0Var, b0 b0Var, e0 e0Var) {
        this.f19890b = webView;
        Context context = webView.getContext();
        this.f19889a = context;
        this.f19891c = zzavsVar;
        this.f19894f = zzdshVar;
        zzbdc.zza(context);
        zzbct zzbctVar = zzbdc.zzjP;
        nc.t tVar = nc.t.f12227d;
        this.f19893e = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        this.f19895g = ((Boolean) tVar.f12230c.zzb(zzbdc.zzjQ)).booleanValue();
        this.f19897i = zzfjqVar;
        this.f19892d = zzfcsVar;
        this.j = g0Var;
        this.f19898k = b0Var;
        this.f19899l = e0Var;
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public String getClickSignals(String str) {
        try {
            mc.n nVar = mc.n.D;
            nVar.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzd = this.f19891c.zzc().zzd(this.f19889a, str, this.f19890b);
            if (!this.f19895g) {
                return strZzd;
            }
            nVar.f11584k.getClass();
            u3.c.x(this.f19894f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzd;
        } catch (RuntimeException e10) {
            int i10 = qc.l0.f13401b;
            rc.k.e("Exception getting click signals. ", e10);
            mc.n.D.f11582h.zzw(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public String getClickSignalsWithTimeout(String str, int i10) {
        if (i10 <= 0) {
            String strD = m6.a.d(i10, "Invalid timeout for getting click signals. Timeout=");
            int i11 = qc.l0.f13401b;
            rc.k.d(strD);
            return "";
        }
        try {
            return (String) zzcad.zza.zzb(new mc.g(6, this, str)).get(Math.min(i10, this.f19893e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = qc.l0.f13401b;
            rc.k.e("Exception getting click signals with timeout. ", e10);
            mc.n.D.f11582h.zzw(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public String getQueryInfo() throws Throwable {
        r0 r0Var = mc.n.D.f11577c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        y yVar = new y(this, string);
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            this.j.b(this.f19890b, yVar);
            return string;
        }
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjS)).booleanValue()) {
            this.f19896h.execute(new b8.b(this, bundle, yVar, 15, false));
            return string;
        }
        d8.e eVar = new d8.e(7);
        eVar.h(bundle);
        zc.a.a(this.f19889a, new fc.g(eVar), yVar);
        return string;
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public String getViewSignals() {
        try {
            mc.n nVar = mc.n.D;
            nVar.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.f19891c.zzc().zzh(this.f19889a, this.f19890b, null);
            if (!this.f19895g) {
                return strZzh;
            }
            nVar.f11584k.getClass();
            u3.c.x(this.f19894f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzh;
        } catch (RuntimeException e10) {
            int i10 = qc.l0.f13401b;
            rc.k.e("Exception getting view signals. ", e10);
            mc.n.D.f11582h.zzw(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            String strD = m6.a.d(i10, "Invalid timeout for getting view signals. Timeout=");
            int i11 = qc.l0.f13401b;
            rc.k.d(strD);
            return "";
        }
        try {
            return (String) zzcad.zza.zzb(new h6.c(this, 6)).get(Math.min(i10, this.f19893e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = qc.l0.f13401b;
            rc.k.e("Exception getting view signals with timeout. ", e10);
            mc.n.D.f11582h.zzw(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public void recordClick(String str) {
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjU)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcad.zza.execute(new f(2, this, str));
    }

    @JavascriptInterface
    @TargetApi(zzbch.zzt.zzm)
    public void reportTouchEvent(String str) throws JSONException {
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i10 = 1;
                if (i14 != 1) {
                    i10 = 2;
                    if (i14 != 2) {
                        i10 = 3;
                        if (i14 != 3) {
                            i10 = -1;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            try {
                this.f19891c.zzd(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e10) {
                e = e10;
                int i15 = qc.l0.f13401b;
                rc.k.e("Failed to parse the touch string. ", e);
                mc.n.D.f11582h.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e11) {
                e = e11;
                int i152 = qc.l0.f13401b;
                rc.k.e("Failed to parse the touch string. ", e);
                mc.n.D.f11582h.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }
}
