package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends fj.m implements ej.a {

    /* renamed from: b, reason: collision with root package name */
    public static final f f17616b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f17617c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17618a;

    static {
        int i10 = 0;
        f17616b = new f(i10, 0);
        f17617c = new f(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11) {
        super(i10);
        this.f17618a = i11;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f17618a) {
            case 0:
                return new f0(2);
            default:
                return new f0(3);
        }
    }
}
