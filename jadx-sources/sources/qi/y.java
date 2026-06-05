package qi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13528b;

    /* renamed from: c, reason: collision with root package name */
    public int f13529c;

    /* renamed from: d, reason: collision with root package name */
    public int f13530d;

    public y(Object[] objArr, int i10) {
        this.f13527a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f13528b = objArr.length;
            this.f13530d = i10;
        } else {
            StringBuilder sbP = gk.b.p(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbP.append(objArr.length);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
    }

    @Override // qi.a
    public final int b() {
        return this.f13530d;
    }

    public final void e() {
        if (20 > this.f13530d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f13530d).toString());
        }
        int i10 = this.f13529c;
        int i11 = this.f13528b;
        int i12 = (i10 + 20) % i11;
        Object[] objArr = this.f13527a;
        if (i10 > i12) {
            Arrays.fill(objArr, i10, i11, (Object) null);
            Arrays.fill(objArr, 0, i12, (Object) null);
        } else {
            Arrays.fill(objArr, i10, i12, (Object) null);
        }
        this.f13529c = i12;
        this.f13530d -= 20;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int iB = b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, iB, "index: ", ", size: "));
        }
        return this.f13527a[(this.f13529c + i10) % this.f13528b];
    }

    @Override // qi.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new i1.l(this);
    }

    @Override // qi.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // qi.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        fj.l.f(objArr, "array");
        int length = objArr.length;
        int i10 = this.f13530d;
        if (length < i10) {
            objArr = Arrays.copyOf(objArr, i10);
            fj.l.e(objArr, "copyOf(...)");
        }
        int i11 = this.f13530d;
        int i12 = this.f13529c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr2 = this.f13527a;
            if (i14 >= i11 || i12 >= this.f13528b) {
                break;
            }
            objArr[i14] = objArr2[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            objArr[i14] = objArr2[i13];
            i14++;
            i13++;
        }
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
