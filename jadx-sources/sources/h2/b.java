package h2;

import b2.c;
import c2.e0;
import c2.h;
import c2.n;
import c2.u;
import fj.l;
import ld.i;
import s3.m;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public h f7577a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7578b;

    /* renamed from: c, reason: collision with root package name */
    public n f7579c;

    /* renamed from: d, reason: collision with root package name */
    public float f7580d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public m f7581e = m.f14752a;

    public boolean b(float f10) {
        return false;
    }

    public boolean e(n nVar) {
        return false;
    }

    public final void g(h0 h0Var, long j, float f10, n nVar) {
        e2.b bVar = h0Var.f17669a;
        if (this.f7580d != f10) {
            if (!b(f10)) {
                if (f10 == 1.0f) {
                    h hVar = this.f7577a;
                    if (hVar != null) {
                        hVar.c(f10);
                    }
                    this.f7578b = false;
                } else {
                    h hVarG = this.f7577a;
                    if (hVarG == null) {
                        hVarG = e0.g();
                        this.f7577a = hVarG;
                    }
                    hVarG.c(f10);
                    this.f7578b = true;
                }
            }
            this.f7580d = f10;
        }
        if (!l.b(this.f7579c, nVar)) {
            if (!e(nVar)) {
                if (nVar == null) {
                    h hVar2 = this.f7577a;
                    if (hVar2 != null) {
                        hVar2.f(null);
                    }
                    this.f7578b = false;
                } else {
                    h hVarG2 = this.f7577a;
                    if (hVarG2 == null) {
                        hVarG2 = e0.g();
                        this.f7577a = hVarG2;
                    }
                    hVarG2.f(nVar);
                    this.f7578b = true;
                }
            }
            this.f7579c = nVar;
        }
        m layoutDirection = h0Var.getLayoutDirection();
        if (this.f7581e != layoutDirection) {
            f(layoutDirection);
            this.f7581e = layoutDirection;
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((i) bVar.f5738b.f373b).N(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.f7578b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                        c cVarG = uk.c.g(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        u uVarH = bVar.f5738b.h();
                        h hVarG3 = this.f7577a;
                        if (hVarG3 == null) {
                            hVarG3 = e0.g();
                            this.f7577a = hVarG3;
                        }
                        try {
                            uVarH.j(cVarG, hVarG3);
                            i(h0Var);
                            uVarH.q();
                        } catch (Throwable th2) {
                            uVarH.q();
                            throw th2;
                        }
                    } else {
                        i(h0Var);
                    }
                }
            } catch (Throwable th3) {
                ((i) bVar.f5738b.f373b).N(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        ((i) bVar.f5738b.f373b).N(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(h0 h0Var);

    public void f(m mVar) {
    }
}
