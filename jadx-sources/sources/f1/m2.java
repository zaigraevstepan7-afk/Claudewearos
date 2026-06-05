package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m2 extends t1.c0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f6394c;

    public m2(long j, Object obj) {
        super(j);
        this.f6394c = obj;
    }

    @Override // t1.c0
    public final void a(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f6394c = ((m2) c0Var).f6394c;
    }

    @Override // t1.c0
    public final t1.c0 b(long j) {
        return new m2(t1.m.j().g(), this.f6394c);
    }
}
