package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1.a f15416a = new p1.a(0);

    public final boolean d(int i10) {
        return (i10 & this.f15416a.get()) != 0;
    }

    public final void f(int i10) {
        p1.a aVar;
        int i11;
        do {
            aVar = this.f15416a;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
