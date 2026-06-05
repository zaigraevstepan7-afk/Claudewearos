package q;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f13111a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f13112b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f13113c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f13114d;

    public p(int i10) {
        if (i10 == 0) {
            this.f13112b = r.a.f13649b;
            this.f13113c = r.a.f13650c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f13112b = new long[i14];
        this.f13113c = new Object[i14];
    }

    public final void a() {
        int i10 = this.f13114d;
        Object[] objArr = this.f13113c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f13114d = 0;
        this.f13111a = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = r.a.b(this.f13112b, this.f13114d, j);
        if (iB < 0 || (obj = this.f13113c[iB]) == q.f13118a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.f13111a) {
            int i10 = this.f13114d;
            long[] jArr = this.f13112b;
            Object[] objArr = this.f13113c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != q.f13118a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f13111a = false;
            this.f13114d = i11;
        }
        return r.a.b(this.f13112b, this.f13114d, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        fj.l.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        p pVar = (p) objClone;
        pVar.f13112b = (long[]) this.f13112b.clone();
        pVar.f13113c = (Object[]) this.f13113c.clone();
        return pVar;
    }

    public final long d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13114d)) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f13111a) {
            long[] jArr = this.f13112b;
            Object[] objArr = this.f13113c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != q.f13118a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f13111a = false;
            this.f13114d = i12;
        }
        return this.f13112b[i10];
    }

    public final void e(long j, Object obj) {
        Object obj2 = q.f13118a;
        int iB = r.a.b(this.f13112b, this.f13114d, j);
        if (iB >= 0) {
            this.f13113c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f13114d;
        if (i10 < i11) {
            Object[] objArr = this.f13113c;
            if (objArr[i10] == obj2) {
                this.f13112b[i10] = j;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f13111a) {
            long[] jArr = this.f13112b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f13113c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f13111a = false;
                this.f13114d = i12;
                i10 = ~r.a.b(this.f13112b, i12, j);
            }
        }
        int i14 = this.f13114d;
        if (i14 >= this.f13112b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f13112b, i18);
            fj.l.e(jArrCopyOf, "copyOf(...)");
            this.f13112b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13113c, i18);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13113c = objArrCopyOf;
        }
        int i19 = this.f13114d;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f13112b;
            int i20 = i10 + 1;
            qi.k.h0(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f13113c;
            qi.k.i0(objArr3, i20, objArr3, i10, this.f13114d);
        }
        this.f13112b[i10] = j;
        this.f13113c[i10] = obj;
        this.f13114d++;
    }

    public final void f(long j) {
        int iB = r.a.b(this.f13112b, this.f13114d, j);
        if (iB >= 0) {
            Object[] objArr = this.f13113c;
            Object obj = objArr[iB];
            Object obj2 = q.f13118a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f13111a = true;
            }
        }
    }

    public final int g() {
        if (this.f13111a) {
            int i10 = this.f13114d;
            long[] jArr = this.f13112b;
            Object[] objArr = this.f13113c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != q.f13118a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f13111a = false;
            this.f13114d = i11;
        }
        return this.f13114d;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13114d)) {
            r.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f13111a) {
            long[] jArr = this.f13112b;
            Object[] objArr = this.f13113c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != q.f13118a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f13111a = false;
            this.f13114d = i12;
        }
        return this.f13113c[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13114d * 28);
        sb2.append('{');
        int i10 = this.f13114d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            Object objH = h(i11);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ p(Object obj) {
        this(10);
    }
}
