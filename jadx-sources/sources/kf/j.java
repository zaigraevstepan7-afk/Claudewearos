package kf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends k {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f9580c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f9582e;

    public j(k kVar, int i10, int i11) {
        this.f9582e = kVar;
        this.f9580c = i10;
        this.f9581d = i11;
    }

    @Override // kf.h
    public final int e() {
        return this.f9582e.i() + this.f9580c + this.f9581d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u6.v.g(i10, this.f9581d);
        return this.f9582e.get(i10 + this.f9580c);
    }

    @Override // kf.h
    public final int i() {
        return this.f9582e.i() + this.f9580c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9581d;
    }

    @Override // kf.h
    public final Object[] w() {
        return this.f9582e.w();
    }

    @Override // kf.k, java.util.List
    /* renamed from: x */
    public final k subList(int i10, int i11) {
        u6.v.m(i10, i11, this.f9581d);
        int i12 = this.f9580c;
        return this.f9582e.subList(i10 + i12, i11 + i12);
    }
}
