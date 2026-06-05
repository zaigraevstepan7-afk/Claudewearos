package g0;

import b0.c1;
import f0.o0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ag.i f6943a;

    /* renamed from: b, reason: collision with root package name */
    public final q.v f6944b;

    /* renamed from: c, reason: collision with root package name */
    public final q.w f6945c;

    /* renamed from: d, reason: collision with root package name */
    public final q.t f6946d;

    /* renamed from: e, reason: collision with root package name */
    public final q.v f6947e;

    /* renamed from: f, reason: collision with root package name */
    public float f6948f;

    /* renamed from: g, reason: collision with root package name */
    public int f6949g;

    /* renamed from: h, reason: collision with root package name */
    public int f6950h;

    /* renamed from: i, reason: collision with root package name */
    public int f6951i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f6952k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6953l;

    /* renamed from: m, reason: collision with root package name */
    public int f6954m;

    /* renamed from: n, reason: collision with root package name */
    public final o0 f6955n;

    /* renamed from: o, reason: collision with root package name */
    public final ac.d f6956o;

    public o(ag.i iVar, o0 o0Var, e eVar) {
        this.f6943a = iVar;
        q.v vVar = q.l.f13102a;
        this.f6944b = new q.v();
        this.f6945c = new q.w();
        int i10 = q.i.f13086a;
        this.f6946d = new q.t();
        this.f6947e = new q.v();
        this.f6949g = -1;
        this.f6950h = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f6951i = Integer.MIN_VALUE;
        this.f6955n = o0Var;
        this.f6956o = new ac.d(eVar, 13);
    }

    public final int a(ac.d dVar, int i10, boolean z2) {
        List list;
        List list2;
        q.v vVar = this.f6947e;
        if (vVar.a(i10)) {
            Object objB = vVar.b(i10);
            fj.l.c(objB);
            return ((f0.h) objB).f6148b;
        }
        q.v vVar2 = this.f6944b;
        int i11 = 0;
        if (vVar2.a(i10)) {
            if (!z2 || (list2 = (List) vVar2.b(i10)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i11 < size) {
                ((f0.n0) list2.get(i11)).a();
                i11++;
            }
            return -1;
        }
        f0.f fVar = new f0.f(this, dVar, 0);
        long j = dVar.t().f7013u;
        o0 o0Var = (o0) dVar.f375d;
        if (o0Var == null) {
            fj.l.l("state");
            throw null;
        }
        vVar2.i(i10, yd.f.K(o0Var.a(i10, j, true, new c1(23, fVar, dVar))));
        if (!z2 || (list = (List) vVar2.b(i10)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i11 < size2) {
            ((f0.n0) list.get(i11)).a();
            i11++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.f6950h == Integer.MAX_VALUE || this.f6951i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(ac.d dVar, int i10, int i11) {
        int i12;
        int i13;
        q.v vVar = this.f6947e;
        f0.h hVar = (f0.h) vVar.b(i10);
        f0.g gVar = f0.h.f6146c;
        if (hVar != null) {
            hVar.f6148b = i11;
            hVar.f6147a = gVar;
        } else {
            hVar = new f0.h();
            hVar.f6147a = gVar;
            hVar.f6148b = i11;
        }
        vVar.i(i10, hVar);
        if (i10 > this.f6951i) {
            this.f6951i = i10;
            this.f6952k -= i11;
        } else if (i10 < this.f6950h) {
            this.f6950h = i10;
            this.j -= i11;
        }
        if (Math.signum(this.f6948f) <= 0.0f) {
            if (this.f6952k > 0) {
                i12 = this.f6951i + 1;
                i13 = i12;
            }
            i13 = -1;
        } else {
            if (Math.signum(this.f6948f) > 0.0f && this.j > 0) {
                i12 = this.f6950h - 1;
                i13 = i12;
            }
            i13 = -1;
        }
        if (i13 > 0) {
            dVar.getClass();
            if (i13 != -1 && i13 < this.f6954m) {
                f0.f fVar = new f0.f(this, dVar, 1);
                long j = dVar.t().f7013u;
                o0 o0Var = (o0) dVar.f375d;
                if (o0Var == null) {
                    fj.l.l("state");
                    throw null;
                }
                this.f6944b.i(i13, yd.f.K(o0Var.a(i13, j, true, new c1(23, fVar, dVar))));
            }
        }
        h();
    }

    public final void d(ac.d dVar, int i10, int i11, int i12, int i13, int i14, float f10, boolean z2) {
        int i15;
        int i16;
        boolean z10 = Math.signum(f10) == Math.signum(this.f6948f);
        if (!z2) {
            if (!z10 || this.f6953l) {
                this.j = i12 - i14;
                this.f6950h = i10;
            } else {
                int iH = hj.a.H(Math.abs(f10)) + this.j;
                int i17 = i12 - i14;
                if (iH > i17) {
                    iH = i17;
                }
                this.j = iH;
            }
            while (this.j > 0 && (i15 = this.f6950h) > 0) {
                int iA = a(dVar, this.f6950h - 1, i15 + (-1) == i10 + (-1) && ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) != 0) && Math.abs(f10) >= ((float) i14));
                if (iA == -1) {
                    return;
                }
                this.f6950h--;
                this.j -= iA;
            }
            return;
        }
        if (!z10 || this.f6953l) {
            this.f6952k = i12 - i13;
            this.f6951i = i11;
        } else {
            int iH2 = hj.a.H(Math.abs(f10)) + this.f6952k;
            int i18 = i12 - i13;
            if (iH2 > i18) {
                iH2 = i18;
            }
            this.f6952k = iH2;
        }
        while (this.f6952k > 0) {
            int i19 = this.f6951i;
            dVar.getClass();
            if (i19 == -1 || (i16 = this.f6951i) >= this.f6954m - 1) {
                return;
            }
            int iA2 = a(dVar, this.f6951i + 1, i16 + 1 == i11 + 1 && ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) != 0) && Math.abs(f10) >= ((float) i13));
            if (iA2 == -1) {
                return;
            }
            this.f6951i++;
            this.f6952k -= iA2;
        }
    }

    public final void e(float f10, z zVar) {
        o oVar;
        boolean z2;
        int i10;
        int i11;
        int i12;
        ac.d dVar = this.f6956o;
        dVar.f374c = zVar;
        dVar.f375d = this.f6955n;
        float f11 = -f10;
        h();
        if (dVar.p()) {
            uk.c.D(dVar.t());
            dVar.t();
            this.f6954m = dVar.A();
            int iM = dVar.m();
            int iR = dVar.r();
            int iA = dVar.A();
            int iV = dVar.v();
            int iU = dVar.u();
            q.v vVar = this.f6947e;
            if (f11 <= 0.0f) {
                this.j = 0 - iV;
                this.f6950h = iM;
                while (this.j > 0 && (i12 = this.f6950h) > 0 && vVar.a(i12 - 1)) {
                    Object objB = vVar.b(this.f6950h - 1);
                    fj.l.c(objB);
                    this.f6950h--;
                    this.j -= ((f0.h) objB).f6148b;
                }
                f(0, this.f6950h - 1);
            } else {
                this.f6952k = 0 - iU;
                this.f6951i = iR;
                while (this.f6952k > 0 && (i11 = this.f6951i) < iA - 1 && vVar.a(i11 + 1)) {
                    Object objB2 = vVar.b(this.f6951i + 1);
                    fj.l.c(objB2);
                    int i13 = ((f0.h) objB2).f6148b;
                    this.f6951i++;
                    this.f6952k -= i13;
                }
                f(this.f6951i + 1, iA - 1);
            }
        }
        if (dVar.p()) {
            uk.c.D(dVar.t());
            if (dVar.t().f7012t != null) {
                i10 = ((h0) this.f6943a.f449b).f6903o;
                z2 = false;
            } else {
                z2 = false;
                i10 = 0;
            }
            oVar = this;
            oVar.d(dVar, dVar.m(), dVar.r(), i10, dVar.u(), dVar.v(), f11, f11 <= 0.0f ? true : z2);
        } else {
            oVar = this;
        }
        oVar.f6948f = f11;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.o.f(int, int):void");
    }

    public final void g() {
        this.f6950h = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f6951i = Integer.MIN_VALUE;
        this.j = 0;
        this.f6952k = 0;
        this.f6953l = false;
        this.f6946d.a();
        this.f6947e.c();
        q.v vVar = this.f6944b;
        long[] jArr = vVar.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = vVar.f13097b[i13];
                        List list = (List) vVar.f13098c[i13];
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            ((f0.n0) list.get(i15)).cancel();
                        }
                        vVar.h(i13);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h() {
        u3.a.o(this.j, "prefetchWindowStartExtraSpace");
        u3.a.o(this.f6952k, "prefetchWindowEndExtraSpace");
        u3.a.o(this.f6950h, "prefetchWindowStartIndex");
        u3.a.o(this.f6951i, "prefetchWindowEndIndex");
    }
}
