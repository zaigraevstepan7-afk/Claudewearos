package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t2.w f12680a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12682c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12683d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12684e;

    /* renamed from: f, reason: collision with root package name */
    public final q.b0 f12685f = new q.b0();

    /* renamed from: g, reason: collision with root package name */
    public final m f12686g = new m();

    /* renamed from: h, reason: collision with root package name */
    public final q.y f12687h = new q.y(10);

    public d(t2.w wVar) {
        this.f12680a = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.a(long, java.util.List, boolean):void");
    }

    public final boolean b(h hVar, boolean z2) {
        q.p pVar = (q.p) hVar.f12700c;
        t2.w wVar = this.f12680a;
        m mVar = this.f12686g;
        boolean zA = mVar.a(pVar, wVar, hVar, z2);
        g1.e eVar = mVar.f12728a;
        if (!zA) {
            return false;
        }
        boolean z10 = true;
        this.f12681b = true;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((l) objArr[i11]).e(hVar, z2) || z11;
        }
        Object[] objArr2 = eVar.f7024a;
        int i12 = eVar.f7026c;
        boolean z12 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z12 = ((l) objArr2[i13]).d(hVar) || z12;
        }
        mVar.b(hVar);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.f12681b = false;
        if (this.f12684e) {
            this.f12684e = false;
            q.b0 b0Var = this.f12685f;
            int i14 = b0Var.f13034b;
            for (int i15 = 0; i15 < i14; i15++) {
                d((v1.n) b0Var.f(i15));
            }
            b0Var.d();
        }
        if (this.f12682c) {
            this.f12682c = false;
            c();
        }
        if (this.f12683d) {
            this.f12683d = false;
            mVar.f12728a.h();
        }
        return z10;
    }

    public final void c() {
        if (this.f12681b) {
            this.f12682c = true;
            return;
        }
        m mVar = this.f12686g;
        g1.e eVar = mVar.f12728a;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l) objArr[i11]).c();
        }
        if (this.f12683d) {
            this.f12683d = true;
        } else {
            mVar.f12728a.h();
        }
    }

    public final void d(v1.n nVar) {
        if (this.f12681b) {
            this.f12684e = true;
            this.f12685f.a(nVar);
            return;
        }
        m mVar = this.f12686g;
        q.b0 b0Var = mVar.f12729b;
        b0Var.d();
        b0Var.a(mVar);
        while (b0Var.i()) {
            m mVar2 = (m) b0Var.k(b0Var.f13034b - 1);
            int i10 = 0;
            while (true) {
                g1.e eVar = mVar2.f12728a;
                if (i10 < eVar.f7026c) {
                    l lVar = (l) eVar.f7024a[i10];
                    if (fj.l.b(lVar.f12717c, nVar)) {
                        mVar2.f12728a.k(lVar);
                        lVar.c();
                    } else {
                        b0Var.a(lVar);
                        i10++;
                    }
                }
            }
        }
    }
}
