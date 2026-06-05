package z1;

import c2.q;
import c2.w;
import c2.w0;
import t.m1;
import v2.i1;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f20367b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f20368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20369d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20370e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20371f;

    public o(float f10, w0 w0Var, boolean z2, long j, long j4) {
        this.f20367b = f10;
        this.f20368c = w0Var;
        this.f20369d = z2;
        this.f20370e = j;
        this.f20371f = j4;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new q(new c2.x0(this, 29));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s3.f.e(this.f20367b, oVar.f20367b) && this.f20368c.equals(oVar.f20368c) && this.f20369d == oVar.f20369d && w.d(this.f20370e, oVar.f20370e) && w.d(this.f20371f, oVar.f20371f);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        i1 i1Var;
        q qVar = (q) nVar;
        c2.x0 x0Var = new c2.x0(this, 29);
        qVar.H = x0Var;
        if (qVar.f17565a.G && (i1Var = v2.n.v(qVar, 2).I) != null) {
            i1Var.V1(x0Var, true);
        }
    }

    public final int hashCode() {
        int i10 = gk.b.i((this.f20368c.hashCode() + (Float.hashCode(this.f20367b) * 31)) * 31, 31, this.f20369d);
        int i11 = w.f3059i;
        return Long.hashCode(this.f20371f) + gk.b.j(i10, this.f20370e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) s3.f.f(this.f20367b));
        sb2.append(", shape=");
        sb2.append(this.f20368c);
        sb2.append(", clip=");
        sb2.append(this.f20369d);
        sb2.append(", ambientColor=");
        m1.q(this.f20370e, sb2, ", spotColor=");
        sb2.append((Object) w.j(this.f20371f));
        sb2.append(')');
        return sb2.toString();
    }
}
