package p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f12663a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f12664b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12665c;

    public m(int i10, long[] jArr, Object[] objArr) {
        this.f12663a = i10;
        this.f12664b = jArr;
        this.f12665c = objArr;
    }

    public final int a(long j) {
        int i10 = this.f12663a - 1;
        if (i10 != -1) {
            long[] jArr = this.f12664b;
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j4 = jArr[i12] - j;
                    if (j4 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j4 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j) {
                return 0;
            }
            if (j10 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final m b(long j, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f12665c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f12664b;
                i10 = this.f12663a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j4 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j4 > j) {
                    jArr2[i11] = j;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j4;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j10 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j10;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new m(i13, jArr2, objArr2);
    }
}
