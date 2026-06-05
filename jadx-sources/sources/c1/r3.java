package c1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2637d;

    public /* synthetic */ r3(f1.i0 i0Var, j1.a aVar, i1.g gVar, f1.v0 v0Var) {
        this.f2634a = 3;
        this.f2635b = i0Var;
        this.f2636c = aVar;
        this.f2637d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ti.c] */
    /* JADX WARN: Type inference failed for: r6v11 */
    @Override // ej.a
    public final Object a() {
        int i10;
        int i11 = this.f2634a;
        int i12 = 6;
        int i13 = 0;
        pi.o oVar = pi.o.f13011a;
        Object obj = this.f2637d;
        Object obj2 = this.f2636c;
        Object obj3 = this.f2635b;
        switch (i11) {
            case 0:
                qj.z zVar = (qj.z) obj;
                x5 x5Var = (x5) obj2;
                if (((Boolean) ((x5) obj3).f2867d.f4557d.invoke(y5.f2912b)).booleanValue()) {
                    qj.b0.w(zVar, null, new l3(x5Var, num, i12), 3);
                }
                return Boolean.TRUE;
            case 1:
                d0.u uVar = (d0.u) obj2;
                d0.h hVar = (d0.h) ((f1.y) obj3).getValue();
                return new d0.k(uVar, hVar, (d0.c) obj, new ak.x((kj.h) uVar.f4444e.f4429f.getValue(), hVar));
            case 2:
                j8 j8Var = (j8) obj3;
                qj.z zVar2 = (qj.z) obj;
                f1.a1 a1Var = (f1.a1) obj2;
                if (j8Var.b()) {
                    qj.b0.w(zVar2, null, new d1.t(j8Var, num, i13), 3);
                    a1Var.setValue(Boolean.FALSE);
                }
                return oVar;
            case 3:
                f1.i0 i0Var = (f1.i0) obj3;
                j1.a aVar = (j1.a) obj2;
                i1.g gVar = (i1.g) obj;
                j1.b bVar = i0Var.M;
                j1.a aVar2 = bVar.f8609b;
                try {
                    bVar.f8609b = aVar;
                    i1.g gVar2 = i0Var.G;
                    int[] iArr = i0Var.f6326o;
                    q.v vVar = i0Var.f6333v;
                    i0Var.f6326o = null;
                    i0Var.f6333v = null;
                    try {
                        i0Var.G = gVar;
                        boolean z2 = bVar.f8612e;
                        try {
                            bVar.f8612e = false;
                            throw null;
                        } catch (Throwable th2) {
                            bVar.f8612e = z2;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        i0Var.G = gVar2;
                        i0Var.f6326o = iArr;
                        i0Var.f6333v = vVar;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar.f8609b = aVar2;
                    throw th4;
                }
            case 4:
                s3.c cVar = (s3.c) obj;
                float fFloatValue = ((Number) ((t.c) obj3).e()).floatValue() / s3.a.h(((b0.y) obj2).f1460b);
                if (fFloatValue < -1.0f) {
                    fFloatValue = -1.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(t.x.f15309a.c(Math.abs(fFloatValue)) * Math.signum(fFloatValue) * cVar.w0(4.0f));
            case 5:
                h0.h hVar2 = (h0.h) obj3;
                b2.c cVarQ1 = h0.h.q1(hVar2, (v2.i1) obj2, (a2.d0) obj);
                if (cVarQ1 == null) {
                    return null;
                }
                x.i iVar = hVar2.H;
                if (s3.l.b(iVar.O, x.j.f19570a)) {
                    a0.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarQ1.i(iVar.u1(cVarQ1, iVar.r1(), 0L) ^ (-9223372034707292160L));
            case 6:
                i1.b bVar2 = (i1.b) obj3;
                i1.k kVar = (i1.k) obj2;
                j1.k0 k0Var = (j1.k0) obj;
                if (bVar2 != null) {
                    kVar.a(kVar.c(bVar2) - kVar.f8154t);
                }
                List listI = u1.b.i(kVar, null, kVar.f8154t, null);
                u1.c cVar2 = (u1.c) qi.l.G0(listI);
                num = cVar2 != null ? cVar2.f16566c : 0;
                List listC = k0Var.c(num);
                if (num != 0 && !listC.isEmpty()) {
                    u1.c cVar3 = (u1.c) qi.l.z0(listC);
                    List listX0 = qi.l.x0(listC);
                    int i14 = cVar3.f16564a;
                    com.google.android.gms.common.api.internal.i0 i0Var2 = cVar3.f16565b;
                    cVar3.getClass();
                    listC = qi.l.I0(yd.f.K(new u1.c(i14, i0Var2, num)), listX0);
                }
                return new u1.a(qi.l.I0(listI, listC), k0Var.h());
            case 7:
                ej.a aVar3 = (ej.a) obj3;
                f1.f1 f1Var = (f1.f1) obj2;
                if (f1Var.g() > ((f1.f1) obj).g() * 0.22f) {
                    aVar3.a();
                } else {
                    f1Var.h(0.0f);
                }
                return oVar;
            case 8:
                lb.g gVar3 = (lb.g) obj3;
                f1.a1 a1Var2 = (f1.a1) obj2;
                f1.a1 a1Var3 = (f1.a1) obj;
                nb.o oVar2 = nb.o.f12026a;
                nb.o.f12027b.c();
                tj.r0 r0Var = nb.o.f12033h;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.k(null, bool);
                w8.a aVar4 = nb.o.f12050z;
                if (aVar4 != null) {
                    aVar4.b();
                }
                nb.o.f12050z = null;
                a1Var2.setValue(bool);
                gVar3.y(false);
                lb.q3.D(a1Var3, false);
                return oVar;
            case 9:
                ((ej.c) obj3).invoke((lb.t3) ((f1.a1) obj).getValue());
                ((ej.a) obj2).a();
                return oVar;
            case 10:
                f1.a1 a1Var4 = (f1.a1) obj;
                mb.b bVar3 = (mb.b) qi.l.B0(((g0.h0) obj2).o(), (List) obj3);
                a1Var4.setValue(bVar3 != null ? bVar3.f11438a : null);
                return oVar;
            case 11:
                ((ej.c) obj3).invoke((String) obj2);
                ((f1.a1) obj).setValue(null);
                return oVar;
            case 12:
                Activity activity = (Activity) obj3;
                f1.a1 a1Var5 = (f1.a1) obj2;
                f1.a1 a1Var6 = (f1.a1) obj;
                if (activity == null) {
                    a1Var5.setValue("Could not start Google Play billing.");
                } else {
                    a1Var5.setValue(null);
                    nb.o oVar3 = nb.o.f12026a;
                    nb.o.d(activity, (nb.q) a1Var6.getValue());
                }
                return oVar;
            case 13:
                ((p1.b) obj3).a();
                p1.a aVar5 = (p1.a) ((ak.v) obj2).f732c;
                int i15 = ((fj.t) obj).f6805a;
                do {
                    i10 = aVar5.get();
                } while (!aVar5.compareAndSet(i10, ((i10 >>> 27) & 15) == i15 ? i10 - 1 : i10));
                return oVar;
            case 14:
                Context context = (Context) obj2;
                ((SharedPreferences) obj3).edit().putBoolean("post_setup_customization_done", true).putBoolean("show_post_setup_customization", false).apply();
                ((f1.a1) obj).setValue(Boolean.FALSE);
                Activity activity2 = context instanceof Activity ? (Activity) context : null;
                if (activity2 != null) {
                    activity2.recreate();
                }
                return oVar;
            case 15:
                ((ej.c) obj3).invoke(((va.v) obj2).f18007a);
                ((ej.c) obj).invoke(new ib.b(ib.k0.f8437d));
                return oVar;
            case 16:
                ((ej.e) obj3).invoke(((ra.c) obj2).f13951d, (ra.s0) ((f1.a1) obj).getValue());
                return oVar;
            case 17:
                qj.b0.w((qj.z) obj, null, new ab.o((t.c) obj2, num, i12), 3);
                ((ej.a) obj3).a();
                return oVar;
            default:
                x.i iVar2 = (x.i) obj3;
                x.d3 d3Var = (x.d3) obj2;
                x.d dVar = (x.d) obj;
                yh.c cVar4 = iVar2.M;
                while (true) {
                    g1.e eVar = (g1.e) cVar4.f20314b;
                    int i16 = eVar.f7026c;
                    if (i16 != 0) {
                        if (i16 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        b2.c cVar5 = (b2.c) ((x.g) eVar.f7024a[i16 - 1]).f19528a.a();
                        if (cVar5 == null ? true : x.i.s1(iVar2, cVar5, 0L, 0L, 3)) {
                            g1.e eVar2 = (g1.e) cVar4.f20314b;
                            ((x.g) eVar2.l(eVar2.f7026c - 1)).f19529b.resumeWith(oVar);
                        }
                    }
                }
                if (iVar2.N) {
                    b2.c cVar6 = (b2.c) iVar2.L.a();
                    if (cVar6 != null && x.i.s1(iVar2, cVar6, 0L, 0L, 3)) {
                        iVar2.N = false;
                    }
                }
                d3Var.f19497e = x.i.q1(iVar2, dVar, 0L);
                return oVar;
        }
    }

    public /* synthetic */ r3(Object obj, Object obj2, Object obj3, int i10) {
        this.f2634a = i10;
        this.f2635b = obj;
        this.f2636c = obj2;
        this.f2637d = obj3;
    }

    public /* synthetic */ r3(Object obj, qj.z zVar, Object obj2, int i10) {
        this.f2634a = i10;
        this.f2635b = obj;
        this.f2637d = zVar;
        this.f2636c = obj2;
    }

    public /* synthetic */ r3(qj.z zVar, ej.a aVar, t.c cVar) {
        this.f2634a = 17;
        this.f2637d = zVar;
        this.f2635b = aVar;
        this.f2636c = cVar;
    }
}
