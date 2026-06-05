package k1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends qi.d {

    /* renamed from: a, reason: collision with root package name */
    public final l1.c f9347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9349c;

    public a(l1.c cVar, int i10, int i11) {
        this.f9347a = cVar;
        this.f9348b = i10;
        cg.b.l(i10, i11, cVar.b());
        this.f9349c = i11 - i10;
    }

    @Override // qi.a
    public final int b() {
        return this.f9349c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        cg.b.j(i10, this.f9349c);
        return this.f9347a.get(this.f9348b + i10);
    }

    @Override // qi.d, java.util.List
    public final List subList(int i10, int i11) {
        cg.b.l(i10, i11, this.f9349c);
        int i12 = this.f9348b;
        return new a(this.f9347a, i10 + i12, i12 + i11);
    }
}
