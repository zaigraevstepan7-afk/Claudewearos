package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public k1.e f15430c;

    /* renamed from: d, reason: collision with root package name */
    public int f15431d;

    public e0(long j, k1.e eVar) {
        super(j);
        this.f15430c = eVar;
    }

    @Override // t1.c0
    public final void a(c0 c0Var) {
        synchronized (r.f15485c) {
            fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f15430c = ((e0) c0Var).f15430c;
            this.f15431d = ((e0) c0Var).f15431d;
        }
    }

    @Override // t1.c0
    public final c0 b(long j) {
        return new e0(j, this.f15430c);
    }
}
