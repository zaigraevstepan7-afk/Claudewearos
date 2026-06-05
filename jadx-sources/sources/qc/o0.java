package qc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f13415b;

    /* renamed from: d, reason: collision with root package name */
    public mf.a f13417d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f13419f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f13420g;

    /* renamed from: i, reason: collision with root package name */
    public String f13422i;
    public String j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13414a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13416c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public zzbaa f13418e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13421h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13423k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f13424l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f13425m = -1;

    /* renamed from: n, reason: collision with root package name */
    public zzbzk f13426n = new zzbzk("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f13427o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f13428p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f13429q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f13430r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f13431s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f13432t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f13433u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13434v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f13435w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f13436x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f13437y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f13438z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    public final void a(int i10) {
        l();
        synchronized (this.f13414a) {
            try {
                this.f13425m = i10;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str) {
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjI)).booleanValue()) {
            l();
            synchronized (this.f13414a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f13420g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f13420g.apply();
                    }
                    m();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(boolean z2) {
        l();
        synchronized (this.f13414a) {
            try {
                if (z2 == this.f13423k) {
                    return;
                }
                this.f13423k = z2;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z2);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z2) {
        l();
        synchronized (this.f13414a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) nc.t.f12227d.f12230c.zzb(zzbdc.zzkJ)).longValue();
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z2);
                    this.f13420g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        mc.n.D.f11584k.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f13432t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r10 = qc.l0.f13401b;
        rc.k.h("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.l()
            java.lang.Object r0 = r7.f13414a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f13432t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L91
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "timestamp_ms"
            mc.n r10 = mc.n.D     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            ud.b r10 = r10.f11584k     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            org.json.JSONObject r9 = r7.f13432t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            goto L78
        L70:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            int r10 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L14
            rc.k.h(r9, r8)     // Catch: java.lang.Throwable -> L14
        L78:
            android.content.SharedPreferences$Editor r8 = r7.f13420g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8c
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f13432t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f13420g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8c:
            r7.m()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.o0.e(java.lang.String, java.lang.String, boolean):void");
    }

    public final void f(int i10) {
        l();
        synchronized (this.f13414a) {
            try {
                if (this.C == i10) {
                    return;
                }
                this.C = i10;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(long j) {
        l();
        synchronized (this.f13414a) {
            try {
                if (this.D == j) {
                    return;
                }
                this.D = j;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(String str) {
        l();
        synchronized (this.f13414a) {
            try {
                this.f13424l = str;
                if (this.f13420g != null) {
                    if (str.equals("-1")) {
                        this.f13420g.remove("IABTCF_TCString");
                    } else {
                        this.f13420g.putString("IABTCF_TCString", str);
                    }
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i() {
        boolean z2;
        l();
        synchronized (this.f13414a) {
            z2 = this.f13433u;
        }
        return z2;
    }

    public final boolean j() {
        boolean z2;
        l();
        synchronized (this.f13414a) {
            z2 = this.f13434v;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2;
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzaJ)).booleanValue()) {
            return false;
        }
        l();
        synchronized (this.f13414a) {
            z2 = this.f13423k;
        }
        return z2;
    }

    public final void l() {
        mf.a aVar = this.f13417d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f13417d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            int i10 = l0.f13401b;
            rc.k.h("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            int i11 = l0.f13401b;
            rc.k.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            int i112 = l0.f13401b;
            rc.k.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            int i1122 = l0.f13401b;
            rc.k.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void m() {
        zzcad.zza.execute(new ah.d(this, 23));
    }

    public final zzbzk n() {
        zzbzk zzbzkVar;
        l();
        synchronized (this.f13414a) {
            try {
                if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlT)).booleanValue() && this.f13426n.zzj()) {
                    ArrayList arrayList = this.f13416c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Runnable) obj).run();
                    }
                }
                zzbzkVar = this.f13426n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbzkVar;
    }

    public final String o() {
        String str;
        l();
        synchronized (this.f13414a) {
            str = this.f13435w;
        }
        return str;
    }

    public final void p(Context context) {
        synchronized (this.f13414a) {
            try {
                if (this.f13419f != null) {
                    return;
                }
                this.f13417d = zzcad.zza.zza(new a8.e(20, this, context, false));
                this.f13415b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(String str) {
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
            l();
            synchronized (this.f13414a) {
                try {
                    if (this.f13438z.equals(str)) {
                        return;
                    }
                    this.f13438z = str;
                    SharedPreferences.Editor editor = this.f13420g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f13420g.apply();
                    }
                    m();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void r(boolean z2) {
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
            l();
            synchronized (this.f13414a) {
                try {
                    if (this.f13437y == z2) {
                        return;
                    }
                    this.f13437y = z2;
                    SharedPreferences.Editor editor = this.f13420g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z2);
                        this.f13420g.apply();
                    }
                    m();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void s(String str) {
        l();
        synchronized (this.f13414a) {
            try {
                if (TextUtils.equals(this.f13435w, str)) {
                    return;
                }
                this.f13435w = str;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(long j) {
        l();
        synchronized (this.f13414a) {
            try {
                if (this.f13428p == j) {
                    return;
                }
                this.f13428p = j;
                SharedPreferences.Editor editor = this.f13420g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f13420g.apply();
                }
                m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
