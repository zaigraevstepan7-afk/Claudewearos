package f2;

import c2.w;
import fj.m;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6511b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f6512c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6513a;

    static {
        int i10 = 1;
        f6511b = new a(i10, 0);
        f6512c = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f6513a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f6513a) {
            case 0:
                break;
            default:
                e2.d.c1((e2.d) obj, w.f3057g, 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return o.f13011a;
    }
}
