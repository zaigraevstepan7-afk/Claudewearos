package c2;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CancellationException;
import t2.e1;
import t2.f1;
import v2.g2;
import w2.d1;
import w2.o1;
import w2.u2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        super(1);
        this.f3027a = i10;
        this.f3028b = obj;
        this.f3029c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ej.c
    public final Object invoke(Object obj) throws Throwable {
        t0.r rVar;
        switch (this.f3027a) {
            case 0:
                e1.G((e1) obj, (f1) this.f3028b, 0, 0, ((q) this.f3029c).H, 4);
                return pi.o.f13011a;
            case 1:
                e1.G((e1) obj, (f1) this.f3028b, 0, 0, ((y0) this.f3029c).U, 4);
                return pi.o.f13011a;
            case 2:
                e2.d dVar = (e2.d) obj;
                e2.d dVar2 = (e2.d) this.f3028b;
                s3.c cVarK = dVar.C0().k();
                s3.m mVarS = dVar.C0().s();
                u uVarH = dVar.C0().h();
                long jY = dVar.C0().y();
                f2.b bVar = (f2.b) dVar.C0().f374c;
                ej.c cVar = (ej.c) this.f3029c;
                s3.c cVarK2 = dVar2.C0().k();
                s3.m mVarS2 = dVar2.C0().s();
                u uVarH2 = dVar2.C0().h();
                long jY2 = dVar2.C0().y();
                f2.b bVar2 = (f2.b) dVar2.C0().f374c;
                ac.d dVarC0 = dVar2.C0();
                dVarC0.O(cVarK);
                dVarC0.P(mVarS);
                dVarC0.N(uVarH);
                dVarC0.Q(jY);
                dVarC0.f374c = bVar;
                uVarH.f();
                try {
                    cVar.invoke(dVar2);
                    uVarH.q();
                    ac.d dVarC02 = dVar2.C0();
                    dVarC02.O(cVarK2);
                    dVarC02.P(mVarS2);
                    dVarC02.N(uVarH2);
                    dVarC02.Q(jY2);
                    dVarC02.f374c = bVar2;
                    return pi.o.f13011a;
                } catch (Throwable th2) {
                    uVarH.q();
                    ac.d dVarC03 = dVar2.C0();
                    dVarC03.O(cVarK2);
                    dVarC03.P(mVarS2);
                    dVarC03.N(uVarH2);
                    dVarC03.Q(jY2);
                    dVarC03.f374c = bVar2;
                    throw th2;
                }
            case 3:
                Throwable th3 = (Throwable) obj;
                x3.h hVar = (x3.h) this.f3028b;
                if (th3 == null) {
                    Object objA = ((qj.f0) this.f3029c).A();
                    hVar.f19830d = true;
                    x3.j jVar = hVar.f19828b;
                    if (jVar != null && jVar.f19832b.w(objA)) {
                        hVar.f19827a = null;
                        hVar.f19828b = null;
                        hVar.f19829c = null;
                    }
                } else if (th3 instanceof CancellationException) {
                    hVar.f19830d = true;
                    x3.j jVar2 = hVar.f19828b;
                    if (jVar2 != null && jVar2.f19832b.cancel(true)) {
                        hVar.f19827a = null;
                        hVar.f19828b = null;
                        hVar.f19829c = null;
                    }
                } else {
                    hVar.f19830d = true;
                    x3.j jVar3 = hVar.f19828b;
                    if (jVar3 != null && jVar3.f19832b.x(th3)) {
                        hVar.f19827a = null;
                        hVar.f19828b = null;
                        hVar.f19829c = null;
                    }
                }
                return pi.o.f13011a;
            case 4:
                MotionEvent motionEvent = (MotionEvent) obj;
                p2.d0 d0Var = (p2.d0) this.f3029c;
                if (motionEvent.getActionMasked() == 0) {
                    wh.s sVar = (wh.s) this.f3028b;
                    p2.e0 e0Var = d0Var.f12688b;
                    if (e0Var == null) {
                        fj.l.l("onTouchEvent");
                        throw null;
                    }
                    sVar.f19380b = ((Boolean) e0Var.invoke(motionEvent)).booleanValue() ? p2.b0.f12670b : p2.b0.f12671c;
                } else {
                    p2.e0 e0Var2 = d0Var.f12688b;
                    if (e0Var2 == null) {
                        fj.l.l("onTouchEvent");
                        throw null;
                    }
                    e0Var2.invoke(motionEvent);
                }
                return pi.o.f13011a;
            case 5:
                ((e1) obj).z((f1) this.f3028b, 0, 0, ((s.f0) this.f3029c).f14596c.g());
                return pi.o.f13011a;
            case 6:
                ((e1) obj).z((f1) this.f3028b, 0, 0, ((v1.s) this.f3029c).H);
                return pi.o.f13011a;
            case 7:
                ((v2.f0) this.f3028b).d0(((v1.o) obj).c((v1.o) this.f3029c));
                return pi.o.f13011a;
            case 8:
                return new o1((t0.q) this.f3028b, new a2.f0((w2.i0) this.f3029c, 14));
            case 9:
                o1 o1Var = (o1) this.f3028b;
                synchronized (o1Var.f18344c) {
                    try {
                        o1Var.f18346e = true;
                        g1.e eVar = o1Var.f18345d;
                        Object[] objArr = eVar.f7024a;
                        int i10 = eVar.f7026c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            l3.k kVar = (l3.k) ((g2) objArr[i11]).get();
                            if (kVar != null && (rVar = kVar.f9921b) != null) {
                                kVar.a(rVar);
                                kVar.f9921b = null;
                            }
                        }
                        o1Var.f18345d.h();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                l3.u uVar = ((w2.i0) this.f3029c).f18296b;
                uVar.f9941b.set(null);
                uVar.f9940a.e();
                return pi.o.f13011a;
            case 10:
                w2.l0 l0Var = (w2.l0) this.f3028b;
                w2.m0 m0Var = (w2.m0) this.f3029c;
                synchronized (l0Var.f18313e) {
                    l0Var.f18315z.remove(m0Var);
                }
                return pi.o.f13011a;
            case 11:
                ((Choreographer) ((f1.e) this.f3028b).f6281b).removeFrameCallback((w2.m0) this.f3029c);
                return pi.o.f13011a;
            case 12:
                d1 d1Var = (d1) obj;
                ej.e eVar2 = (ej.e) this.f3029c;
                u2 u2Var = (u2) this.f3028b;
                if (!u2Var.f18433c) {
                    androidx.lifecycle.t tVar = d1Var.f18228c;
                    View view = d1Var.f18226a;
                    androidx.lifecycle.v vVarH = tVar.h();
                    u2Var.f18435e = eVar2;
                    if (u2Var.f18434d == null) {
                        if (fj.l.b(Looper.myLooper(), view.getHandler().getLooper())) {
                            u2Var.f18434d = vVarH;
                            vVarH.a(u2Var);
                        } else {
                            view.post(new ac.e(20, u2Var, vVarH));
                        }
                    } else if (vVarH.f1141c.compareTo(androidx.lifecycle.o.f1113c) >= 0) {
                        u2Var.f18432b.A(new p1.e(new w2.e1(u2Var, d1Var, eVar2), true, -1723985096));
                    }
                }
                return pi.o.f13011a;
            default:
                w3.x xVar = (w3.x) this.f3028b;
                xVar.setPositionProvider((w3.c0) this.f3029c);
                xVar.r();
                return new w3.i();
        }
    }
}
