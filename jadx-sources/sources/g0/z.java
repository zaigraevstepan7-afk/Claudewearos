package g0;

import java.util.List;
import java.util.Map;
import t2.r0;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f6994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6996c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6997d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f6998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6999f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7000g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7001h;

    /* renamed from: i, reason: collision with root package name */
    public final i f7002i;
    public final i j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7003k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7004l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7005m;

    /* renamed from: n, reason: collision with root package name */
    public final y.m f7006n;

    /* renamed from: o, reason: collision with root package name */
    public final r0 f7007o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7008p;

    /* renamed from: q, reason: collision with root package name */
    public final List f7009q;

    /* renamed from: r, reason: collision with root package name */
    public final List f7010r;

    /* renamed from: s, reason: collision with root package name */
    public final qj.z f7011s;

    /* renamed from: t, reason: collision with root package name */
    public final s3.c f7012t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7013u;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z(int i10, int i11, int i12, int i13, int i14, int i15, y.m mVar, r0 r0Var, qj.z zVar, s3.c cVar, long j) {
        o1 o1Var = o1.f19665b;
        qi.s sVar = qi.s.f13520a;
        this(sVar, i10, i11, i12, o1Var, i13, i14, i15, null, null, 0.0f, 0, false, mVar, r0Var, false, sVar, sVar, zVar, cVar, j);
    }

    public final z a(int i10) {
        int i11;
        int i12 = this.f6995b + this.f6996c;
        if (this.f7008p) {
            return null;
        }
        List list = this.f6994a;
        if (list.isEmpty() || this.f7002i == null || (i11 = this.f7004l - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f10 = this.f7003k - (i12 != 0 ? i10 / i12 : 0.0f);
        if (this.j == null || f10 >= 0.5f || f10 <= -0.5f) {
            return null;
        }
        i iVar = (i) qi.l.z0(list);
        i iVar2 = (i) qi.l.F0(list);
        int i13 = this.f7000g;
        int i14 = this.f6999f;
        if (i10 < 0) {
            if (Math.min((iVar.j + i12) - i14, (iVar2.j + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - iVar.j, i13 - iVar2.j) <= i10) {
            return null;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((i) list.get(i15)).a(i10);
        }
        List list2 = this.f7009q;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((i) list2.get(i16)).a(i10);
        }
        List list3 = this.f7010r;
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            ((i) list3.get(i17)).a(i10);
        }
        return new z(this.f6994a, this.f6995b, this.f6996c, this.f6997d, this.f6998e, this.f6999f, this.f7000g, this.f7001h, this.f7002i, this.j, f10, i11, this.f7005m || i10 > 0, this.f7006n, this.f7007o, this.f7008p, this.f7009q, this.f7010r, this.f7011s, this.f7012t, this.f7013u);
    }

    public final long b() {
        r0 r0Var = this.f7007o;
        return (r0Var.getWidth() << 32) | (r0Var.getHeight() & 4294967295L);
    }

    @Override // t2.r0
    public final Map f() {
        return this.f7007o.f();
    }

    @Override // t2.r0
    public final void g() {
        this.f7007o.g();
    }

    @Override // t2.r0
    public final int getHeight() {
        return this.f7007o.getHeight();
    }

    @Override // t2.r0
    public final int getWidth() {
        return this.f7007o.getWidth();
    }

    @Override // t2.r0
    public final ej.c h() {
        return this.f7007o.h();
    }

    public z(List list, int i10, int i11, int i12, o1 o1Var, int i13, int i14, int i15, i iVar, i iVar2, float f10, int i16, boolean z2, y.m mVar, r0 r0Var, boolean z10, List list2, List list3, qj.z zVar, s3.c cVar, long j) {
        this.f6994a = list;
        this.f6995b = i10;
        this.f6996c = i11;
        this.f6997d = i12;
        this.f6998e = o1Var;
        this.f6999f = i13;
        this.f7000g = i14;
        this.f7001h = i15;
        this.f7002i = iVar;
        this.j = iVar2;
        this.f7003k = f10;
        this.f7004l = i16;
        this.f7005m = z2;
        this.f7006n = mVar;
        this.f7007o = r0Var;
        this.f7008p = z10;
        this.f7009q = list2;
        this.f7010r = list3;
        this.f7011s = zVar;
        this.f7012t = cVar;
        this.f7013u = j;
    }
}
