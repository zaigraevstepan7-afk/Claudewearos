package a8;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.auth.FirebaseAuth;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import mc.n;
import md.l;
import nc.q2;
import nc.r3;
import nc.s2;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import pg.v;
import pi.o;
import qc.l0;
import qc.o0;
import qj.b0;
import qj.i0;
import qj.y0;
import rc.k;
import t.m1;
import t7.m;
import w8.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public Object f201b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f202c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f200a = i10;
        this.f202c = obj;
        this.f201b = obj2;
    }

    private final void a() {
        o0 o0Var = (o0) this.f201b;
        SharedPreferences sharedPreferences = ((Context) this.f202c).getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (o0Var.f13414a) {
                try {
                    o0Var.f13419f = sharedPreferences;
                    o0Var.f13420g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    o0Var.f13421h = o0Var.f13419f.getBoolean("use_https", o0Var.f13421h);
                    o0Var.f13433u = o0Var.f13419f.getBoolean("content_url_opted_out", o0Var.f13433u);
                    o0Var.f13422i = o0Var.f13419f.getString("content_url_hashes", o0Var.f13422i);
                    o0Var.f13423k = o0Var.f13419f.getBoolean("gad_idless", o0Var.f13423k);
                    o0Var.f13434v = o0Var.f13419f.getBoolean("content_vertical_opted_out", o0Var.f13434v);
                    o0Var.j = o0Var.f13419f.getString("content_vertical_hashes", o0Var.j);
                    o0Var.f13430r = o0Var.f13419f.getInt("version_code", o0Var.f13430r);
                    if (((Boolean) zzbeu.zzg.zze()).booleanValue() && t.f12227d.f12230c.zze()) {
                        o0Var.f13426n = new zzbzk("", 0L);
                    } else {
                        o0Var.f13426n = new zzbzk(o0Var.f13419f.getString("app_settings_json", o0Var.f13426n.zzc()), o0Var.f13419f.getLong("app_settings_last_update_ms", o0Var.f13426n.zza()));
                    }
                    o0Var.f13427o = o0Var.f13419f.getLong("app_last_background_time_ms", o0Var.f13427o);
                    o0Var.f13429q = o0Var.f13419f.getInt("request_in_session_count", o0Var.f13429q);
                    o0Var.f13428p = o0Var.f13419f.getLong("first_ad_req_time_ms", o0Var.f13428p);
                    o0Var.f13431s = o0Var.f13419f.getStringSet("never_pool_slots", o0Var.f13431s);
                    o0Var.f13435w = o0Var.f13419f.getString("display_cutout", o0Var.f13435w);
                    o0Var.B = o0Var.f13419f.getInt("app_measurement_npa", o0Var.B);
                    o0Var.C = o0Var.f13419f.getInt("sd_app_measure_npa", o0Var.C);
                    o0Var.D = o0Var.f13419f.getLong("sd_app_measure_npa_ts", o0Var.D);
                    o0Var.f13436x = o0Var.f13419f.getString("inspector_info", o0Var.f13436x);
                    o0Var.f13437y = o0Var.f13419f.getBoolean("linked_device", o0Var.f13437y);
                    o0Var.f13438z = o0Var.f13419f.getString("linked_ad_unit", o0Var.f13438z);
                    o0Var.A = o0Var.f13419f.getString("inspector_ui_storage", o0Var.A);
                    o0Var.f13424l = o0Var.f13419f.getString("IABTCF_TCString", o0Var.f13424l);
                    o0Var.f13425m = o0Var.f13419f.getInt("gad_has_consent_for_cookies", o0Var.f13425m);
                    try {
                        o0Var.f13432t = new JSONObject(o0Var.f13419f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e10) {
                        int i10 = l0.f13401b;
                        k.h("Could not convert native advanced settings to json object", e10);
                    }
                    o0Var.m();
                } finally {
                }
            }
        } catch (Throwable th2) {
            n.D.f11582h.zzw(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            l0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    private final void b() {
        int i10 = 0;
        while (true) {
            try {
                ((Runnable) this.f201b).run();
            } catch (Throwable th2) {
                b0.q(th2, ti.i.f16336a);
            }
            Runnable runnableI0 = ((vj.h) this.f202c).i0();
            if (runnableI0 == null) {
                return;
            }
            try {
                this.f201b = runnableI0;
                i10++;
                if (i10 >= 16) {
                    vj.h hVar = (vj.h) this.f202c;
                    if (vj.b.j(hVar.f18100d, hVar)) {
                        vj.h hVar2 = (vj.h) this.f202c;
                        vj.b.i(hVar2.f18100d, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                vj.h hVar3 = (vj.h) this.f202c;
                synchronized (hVar3.f18103z) {
                    vj.h.A.decrementAndGet(hVar3);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f201b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        lg.k.f10964f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f201b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f201b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f202c     // Catch: java.lang.Throwable -> L58
            lg.k r2 = (lg.k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f10966b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f202c     // Catch: java.lang.Throwable -> L20
            lg.k r0 = (lg.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f10967c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f10968d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f10968d = r6     // Catch: java.lang.Throwable -> L20
            r0.f10967c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f202c     // Catch: java.lang.Throwable -> L20
            lg.k r4 = (lg.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f10966b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f201b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f202c     // Catch: java.lang.Throwable -> L20
            lg.k r0 = (lg.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f10967c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f201b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f201b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = lg.k.f10964f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f201b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f201b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.c():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws i0, NumberFormatException {
        ld.i iVar;
        yh.c cVar;
        m.e eVar;
        switch (this.f200a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f201b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    z7.c cVar2 = (z7.c) obj;
                    Object obj2 = ((f) this.f202c).f208e;
                    cVar2.f20462b = obj2;
                    cVar2.d(cVar2.f20464d, obj2);
                }
                return;
            case 1:
                d8.h hVar = (d8.h) this.f201b;
                try {
                    ((Runnable) this.f202c).run();
                    return;
                } finally {
                    hVar.a();
                }
            case 2:
                fc.f fVar = (fc.f) this.f201b;
                try {
                    fVar.f6694b.zzg(r3.a(fVar.f6693a, (q2) this.f202c));
                    return;
                } catch (RemoteException e10) {
                    k.e("Failed to load ad.", e10);
                    return;
                }
            case 3:
                fc.k kVar = (fc.k) this.f201b;
                try {
                    kVar.f6708a.b(((fc.g) this.f202c).f6695a);
                    return;
                } catch (IllegalStateException e11) {
                    zzbul.zza(kVar.getContext()).zzh(e11, "BaseAdView.loadAd");
                    return;
                }
            case 4:
                synchronized (((ConstraintTrackingWorker) this.f202c).f1260z) {
                    if (((ConstraintTrackingWorker) this.f202c).A) {
                        ((ConstraintTrackingWorker) this.f202c).B.h(new t7.j());
                    } else {
                        ((ConstraintTrackingWorker) this.f202c).B.j((mf.a) this.f201b);
                    }
                }
                return;
            case 5:
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f201b;
                Iterator it = firebaseAuth.f4254c.iterator();
                while (it.hasNext()) {
                    ng.a aVar = (ng.a) it.next();
                    aVar.f12338a.execute(new ac.e(16, aVar.f12339b, (th.b) this.f202c));
                }
                Iterator it2 = firebaseAuth.f4253b.iterator();
                if (it2.hasNext()) {
                    throw gk.b.k(it2);
                }
                return;
            case 6:
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(cg.i.f((String) this.f201b));
                if (firebaseAuth2.f4257f != null) {
                    Task taskA = firebaseAuth2.a(true);
                    jg.g.f8886f.e("Token refreshing started", new Object[0]);
                    taskA.addOnFailureListener(new p7.k(this, 10));
                    return;
                }
                return;
            case 7:
                try {
                    c();
                    return;
                } catch (Error e12) {
                    synchronized (((lg.k) this.f202c).f10966b) {
                        ((lg.k) this.f202c).f10967c = 1;
                        throw e12;
                    }
                }
            case 8:
                m.e eVar2 = (m.e) this.f201b;
                m.h hVar2 = (m.h) this.f202c;
                l.h hVar3 = hVar2.f11101c;
                if (hVar3 != null && (iVar = hVar3.f9780e) != null && (cVar = ((ActionMenuView) iVar.f10924b).M) != null) {
                    Toolbar toolbar = (Toolbar) cVar.f20314b;
                    m.h hVar4 = toolbar.f812a.L;
                    if (hVar4 == null || (eVar = hVar4.K) == null || !eVar.b()) {
                        Iterator it3 = ((CopyOnWriteArrayList) toolbar.f817c0.f12661c).iterator();
                        while (it3.hasNext()) {
                            ((w5.b0) it3.next()).f18612a.t();
                        }
                    }
                }
                ActionMenuView actionMenuView = hVar2.f11105z;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (eVar2.b()) {
                        hVar2.K = eVar2;
                    } else if (eVar2.f9827e != null) {
                        eVar2.d(0, 0, false, false);
                        hVar2.K = eVar2;
                    }
                }
                hVar2.M = null;
                return;
            case 9:
                zzdsc zzdscVar = (zzdsc) this.f201b;
                Long l10 = (Long) this.f202c;
                n.D.f11584k.getClass();
                mc.e.l(zzdscVar, "cld_r", SystemClock.elapsedRealtime() - l10.longValue());
                return;
            case 10:
                md.k kVar2 = (md.k) this.f201b;
                IBinder iBinder = (IBinder) this.f202c;
                synchronized (kVar2) {
                    if (iBinder == null) {
                        kVar2.a("Null service connection");
                    } else {
                        try {
                            kVar2.f11628c = new t0.j(iBinder);
                            kVar2.f11626a = 2;
                            ((ScheduledExecutorService) kVar2.f11631f.f11640c).execute(new md.j(kVar2, 0));
                        } catch (RemoteException e13) {
                            kVar2.a(e13.getMessage());
                        }
                    }
                }
                return;
            case 11:
                md.k kVar3 = (md.k) this.f201b;
                int i11 = ((l) this.f202c).f11632a;
                synchronized (kVar3) {
                    l lVar = (l) kVar3.f11630e.get(i11);
                    if (lVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i11);
                        kVar3.f11630e.remove(i11);
                        lVar.b(new a5.a("Timed out waiting for response", null));
                        kVar3.c();
                    }
                }
                return;
            case 12:
                ((s2) this.f201b).f12218l.addView((View) xd.b.u((xd.a) this.f202c));
                return;
            case 13:
                throw new RuntimeException((String) this.f201b, (Throwable) this.f202c);
            case 14:
                ((pc.i) ((pc.h) this.f201b).f12840b).f12841a.getWindow().setBackgroundDrawable((BitmapDrawable) this.f202c);
                return;
            case 15:
                l5.e eVar3 = ((SwipeDismissBehavior) this.f202c).f3786a;
                if (eVar3 == null || !eVar3.f()) {
                    return;
                }
                ((View) this.f201b).postOnAnimation(this);
                return;
            case 16:
                v vVar = (v) ((t0.j) this.f202c).f15364c;
                String str = (String) this.f201b;
                if (vVar.f12960c) {
                    return;
                }
                vVar.e();
                if (vVar.f12962e != null) {
                    vVar.b(str);
                    return;
                }
                if (str.length() <= 6) {
                    try {
                        int i12 = Integer.parseInt(str);
                        if (i12 > 0) {
                            vVar.d(i12);
                        }
                        str = null;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    vVar.d(1);
                }
                if (str != null) {
                    vVar.b(str);
                    return;
                }
                return;
            case 17:
                t0.j jVar = (t0.j) this.f202c;
                ah.f fVar2 = (ah.f) this.f201b;
                if (fVar2.getCause() == null || !(fVar2.getCause() instanceof EOFException)) {
                    ((v) jVar.f15364c).j.l(fVar2, "WebSocket error.", new Object[0]);
                } else {
                    ((v) jVar.f15364c).j.l(null, "WebSocket reached EOF.", new Object[0]);
                }
                v.a((v) jVar.f15364c);
                return;
            case 18:
                ld.i iVar2 = (ld.i) this.f201b;
                Typeface typeface = (Typeface) this.f202c;
                k4.b bVar = (k4.b) iVar2.f10924b;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case 19:
                ((q4.e) this.f201b).accept(this.f202c);
                return;
            case 20:
                a();
                return;
            case zzbch.zzt.zzm /* 21 */:
                ((qg.a) this.f202c).f13487h = null;
                ((pg.c) this.f201b).run();
                return;
            case 22:
                ((qj.l) this.f202c).C((y0) this.f201b, o.f13011a);
                return;
            case 23:
                ug.k kVar4 = (ug.k) this.f201b;
                mg.b bVar2 = (mg.b) this.f202c;
                TaskCompletionSource taskCompletionSource = kVar4.f17081a;
                if (bVar2 == null) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                taskCompletionSource.setException(new mg.c("Firebase Database error: " + bVar2.f11672b));
                return;
            case 24:
                m mVarG = m.g();
                String str2 = v7.a.f17870d;
                c8.i iVar3 = (c8.i) this.f201b;
                mVarG.c(str2, m1.i("Scheduling work ", iVar3.f3121a), new Throwable[0]);
                ((v7.a) this.f202c).f17871a.d(iVar3);
                return;
            case 25:
                b();
                return;
            case 26:
                Future future = (Future) this.f201b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f202c;
                future.cancel(true);
                zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                w8.a aVar2 = (w8.a) this.f201b;
                ac.l lVar2 = (ac.l) this.f202c;
                w8.c cVar3 = u.f18987k;
                aVar2.s(24, 7, cVar3);
                lVar2.d(cVar3, new ArrayList());
                return;
            case 28:
                w8.a aVar3 = (w8.a) this.f201b;
                w8.c cVar4 = (w8.c) this.f202c;
                if (((ac.h) aVar3.f18920e.f3553c) != null) {
                    ((ac.h) aVar3.f18920e.f3553c).d(cVar4, null);
                    return;
                } else {
                    zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            default:
                qh.c cVar5 = (qh.c) this.f202c;
                ArrayList arrayList2 = (ArrayList) this.f201b;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    wg.e eVar4 = (wg.e) obj3;
                    if (((p1.l) cVar5.f13508c).A()) {
                        ((p1.l) cVar5.f13508c).l(null, "Raising " + eVar4.toString(), new Object[0]);
                    }
                    eVar4.a();
                }
                return;
        }
    }

    public String toString() {
        switch (this.f200a) {
            case 7:
                Runnable runnable = (Runnable) this.f201b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((lg.k) this.f202c).f10967c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2, boolean z2) {
        this.f200a = i10;
        this.f201b = obj;
        this.f202c = obj2;
    }

    public /* synthetic */ e(mc.e eVar, zzdsc zzdscVar, Long l10) {
        this.f200a = 9;
        this.f201b = zzdscVar;
        this.f202c = l10;
    }

    public e(jg.g gVar, String str) {
        this.f200a = 6;
        this.f202c = gVar;
        e0.e(str);
        this.f201b = str;
    }

    public e(lg.k kVar) {
        this.f200a = 7;
        this.f202c = kVar;
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f200a = 15;
        this.f202c = swipeDismissBehavior;
        this.f201b = view;
    }

    public e(ug.k kVar, mg.b bVar, mg.d dVar) {
        this.f200a = 23;
        this.f201b = kVar;
        this.f202c = bVar;
    }
}
