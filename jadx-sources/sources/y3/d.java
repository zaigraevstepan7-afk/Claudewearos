package y3;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f20191f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f20192g;

    /* renamed from: h, reason: collision with root package name */
    public int f20193h;

    /* renamed from: i, reason: collision with root package name */
    public qh.c f20194i;

    @Override // y3.b
    public final f d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f20193h; i11++) {
            f[] fVarArr = this.f20191f;
            f fVar = fVarArr[i11];
            if (!zArr[fVar.f20197b]) {
                qh.c cVar = this.f20194i;
                cVar.f13507b = fVar;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = ((f) cVar.f13507b).A[i12];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = fVar2.A[i12];
                            float f12 = ((f) cVar.f13507b).A[i12];
                            if (f12 == f11) {
                                i12--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f20191f[i10];
    }

    @Override // y3.b
    public final boolean e() {
        return this.f20193h == 0;
    }

    @Override // y3.b
    public final void i(c cVar, b bVar, boolean z2) {
        f fVar = bVar.f20170a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.A;
        a aVar = bVar.f20173d;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar.e(i10);
            float f10 = aVar.f(i10);
            qh.c cVar2 = this.f20194i;
            cVar2.f13507b = fVarE;
            if (fVarE.f20196a) {
                boolean z10 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((f) cVar2.f13507b).A;
                    float f11 = (fArr[i11] * f10) + fArr2[i11];
                    fArr2[i11] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) cVar2.f13507b).A[i11] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((d) cVar2.f13508c).k((f) cVar2.f13507b);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f12 = fArr[i12];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) cVar2.f13507b).A[i12] = f13;
                    } else {
                        ((f) cVar2.f13507b).A[i12] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f20171b = (bVar.f20171b * f10) + this.f20171b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i10;
        int i11 = this.f20193h + 1;
        f[] fVarArr = this.f20191f;
        if (i11 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f20191f = fVarArr2;
            this.f20192g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f20191f;
        int i12 = this.f20193h;
        fVarArr3[i12] = fVar;
        int i13 = i12 + 1;
        this.f20193h = i13;
        if (i13 > 1 && fVarArr3[i12].f20197b > fVar.f20197b) {
            int i14 = 0;
            while (true) {
                i10 = this.f20193h;
                if (i14 >= i10) {
                    break;
                }
                this.f20192g[i14] = this.f20191f[i14];
                i14++;
            }
            Arrays.sort(this.f20192g, 0, i10, new ea.e(13));
            for (int i15 = 0; i15 < this.f20193h; i15++) {
                this.f20191f[i15] = this.f20192g[i15];
            }
        }
        fVar.f20196a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i10 = 0;
        while (i10 < this.f20193h) {
            if (this.f20191f[i10] == fVar) {
                while (true) {
                    int i11 = this.f20193h;
                    if (i10 >= i11 - 1) {
                        this.f20193h = i11 - 1;
                        fVar.f20196a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f20191f;
                        int i12 = i10 + 1;
                        fVarArr[i10] = fVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // y3.b
    public final String toString() {
        qh.c cVar = this.f20194i;
        String str = " goal -> (" + this.f20171b + ") : ";
        for (int i10 = 0; i10 < this.f20193h; i10++) {
            cVar.f13507b = this.f20191f[i10];
            str = str + cVar + " ";
        }
        return str;
    }
}
