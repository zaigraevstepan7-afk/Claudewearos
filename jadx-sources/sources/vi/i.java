package vi;

import fj.l;
import fj.w;
import fj.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class i extends c implements fj.i {
    private final int arity;

    public i(int i10, ti.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // fj.i
    public int getArity() {
        return this.arity;
    }

    @Override // vi.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f6808a.getClass();
        String strA = x.a(this);
        l.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
