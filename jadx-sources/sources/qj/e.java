package qj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13568b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final e0[] f13569a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(e0[] e0VarArr) {
        this.f13569a = e0VarArr;
        this.notCompletedCount$volatile = e0VarArr.length;
    }

    public final Object a(vi.i iVar) {
        l lVar = new l(1, u3.a.g(iVar));
        lVar.p();
        e1[] e1VarArr = this.f13569a;
        int length = e1VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            e1 e1Var = e1VarArr[i10];
            ((l1) e1Var).start();
            c cVar = new c(this, lVar);
            cVar.f13559f = b0.r(e1Var, true, cVar);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.A.set(cVar2, dVar);
        }
        if (l.f13595z.get(lVar) instanceof q1) {
            lVar.t(dVar);
        } else {
            dVar.b();
        }
        Object objO = lVar.o();
        ui.a aVar = ui.a.f17085a;
        return objO;
    }
}
