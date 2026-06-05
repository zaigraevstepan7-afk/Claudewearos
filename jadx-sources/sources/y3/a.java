package y3;

import java.util.Arrays;
import p1.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f20162b;

    /* renamed from: c, reason: collision with root package name */
    public final l f20163c;

    /* renamed from: a, reason: collision with root package name */
    public int f20161a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f20164d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f20165e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f20166f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f20167g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f20168h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f20169i = -1;
    public boolean j = false;

    public a(b bVar, l lVar) {
        this.f20162b = bVar;
        this.f20163c = lVar;
    }

    public final void a(f fVar, float f10, boolean z2) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f20168h;
            b bVar = this.f20162b;
            if (i10 == -1) {
                this.f20168h = 0;
                this.f20167g[0] = f10;
                this.f20165e[0] = fVar.f20197b;
                this.f20166f[0] = -1;
                fVar.D++;
                fVar.a(bVar);
                this.f20161a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f20169i + 1;
                this.f20169i = i11;
                int[] iArr = this.f20165e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f20169i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f20161a; i13++) {
                int i14 = this.f20165e[i10];
                int i15 = fVar.f20197b;
                if (i14 == i15) {
                    float[] fArr = this.f20167g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f20168h) {
                            this.f20168h = this.f20166f[i10];
                        } else {
                            int[] iArr2 = this.f20166f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z2) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f20169i = i10;
                        }
                        fVar.D--;
                        this.f20161a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f20166f[i10];
            }
            int length = this.f20169i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f20165e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f20165e;
            if (length >= iArr4.length && this.f20161a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f20165e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f20165e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f20164d * 2;
                this.f20164d = i18;
                this.j = false;
                this.f20169i = length - 1;
                this.f20167g = Arrays.copyOf(this.f20167g, i18);
                this.f20165e = Arrays.copyOf(this.f20165e, this.f20164d);
                this.f20166f = Arrays.copyOf(this.f20166f, this.f20164d);
            }
            this.f20165e[length] = fVar.f20197b;
            this.f20167g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f20166f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f20166f[length] = this.f20168h;
                this.f20168h = length;
            }
            fVar.D++;
            fVar.a(bVar);
            this.f20161a++;
            if (!this.j) {
                this.f20169i++;
            }
            int i19 = this.f20169i;
            int[] iArr8 = this.f20165e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f20169i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i10 = this.f20168h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20161a; i11++) {
            f fVar = ((f[]) this.f20163c.f12662d)[this.f20165e[i10]];
            if (fVar != null) {
                fVar.b(this.f20162b);
            }
            i10 = this.f20166f[i10];
        }
        this.f20168h = -1;
        this.f20169i = -1;
        this.j = false;
        this.f20161a = 0;
    }

    public final float c(f fVar) {
        int i10 = this.f20168h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20161a; i11++) {
            if (this.f20165e[i10] == fVar.f20197b) {
                return this.f20167g[i10];
            }
            i10 = this.f20166f[i10];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f20161a;
    }

    public final f e(int i10) {
        int i11 = this.f20168h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20161a; i12++) {
            if (i12 == i10) {
                return ((f[]) this.f20163c.f12662d)[this.f20165e[i11]];
            }
            i11 = this.f20166f[i11];
        }
        return null;
    }

    public final float f(int i10) {
        int i11 = this.f20168h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20161a; i12++) {
            if (i12 == i10) {
                return this.f20167g[i11];
            }
            i11 = this.f20166f[i11];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f10) {
        if (f10 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i10 = this.f20168h;
        b bVar = this.f20162b;
        if (i10 == -1) {
            this.f20168h = 0;
            this.f20167g[0] = f10;
            this.f20165e[0] = fVar.f20197b;
            this.f20166f[0] = -1;
            fVar.D++;
            fVar.a(bVar);
            this.f20161a++;
            if (this.j) {
                return;
            }
            int i11 = this.f20169i + 1;
            this.f20169i = i11;
            int[] iArr = this.f20165e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f20169i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f20161a; i13++) {
            int i14 = this.f20165e[i10];
            int i15 = fVar.f20197b;
            if (i14 == i15) {
                this.f20167g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f20166f[i10];
        }
        int length = this.f20169i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f20165e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f20165e;
        if (length >= iArr3.length && this.f20161a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f20165e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f20165e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f20164d * 2;
            this.f20164d = i18;
            this.j = false;
            this.f20169i = length - 1;
            this.f20167g = Arrays.copyOf(this.f20167g, i18);
            this.f20165e = Arrays.copyOf(this.f20165e, this.f20164d);
            this.f20166f = Arrays.copyOf(this.f20166f, this.f20164d);
        }
        this.f20165e[length] = fVar.f20197b;
        this.f20167g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f20166f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f20166f[length] = this.f20168h;
            this.f20168h = length;
        }
        fVar.D++;
        fVar.a(bVar);
        int i19 = this.f20161a + 1;
        this.f20161a = i19;
        if (!this.j) {
            this.f20169i++;
        }
        int[] iArr7 = this.f20165e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f20169i >= iArr7.length) {
            this.j = true;
            this.f20169i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z2) {
        int i10 = this.f20168h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f20161a) {
            if (this.f20165e[i10] == fVar.f20197b) {
                if (i10 == this.f20168h) {
                    this.f20168h = this.f20166f[i10];
                } else {
                    int[] iArr = this.f20166f;
                    iArr[i12] = iArr[i10];
                }
                if (z2) {
                    fVar.b(this.f20162b);
                }
                fVar.D--;
                this.f20161a--;
                this.f20165e[i10] = -1;
                if (this.j) {
                    this.f20169i = i10;
                }
                return this.f20167g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f20166f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f20168h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f20161a; i11++) {
            str = (m1.v(str, " -> ") + this.f20167g[i10] + " : ") + ((f[]) this.f20163c.f12662d)[this.f20165e[i10]];
            i10 = this.f20166f[i10];
        }
        return str;
    }
}
