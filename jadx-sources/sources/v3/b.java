package v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends fj.m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f17808b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f17809c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17810d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f17811e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17812a;

    static {
        int i10 = 1;
        f17808b = new b(i10, 0);
        f17809c = new b(i10, 1);
        f17810d = new b(i10, 2);
        f17811e = new b(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f17812a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f17812a) {
            case 0:
                h hVar = (h) obj;
                hVar.getHandler().post(new p0.c(2, hVar.K));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return pi.o.f13011a;
    }
}
