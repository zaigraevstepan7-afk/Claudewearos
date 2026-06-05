package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f19432a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f19433b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f19434c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f19435d;

    /* renamed from: e, reason: collision with root package name */
    public w0 f19436e;

    /* renamed from: f, reason: collision with root package name */
    public w2 f19437f;

    /* renamed from: g, reason: collision with root package name */
    public p7.k f19438g;

    /* renamed from: h, reason: collision with root package name */
    public long f19439h = 9205357640488583168L;

    /* renamed from: i, reason: collision with root package name */
    public mc.e f19440i;
    public final k4.d j;

    /* renamed from: k, reason: collision with root package name */
    public final k4.d f19441k;

    /* renamed from: l, reason: collision with root package name */
    public long f19442l;

    public a1(m0 m0Var) {
        this.f19432a = m0Var;
        k4.d dVar = new k4.d();
        dVar.f9421b = new q.b0();
        this.j = dVar;
        k4.d dVar2 = new k4.d();
        dVar2.f9421b = new q.x();
        this.f19441k = dVar2;
        this.f19442l = 0L;
    }

    public static void c(a1 a1Var, m2.b bVar, long j, long j4, int i10) {
        if ((i10 & 4) != 0) {
            j4 = 0;
        }
        m0 m0Var = a1Var.f19432a;
        x0 x0Var = a1Var.f19435d;
        if (x0Var == null) {
            x0Var = new x0();
            x0Var.f19748b = null;
            x0Var.f19749c = Long.MAX_VALUE;
            x0Var.f19750d = false;
            a1Var.f19435d = x0Var;
        }
        x0Var.f19748b = bVar;
        x0Var.f19749c = j;
        mc.e eVar = a1Var.f19440i;
        if (eVar == null) {
            a1Var.f19440i = new mc.e(m0Var.J);
        } else {
            eVar.f11546c = m0Var.J;
            eVar.f11545b = j4;
        }
        x0Var.f19750d = false;
        a1Var.f19437f = x0Var;
    }

    public final void a() {
        v0 v0Var = this.f19433b;
        if (v0Var == null) {
            u0 u0Var = u0.f19733c;
            v0Var = new v0();
            v0Var.f19740b = u0Var;
            v0Var.f19741c = false;
            this.f19433b = v0Var;
        }
        v0Var.f19740b = u0.f19733c;
        v0Var.f19741c = false;
        this.f19437f = v0Var;
    }

    public final void b(m2.b bVar, long j, mc.e eVar) {
        w0 w0Var = this.f19436e;
        if (w0Var == null) {
            w0Var = new w0();
            w0Var.f19745b = null;
            w0Var.f19746c = Long.MAX_VALUE;
            this.f19436e = w0Var;
        }
        w0Var.f19745b = bVar;
        w0Var.f19746c = j;
        eVar.f11545b = 0L;
        this.f19437f = w0Var;
    }

    public final p7.k d() {
        p7.k kVar = this.f19438g;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(m2.b bVar, m2.a aVar, long j) {
        m0 m0Var = this.f19432a;
        long jX = v2.n.x(m0Var).X(0L);
        if (!b2.b.c(this.f19439h, 9205357640488583168L) && !b2.b.c(jX, this.f19439h)) {
            this.f19442l = b2.b.f(this.f19442l, b2.b.e(jX, this.f19439h));
        }
        this.f19439h = jX;
        o1 o1Var = m0Var.J;
        fj.l.c(o1Var);
        o0 o0Var = p0.f19671a;
        if (Math.abs(Float.intBitsToFloat((int) (o1Var == o1.f19664a ? j & 4294967295L : j >> 32))) > 2.0f) {
            w2.a(d(), bVar, m0Var.J, aVar, this.j, this.f19442l);
            k4.d dVar = this.f19441k;
            q.x xVar = (q.x) dVar.f9421b;
            int i10 = xVar.f13145b;
            if (i10 == 3) {
                int i11 = dVar.f9420a;
                dVar.f9420a = i11 + 1;
                if (i11 < 0 || i11 >= i10) {
                    r.a.d("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = xVar.f13144a;
                long j4 = jArr[i11];
                jArr[i11] = j;
            } else {
                xVar.a(j);
            }
            if (dVar.f9420a == 3) {
                dVar.f9420a = 0;
            }
            long[] jArr2 = xVar.f13144a;
            int i12 = xVar.f13145b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i13] >> 32));
            }
            int i14 = xVar.f13145b;
            float f10 = fIntBitsToFloat2 / i14;
            long[] jArr3 = xVar.f13144a;
            for (int i15 = 0; i15 < i14; i15++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i15] & 4294967295L));
            }
            m0Var.B1(new u((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat / xVar.f13145b) & 4294967295L), true));
        }
    }

    public final void f(m2.b bVar, m2.b bVar2, m2.a aVar, long j) {
        if (this.f19438g == null) {
            this.f19438g = new p7.k(19);
        }
        this.f19442l = 0L;
        p7.k kVarD = d();
        m0 m0Var = this.f19432a;
        w2.a(kVarD, bVar, m0Var.J, aVar, this.j, this.f19442l);
        long jE = b2.b.e(w2.j(bVar2, m0Var.J, aVar), j);
        if (((Boolean) m0Var.K.invoke(new p2.g0(1))).booleanValue()) {
            this.f19439h = v2.n.x(m0Var).X(0L);
            m0Var.B1(new v(jE));
        }
        k4.d dVar = this.f19441k;
        dVar.f9420a = 0;
        ((q.x) dVar.f9421b).f13145b = 0;
    }
}
