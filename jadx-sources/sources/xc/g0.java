package xc;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19932a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19933b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f19934c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdsh f19935d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f19936e;

    public g0(Context context, zzdsh zzdshVar, zzgdm zzgdmVar) {
        this.f19934c = context;
        this.f19935d = zzdshVar;
        this.f19936e = zzgdmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0073, B:30:0x0077, B:32:0x007d, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(final boolean r10, xc.i0 r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f19932a     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            xc.i0 r2 = (xc.i0) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            mc.n r5 = mc.n.D     // Catch: java.lang.Throwable -> L30
            ud.b r5 = r5.f11584k     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.f19946c     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            zc.a r2 = r2.f19944a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            zc.a r2 = r11.f19944a     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L89
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            zc.a r0 = r11.f19944a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfh.zzf     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfh.zzg     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            zc.a r0 = r11.f19944a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.internal.ads.zzcad.zzd     // Catch: java.lang.Throwable -> L30
            xc.f0 r2 = new xc.f0     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.f19933b     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L73
            goto L87
        L73:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L77:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L87
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.d(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L77
        L87:
            monitor-exit(r9)
            return
        L89:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.g0.a(boolean, xc.i0):void");
    }

    public final synchronized void b(Object obj, zc.b bVar) throws Throwable {
        try {
            try {
                mc.n.D.f11584k.getClass();
                Pair pair = new Pair(bVar, Long.valueOf(System.currentTimeMillis()));
                zzcad.zzf.execute(new b8.b(this, obj, pair, 16, false));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        HashMap map = this.f19933b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f19936e.submit(new mc.h(this, z2, 1));
    }

    public final void d(i0 i0Var, Pair pair, boolean z2) {
        i0Var.f19948e.set(true);
        zc.a aVar = i0Var.f19944a;
        if (aVar != null) {
            ((zc.b) pair.first).onSuccess(aVar);
        } else {
            ((zc.b) pair.first).onFailure(i0Var.f19945b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        mc.n.D.f11584k.getClass();
        u3.c.x(this.f19935d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z2)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }

    public final synchronized void e(boolean z2, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z2);
                HashMap map = this.f19932a;
                Boolean boolValueOf = Boolean.valueOf(z2);
                i0 i0Var = (i0) map.get(boolValueOf);
                int i10 = 0;
                if (z10 && i0Var != null) {
                    try {
                        i10 = i0Var.f19947d + 1;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                i0 i0Var2 = (i0) map.get(boolValueOf);
                h0 h0Var = new h0(this, z2, i10, i0Var2 == null ? null : Boolean.valueOf(i0Var2.f19948e.get()), this.f19935d);
                d8.e eVar = new d8.e(7);
                eVar.h(bundle);
                fc.g gVar = new fc.g(eVar);
                if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlp)).booleanValue()) {
                    this.f19936e.submit(new w8.j(this, gVar, h0Var, 4));
                } else {
                    zc.a.a(this.f19934c, gVar, h0Var);
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
