package a2;

import android.util.Log;
import c2.t0;
import java.util.concurrent.Executor;
import t2.d1;
import v2.b1;
import v2.i1;
import v2.z1;
import w2.b2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
        super(0);
        this.f16a = i10;
        this.f17b = obj;
        this.f18c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [ej.c, fj.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // ej.a
    public final Object a() {
        d3.r rVar;
        v2.f0 f0Var;
        switch (this.f16a) {
            case 0:
                ((fj.v) this.f17b).f6807a = ((e0) this.f18c).s1();
                break;
            case 1:
                ej.a aVar = (ej.a) this.f17b;
                if (aVar == null || (r0 = (b2.c) aVar.a()) == null) {
                    i1 i1Var = (i1) this.f18c;
                    if (!i1Var.w1().G) {
                        i1Var = null;
                    }
                    if (i1Var != null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
                ((Executor) this.f17b).execute(new ac.o((z4.d) this.f18c, 7));
                break;
            case 3:
                ((fj.m) this.f18c).invoke(((fj.v) this.f17b).f6807a);
                break;
            case 4:
                g5.d dVar = (g5.d) this.f17b;
                dVar.f().execute(new ac.e(4, dVar, (z4.k) this.f18c));
                break;
            case 5:
                g5.d dVar2 = (g5.d) this.f18c;
                dVar2.f().execute(new ac.e(5, dVar2, (fj.v) this.f17b));
                break;
            case 6:
                g5.d dVar3 = (g5.d) this.f17b;
                dVar3.f().execute(new g5.b(dVar3, (a5.d) this.f18c, 1));
                break;
            case 7:
                g5.d dVar4 = (g5.d) this.f17b;
                dVar4.f().execute(new ac.e(6, dVar4, (a5.b) this.f18c));
                break;
            case 8:
                i5.c cVar = (i5.c) this.f17b;
                cVar.g().execute(new ac.e(7, cVar, (z4.k) this.f18c));
                break;
            case 9:
                i5.c cVar2 = (i5.c) this.f18c;
                cVar2.g().execute(new ac.e(8, cVar2, (fj.v) this.f17b));
                break;
            case 10:
                i5.c cVar3 = (i5.c) this.f17b;
                cVar3.g().execute(new i5.b(cVar3, (a5.d) this.f18c, 1));
                break;
            case 11:
                i5.c cVar4 = (i5.c) this.f17b;
                cVar4.g().execute(new ac.e(9, cVar4, (a5.b) this.f18c));
                break;
            case 12:
                i5.c cVar5 = (i5.c) this.f17b;
                cVar5.g().execute(new ac.e(10, cVar5, (a5.e) this.f18c));
                break;
            case 13:
                ((p2.d) this.f17b).d((v1.n) this.f18c);
                break;
            case 14:
                b1 b1Var = ((v2.f0) this.f18c).Y;
                fj.v vVar = (fj.v) this.f17b;
                if ((b1Var.f17586f.f17568d & 8) != 0) {
                    for (v1.n nVar = b1Var.f17585e; nVar != null; nVar = nVar.f17569e) {
                        if ((nVar.f17567c & 8) != 0) {
                            v2.k kVarE = nVar;
                            ?? eVar = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof z1) {
                                    z1 z1Var = (z1) kVarE;
                                    if (z1Var.Y()) {
                                        d3.n nVar2 = new d3.n();
                                        vVar.f6807a = nVar2;
                                        nVar2.f4761d = true;
                                    }
                                    if (z1Var.X0()) {
                                        ((d3.n) vVar.f6807a).f4760c = true;
                                    }
                                    z1Var.u0((d3.z) vVar.f6807a);
                                } else if ((kVarE.f17567c & 8) != 0 && (kVarE instanceof v2.k)) {
                                    v1.n nVar3 = kVarE.I;
                                    int i10 = 0;
                                    kVarE = kVarE;
                                    eVar = eVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f17567c & 8) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                kVarE = nVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f17570f;
                                        kVarE = kVarE;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVarE = v2.n.e(eVar);
                            }
                        }
                    }
                }
                break;
            case 15:
                ej.c cVar6 = (ej.c) this.f17b;
                t0 t0Var = i1.f17679f0;
                cVar6.invoke(t0Var);
                i1 i1Var2 = (i1) this.f18c;
                boolean zB = fj.l.b(i1Var2.W, t0Var.H);
                boolean z2 = i1Var2.X;
                boolean z10 = t0Var.I;
                boolean z11 = z2 != z10;
                if (!zB || z11) {
                    i1Var2.W = t0Var.H;
                    i1Var2.X = z10;
                    if (i1Var2.Y && (z11 || (z10 && !zB))) {
                        i1Var2.H.E();
                    }
                }
                i1Var2.Y = true;
                t0Var.Q = t0Var.H.b(t0Var.K, t0Var.M, t0Var.L);
                break;
            case 16:
                ((fj.v) this.f17b).f6807a = v2.n.h((v3.t) this.f18c, d1.f15532a);
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                w2.y yVar = (w2.y) this.f18c;
                b2 b2Var = (b2) this.f17b;
                d3.k kVar = b2Var.f18210e;
                d3.k kVar2 = b2Var.f18211f;
                Float f10 = b2Var.f18208c;
                Float f11 = b2Var.f18209d;
                float fFloatValue = (kVar == null || f10 == null) ? 0.0f : ((Number) kVar.f4724a.a()).floatValue() - f10.floatValue();
                float fFloatValue2 = (kVar2 == null || f11 == null) ? 0.0f : ((Number) kVar2.f4724a.a()).floatValue() - f11.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = yVar.A(b2Var.f18206a);
                    d3.s sVar = (d3.s) yVar.s().b(yVar.D);
                    if (sVar != null) {
                        try {
                            u4.e eVar2 = yVar.F;
                            if (eVar2 != null) {
                                eVar2.f16615a.setBoundsInScreen(yVar.k(sVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    d3.s sVar2 = (d3.s) yVar.s().b(yVar.E);
                    if (sVar2 != null) {
                        try {
                            u4.e eVar3 = yVar.G;
                            if (eVar3 != null) {
                                eVar3.f16615a.setBoundsInScreen(yVar.k(sVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    yVar.f18458d.invalidate();
                    d3.s sVar3 = (d3.s) yVar.s().b(iA);
                    if (sVar3 != null && (rVar = sVar3.f4769a) != null && (f0Var = rVar.f4765c) != null) {
                        if (kVar != null) {
                            yVar.I.i(iA, kVar);
                        }
                        if (kVar2 != null) {
                            yVar.J.i(iA, kVar2);
                        }
                        yVar.w(f0Var);
                    }
                }
                if (kVar != null) {
                    b2Var.f18208c = (Float) kVar.f4724a.a();
                }
                if (kVar2 != null) {
                    b2Var.f18209d = (Float) kVar2.f4724a.a();
                }
                break;
            default:
                ((z1.c) this.f17b).J.invoke((z1.d) this.f18c);
                break;
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(ej.c cVar, fj.v vVar) {
        super(0);
        this.f16a = 3;
        this.f18c = (fj.m) cVar;
        this.f17b = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, fj.v vVar, int i10) {
        super(0);
        this.f16a = i10;
        this.f18c = obj;
        this.f17b = vVar;
    }
}
