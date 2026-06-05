package kf;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends l {

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f9590f;

    /* renamed from: z, reason: collision with root package name */
    public static final n f9591z;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f9592d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f9593e;

    static {
        Object[] objArr = new Object[0];
        f9590f = objArr;
        f9591z = new n(objArr, objArr);
    }

    public n(Object[] objArr, Object[] objArr2) {
        this.f9592d = objArr;
        this.f9593e = objArr2;
    }

    @Override // kf.h
    public final int b(Object[] objArr) {
        System.arraycopy(this.f9592d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f9593e.length;
        return false;
    }

    @Override // kf.h
    public final int e() {
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // kf.h
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m mVar = this.f9587b;
        if (mVar == null) {
            i iVar = k.f9584b;
            mVar = m.f9588d;
            this.f9587b = mVar;
        }
        return mVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // kf.h
    public final Object[] w() {
        return this.f9592d;
    }
}
