package qc;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzdva;
import com.google.android.gms.internal.ads.zzdvb;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13406a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f13407b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f13408c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f13409d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13410e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f13411f = "";

    /* renamed from: g, reason: collision with root package name */
    public zzdvb f13412g;

    public static void e(Context context, String str, boolean z2, boolean z10) {
        if (context instanceof Activity) {
            r0.f13445l.post(new m(context, str, z2, z10));
        } else {
            int i10 = l0.f13401b;
            rc.k.f("Can not create dialog without Activity Context");
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", mc.n.D.f11577c.y(context, str2));
        new y(context);
        w wVarA = y.a(0, str, map, null);
        try {
            return (String) wVarA.get(((Integer) nc.t.f12227d.f12230c.zzb(zzbdc.zzfg)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            String strValueOf = String.valueOf(str);
            int i10 = l0.f13401b;
            rc.k.e("Interrupted while retrieving a response from: ".concat(strValueOf), e10);
            wVarA.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            String strValueOf2 = String.valueOf(str);
            int i11 = l0.f13401b;
            rc.k.e("Timeout while retrieving a response from: ".concat(strValueOf2), e11);
            wVarA.cancel(true);
            return null;
        } catch (Exception e12) {
            String strValueOf3 = String.valueOf(str);
            int i12 = l0.f13401b;
            rc.k.e("Error retrieving a response from: ".concat(strValueOf3), e12);
            return null;
        }
    }

    public final void a(Context context) {
        zzdvb zzdvbVar;
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue() || (zzdvbVar = this.f13412g) == null) {
            return;
        }
        zzdvbVar.zzh(new l(this, context), zzdva.DEBUG_MENU);
    }

    public final void b(Context context, String str, String str2) {
        r0 r0Var = mc.n.D.f11577c;
        r0.r(context, k(context, (String) nc.t.f12227d.f12230c.zzb(zzbdc.zzfc), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) nc.t.f12227d.f12230c.zzb(zzbdc.zzff), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        r0 r0Var = mc.n.D.f11577c;
        new b0(context, str, builderBuildUpon.build().toString(), null).zzb();
    }

    public final void d(boolean z2) {
        synchronized (this.f13406a) {
            try {
                this.f13410e = z2;
                if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
                    ((o0) mc.n.D.f11582h.zzi()).r(z2);
                    zzdvb zzdvbVar = this.f13412g;
                    if (zzdvbVar != null) {
                        zzdvbVar.zzl(z2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(Context context, String str, String str2) {
        zzbct zzbctVar = zzbdc.zzfe;
        nc.t tVar = nc.t.f12227d;
        String strJ = j(context, k(context, (String) tVar.f12230c.zzb(zzbctVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            int i10 = l0.f13401b;
            rc.k.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            d(zEquals);
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
                n0 n0VarZzi = mc.n.D.f11582h.zzi();
                if (true != zEquals) {
                    str = "";
                }
                ((o0) n0VarZzi).q(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            int i11 = l0.f13401b;
            rc.k.h("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.f13406a) {
            z2 = this.f13410e;
        }
        return z2;
    }

    public final boolean h() {
        boolean z2;
        synchronized (this.f13406a) {
            z2 = this.f13409d;
        }
        return z2;
    }

    public final boolean i(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i10 = l0.f13401b;
        rc.k.b("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0034, B:20:0x006f, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri k(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f13406a
            monitor-enter(r0)
            java.lang.String r1 = r5.f13407b     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6f
            mc.n r1 = mc.n.D     // Catch: java.lang.Throwable -> L32
            qc.r0 r1 = r1.f11577c     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4 = 1
            ud.c.f(r1, r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L3d
        L32:
            r6 = move-exception
            goto L86
        L34:
            java.lang.String r1 = "Error reading from internal storage."
            int r2 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L32
            rc.k.b(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ""
        L3d:
            r5.f13407b = r2     // Catch: java.lang.Throwable -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6f
            mc.n r1 = mc.n.D     // Catch: java.lang.Throwable -> L32
            qc.r0 r1 = r1.f11577c     // Catch: java.lang.Throwable -> L32
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r5.f13407b = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            r6.write(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            r6.close()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L67
            goto L6f
        L67:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            int r2 = qc.l0.f13401b     // Catch: java.lang.Throwable -> L32
            rc.k.e(r1, r6)     // Catch: java.lang.Throwable -> L32
        L6f:
            java.lang.String r6 = r5.f13407b     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.n.k(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
