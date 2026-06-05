package kk;

import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends qi.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f9724a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9725b;

    public s(i[] iVarArr, int[] iArr) {
        this.f9724a = iVarArr;
        this.f9725b = iArr;
    }

    @Override // qi.a
    public final int b() {
        return this.f9724a.length;
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f9724a[i10];
    }

    @Override // qi.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // qi.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
