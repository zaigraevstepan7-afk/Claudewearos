package w2;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final d3.n f18218a;

    /* renamed from: b, reason: collision with root package name */
    public final q.w f18219b;

    public c2(d3.r rVar, q.k kVar) {
        this.f18218a = rVar.f4766d;
        List listJ = d3.r.j(4, rVar);
        this.f18219b = new q.w(listJ.size());
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            d3.r rVar2 = (d3.r) listJ.get(i10);
            if (kVar.a(rVar2.f4768f)) {
                this.f18219b.a(rVar2.f4768f);
            }
        }
    }
}
