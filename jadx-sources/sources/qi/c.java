package qi;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f13510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13512c;

    public c(d dVar, int i10, int i11) {
        this.f13510a = dVar;
        this.f13511b = i10;
        wd.a.q(i10, i11, dVar.b());
        this.f13512c = i11 - i10;
    }

    @Override // qi.a
    public final int b() {
        return this.f13512c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f13512c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "index: ", ", size: "));
        }
        return this.f13510a.get(this.f13511b + i10);
    }

    @Override // qi.d, java.util.List
    public final List subList(int i10, int i11) {
        wd.a.q(i10, i11, this.f13512c);
        int i12 = this.f13511b;
        return new c(this.f13510a, i10 + i12, i12 + i11);
    }
}
