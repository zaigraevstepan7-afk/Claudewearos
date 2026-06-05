package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l2 extends t1.c0 {

    /* renamed from: c, reason: collision with root package name */
    public long f6384c;

    public l2(long j, long j4) {
        super(j);
        this.f6384c = j4;
    }

    @Override // t1.c0
    public final void a(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f6384c = ((l2) c0Var).f6384c;
    }

    @Override // t1.c0
    public final t1.c0 b(long j) {
        return new l2(j, this.f6384c);
    }
}
