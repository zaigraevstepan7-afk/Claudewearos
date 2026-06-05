package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public l1.c f15514c;

    /* renamed from: d, reason: collision with root package name */
    public int f15515d;

    /* renamed from: e, reason: collision with root package name */
    public int f15516e;

    public x(long j, l1.c cVar) {
        super(j);
        this.f15514c = cVar;
    }

    @Override // t1.c0
    public final void a(c0 c0Var) {
        synchronized (r.f15483a) {
            fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f15514c = ((x) c0Var).f15514c;
            this.f15515d = ((x) c0Var).f15515d;
            this.f15516e = ((x) c0Var).f15516e;
        }
    }

    @Override // t1.c0
    public final c0 b(long j) {
        return new x(j, this.f15514c);
    }
}
