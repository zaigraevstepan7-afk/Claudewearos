package cg;

import java.util.concurrent.Executor;
import kg.r;
import qj.b0;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements kg.e {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3376b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f3377c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f3378d = new j(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j f3379e = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3380a;

    public /* synthetic */ j(int i10) {
        this.f3380a = i10;
    }

    @Override // kg.e
    public final Object f(p pVar) {
        switch (this.f3380a) {
            case 0:
                Object objF = pVar.f(new r(gg.a.class, Executor.class));
                fj.l.e(objF, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF);
            case 1:
                Object objF2 = pVar.f(new r(gg.c.class, Executor.class));
                fj.l.e(objF2, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF2);
            case 2:
                Object objF3 = pVar.f(new r(gg.b.class, Executor.class));
                fj.l.e(objF3, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF3);
            default:
                Object objF4 = pVar.f(new r(gg.d.class, Executor.class));
                fj.l.e(objF4, "c.get(Qualified.qualifie\u2026a, Executor::class.java))");
                return b0.l((Executor) objF4);
        }
    }
}
