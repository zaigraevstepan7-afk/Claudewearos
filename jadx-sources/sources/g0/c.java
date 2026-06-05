package g0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6855b;

    public /* synthetic */ c(int i10, List list) {
        this.f6854a = i10;
        this.f6855b = list;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f6854a) {
            case 0:
                Object obj = this.f6855b.get(2);
                fj.l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                int size = this.f6855b.size();
                if (size < 1) {
                    size = 1;
                }
                return Integer.valueOf(size);
        }
    }
}
