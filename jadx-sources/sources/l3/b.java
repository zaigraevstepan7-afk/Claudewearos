package l3;

import c2.k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends fj.m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f9883b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f9884c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f9885d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f9886e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f9887f;

    /* renamed from: z, reason: collision with root package name */
    public static final b f9888z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9889a;

    static {
        int i10 = 1;
        f9883b = new b(i10, 0);
        f9884c = new b(i10, 1);
        f9885d = new b(i10, 2);
        f9886e = new b(i10, 3);
        f9887f = new b(i10, 4);
        f9888z = new b(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f9889a = i11;
    }

    @Override // ej.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f9889a) {
            case 0:
                float[] fArr = ((k0) obj).f3015a;
                break;
            case 1:
                float[] fArr2 = ((k0) obj).f3015a;
                break;
            case 2:
                break;
            case 3:
                int i10 = ((i) obj).f9912a;
                break;
            case 4:
                break;
            default:
                int i11 = ((i) obj).f9912a;
                break;
        }
        return pi.o.f13011a;
    }
}
