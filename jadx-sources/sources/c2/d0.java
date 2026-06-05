package c2;

import t.m1;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class d0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f2973b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2974c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2975d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2976e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2977f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f2978g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2979h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2980i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2981k;

    /* renamed from: l, reason: collision with root package name */
    public final n f2982l;

    public d0(float f10, float f11, float f12, float f13, long j, w0 w0Var, boolean z2, long j4, long j10, int i10, n nVar) {
        this.f2973b = f10;
        this.f2974c = f11;
        this.f2975d = f12;
        this.f2976e = f13;
        this.f2977f = j;
        this.f2978g = w0Var;
        this.f2979h = z2;
        this.f2980i = j4;
        this.j = j10;
        this.f2981k = i10;
        this.f2982l = nVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        y0 y0Var = new y0();
        y0Var.H = this.f2973b;
        y0Var.I = this.f2974c;
        y0Var.J = this.f2975d;
        y0Var.K = this.f2976e;
        y0Var.L = 8.0f;
        y0Var.M = this.f2977f;
        y0Var.N = this.f2978g;
        y0Var.O = this.f2979h;
        y0Var.P = this.f2980i;
        y0Var.Q = this.j;
        y0Var.R = this.f2981k;
        y0Var.S = 3;
        y0Var.T = this.f2982l;
        y0Var.U = new x0(y0Var, 0);
        return y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Float.compare(this.f2973b, d0Var.f2973b) == 0 && Float.compare(this.f2974c, d0Var.f2974c) == 0 && Float.compare(this.f2975d, d0Var.f2975d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f2976e, d0Var.f2976e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && a1.a(this.f2977f, d0Var.f2977f) && fj.l.b(this.f2978g, d0Var.f2978g) && this.f2979h == d0Var.f2979h && w.d(this.f2980i, d0Var.f2980i) && w.d(this.j, d0Var.j) && this.f2981k == d0Var.f2981k && fj.l.b(this.f2982l, d0Var.f2982l);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        i1 i1Var;
        y0 y0Var = (y0) nVar;
        y0Var.H = this.f2973b;
        y0Var.I = this.f2974c;
        y0Var.J = this.f2975d;
        y0Var.K = this.f2976e;
        y0Var.L = 8.0f;
        y0Var.M = this.f2977f;
        y0Var.N = this.f2978g;
        y0Var.O = this.f2979h;
        y0Var.P = this.f2980i;
        y0Var.Q = this.j;
        y0Var.R = this.f2981k;
        y0Var.S = 3;
        y0Var.T = this.f2982l;
        x0 x0Var = y0Var.U;
        if (y0Var.f17565a.G && (i1Var = v2.n.v(y0Var, 2).I) != null) {
            i1Var.V1(x0Var, true);
        }
    }

    public final int hashCode() {
        int iF = gk.b.f(8.0f, gk.b.f(0.0f, gk.b.f(0.0f, gk.b.f(0.0f, gk.b.f(this.f2976e, gk.b.f(0.0f, gk.b.f(0.0f, gk.b.f(this.f2975d, gk.b.f(this.f2974c, Float.hashCode(this.f2973b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = a1.f2963c;
        int i11 = gk.b.i((this.f2978g.hashCode() + gk.b.j(iF, this.f2977f, 31)) * 31, 961, this.f2979h);
        int i12 = w.f3059i;
        int iG = gk.b.g(3, gk.b.g(this.f2981k, gk.b.j(gk.b.j(i11, this.f2980i, 31), this.j, 31), 31), 31);
        n nVar = this.f2982l;
        return iG + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f2973b);
        sb2.append(", scaleY=");
        sb2.append(this.f2974c);
        sb2.append(", alpha=");
        sb2.append(this.f2975d);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f2976e);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) a1.d(this.f2977f));
        sb2.append(", shape=");
        sb2.append(this.f2978g);
        sb2.append(", clip=");
        sb2.append(this.f2979h);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        m1.q(this.f2980i, sb2, ", spotShadowColor=");
        m1.q(this.j, sb2, ", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f2981k + ')'));
        sb2.append(", blendMode=");
        sb2.append((Object) e0.I(3));
        sb2.append(", colorFilter=");
        sb2.append(this.f2982l);
        sb2.append(')');
        return sb2.toString();
    }
}
