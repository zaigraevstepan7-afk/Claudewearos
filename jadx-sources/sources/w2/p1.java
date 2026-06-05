package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p1 extends fj.m implements ej.a {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f18354b;

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f18355c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18356a;

    static {
        int i10 = 0;
        f18354b = new p1(i10, 0);
        f18355c = new p1(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(int i10, int i11) {
        super(i10);
        this.f18356a = i11;
    }

    @Override // ej.a
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f18356a) {
            case 0:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
