package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f918f = new e1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f919a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f920b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f921c;

    /* renamed from: d, reason: collision with root package name */
    public int f922d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f923e;

    public e1(int i10, int[] iArr, Object[] objArr, boolean z2) {
        this.f919a = i10;
        this.f920b = iArr;
        this.f921c = objArr;
        this.f923e = z2;
    }

    public final void a(int i10) {
        int[] iArr = this.f920b;
        if (i10 > iArr.length) {
            int i11 = this.f919a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f920b = Arrays.copyOf(iArr, i10);
            this.f921c = Arrays.copyOf(this.f921c, i10);
        }
    }

    public final int b() {
        int iC0;
        int iE0;
        int iC02;
        int i10 = this.f922d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f919a; i12++) {
            int i13 = this.f920b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f921c[i12]).getClass();
                    iC02 = m.c0(i14) + 8;
                } else if (i15 == 2) {
                    iC02 = m.a0(i14, (g) this.f921c[i12]);
                } else if (i15 == 3) {
                    iC0 = m.c0(i14) * 2;
                    iE0 = ((e1) this.f921c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(a0.b());
                    }
                    ((Integer) this.f921c[i12]).getClass();
                    iC02 = m.c0(i14) + 4;
                }
                i11 = iC02 + i11;
            } else {
                long jLongValue = ((Long) this.f921c[i12]).longValue();
                iC0 = m.c0(i14);
                iE0 = m.e0(jLongValue);
            }
            i11 = iE0 + iC0 + i11;
        }
        this.f922d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f923e) {
            throw new UnsupportedOperationException();
        }
        a(this.f919a + 1);
        int[] iArr = this.f920b;
        int i11 = this.f919a;
        iArr[i11] = i10;
        this.f921c[i11] = obj;
        this.f919a = i11 + 1;
    }

    public final void d(g0 g0Var) {
        if (this.f919a == 0) {
            return;
        }
        g0Var.getClass();
        m mVar = (m) g0Var.f932a;
        for (int i10 = 0; i10 < this.f919a; i10++) {
            int i11 = this.f920b[i10];
            Object obj = this.f921c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                mVar.y0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                mVar.o0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                mVar.k0(i12, (g) obj);
            } else if (i13 == 3) {
                mVar.v0(i12, 3);
                ((e1) obj).d(g0Var);
                mVar.v0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(a0.b());
                }
                mVar.m0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i10 = this.f919a;
        if (i10 == e1Var.f919a) {
            int[] iArr = this.f920b;
            int[] iArr2 = e1Var.f920b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f921c;
                    Object[] objArr2 = e1Var.f921c;
                    int i12 = this.f919a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f919a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f920b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f921c;
        int i15 = this.f919a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
