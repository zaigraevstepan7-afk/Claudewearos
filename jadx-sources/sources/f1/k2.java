package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k2 extends t1.c0 {

    /* renamed from: c, reason: collision with root package name */
    public int f6369c;

    public k2(long j, int i10) {
        super(j);
        this.f6369c = i10;
    }

    @Override // t1.c0
    public final void a(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f6369c = ((k2) c0Var).f6369c;
    }

    @Override // t1.c0
    public final t1.c0 b(long j) {
        return new k2(j, this.f6369c);
    }
}
