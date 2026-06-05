package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f14643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ej.a aVar, boolean z2) {
        super(1);
        this.f14642a = z2;
        this.f14643b = aVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ((c2.f0) obj).q(!this.f14642a && ((Boolean) this.f14643b.a()).booleanValue());
        return pi.o.f13011a;
    }
}
