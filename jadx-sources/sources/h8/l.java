package h8;

import java.util.ArrayList;
import java.util.List;
import qj.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7706a;

    public /* synthetic */ l(int i10) {
        this.f7706a = i10;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f7706a) {
            case 0:
                xj.e eVar = m0.f13601a;
                return vj.n.f18117a.f14555f;
            case 1:
                return (l8.c) l8.d.f10090a.getValue();
            case 2:
                List listL0 = qi.l.L0(new t(0), (List) v8.k.f17895a.getValue());
                ArrayList arrayList = new ArrayList();
                if (listL0.size() <= 0) {
                    return arrayList;
                }
                if (listL0.get(0) != null) {
                    throw new ClassCastException();
                }
                fj.l.d(null, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                throw null;
            default:
                List listL02 = qi.l.L0(new t(1), (List) v8.k.f17896b.getValue());
                ArrayList arrayList2 = new ArrayList();
                if (listL02.size() <= 0) {
                    return arrayList2;
                }
                listL02.get(0).getClass();
                throw new ClassCastException();
        }
    }
}
