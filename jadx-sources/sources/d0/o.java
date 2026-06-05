package d0;

import java.util.List;
import java.util.Map;
import qj.z;
import t2.r0;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f4393a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4394b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4395c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4396d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f4397e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4398f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4399g;

    /* renamed from: h, reason: collision with root package name */
    public final z f4400h;

    /* renamed from: i, reason: collision with root package name */
    public final s3.c f4401i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4402k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4403l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4404m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4405n;

    /* renamed from: o, reason: collision with root package name */
    public final o1 f4406o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4407p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4408q;

    public o(p pVar, int i10, boolean z2, float f10, r0 r0Var, float f11, boolean z10, z zVar, s3.c cVar, long j, List list, int i11, int i12, int i13, o1 o1Var, int i14, int i15) {
        this.f4393a = pVar;
        this.f4394b = i10;
        this.f4395c = z2;
        this.f4396d = f10;
        this.f4397e = r0Var;
        this.f4398f = f11;
        this.f4399g = z10;
        this.f4400h = zVar;
        this.f4401i = cVar;
        this.j = j;
        this.f4402k = list;
        this.f4403l = i11;
        this.f4404m = i12;
        this.f4405n = i13;
        this.f4406o = o1Var;
        this.f4407p = i14;
        this.f4408q = i15;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final o a(int i10, boolean z2) {
        p pVar;
        if (this.f4399g) {
            return null;
        }
        ?? r15 = this.f4402k;
        if (r15.isEmpty() || (pVar = this.f4393a) == null) {
            return null;
        }
        int i11 = pVar.f4419l;
        int i12 = this.f4394b - i10;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        p pVar2 = (p) qi.l.z0(r15);
        p pVar3 = (p) qi.l.F0(r15);
        if (pVar2.f4421n || pVar3.f4421n) {
            return null;
        }
        int i13 = this.f4404m;
        int i14 = this.f4403l;
        if (i10 < 0) {
            if (Math.min((pVar2.j + pVar2.f4419l) - i14, (pVar3.j + pVar3.f4419l) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - pVar2.j, i13 - pVar3.j) <= i10) {
            return null;
        }
        int size = r15.size();
        for (int i15 = 0; i15 < size; i15++) {
            p pVar4 = (p) r15.get(i15);
            pVar4.getClass();
            int[] iArr = pVar4.f4423p;
            if (!pVar4.f4421n) {
                pVar4.j += i10;
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    if ((i16 & 1) != 0) {
                        iArr[i16] = iArr[i16] + i10;
                    }
                }
                if (z2) {
                    int size2 = pVar4.f4410b.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        pVar4.f4417i.a(i17, pVar4.f4415g);
                    }
                }
            }
        }
        return new o(this.f4393a, i12, this.f4395c || i10 > 0, i10, this.f4397e, this.f4398f, this.f4399g, this.f4400h, this.f4401i, this.j, r15, this.f4403l, this.f4404m, this.f4405n, this.f4406o, this.f4407p, this.f4408q);
    }

    public final long b() {
        r0 r0Var = this.f4397e;
        return (r0Var.getWidth() << 32) | (r0Var.getHeight() & 4294967295L);
    }

    @Override // t2.r0
    public final Map f() {
        return this.f4397e.f();
    }

    @Override // t2.r0
    public final void g() {
        this.f4397e.g();
    }

    @Override // t2.r0
    public final int getHeight() {
        return this.f4397e.getHeight();
    }

    @Override // t2.r0
    public final int getWidth() {
        return this.f4397e.getWidth();
    }

    @Override // t2.r0
    public final ej.c h() {
        return this.f4397e.h();
    }
}
