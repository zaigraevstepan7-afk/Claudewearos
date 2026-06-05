package kf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: d, reason: collision with root package name */
    public static final m f9588d = new m(new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9589c;

    public m(Object[] objArr) {
        this.f9589c = objArr;
    }

    @Override // kf.k, kf.h
    public final int b(Object[] objArr) {
        System.arraycopy(this.f9589c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // kf.h
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u6.v.g(i10, 0);
        Object obj = this.f9589c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // kf.h
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // kf.h
    public final Object[] w() {
        return this.f9589c;
    }
}
