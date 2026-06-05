package ab;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.messaging.FirebaseMessaging;
import f1.a1;
import g3.m0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k0.t0;
import k0.t1;
import k0.z0;
import qj.e1;
import ra.i1;
import v0.n0;
import v0.u0;
import v0.y0;
import x.d3;
import x.h2;
import x.j2;
import x.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f316d;

    public /* synthetic */ m(fj.s sVar, h2 h2Var, fj.s sVar2, x.m mVar) {
        this.f313a = 24;
        this.f314b = sVar;
        this.f315c = h2Var;
        this.f316d = sVar2;
    }

    private final Object b(Object obj) {
        FirebaseMessaging firebaseMessaging;
        FirebaseMessaging firebaseMessaging2;
        mg.d dVar = (mg.d) this.f314b;
        a1 a1Var = (a1) this.f315c;
        t1.q qVar = (t1.q) this.f316d;
        fj.l.f((f1.b0) obj, "$this$DisposableEffect");
        p7.k kVar = new p7.k(a1Var, 21);
        dVar.b("config").a(kVar);
        yh.c cVar = new yh.c(qVar, 14);
        dVar.b("devlogs").a(cVar);
        w8.h hVar = FirebaseMessaging.f4290m;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(cg.i.e());
        }
        int i10 = 3;
        firebaseMessaging.f4301i.onSuccessTask(new t1.f("devlog", i10));
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging2 = FirebaseMessaging.getInstance(cg.i.e());
        }
        firebaseMessaging2.f4301i.onSuccessTask(new t1.f("apk_update", i10));
        return new b6.g(dVar, kVar, cVar, 1);
    }

    private final Object f(Object obj) {
        List list = (List) this.f314b;
        Set set = (Set) this.f315c;
        ej.c cVar = (ej.c) this.f316d;
        d0.h hVar = (d0.h) obj;
        fj.l.f(hVar, "$this$LazyColumn");
        ta.n nVar = new ta.n(7);
        hVar.f4359b.a(list.size(), new d0.f(new d1.b0(7, nVar, list), new i1(3, list), new p1.e(new ua.j(list, set, cVar), true, 802480018)));
        return pi.o.f13011a;
    }

    private final Object h(Object obj) {
        boolean z2;
        t0 t0Var;
        p2.h hVar = (p2.h) this.f314b;
        l7.n nVar = (l7.n) this.f315c;
        fj.r rVar = (fj.r) this.f316d;
        p2.w wVar = (p2.w) obj;
        long j = wVar.f12762c;
        u0 u0Var = (u0) hVar.f12701d;
        if (!u0Var.k() || u0Var.n().f9937a.f7081b.length() == 0 || (t0Var = u0Var.f17489d) == null || t0Var.d() == null) {
            z2 = false;
        } else {
            hVar.d(u0Var.n(), j, false, nVar);
            z2 = true;
        }
        if (z2) {
            wVar.a();
            rVar.f6803a = true;
        }
        return pi.o.f13011a;
    }

    private final Object i(Object obj) {
        final u0 u0Var = (u0) this.f314b;
        qj.z zVar = (qj.z) this.f315c;
        Context context = (Context) this.f316d;
        m0.a aVar = (m0.a) obj;
        q.b0 b0Var = aVar.f11218a;
        q.b0 b0Var2 = aVar.f11218a;
        n0.f fVar = n0.f.f11851b;
        b0Var.a(fVar);
        z0[] z0VarArr = z0.f9345b;
        final int i10 = 0;
        boolean z2 = (m0.c(u0Var.n().f9938b) || !u0Var.j() || u0Var.f17492g == null) ? false : true;
        ti.c cVar = null;
        y0 y0Var = new y0(zVar, new n0(u0Var, cVar, i));
        Resources resources = context.getResources();
        int i11 = 29;
        t1 t1Var = new t1(i11, y0Var, cVar);
        if (z2) {
            b0Var2.a(new n0.d(n0.e.f11846a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, t1Var));
        }
        z0[] z0VarArr2 = z0.f9345b;
        boolean z10 = (m0.c(u0Var.n().f9938b) || u0Var.f17492g == null) ? false : true;
        final int i12 = 2;
        y0 y0Var2 = new y0(zVar, new n0(u0Var, cVar, i12));
        Resources resources2 = context.getResources();
        t1 t1Var2 = new t1(i11, y0Var2, cVar);
        if (z10) {
            b0Var2.a(new n0.d(n0.e.f11847b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, t1Var2));
        }
        z0[] z0VarArr3 = z0.f9345b;
        boolean z11 = u0Var.j() && ((Boolean) u0Var.f17507w.getValue()).booleanValue() && u0Var.f17492g != null;
        y0 y0Var3 = new y0(zVar, new n0(u0Var, cVar, 3));
        Resources resources3 = context.getResources();
        t1 t1Var3 = new t1(i11, y0Var3, cVar);
        if (z11) {
            b0Var2.a(new n0.d(n0.e.f11848c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, t1Var3));
        }
        z0[] z0VarArr4 = z0.f9345b;
        boolean z12 = m0.d(u0Var.n().f9938b) != u0Var.n().f9937a.f7081b.length();
        ej.a aVar2 = new ej.a() { // from class: v0.x0
            @Override // ej.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        break;
                    case 1:
                        u0 u0Var2 = u0Var;
                        l3.t tVarE = u0.e(u0Var2.n().f9937a, g3.e0.b(0, u0Var2.n().f9937a.f7081b.length()));
                        u0Var2.f17488c.invoke(tVarE);
                        long j = tVarE.f9938b;
                        u0Var2.f17506v = new g3.m0(j);
                        u0Var2.f17504t = l3.t.a(u0Var2.f17504t, null, j, 5);
                        u0Var2.h(true);
                        break;
                    default:
                        ej.a aVar3 = u0Var.f17491f;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        break;
                }
                return pi.o.f13011a;
            }
        };
        ej.a aVar3 = new ej.a() { // from class: v0.x0
            @Override // ej.a
            public final Object a() {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        u0 u0Var2 = u0Var;
                        l3.t tVarE = u0.e(u0Var2.n().f9937a, g3.e0.b(0, u0Var2.n().f9937a.f7081b.length()));
                        u0Var2.f17488c.invoke(tVarE);
                        long j = tVarE.f9938b;
                        u0Var2.f17506v = new g3.m0(j);
                        u0Var2.f17504t = l3.t.a(u0Var2.f17504t, null, j, 5);
                        u0Var2.h(true);
                        break;
                    default:
                        ej.a aVar32 = u0Var.f17491f;
                        if (aVar32 != null) {
                            aVar32.a();
                        }
                        break;
                }
                return pi.o.f13011a;
            }
        };
        Resources resources4 = context.getResources();
        t1 t1Var4 = new t1(i11, aVar3, aVar2);
        if (z12) {
            b0Var2.a(new n0.d(n0.e.f11849d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, t1Var4));
        }
        z0[] z0VarArr5 = z0.f9345b;
        i = (u0Var.j() && m0.c(u0Var.n().f9938b)) ? 1 : 0;
        ej.a aVar4 = new ej.a() { // from class: v0.x0
            @Override // ej.a
            public final Object a() {
                switch (i12) {
                    case 0:
                        break;
                    case 1:
                        u0 u0Var2 = u0Var;
                        l3.t tVarE = u0.e(u0Var2.n().f9937a, g3.e0.b(0, u0Var2.n().f9937a.f7081b.length()));
                        u0Var2.f17488c.invoke(tVarE);
                        long j = tVarE.f9938b;
                        u0Var2.f17506v = new g3.m0(j);
                        u0Var2.f17504t = l3.t.a(u0Var2.f17504t, null, j, 5);
                        u0Var2.h(true);
                        break;
                    default:
                        ej.a aVar32 = u0Var.f17491f;
                        if (aVar32 != null) {
                            aVar32.a();
                        }
                        break;
                }
                return pi.o.f13011a;
            }
        };
        Resources resources5 = context.getResources();
        t1 t1Var5 = new t1(i11, aVar4, cVar);
        if (i != 0) {
            b0Var2.a(new n0.d(n0.e.f11850e, resources5.getString(R.string.autofill), 0, t1Var5));
        }
        b0Var2.a(fVar);
        return pi.o.f13011a;
    }

    private final Object j(Object obj) {
        x.i iVar = (x.i) this.f314b;
        e1 e1Var = (e1) this.f315c;
        j2 j2Var = (j2) this.f316d;
        float fFloatValue = ((Float) obj).floatValue();
        float f10 = iVar.J ? 1.0f : -1.0f;
        l2 l2Var = iVar.I;
        long jE = l2Var.e(l2Var.h(f10 * fFloatValue));
        l2 l2Var2 = j2Var.f19583a;
        float fG = l2Var.g(l2Var.e(l2Var2.c(l2Var2.f19622k, jE, 1))) * f10;
        if (Math.abs(fG) < Math.abs(fFloatValue)) {
            CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
            cancellationException.initCause(null);
            e1Var.e(cancellationException);
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:341:0x080c  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ej.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 3148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.m.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f313a = i10;
        this.f314b = obj;
        this.f315c = obj2;
        this.f316d = obj3;
    }

    public /* synthetic */ m(x.i iVar, d3 d3Var, e1 e1Var, j2 j2Var) {
        this.f313a = 23;
        this.f314b = iVar;
        this.f315c = e1Var;
        this.f316d = j2Var;
    }
}
