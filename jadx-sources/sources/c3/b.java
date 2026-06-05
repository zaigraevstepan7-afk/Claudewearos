package c3;

import fj.m;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3073b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f3074c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f3075d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3076a;

    static {
        int i10 = 1;
        f3073b = new b(i10, 0);
        f3074c = new b(i10, 1);
        f3075d = new b(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f3076a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f3076a) {
            case 0:
                ((Number) obj).longValue();
                return o.f13011a;
            case 1:
                return Integer.valueOf(((j) obj).f3095b);
            default:
                return Integer.valueOf(((j) obj).f3096c.a());
        }
    }
}
