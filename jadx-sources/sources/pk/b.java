package pk;

import f1.i0;
import f1.s0;
import f1.v;
import jb.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13020a;

    static {
        new s0(new e(20));
        f13020a = new v(new e(21));
    }

    public static final cl.a a(i0 i0Var) {
        cl.a aVar;
        Object obj;
        v vVar = f13020a;
        i0Var.b0(1668867238);
        try {
            a aVar2 = (a) i0Var.j(vVar);
            if (aVar2.f13019b == null) {
                aVar2.f13019b = aVar2.f13018a.a();
            }
            obj = aVar2.f13019b;
        } catch (Exception e10) {
            a aVar3 = (a) i0Var.j(vVar);
            Object objA = aVar3.f13018a.a();
            aVar3.f13019b = objA;
            cl.a aVar4 = (cl.a) objA;
            if (aVar4 == null) {
                throw new IllegalStateException(("Can't get Koin scope due to error: " + e10).toString());
            }
            aVar = aVar4;
        }
        if (obj == null) {
            throw new IllegalStateException("Can't retrieve value for ");
        }
        aVar = (cl.a) obj;
        i0Var.p(false);
        return aVar;
    }
}
