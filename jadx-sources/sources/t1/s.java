package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public k1.d f15486c;

    /* renamed from: d, reason: collision with root package name */
    public int f15487d;

    public s(long j, k1.d dVar) {
        super(j);
        this.f15486c = dVar;
    }

    @Override // t1.c0
    public final void a(c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        s sVar = (s) c0Var;
        synchronized (r.f15484b) {
            this.f15486c = sVar.f15486c;
            this.f15487d = sVar.f15487d;
        }
    }

    @Override // t1.c0
    public final c0 b(long j) {
        return new s(j, this.f15486c);
    }
}
