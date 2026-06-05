package j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends x8.a {

    /* renamed from: c, reason: collision with root package name */
    public int f8641c;

    /* renamed from: e, reason: collision with root package name */
    public int f8643e;

    /* renamed from: g, reason: collision with root package name */
    public int f8645g;

    /* renamed from: b, reason: collision with root package name */
    public j0[] f8640b = new j0[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f8642d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f8644f = new Object[16];

    public final void c0() {
        this.f8641c = 0;
        this.f8643e = 0;
        qi.k.m0(0, this.f8645g, null, this.f8644f);
        this.f8645g = 0;
    }

    public final void d0(f1.a aVar, i1.k kVar, p1.k kVar2, k0 k0Var) {
        if (this.f8641c != 0) {
            androidx.datastore.preferences.protobuf.k kVar3 = new androidx.datastore.preferences.protobuf.k(this);
            l0 l0Var = (l0) kVar3.f957e;
            while (true) {
                j0 j0Var = l0Var.f8640b[kVar3.f954b];
                i1.b bVarB = j0Var.b(kVar3);
                f1.a aVar2 = aVar;
                i1.k kVar4 = kVar;
                p1.k kVar5 = kVar2;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(kVar3, aVar2, kVar4, kVar5, k0Var2);
                    int i10 = kVar3.f954b;
                    int i11 = l0Var.f8641c;
                    if (i10 < i11) {
                        j0 j0Var2 = l0Var.f8640b[i10];
                        kVar3.f955c += j0Var2.f8636a;
                        kVar3.f956d += j0Var2.f8637b;
                        int i12 = i10 + 1;
                        kVar3.f954b = i12;
                        if (i12 >= i11) {
                            break;
                        }
                        aVar = aVar2;
                        kVar = kVar4;
                        kVar2 = kVar5;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        c0();
    }

    public final boolean e0() {
        return this.f8641c == 0;
    }

    public final void f0(j0 j0Var) {
        int i10 = this.f8641c;
        j0[] j0VarArr = this.f8640b;
        if (i10 == j0VarArr.length) {
            j0[] j0VarArr2 = new j0[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i10);
            this.f8640b = j0VarArr2;
        }
        int i11 = this.f8643e;
        int i12 = j0Var.f8636a;
        int i13 = j0Var.f8637b;
        int i14 = i11 + i12;
        int[] iArr = this.f8642d;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            qi.k.e0(0, 0, length, iArr, iArr2);
            this.f8642d = iArr2;
        }
        int i16 = this.f8645g + i13;
        Object[] objArr = this.f8644f;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f8644f = objArr2;
        }
        j0[] j0VarArr3 = this.f8640b;
        int i18 = this.f8641c;
        this.f8641c = i18 + 1;
        j0VarArr3[i18] = j0Var;
        this.f8643e += j0Var.f8636a;
        this.f8645g += i13;
    }
}
