package c2;

import t.m1;
import t2.f1;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 extends v1.n implements v2.w, z1 {
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public long M;
    public w0 N;
    public boolean O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public n T;
    public x0 U;

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new p(1, f1VarY, this));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.H);
        sb2.append(", scaleY=");
        sb2.append(this.I);
        sb2.append(", alpha = ");
        sb2.append(this.J);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.K);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.L);
        sb2.append(", transformOrigin=");
        sb2.append((Object) a1.d(this.M));
        sb2.append(", shape=");
        sb2.append(this.N);
        sb2.append(", clip=");
        sb2.append(this.O);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        m1.q(this.P, sb2, ", spotShadowColor=");
        m1.q(this.Q, sb2, ", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.R + ')'));
        sb2.append(", blendMode=");
        sb2.append((Object) e0.I(this.S));
        sb2.append(", colorFilter=");
        sb2.append(this.T);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        if (this.O) {
            d3.x.e(zVar, this.N);
        }
    }

    @Override // v2.z1
    public final boolean z() {
        return false;
    }
}
