package e0;

import f0.h0;
import f0.y;
import java.util.List;
import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5277c;

    /* renamed from: d, reason: collision with root package name */
    public final s3.m f5278d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5279e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5280f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5281g;

    /* renamed from: h, reason: collision with root package name */
    public final y f5282h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5283i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5284k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5285l;

    /* renamed from: m, reason: collision with root package name */
    public int f5286m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final long f5287n;

    /* renamed from: o, reason: collision with root package name */
    public long f5288o;

    /* renamed from: p, reason: collision with root package name */
    public int f5289p;

    /* renamed from: q, reason: collision with root package name */
    public int f5290q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5291r;

    public m(int i10, Object obj, int i11, int i12, s3.m mVar, int i13, int i14, List list, long j, Object obj2, y yVar, long j4, int i15, int i16) {
        this.f5275a = i10;
        this.f5276b = obj;
        this.f5277c = i11;
        this.f5278d = mVar;
        this.f5279e = list;
        this.f5280f = j;
        this.f5281g = obj2;
        this.f5282h = yVar;
        this.f5283i = i15;
        this.j = i16;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            iMax = Math.max(iMax, ((f1) list.get(i17)).f15551b);
        }
        this.f5284k = iMax;
        int i18 = i12 + iMax;
        this.f5285l = i18 >= 0 ? i18 : 0;
        this.f5287n = (this.f5277c << 32) | (iMax & 4294967295L);
        this.f5288o = 0L;
        this.f5289p = -1;
        this.f5290q = -1;
    }

    public final void a(e1 e1Var) {
        if (this.f5286m == Integer.MIN_VALUE) {
            a0.a.a("position() should be called first");
        }
        List list = this.f5279e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f1 f1Var = (f1) list.get(i10);
            int i11 = f1Var.f15551b;
            long j = this.f5288o;
            this.f5282h.a(i10, this.f5276b);
            e1.I(e1Var, f1Var, s3.j.c(j, this.f5280f), null, 6);
        }
    }

    @Override // f0.h0
    public final int b() {
        return this.f5279e.size();
    }

    @Override // f0.h0
    public final int c() {
        return this.f5285l;
    }

    @Override // f0.h0
    public final int d() {
        return this.j;
    }

    @Override // f0.h0
    public final Object e(int i10) {
        return ((f1) this.f5279e.get(i10)).c0();
    }

    @Override // f0.h0
    public final boolean f() {
        return true;
    }

    @Override // f0.h0
    public final void g() {
        this.f5291r = true;
    }

    @Override // f0.h0
    public final int getIndex() {
        return this.f5275a;
    }

    @Override // f0.h0
    public final Object getKey() {
        return this.f5276b;
    }

    @Override // f0.h0
    public final void h(int i10, int i11, int i12) {
        k(i10, 0, i11, i12, -1, -1);
    }

    @Override // f0.h0
    public final long i(int i10) {
        return this.f5288o;
    }

    @Override // f0.h0
    public final int j() {
        return this.f5283i;
    }

    public final void k(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f5286m = i13;
        if (this.f5278d == s3.m.f14753b) {
            i11 = (i12 - i11) - this.f5277c;
        }
        this.f5288o = (i11 << 32) | (i10 & 4294967295L);
        this.f5289p = i14;
        this.f5290q = i15;
    }
}
