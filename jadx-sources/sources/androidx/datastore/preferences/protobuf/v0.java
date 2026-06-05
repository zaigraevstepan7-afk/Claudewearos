package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f1028d = new v0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1029b;

    /* renamed from: c, reason: collision with root package name */
    public int f1030c;

    public v0(Object[] objArr, int i10, boolean z2) {
        this.f895a = z2;
        this.f1029b = objArr;
        this.f1030c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f1030c;
        Object[] objArr = this.f1029b;
        if (i10 == objArr.length) {
            this.f1029b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1029b;
        int i11 = this.f1030c;
        this.f1030c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f1030c) {
            StringBuilder sbP = gk.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f1030c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f1029b[i10];
    }

    public final v0 i(int i10) {
        if (i10 >= this.f1030c) {
            return new v0(Arrays.copyOf(this.f1029b, i10), this.f1030c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f1029b;
        Object obj = objArr[i10];
        if (i10 < this.f1030c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f1030c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f1029b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1030c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f1030c)) {
            Object[] objArr = this.f1029b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[m6.a.c(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f1029b, i10, objArr2, i10 + 1, this.f1030c - i10);
                this.f1029b = objArr2;
            }
            this.f1029b[i10] = obj;
            this.f1030c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbP = gk.b.p(i10, "Index:", ", Size:");
        sbP.append(this.f1030c);
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
