package i2;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends fj.m implements ej.a {

    /* renamed from: b, reason: collision with root package name */
    public static final g f8241b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f8242c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8243a;

    static {
        int i10 = 0;
        f8241b = new g(i10, 0);
        f8242c = new g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f8243a = i11;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f8243a) {
            case 0:
                return new c2.k(new PathMeasure());
            default:
                return pi.o.f13011a;
        }
    }
}
