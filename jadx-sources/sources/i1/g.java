package i1;

import f1.n;
import f1.n0;
import f1.o1;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f8113a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8115c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f8116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8117e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8118f;

    /* renamed from: g, reason: collision with root package name */
    public int f8119g;

    /* renamed from: h, reason: collision with root package name */
    public int f8120h;

    /* renamed from: i, reason: collision with root package name */
    public int f8121i;
    public final n0 j;

    /* renamed from: k, reason: collision with root package name */
    public int f8122k;

    /* renamed from: l, reason: collision with root package name */
    public int f8123l;

    /* renamed from: m, reason: collision with root package name */
    public int f8124m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8125n;

    public g(h hVar) {
        this.f8113a = hVar;
        this.f8114b = hVar.f8126a;
        int i10 = hVar.f8127b;
        this.f8115c = i10;
        this.f8116d = hVar.f8128c;
        this.f8117e = hVar.f8129d;
        this.f8120h = i10;
        this.f8121i = -1;
        this.j = new n0(0, false);
    }

    public final b a(int i10) {
        ArrayList arrayList = this.f8113a.B;
        int iE = j.e(arrayList, i10, this.f8115c);
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f8116d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return f1.m.f6385a;
    }

    public final void c() {
        this.f8118f = true;
        h hVar = this.f8113a;
        hVar.getClass();
        if (this.f8113a != hVar || hVar.f8130e <= 0) {
            n.a("Unexpected reader close()");
        }
        hVar.f8130e--;
        this.f8116d = new Object[0];
    }

    public final boolean d(int i10) {
        return (this.f8114b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f8122k == 0) {
            if (this.f8119g != this.f8120h) {
                n.a("endGroup() not called at the end of a group");
            }
            int i10 = (this.f8121i * 5) + 2;
            int[] iArr = this.f8114b;
            int i11 = iArr[i10];
            this.f8121i = i11;
            int i12 = this.f8115c;
            this.f8120h = i11 < 0 ? i12 : iArr[(i11 * 5) + 3] + i11;
            int iC = this.j.c();
            if (iC < 0) {
                this.f8123l = 0;
                this.f8124m = 0;
            } else {
                this.f8123l = iC;
                this.f8124m = i11 >= i12 + (-1) ? this.f8117e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f8119g;
        if (i10 < this.f8120h) {
            return b(this.f8114b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f8119g;
        if (i10 >= this.f8120h) {
            return 0;
        }
        return this.f8114b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f8114b;
        int iB = j.b(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iB + i11;
        return i13 < (i12 < this.f8115c ? iArr[(i12 * 5) + 4] : this.f8117e) ? this.f8116d[i13] : f1.m.f6385a;
    }

    public final int i(int i10) {
        return this.f8114b[i10 * 5];
    }

    public final boolean j(int i10) {
        return (this.f8114b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i10) {
        return (this.f8114b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i10) {
        return (this.f8114b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i10;
        if (this.f8122k > 0 || (i10 = this.f8123l) >= this.f8124m) {
            this.f8125n = false;
            return f1.m.f6385a;
        }
        this.f8125n = true;
        Object[] objArr = this.f8116d;
        this.f8123l = i10 + 1;
        return objArr[i10];
    }

    public final Object n(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f8114b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 != 0) {
            return i12 != 0 ? this.f8116d[iArr[i11 + 4]] : f1.m.f6385a;
        }
        return null;
    }

    public final int o(int i10) {
        return this.f8114b[(i10 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f8116d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int q(int i10) {
        return this.f8114b[(i10 * 5) + 2];
    }

    public final void r(int i10) {
        if (this.f8122k != 0) {
            n.a("Cannot reposition while in an empty region");
        }
        this.f8119g = i10;
        int[] iArr = this.f8114b;
        int i11 = this.f8115c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f8121i) {
            this.f8121i = i12;
            if (i12 < 0) {
                this.f8120h = i11;
            } else {
                this.f8120h = iArr[(i12 * 5) + 3] + i12;
            }
            this.f8123l = 0;
            this.f8124m = 0;
        }
    }

    public final int s() {
        if (this.f8122k != 0) {
            n.a("Cannot skip while in an empty region");
        }
        int i10 = this.f8119g;
        int i11 = i10 * 5;
        int[] iArr = this.f8114b;
        int i12 = iArr[i11 + 1];
        int i13 = (1073741824 & i12) != 0 ? 1 : i12 & 67108863;
        this.f8119g = iArr[i11 + 3] + i10;
        return i13;
    }

    public final void t() {
        if (!(this.f8122k == 0)) {
            n.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f8119g = this.f8120h;
        this.f8123l = 0;
        this.f8124m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f8119g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f8121i);
        sb2.append(", end=");
        return m6.a.g(sb2, this.f8120h, ')');
    }

    public final void u() {
        if (this.f8122k <= 0) {
            int i10 = this.f8121i;
            int i11 = this.f8119g;
            int i12 = i11 * 5;
            int[] iArr = this.f8114b;
            if (iArr[i12 + 2] != i10) {
                o1.a("Invalid slot table detected");
            }
            int i13 = this.f8123l;
            int i14 = this.f8124m;
            n0 n0Var = this.j;
            if (i13 == 0 && i14 == 0) {
                n0Var.d(-1);
            } else {
                n0Var.d(i13);
            }
            this.f8121i = i11;
            this.f8120h = iArr[i12 + 3] + i11;
            int i15 = i11 + 1;
            this.f8119g = i15;
            this.f8123l = j.b(iArr, i11);
            this.f8124m = i11 >= this.f8115c + (-1) ? this.f8117e : iArr[(i15 * 5) + 4];
        }
    }
}
