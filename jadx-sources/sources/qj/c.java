package qj;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends h1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final l f13558e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f13559f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e f13560z;

    public c(e eVar, l lVar) {
        this.f13560z = eVar;
        this.f13558e = lVar;
    }

    @Override // qj.h1
    public final boolean k() {
        return false;
    }

    @Override // qj.h1
    public final void l(Throwable th2) throws i0 {
        l lVar = this.f13558e;
        if (th2 != null) {
            lVar.getClass();
            d7.c cVarE = lVar.E(new t(false, th2), null);
            if (cVarE != null) {
                lVar.z(cVarE);
                d dVar = (d) A.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f13568b;
        e eVar = this.f13560z;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f13569a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.g());
            }
            lVar.resumeWith(arrayList);
        }
    }
}
