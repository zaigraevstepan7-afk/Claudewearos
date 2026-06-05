package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements ti.g, n2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b0.b f6288b = new b0.b(19);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f6289c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f6290d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f6291e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f6292f = new f(4);

    /* renamed from: z, reason: collision with root package name */
    public static final f f6293z = new f(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6294a;

    public /* synthetic */ f(int i10) {
        this.f6294a = i10;
    }

    @Override // f1.n2
    public boolean a(Object obj, Object obj2) {
        switch (this.f6294a) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return fj.l.b(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f6294a) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
