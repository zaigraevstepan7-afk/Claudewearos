package vi;

import fj.l;
import fj.w;
import fj.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class h extends g implements fj.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f18081a;

    public h(ti.c cVar) {
        super(cVar);
        this.f18081a = 2;
    }

    @Override // fj.i
    public final int getArity() {
        return this.f18081a;
    }

    @Override // vi.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f6808a.getClass();
        String strA = x.a(this);
        l.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
