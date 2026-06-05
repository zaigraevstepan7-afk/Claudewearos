package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6465b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ej.a aVar) {
        super(aVar);
        f fVar = f.f6293z;
        this.f6466c = fVar;
    }

    @Override // f1.q1
    public final r1 a(Object obj) {
        switch (this.f6465b) {
            case 0:
                return new r1(this, obj, obj == null, null, true);
            default:
                return new r1(this, obj, obj == null, (n2) this.f6466c, true);
        }
    }

    @Override // f1.q1
    public u2 b() {
        switch (this.f6465b) {
            case 0:
                return (w) this.f6466c;
            default:
                return super.b();
        }
    }

    public v(ej.c cVar) {
        super(new b6.j(28));
        this.f6466c = new w(cVar);
    }
}
