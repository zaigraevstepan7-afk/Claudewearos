package b8;

import ab.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import c8.i;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import l7.n;
import md.h;
import md.m;
import p1.l;
import qc.t0;
import qj.b0;
import rg.g0;
import rg.j;
import rg.t;
import rg.z;
import u6.u;
import u7.k;
import ug.g;
import w5.a0;
import xc.y;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1611a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1612b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1613c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1614d;

    public /* synthetic */ b(int i10) {
        this.f1611a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Task taskD;
        Object objCall = null;
        boolean zBooleanValue = true;
        ?? r82 = 0;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        switch (this.f1611a) {
            case 0:
                i iVarH = ((WorkDatabase) this.f1613c).w().h((String) this.f1612b);
                if (iVarH == null || !iVarH.b()) {
                    return;
                }
                synchronized (((c) this.f1614d).f1617c) {
                    ((c) this.f1614d).f1620f.put((String) this.f1612b, iVarH);
                    ((c) this.f1614d).f1621z.add(iVarH);
                    c cVar = (c) this.f1614d;
                    cVar.A.b(cVar.f1621z);
                }
                return;
            case 1:
                LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f1613c;
                c1 c1Var = (c1) this.f1614d;
                if (c1Var.f3523b > 0) {
                    Bundle bundle = c1Var.f3524c;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f1612b) : null);
                }
                if (c1Var.f3523b >= 2) {
                    lifecycleCallback.onStart();
                }
                if (c1Var.f3523b >= 3) {
                    lifecycleCallback.onResume();
                }
                if (c1Var.f3523b >= 4) {
                    lifecycleCallback.onStop();
                }
                if (c1Var.f3523b >= 5) {
                    lifecycleCallback.onDestroy();
                    return;
                }
                return;
            case 2:
                LifecycleCallback lifecycleCallback2 = (LifecycleCallback) this.f1613c;
                d1 d1Var = (d1) this.f1614d;
                if (d1Var.f3529p0 > 0) {
                    Bundle bundle2 = d1Var.f3530q0;
                    lifecycleCallback2.onCreate(bundle2 != null ? bundle2.getBundle((String) this.f1612b) : null);
                }
                if (d1Var.f3529p0 >= 2) {
                    lifecycleCallback2.onStart();
                }
                if (d1Var.f3529p0 >= 3) {
                    lifecycleCallback2.onResume();
                }
                if (d1Var.f3529p0 >= 4) {
                    lifecycleCallback2.onStop();
                }
                if (d1Var.f3529p0 >= 5) {
                    lifecycleCallback2.onDestroy();
                    return;
                }
                return;
            case 3:
                ((k) this.f1613c).f16845g.g((String) this.f1612b, (l) this.f1614d);
                return;
            case 4:
                md.a aVar = (md.a) this.f1612b;
                Intent intent = aVar.f11600a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    taskD = Tasks.forResult(null);
                } else {
                    Bundle bundle3 = new Bundle();
                    Intent intent2 = aVar.f11600a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle3.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f11600a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle3.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.f1613c;
                    bundle3.putBoolean("supports_message_handled", true);
                    m mVarC = m.c(context);
                    synchronized (mVarC) {
                        i10 = mVarC.f11638a;
                        mVarC.f11638a = i10 + 1;
                    }
                    taskD = mVarC.d(new md.l(i10, 2, bundle3, 0));
                }
                taskD.addOnCompleteListener(h.f11617b, new yh.c((CountDownLatch) this.f1614d, 10));
                return;
            case 5:
                mg.d dVar = (mg.d) this.f1614d;
                rg.k kVar = dVar.f11673a;
                rg.h hVar = dVar.f11674b;
                r rVar = (r) this.f1613c;
                ug.k kVar2 = (ug.k) ((g) this.f1612b).f17076b;
                l lVar = kVar.f14440k;
                l lVar2 = kVar.f14439i;
                if (lVar2.A()) {
                    lVar2.l(null, "set: " + hVar, new Object[0]);
                }
                if (lVar.A()) {
                    lVar.l(null, "set: " + hVar + " " + rVar, new Object[0]);
                }
                r rVarJ = cg.b.J(rVar, new g0(kVar.f14443n.g(hVar, new ArrayList())), cg.b.C(kVar.f14432b));
                long j = kVar.f14441l;
                kVar.f14441l = 1 + j;
                z zVar = kVar.f14443n;
                zVar.getClass();
                ug.l.b("We shouldn't be persisting non-visible writes.", true);
                kVar.g((List) zVar.f14496g.c(new t(zVar, true, hVar, rVar, j, rVarJ)));
                kVar.f14433c.e("p", hVar.b(), rVar.s(true), null, new j(kVar, hVar, j, kVar2));
                rg.h hVarT = kVar.e(hVar).t();
                if (kVar.j.A()) {
                    lVar2.l(null, "Aborting transactions for path: " + hVar + ". Affected: " + hVarT, new Object[0]);
                }
                l lVarF = kVar.f14436f.F(hVar);
                for (l lVar3 = (l) lVarF.f12661c; lVar3 != null; lVar3 = (l) lVar3.f12661c) {
                    kVar.a(lVar3);
                }
                kVar.a(lVarF);
                yh.c cVar2 = new yh.c(kVar, 15);
                Object[] array = ((ug.j) lVarF.f12662d).f17080a.entrySet().toArray();
                while (r82 < array.length) {
                    Map.Entry entry = (Map.Entry) array[r82];
                    new l((zg.c) entry.getKey(), lVarF, (ug.j) entry.getValue(), 12).p(cVar2, true);
                    r82++;
                }
                kVar.i(hVarT);
                return;
            case 6:
                i0 i0Var = (i0) this.f1613c;
                String str = (String) this.f1612b;
                HashMap map = (HashMap) this.f1614d;
                zzcfe zzcfeVar = (zzcfe) i0Var.f3554d;
                if (zzcfeVar != null) {
                    zzcfeVar.zzd(str, map);
                    return;
                }
                return;
            case 7:
                try {
                    objCall = ((q4.d) this.f1613c).call();
                } catch (Exception unused) {
                }
                ((Handler) this.f1614d).post(new a8.e(19, (q4.e) this.f1612b, objCall, r82));
                return;
            case 8:
                qj.l lVar4 = (qj.l) this.f1613c;
                try {
                    b0.A(lVar4.f13597e.s(ti.d.f16335a), new q((u) this.f1612b, lVar4, (t0.f) this.f1614d, (ti.c) null, 12));
                    return;
                } catch (Throwable th2) {
                    lVar4.x(th2);
                    return;
                }
            case 9:
                try {
                    zBooleanValue = ((Boolean) ((e8.k) this.f1614d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((u7.b) this.f1613c).b((String) this.f1612b, zBooleanValue);
                return;
            case 10:
                e8.k kVar3 = (e8.k) this.f1612b;
                u7.l lVar5 = (u7.l) this.f1614d;
                try {
                    ((mf.a) this.f1613c).get();
                    t7.m.g().c(u7.l.M, "Starting work for " + lVar5.f16852e.f3123c, new Throwable[0]);
                    lVar5.K = lVar5.f16853f.startWork();
                    kVar3.j(lVar5.K);
                    return;
                } catch (Throwable th3) {
                    kVar3.i(th3);
                    return;
                }
            case 11:
                String str2 = (String) this.f1612b;
                u7.l lVar6 = (u7.l) this.f1614d;
                try {
                    try {
                        t7.l lVar7 = (t7.l) ((e8.k) this.f1613c).get();
                        if (lVar7 == null) {
                            t7.m.g().f(u7.l.M, lVar6.f16852e.f3123c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            t7.m.g().c(u7.l.M, String.format("%s returned a %s result.", lVar6.f16852e.f3123c, lVar7), new Throwable[0]);
                            lVar6.A = lVar7;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        t7.m.g().f(u7.l.M, str2 + " failed because it threw an exception/error", e);
                    } catch (CancellationException e11) {
                        t7.m.g().i(u7.l.M, str2 + " was cancelled", e11);
                    } catch (ExecutionException e12) {
                        e = e12;
                        t7.m.g().f(u7.l.M, str2 + " failed because it threw an exception/error", e);
                    }
                    lVar6.b();
                    return;
                } catch (Throwable th4) {
                    lVar6.b();
                    throw th4;
                }
            case 12:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1614d;
                Context context2 = (Context) this.f1612b;
                Intent intent4 = (Intent) this.f1613c;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    t7.m.g().c(ConstraintProxyUpdateReceiver.f1244a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    d8.f.a(context2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    d8.f.a(context2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    d8.f.a(context2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    d8.f.a(context2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 13:
                ((w8.q) this.f1613c).w((a0) this.f1612b, (ac.l) this.f1614d);
                return;
            case 14:
                ((w8.q) this.f1613c).v((rc.f) this.f1612b, (n) this.f1614d);
                return;
            case 15:
                xc.a aVar2 = (xc.a) this.f1613c;
                Bundle bundle4 = (Bundle) this.f1612b;
                y yVar = (y) this.f1614d;
                t0 t0Var = mc.n.D.f11580f;
                Context context3 = aVar2.f19889a;
                CookieManager cookieManagerD = t0Var.d();
                bundle4.putBoolean("accept_3p_cookie", cookieManagerD != null ? cookieManagerD.acceptThirdPartyCookies(aVar2.f19890b) : false);
                d8.e eVar = new d8.e(7);
                eVar.h(bundle4);
                zc.a.a(context3, new fc.g(eVar), yVar);
                return;
            case 16:
                xc.g0 g0Var = (xc.g0) this.f1613c;
                Object obj = this.f1612b;
                Pair pair = (Pair) this.f1614d;
                if (obj instanceof WebView) {
                    Context context4 = g0Var.f19934c;
                    CookieManager cookieManagerD2 = mc.n.D.f11580f.d();
                    if (cookieManagerD2 != null) {
                        zAcceptThirdPartyCookies = cookieManagerD2.acceptThirdPartyCookies((WebView) obj);
                    }
                }
                HashMap map2 = g0Var.f19932a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                xc.i0 i0Var2 = (xc.i0) map2.get(boolValueOf);
                if (i0Var2 != null) {
                    mc.n.D.f11584k.getClass();
                    if (i0Var2.f19946c > System.currentTimeMillis()) {
                        g0Var.d(i0Var2, pair, true);
                        return;
                    }
                }
                HashMap map3 = g0Var.f19933b;
                List arrayList = (List) map3.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map3.put(boolValueOf, arrayList);
                }
                arrayList.add(pair);
                return;
            case 17:
                zzdsh zzdshVar = (zzdsh) this.f1613c;
                String str3 = (String) this.f1612b;
                Pair[] pairArr = (Pair[]) this.f1614d;
                ConcurrentHashMap concurrentHashMapZzc = zzdshVar.zzc();
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str3)) {
                    concurrentHashMapZzc.put("action", str3);
                }
                for (Pair pair2 : pairArr) {
                    String str4 = (String) pair2.first;
                    String str5 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                        concurrentHashMapZzc.put(str4, str5);
                    }
                }
                zzdshVar.zzg(concurrentHashMapZzc);
                return;
            default:
                new zzbuf((Context) this.f1613c, fc.b.BANNER, ((fc.g) this.f1612b).f6695a, null).zzb((zc.b) this.f1614d);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f1611a = i10;
        this.f1614d = obj;
        this.f1613c = obj2;
        this.f1612b = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10, boolean z2) {
        this.f1611a = i10;
        this.f1613c = obj;
        this.f1612b = obj2;
        this.f1614d = obj3;
    }
}
