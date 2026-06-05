package f1;

import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6447d;

    public /* synthetic */ s1(int i10, fj.t tVar, wa.q qVar) {
        this.f6444a = 3;
        this.f6445b = i10;
        this.f6446c = tVar;
        this.f6447d = qVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        o oVar;
        o oVar2;
        int i10;
        switch (this.f6444a) {
            case 0:
                t1 t1Var = (t1) this.f6446c;
                q.a0 a0Var = (q.a0) this.f6447d;
                o oVar3 = (o) obj;
                int i11 = t1Var.f6457e;
                int i12 = this.f6445b;
                if (i11 == i12 && fj.l.b(a0Var, t1Var.f6458f) && (oVar3 instanceof r)) {
                    long[] jArr = a0Var.f13026a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j = jArr[i13];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((255 & j) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj2 = a0Var.f13027b[i17];
                                        boolean z2 = a0Var.f13028c[i17] != i12;
                                        if (z2) {
                                            i10 = i14;
                                            r rVar = (r) oVar3;
                                            q.g0 g0Var = rVar.f6429z;
                                            yd.f.Z(g0Var, obj2, t1Var);
                                            oVar2 = oVar3;
                                            if (obj2 instanceof y) {
                                                y yVar = (y) obj2;
                                                if (!g0Var.c(yVar)) {
                                                    yd.f.a0(rVar.C, yVar);
                                                }
                                                q.g0 g0Var2 = t1Var.f6459g;
                                                if (g0Var2 != null) {
                                                    g0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            oVar2 = oVar3;
                                            i10 = i14;
                                        }
                                        if (z2) {
                                            a0Var.f(i17);
                                        }
                                    } else {
                                        oVar2 = oVar3;
                                        i10 = i14;
                                    }
                                    j >>= i10;
                                    i16++;
                                    i14 = i10;
                                    oVar3 = oVar2;
                                }
                                oVar = oVar3;
                                if (i15 == i14) {
                                }
                            } else {
                                oVar = oVar3;
                            }
                            if (i13 != length) {
                                i13++;
                                oVar3 = oVar;
                            }
                        }
                    }
                }
                return pi.o.f13011a;
            case 1:
                k0.y1 y1Var = (k0.y1) this.f6446c;
                t2.f1 f1Var = (t2.f1) this.f6447d;
                t2.e1 e1Var = (t2.e1) obj;
                int i18 = y1Var.f9340c;
                k0.p1 p1Var = y1Var.f9339b;
                l3.a0 a0Var2 = y1Var.f9341d;
                k0.s1 s1Var = (k0.s1) y1Var.f9342e.a();
                p1Var.a(x.o1.f19664a, k0.s.j(e1Var, i18, a0Var2, s1Var != null ? s1Var.f9254a : null, false, f1Var.f15550a), this.f6445b, f1Var.f15551b);
                t2.e1.D(e1Var, f1Var, 0, Math.round(-p1Var.f9230a.g()));
                break;
            case 2:
                v.t1 t1Var2 = (v.t1) this.f6446c;
                t2.f1 f1Var2 = (t2.f1) this.f6447d;
                t2.e1 e1Var2 = (t2.e1) obj;
                int iG = t1Var2.H.f17307a.g();
                if (iG < 0) {
                    iG = 0;
                }
                int i19 = this.f6445b;
                if (iG > i19) {
                    iG = i19;
                }
                int i20 = -iG;
                boolean z10 = t1Var2.I;
                int i21 = z10 ? 0 : i20;
                if (!z10) {
                    i20 = 0;
                }
                e1Var2.f15541a = true;
                t2.e1.E(e1Var2, f1Var2, i21, i20);
                e1Var2.f15541a = false;
                break;
            default:
                fj.t tVar = (fj.t) this.f6446c;
                wa.q qVar = (wa.q) this.f6447d;
                float fFloatValue = ((Float) obj).floatValue();
                int i22 = this.f6445b;
                float f10 = i22;
                int i23 = (int) (((0.5f * f10) + fFloatValue) / f10);
                int i24 = tVar.f6805a + i23;
                qVar.f19136b.getClass();
                Log.d("ResizeDebug", "Resize MOVE: deltaX=" + fFloatValue + ", cellWidth=" + i22 + ", cellsMoved=" + i23 + ", newSpan=" + cg.b.p(i24, 1, 4));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ s1(Object obj, int i10, int i11, Object obj2) {
        this.f6444a = i11;
        this.f6446c = obj;
        this.f6445b = i10;
        this.f6447d = obj2;
    }

    public /* synthetic */ s1(k0.y1 y1Var, t2.f1 f1Var, int i10) {
        this.f6444a = 1;
        this.f6446c = y1Var;
        this.f6447d = f1Var;
        this.f6445b = i10;
    }
}
