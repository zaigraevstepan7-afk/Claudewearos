package c2;

import android.graphics.Shader;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u0 extends s {

    /* renamed from: a, reason: collision with root package name */
    public ld.i f3045a;

    /* renamed from: b, reason: collision with root package name */
    public long f3046b = 9205357640488583168L;

    @Override // c2.s
    public final void a(float f10, long j, h hVar) {
        ld.i iVar = this.f3045a;
        if (iVar == null || !b2.e.a(this.f3046b, j)) {
            if (b2.e.f(j)) {
                this.f3045a = null;
                this.f3046b = 9205357640488583168L;
                iVar = null;
            } else {
                iVar = this.f3045a;
                if (iVar == null) {
                    iVar = new ld.i(4, false);
                    this.f3045a = iVar;
                }
                iVar.f10924b = b(j);
                this.f3045a = iVar;
                this.f3046b = j;
            }
        }
        long jC = e0.c(hVar.f2999a.getColor());
        long j4 = w.f3052b;
        if (!w.d(jC, j4)) {
            hVar.e(j4);
        }
        if (!fj.l.b(hVar.f3001c, iVar != null ? (Shader) iVar.f10924b : null)) {
            hVar.h(iVar != null ? (Shader) iVar.f10924b : null);
        }
        if (r8.getAlpha() / 255.0f == f10) {
            return;
        }
        hVar.c(f10);
    }

    public abstract Shader b(long j);
}
