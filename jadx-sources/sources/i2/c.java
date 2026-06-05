package i2;

import c2.x0;
import c2.z0;
import java.util.ArrayList;
import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f8178b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8179c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f8180d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f8181e = c2.w.f3058h;

    /* renamed from: f, reason: collision with root package name */
    public List f8182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8183g;

    /* renamed from: h, reason: collision with root package name */
    public c2.j f8184h;

    /* renamed from: i, reason: collision with root package name */
    public ej.c f8185i;
    public final x0 j;

    /* renamed from: k, reason: collision with root package name */
    public String f8186k;

    /* renamed from: l, reason: collision with root package name */
    public float f8187l;

    /* renamed from: m, reason: collision with root package name */
    public float f8188m;

    /* renamed from: n, reason: collision with root package name */
    public float f8189n;

    /* renamed from: o, reason: collision with root package name */
    public float f8190o;

    /* renamed from: p, reason: collision with root package name */
    public float f8191p;

    /* renamed from: q, reason: collision with root package name */
    public float f8192q;

    /* renamed from: r, reason: collision with root package name */
    public float f8193r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8194s;

    public c() {
        int i10 = h0.f8270a;
        this.f8182f = qi.s.f13520a;
        this.f8183g = true;
        this.j = new x0(this, 6);
        this.f8186k = "";
        this.f8190o = 1.0f;
        this.f8191p = 1.0f;
        this.f8194s = true;
    }

    @Override // i2.c0
    public final void a(e2.d dVar) {
        if (this.f8194s) {
            float[] fArrA = this.f8178b;
            if (fArrA == null) {
                fArrA = c2.k0.a();
                this.f8178b = fArrA;
            } else {
                c2.k0.d(fArrA);
            }
            c2.k0.f(fArrA, this.f8192q + this.f8188m, this.f8193r + this.f8189n);
            float f10 = this.f8187l;
            if (fArrA.length >= 16) {
                double d10 = f10 * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = fArrA[1];
                float f16 = fArrA[5];
                float f17 = (fSin * f16) + (fCos * f15);
                float f18 = fArrA[2];
                float f19 = fArrA[6];
                float f20 = (fSin * f19) + (fCos * f18);
                float f21 = fArrA[3];
                float f22 = fArrA[7];
                fArrA[0] = f13;
                fArrA[1] = f17;
                fArrA[2] = f20;
                fArrA[3] = (fSin * f22) + (fCos * f21);
                fArrA[4] = (f12 * fCos) + (f11 * f14);
                fArrA[5] = (f16 * fCos) + (f15 * f14);
                fArrA[6] = (f19 * fCos) + (f18 * f14);
                fArrA[7] = (fCos * f22) + (f14 * f21);
            }
            float f23 = this.f8190o;
            float f24 = this.f8191p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f23;
                fArrA[1] = fArrA[1] * f23;
                fArrA[2] = fArrA[2] * f23;
                fArrA[3] = fArrA[3] * f23;
                fArrA[4] = fArrA[4] * f24;
                fArrA[5] = fArrA[5] * f24;
                fArrA[6] = fArrA[6] * f24;
                fArrA[7] = fArrA[7] * f24;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            c2.k0.f(fArrA, -this.f8188m, -this.f8189n);
            this.f8194s = false;
        }
        if (this.f8183g) {
            if (!this.f8182f.isEmpty()) {
                c2.j jVarA = this.f8184h;
                if (jVarA == null) {
                    jVarA = c2.l.a();
                    this.f8184h = jVarA;
                }
                b.e(this.f8182f, jVarA);
            }
            this.f8183g = false;
        }
        ac.d dVarC0 = dVar.C0();
        long jY = dVarC0.y();
        dVarC0.h().f();
        try {
            ac.d dVar2 = (ac.d) ((ld.i) dVarC0.f373b).f10924b;
            float[] fArr = this.f8178b;
            if (fArr != null) {
                dVar2.h().i(fArr);
            }
            c2.j jVar = this.f8184h;
            if (!this.f8182f.isEmpty() && jVar != null) {
                dVar2.h().m(jVar);
            }
            ArrayList arrayList = this.f8179c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) arrayList.get(i10)).a(dVar);
            }
        } finally {
            m1.r(dVarC0, jY);
        }
    }

    @Override // i2.c0
    public final ej.c b() {
        return this.f8185i;
    }

    @Override // i2.c0
    public final void d(x0 x0Var) {
        this.f8185i = x0Var;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f8179c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f8180d && j != 16) {
            long j4 = this.f8181e;
            if (j4 == 16) {
                this.f8181e = j;
                return;
            }
            int i10 = h0.f8270a;
            if (c2.w.i(j4) == c2.w.i(j) && c2.w.h(j4) == c2.w.h(j) && c2.w.f(j4) == c2.w.f(j)) {
                return;
            }
            this.f8180d = false;
            this.f8181e = c2.w.f3058h;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f8180d && this.f8180d) {
                    f(cVar.f8181e);
                    return;
                } else {
                    this.f8180d = false;
                    this.f8181e = c2.w.f3058h;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        c2.s sVar = hVar.f8251b;
        if (this.f8180d && sVar != null) {
            if (sVar instanceof z0) {
                f(((z0) sVar).f3065a);
            } else {
                this.f8180d = false;
                this.f8181e = c2.w.f3058h;
            }
        }
        c2.s sVar2 = hVar.f8256g;
        if (this.f8180d && sVar2 != null) {
            if (sVar2 instanceof z0) {
                f(((z0) sVar2).f3065a);
            } else {
                this.f8180d = false;
                this.f8181e = c2.w.f3058h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f8186k);
        ArrayList arrayList = this.f8179c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(c0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
