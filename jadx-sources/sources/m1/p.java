package m1;

import i2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11257d;

    public p(f0 f0Var) {
        this.f11257d = f0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f11255c;
        this.f11255c = i10 + 2;
        Object[] objArr = this.f11253a;
        return new b(this.f11257d, objArr[i10], objArr[i10 + 1]);
    }
}
