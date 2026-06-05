package k0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements t2.q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f9056b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f9057c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final ta.n f9058d = new ta.n(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9059a;

    public /* synthetic */ c(int i10) {
        this.f9059a = i10;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        switch (this.f9059a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((t2.p0) list.get(i10)).Y(j));
                }
                return s0Var.B(s3.a.h(j), s3.a.g(j), qi.t.f13521a, new g0.x(arrayList, 1));
            default:
                return s0Var.B(s3.a.h(j), s3.a.g(j), qi.t.f13521a, f9058d);
        }
    }
}
