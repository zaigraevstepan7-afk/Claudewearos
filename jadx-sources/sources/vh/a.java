package vh;

import fj.l;
import gg.b;
import gg.c;
import gg.d;
import java.util.concurrent.Executor;
import kg.e;
import kg.r;
import qj.b0;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18073b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f18074c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f18075d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f18076e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18077a;

    public /* synthetic */ a(int i10) {
        this.f18077a = i10;
    }

    @Override // kg.e
    public final Object f(p pVar) {
        switch (this.f18077a) {
            case 0:
                Object objF = pVar.f(new r(gg.a.class, Executor.class));
                l.e(objF, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF);
            case 1:
                Object objF2 = pVar.f(new r(c.class, Executor.class));
                l.e(objF2, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF2);
            case 2:
                Object objF3 = pVar.f(new r(b.class, Executor.class));
                l.e(objF3, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF3);
            default:
                Object objF4 = pVar.f(new r(d.class, Executor.class));
                l.e(objF4, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF4);
        }
    }
}
