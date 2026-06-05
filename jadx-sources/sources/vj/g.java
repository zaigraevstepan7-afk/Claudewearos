package vj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.b0;
import qj.i0;
import qj.k0;
import qj.v1;
import qj.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends k0 implements vi.d, ti.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final qj.v f18095d;

    /* renamed from: e, reason: collision with root package name */
    public final vi.c f18096e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18097f;

    /* renamed from: z, reason: collision with root package name */
    public final Object f18098z;

    public g(qj.v vVar, vi.c cVar) {
        super(-1);
        this.f18095d = vVar;
        this.f18096e = cVar;
        this.f18097f = b.f18084b;
        this.f18098z = b.m(cVar.getContext());
    }

    @Override // vi.d
    public final vi.d getCallerFrame() {
        return this.f18096e;
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f18096e.getContext();
    }

    @Override // qj.k0
    public final Object h() {
        Object obj = this.f18097f;
        this.f18097f = b.f18084b;
        return obj;
    }

    @Override // ti.c
    public final void resumeWith(Object obj) throws i0 {
        Throwable thA = pi.k.a(obj);
        Object tVar = thA == null ? obj : new qj.t(false, thA);
        vi.c cVar = this.f18096e;
        ti.h context = cVar.getContext();
        qj.v vVar = this.f18095d;
        if (b.j(vVar, context)) {
            this.f18097f = tVar;
            this.f13589c = 0;
            b.i(vVar, cVar.getContext(), this);
            return;
        }
        w0 w0VarA = v1.a();
        if (w0VarA.f13634c >= 4294967296L) {
            this.f18097f = tVar;
            this.f13589c = 0;
            w0VarA.j0(this);
            return;
        }
        w0VarA.l0(true);
        try {
            ti.h context2 = cVar.getContext();
            Object objN = b.n(context2, this.f18098z);
            try {
                cVar.resumeWith(obj);
                while (w0VarA.n0()) {
                }
            } finally {
                b.g(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f18095d + ", " + b0.C(this.f18096e) + ']';
    }

    @Override // qj.k0
    public final ti.c c() {
        return this;
    }
}
