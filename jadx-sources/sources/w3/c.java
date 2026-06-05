package w3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends fj.m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f18478b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f18479c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f18480d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f18481e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f18482f;

    /* renamed from: z, reason: collision with root package name */
    public static final c f18483z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18484a;

    static {
        int i10 = 1;
        f18478b = new c(i10, 0);
        f18479c = new c(i10, 1);
        f18480d = new c(i10, 2);
        f18481e = new c(i10, 3);
        f18482f = new c(i10, 4);
        f18483z = new c(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f18484a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f18484a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                lj.d[] dVarArr = d3.x.f4803a;
                ((d3.z) obj).b(d3.v.f4799y, oVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                lj.d[] dVarArr2 = d3.x.f4803a;
                ((d3.z) obj).b(d3.v.f4798x, oVar);
                break;
            case 4:
                break;
            default:
                x xVar = (x) obj;
                if (xVar.isAttachedToWindow()) {
                    xVar.r();
                    break;
                }
                break;
        }
        return oVar;
    }
}
