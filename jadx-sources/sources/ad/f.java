package ad;

import a8.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c8.i;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.o;
import e8.k;
import fc.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l.h;
import pg.q;
import rg.z;
import t4.q0;
import t4.v0;
import t7.m;
import xc.a0;
import xc.l0;
import zg.l;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f422e;

    public /* synthetic */ f(int i10, Object obj, Object obj2, Object obj3, Object obj4, boolean z2) {
        this.f418a = i10;
        this.f422e = obj;
        this.f419b = obj2;
        this.f420c = obj3;
        this.f421d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVarH;
        boolean zContains;
        switch (this.f418a) {
            case 0:
                Context context = (Context) this.f419b;
                try {
                    new zzbxc(context, (String) this.f420c).zza(((g) this.f421d).f6695a, (d) this.f422e);
                    return;
                } catch (IllegalStateException e10) {
                    zzbul.zza(context).zzh(e10, "RewardedAd.load");
                    return;
                }
            case 1:
                Context context2 = (Context) this.f419b;
                try {
                    new zzbxn(context2, (String) this.f420c).zza(((g) this.f421d).f6695a, (bd.b) this.f422e);
                    return;
                } catch (IllegalStateException e11) {
                    zzbul.zza(context2).zzh(e11, "RewardedInterstitialAd.load");
                    return;
                }
            case 2:
                k kVar = (k) this.f421d;
                UUID uuid = (UUID) this.f419b;
                String string = uuid.toString();
                m mVarG = m.g();
                String str = o.f5032c;
                t7.f fVar = (t7.f) this.f420c;
                mVarG.c(str, "Updating progress for " + uuid + " (" + fVar + ")", new Throwable[0]);
                o oVar = (o) this.f422e;
                WorkDatabase workDatabase = oVar.f5033a;
                WorkDatabase workDatabase2 = oVar.f5033a;
                workDatabase.c();
                try {
                    iVarH = workDatabase2.w().h(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (iVarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (iVarH.f3122b == 2) {
                    c8.g gVar = new c8.g(string, fVar);
                    j jVarV = workDatabase2.v();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVarV.f215a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((c8.b) jVarV.f216b).l(gVar);
                        workDatabase_Impl.q();
                        workDatabase_Impl.h();
                    } catch (Throwable th2) {
                        workDatabase_Impl.h();
                        throw th2;
                    }
                } else {
                    m.g().m(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                }
                kVar.h(null);
                workDatabase2.q();
                return;
            case 3:
                Context context3 = (Context) this.f419b;
                try {
                    new zzbbc(context3, (String) this.f420c, ((g) this.f421d).f6695a, (hc.a) this.f422e).zza();
                    return;
                } catch (IllegalStateException e12) {
                    zzbul.zza(context3).zzh(e12, "AppOpenAd.load");
                    return;
                }
            case 4:
                l.e eVar = (l.e) ((p7.k) this.f422e).f12813b;
                l.i iVar = (l.i) this.f420c;
                l.d dVar = (l.d) this.f419b;
                if (dVar != null) {
                    eVar.S = true;
                    dVar.f9761b.c(false);
                    eVar.S = false;
                }
                if (iVar.isEnabled() && iVar.hasSubMenu()) {
                    ((h) this.f421d).p(iVar, null, 4);
                    return;
                }
                return;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f420c;
                rg.k kVar2 = (rg.k) this.f422e;
                z zVar = kVar2.f14443n;
                rg.e eVar2 = kVar2.f14438h;
                mg.d dVar2 = (mg.d) this.f419b;
                rg.k kVar3 = dVar2.f11673a;
                rg.h hVar = dVar2.f11674b;
                r rVar = (r) zVar.f14496g.c(new ai.d(1, zVar, dVar2.e()));
                if (rVar != null) {
                    taskCompletionSource.setResult(new mg.a(new mg.d(kVar3, hVar), l.e(rVar)));
                    return;
                }
                z zVar2 = kVar2.f14443n;
                zVar2.f14496g.c(new h6.c(zVar2, dVar2.e()));
                z zVar3 = kVar2.f14443n;
                zVar3.getClass();
                mg.a aVar = new mg.a(new mg.d(kVar3, hVar), zVar3.f14496g.d(dVar2.e()).f19286a);
                if (aVar.b()) {
                    ((ug.b) eVar2.f14399e.f373b).schedule(new ac.e(17, taskCompletionSource, aVar), 3000L, TimeUnit.MILLISECONDS);
                }
                q qVar = kVar2.f14433c;
                ArrayList arrayListB = hVar.b();
                HashMap mapA = dVar2.e().f19306b.a();
                qVar.getClass();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                long j = qVar.j;
                qVar.j = 1 + j;
                HashMap map = new HashMap();
                map.put("p", hj.a.E(arrayListB));
                map.put("q", mapA);
                qVar.f12938o.put(Long.valueOf(j), new pg.m(map, new pg.e(taskCompletionSource2)));
                if (qVar.f12932h == pg.l.f12910e) {
                    qVar.k(Long.valueOf(j));
                }
                qVar.b();
                taskCompletionSource2.getTask().addOnCompleteListener((ug.b) eVar2.f14399e.f373b, new ai.h(this, taskCompletionSource, aVar, dVar2, (rg.k) this.f421d));
                return;
            case 6:
                Context context4 = (Context) this.f419b;
                try {
                    new zzbmx(context4, (String) this.f420c).zza(((g) this.f421d).f6695a, (sc.b) this.f422e);
                    return;
                } catch (IllegalStateException e13) {
                    zzbul.zza(context4).zzh(e13, "InterstitialAd.load");
                    return;
                }
            case 7:
                q0.i((View) this.f419b, (v0) this.f420c, (q5.b) this.f421d);
                ((ValueAnimator) this.f422e).start();
                return;
            case 8:
                xc.o oVar2 = (xc.o) this.f419b;
                String str2 = (String) this.f420c;
                xc.l lVar = (xc.l) this.f421d;
                zzbzc zzbzcVar = (zzbzc) this.f422e;
                a0 a0Var = oVar2.f20000b;
                a0Var.e();
                synchronized (a0Var.f19903d) {
                    zContains = a0Var.f19900a.contains(str2);
                }
                if (zContains || oVar2.b()) {
                    return;
                }
                lVar.zzf(new xd.b(oVar2.f19999a), zzbzcVar, null);
                return;
            default:
                l0 l0Var = (l0) this.f419b;
                zzdrw zzdrwVar = (zzdrw) this.f420c;
                ArrayDeque arrayDeque = (ArrayDeque) this.f421d;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.f422e;
                l0Var.d(zzdrwVar, arrayDeque, "to");
                l0Var.d(zzdrwVar, arrayDeque2, "of");
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f418a = i10;
        this.f419b = obj;
        this.f420c = obj2;
        this.f421d = obj3;
        this.f422e = obj4;
    }
}
