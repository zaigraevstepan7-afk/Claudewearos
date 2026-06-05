package d0;

import f0.h0;
import f0.y;
import java.util.List;
import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4409a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4410b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.e f4411c;

    /* renamed from: d, reason: collision with root package name */
    public final s3.m f4412d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4413e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4414f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4415g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4416h;

    /* renamed from: i, reason: collision with root package name */
    public final y f4417i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4418k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4419l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4420m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4421n;

    /* renamed from: o, reason: collision with root package name */
    public int f4422o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f4423p;

    public p(int i10, List list, v1.e eVar, s3.m mVar, int i11, int i12, int i13, long j, Object obj, Object obj2, y yVar, long j4) {
        this.f4409a = i10;
        this.f4410b = list;
        this.f4411c = eVar;
        this.f4412d = mVar;
        this.f4413e = i13;
        this.f4414f = j;
        this.f4415g = obj;
        this.f4416h = obj2;
        this.f4417i = yVar;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            f1 f1Var = (f1) list.get(i15);
            i14 += f1Var.f15551b;
            iMax = Math.max(iMax, f1Var.f15550a);
        }
        this.f4418k = i14;
        int i16 = i14 + this.f4413e;
        this.f4419l = i16 >= 0 ? i16 : 0;
        this.f4420m = iMax;
        this.f4423p = new int[this.f4410b.size() * 2];
    }

    public final void a(e1 e1Var) {
        if (this.f4422o == Integer.MIN_VALUE) {
            a0.a.a("position() should be called first");
        }
        List list = this.f4410b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f1 f1Var = (f1) list.get(i10);
            int i11 = f1Var.f15551b;
            long jI = i(i10);
            this.f4417i.a(i10, this.f4415g);
            e1.I(e1Var, f1Var, s3.j.c(jI, this.f4414f), null, 6);
        }
    }

    @Override // f0.h0
    public final int b() {
        return this.f4410b.size();
    }

    @Override // f0.h0
    public final int c() {
        return this.f4419l;
    }

    @Override // f0.h0
    public final int d() {
        return 1;
    }

    @Override // f0.h0
    public final Object e(int i10) {
        return ((f1) this.f4410b.get(i10)).c0();
    }

    @Override // f0.h0
    public final boolean f() {
        return true;
    }

    @Override // f0.h0
    public final void g() {
        this.f4421n = true;
    }

    @Override // f0.h0
    public final int getIndex() {
        return this.f4409a;
    }

    @Override // f0.h0
    public final Object getKey() {
        return this.f4415g;
    }

    @Override // f0.h0
    public final void h(int i10, int i11, int i12) {
        k(i10, i11, i12);
    }

    @Override // f0.h0
    public final long i(int i10) {
        int i11;
        long j;
        if (i10 == 0 && this.f4410b.size() == 0) {
            i11 = this.j;
            j = 0;
        } else {
            int i12 = i10 * 2;
            int[] iArr = this.f4423p;
            int i13 = iArr[i12];
            i11 = iArr[i12 + 1];
            j = i13;
        }
        return (4294967295L & i11) | (j << 32);
    }

    @Override // f0.h0
    public final int j() {
        return 0;
    }

    public final void k(int i10, int i11, int i12) {
        this.j = i10;
        this.f4422o = i12;
        List list = this.f4410b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            f1 f1Var = (f1) list.get(i13);
            int i14 = i13 * 2;
            v1.e eVar = this.f4411c;
            if (eVar == null) {
                a0.a.b("null horizontalAlignment when isVertical == true");
                throw new b3.e();
            }
            int iA = eVar.a(f1Var.f15550a, i11, this.f4412d);
            int[] iArr = this.f4423p;
            iArr[i14] = iA;
            iArr[i14 + 1] = i10;
            i10 += f1Var.f15551b;
        }
    }
}
