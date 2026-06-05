package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f4158f = new e1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4159a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4160b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4161c;

    /* renamed from: d, reason: collision with root package name */
    public int f4162d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4163e;

    public e1(int i10, int[] iArr, Object[] objArr, boolean z2) {
        this.f4159a = i10;
        this.f4160b = iArr;
        this.f4161c = objArr;
        this.f4163e = z2;
    }

    public static e1 c() {
        return new e1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f4160b;
        if (i10 > iArr.length) {
            int i11 = this.f4159a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4160b = Arrays.copyOf(iArr, i10);
            this.f4161c = Arrays.copyOf(this.f4161c, i10);
        }
    }

    public final int b() {
        int iH0;
        int iJ0;
        int iD0;
        int i10 = this.f4162d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4159a; i12++) {
            int i13 = this.f4160b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f4161c[i12]).getClass();
                    iD0 = l.d0(i14);
                } else if (i15 == 2) {
                    iD0 = l.a0(i14, (i) this.f4161c[i12]);
                } else if (i15 == 3) {
                    iH0 = l.h0(i14) * 2;
                    iJ0 = ((e1) this.f4161c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(c0.c());
                    }
                    ((Integer) this.f4161c[i12]).getClass();
                    iD0 = l.c0(i14);
                }
                i11 = iD0 + i11;
            } else {
                long jLongValue = ((Long) this.f4161c[i12]).longValue();
                iH0 = l.h0(i14);
                iJ0 = l.j0(jLongValue);
            }
            i11 = iJ0 + iH0 + i11;
        }
        this.f4162d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f4163e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4159a + 1);
        int[] iArr = this.f4160b;
        int i11 = this.f4159a;
        iArr[i11] = i10;
        this.f4161c[i11] = obj;
        this.f4159a = i11 + 1;
    }

    public final void e(l0 l0Var) throws androidx.datastore.preferences.protobuf.l {
        if (this.f4159a == 0) {
            return;
        }
        l0Var.getClass();
        l lVar = (l) l0Var.f4196a;
        for (int i10 = 0; i10 < this.f4159a; i10++) {
            int i11 = this.f4160b[i10];
            Object obj = this.f4161c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                lVar.t0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                lVar.o0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                l0Var.a(i12, (i) obj);
            } else if (i13 == 3) {
                lVar.r0(i12, 3);
                ((e1) obj).e(l0Var);
                lVar.r0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(c0.c());
                }
                lVar.m0(i12, ((Integer) obj).intValue());
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
        int i10 = this.f4159a;
        if (i10 == e1Var.f4159a) {
            int[] iArr = this.f4160b;
            int[] iArr2 = e1Var.f4160b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f4161c;
                    Object[] objArr2 = e1Var.f4161c;
                    int i12 = this.f4159a;
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
        int i10 = this.f4159a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f4160b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f4161c;
        int i15 = this.f4159a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
