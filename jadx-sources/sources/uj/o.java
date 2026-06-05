package uj;

import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends vi.c implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final tj.f f17125a;

    /* renamed from: b, reason: collision with root package name */
    public final ti.h f17126b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17127c;

    /* renamed from: d, reason: collision with root package name */
    public ti.h f17128d;

    /* renamed from: e, reason: collision with root package name */
    public ti.c f17129e;

    public o(tj.f fVar, ti.h hVar) {
        super(m.f17123a, ti.i.f16336a);
        this.f17125a = fVar;
        this.f17126b = hVar;
        this.f17127c = ((Number) hVar.F(new ua.a(2), 0)).intValue();
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        try {
            Object objH = h(cVar, obj);
            return objH == ui.a.f17085a ? objH : pi.o.f13011a;
        } catch (Throwable th2) {
            this.f17128d = new k(th2, cVar.getContext());
            throw th2;
        }
    }

    @Override // vi.a, vi.d
    public final vi.d getCallerFrame() {
        ti.c cVar = this.f17129e;
        if (cVar instanceof vi.d) {
            return (vi.d) cVar;
        }
        return null;
    }

    @Override // vi.c, ti.c
    public final ti.h getContext() {
        ti.h hVar = this.f17128d;
        return hVar == null ? ti.i.f16336a : hVar;
    }

    @Override // vi.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h(ti.c cVar, Object obj) {
        ti.h context = cVar.getContext();
        b0.j(context);
        ti.h hVar = this.f17128d;
        if (hVar != context) {
            if (hVar instanceof k) {
                throw new IllegalStateException(nj.f.t0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((k) hVar).f17122b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.F(new r(this, 0), 0)).intValue() != this.f17127c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f17126b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f17128d = context;
        }
        this.f17129e = cVar;
        ej.f fVar = q.f17130a;
        tj.f fVar2 = this.f17125a;
        fj.l.d(fVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objC = fVar.c(fVar2, obj, this);
        if (!fj.l.b(objC, ui.a.f17085a)) {
            this.f17129e = null;
        }
        return objC;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = pi.k.a(obj);
        if (thA != null) {
            this.f17128d = new k(thA, getContext());
        }
        ti.c cVar = this.f17129e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return ui.a.f17085a;
    }
}
