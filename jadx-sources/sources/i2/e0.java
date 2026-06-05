package i2;

import f1.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f8217b;

    /* renamed from: c, reason: collision with root package name */
    public String f8218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8219d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8220e;

    /* renamed from: f, reason: collision with root package name */
    public fj.m f8221f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f8222g;

    /* renamed from: h, reason: collision with root package name */
    public c2.n f8223h;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f8224i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public float f8225k;

    /* renamed from: l, reason: collision with root package name */
    public float f8226l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f8227m;

    public e0(c cVar) {
        this.f8217b = cVar;
        cVar.f8185i = new d0(this, 0);
        this.f8218c = "";
        this.f8219d = true;
        this.f8220e = new a();
        this.f8221f = g.f8242c;
        this.f8222g = f1.s.A(null);
        this.f8224i = f1.s.A(new b2.e(0L));
        this.j = 9205357640488583168L;
        this.f8225k = 1.0f;
        this.f8226l = 1.0f;
        this.f8227m = new d0(this, 1);
    }

    @Override // i2.c0
    public final void a(e2.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(e2.d r35, float r36, c2.n r37) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e0.e(e2.d, float, c2.n):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f8218c);
        sb2.append("\n\tviewportWidth: ");
        j1 j1Var = this.f8224i;
        sb2.append(Float.intBitsToFloat((int) (((b2.e) j1Var.getValue()).f1514a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((b2.e) j1Var.getValue()).f1514a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
