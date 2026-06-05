package l1;

import fj.l;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f9874c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9875d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9876e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f9874c = i12;
        Object[] objArr2 = new Object[i12];
        this.f9875d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f9876e = r52;
        objArr2[0] = objArr;
        b(i10 - r52, 1);
    }

    public final Object a() {
        int i10 = this.f9849a & 31;
        Object obj = this.f9875d[this.f9874c - 1];
        l.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f9874c - i11) * 5;
        while (i11 < this.f9874c) {
            Object[] objArr = this.f9875d;
            Object obj = objArr[i11 - 1];
            l.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[wd.a.F(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (wd.a.F(this.f9849a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f9849a, ((this.f9874c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.f9849a + 1;
        this.f9849a = i10;
        if (i10 == this.f9850b) {
            this.f9876e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f9849a--;
        if (this.f9876e) {
            this.f9876e = false;
            return a();
        }
        c(31);
        return a();
    }
}
