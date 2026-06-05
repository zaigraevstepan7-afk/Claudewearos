package l1;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9866c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9867d;

    public g(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        super(i10, i11);
        this.f9866c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f9867d = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f9867d;
        if (jVar.hasNext()) {
            this.f9849a++;
            return jVar.next();
        }
        int i10 = this.f9849a;
        this.f9849a = i10 + 1;
        return this.f9866c[i10 - jVar.f9850b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9849a;
        j jVar = this.f9867d;
        int i11 = jVar.f9850b;
        if (i10 <= i11) {
            this.f9849a = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f9849a = i12;
        return this.f9866c[i12 - i11];
    }
}
