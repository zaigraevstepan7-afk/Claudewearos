package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z0 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final z0 f4249d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4250b;

    /* renamed from: c, reason: collision with root package name */
    public int f4251c;

    static {
        z0 z0Var = new z0(new Object[0], 0);
        f4249d = z0Var;
        z0Var.f4139a = false;
    }

    public z0(Object[] objArr, int i10) {
        this.f4250b = objArr;
        this.f4251c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f4251c;
        Object[] objArr = this.f4250b;
        if (i10 == objArr.length) {
            this.f4250b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4250b;
        int i11 = this.f4251c;
        this.f4251c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f4251c) {
            StringBuilder sbP = gk.b.p(i10, "Index:", ", Size:");
            sbP.append(this.f4251c);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    public final z f(int i10) {
        if (i10 >= this.f4251c) {
            return new z0(Arrays.copyOf(this.f4250b, i10), this.f4251c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f4250b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f4250b;
        Object obj = objArr[i10];
        if (i10 < this.f4251c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f4251c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f4250b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4251c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f4251c)) {
            Object[] objArr = this.f4250b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[m6.a.c(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f4250b, i10, objArr2, i10 + 1, this.f4251c - i10);
                this.f4250b = objArr2;
            }
            this.f4250b[i10] = obj;
            this.f4251c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbP = gk.b.p(i10, "Index:", ", Size:");
        sbP.append(this.f4251c);
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
