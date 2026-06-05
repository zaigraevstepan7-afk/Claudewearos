package j1;

import f1.n0;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f1.i0 f8608a;

    /* renamed from: b, reason: collision with root package name */
    public a f8609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8610c;

    /* renamed from: f, reason: collision with root package name */
    public int f8613f;

    /* renamed from: g, reason: collision with root package name */
    public int f8614g;

    /* renamed from: l, reason: collision with root package name */
    public int f8618l;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f8611d = new n0(0, false);

    /* renamed from: e, reason: collision with root package name */
    public boolean f8612e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8615h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f8616i = -1;
    public int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f8617k = -1;

    public b(f1.i0 i0Var, a aVar) {
        this.f8608a = i0Var;
        this.f8609b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f8615h;
        if (f1.s.x(arrayList)) {
            f1.s.B(arrayList);
        } else {
            this.f8614g++;
        }
    }

    public final void b() {
        int i10 = this.f8614g;
        if (i10 > 0) {
            l0 l0Var = this.f8609b.f8606d;
            l0Var.f0(h0.f8632c);
            l0Var.f8642d[l0Var.f8643e - l0Var.f8640b[l0Var.f8641c - 1].f8636a] = i10;
            this.f8614g = 0;
        }
        ArrayList arrayList = this.f8615h;
        if (f1.s.x(arrayList)) {
            a aVar = this.f8609b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = arrayList.get(i11);
            }
            aVar.getClass();
            if (size != 0) {
                l0 l0Var2 = aVar.f8606d;
                l0Var2.f0(k.f8638c);
                wd.a.O(l0Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i10 = this.f8618l;
        if (i10 > 0) {
            int i11 = this.f8616i;
            if (i11 >= 0) {
                b();
                l0 l0Var = this.f8609b.f8606d;
                l0Var.f0(z.f8663c);
                int i12 = l0Var.f8643e - l0Var.f8640b[l0Var.f8641c - 1].f8636a;
                int[] iArr = l0Var.f8642d;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f8616i = -1;
            } else {
                int i13 = this.f8617k;
                int i14 = this.j;
                b();
                l0 l0Var2 = this.f8609b.f8606d;
                l0Var2.f0(v.f8659c);
                int i15 = l0Var2.f8643e - l0Var2.f8640b[l0Var2.f8641c - 1].f8636a;
                int[] iArr2 = l0Var2.f8642d;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.j = -1;
                this.f8617k = -1;
            }
            this.f8618l = 0;
        }
    }

    public final void d(boolean z2) {
        f1.i0 i0Var = this.f8608a;
        int i10 = z2 ? i0Var.G.f8121i : i0Var.G.f8119g;
        int i11 = i10 - this.f8613f;
        if (i11 < 0) {
            f1.n.a("Tried to seek backward");
        }
        if (i11 > 0) {
            l0 l0Var = this.f8609b.f8606d;
            l0Var.f0(d.f8623c);
            l0Var.f8642d[l0Var.f8643e - l0Var.f8640b[l0Var.f8641c - 1].f8636a] = i11;
            this.f8613f = i10;
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                f1.n.a("Invalid remove index " + i10);
            }
            if (this.f8616i == i10) {
                this.f8618l += i11;
                return;
            }
            c();
            this.f8616i = i10;
            this.f8618l = i11;
        }
    }
}
