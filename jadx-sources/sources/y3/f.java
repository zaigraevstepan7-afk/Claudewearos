package y3;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20196a;

    /* renamed from: e, reason: collision with root package name */
    public float f20200e;

    /* renamed from: b, reason: collision with root package name */
    public int f20197b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f20198c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f20199d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20201f = false;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f20202z = new float[9];
    public final float[] A = new float[9];
    public b[] B = new b[16];
    public int C = 0;
    public int D = 0;

    public f(int i10) {
        this.E = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 >= i11) {
                b[] bVarArr = this.B;
                if (i11 >= bVarArr.length) {
                    this.B = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.B;
                int i12 = this.C;
                bVarArr2[i12] = bVar;
                this.C = i12 + 1;
                return;
            }
            if (this.B[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.C;
        int i11 = 0;
        while (i11 < i10) {
            if (this.B[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.B;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.C--;
                return;
            }
            i11++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20197b - ((f) obj).f20197b;
    }

    public final void e() {
        this.E = 5;
        this.f20199d = 0;
        this.f20197b = -1;
        this.f20198c = -1;
        this.f20200e = 0.0f;
        this.f20201f = false;
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11] = null;
        }
        this.C = 0;
        this.D = 0;
        this.f20196a = false;
        Arrays.fill(this.A, 0.0f);
    }

    public final void f(c cVar, float f10) {
        this.f20200e = f10;
        this.f20201f = true;
        int i10 = this.C;
        this.f20198c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].h(cVar, this, false);
        }
        this.C = 0;
    }

    public final void i(c cVar, b bVar) {
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].i(cVar, bVar, false);
        }
        this.C = 0;
    }

    public final String toString() {
        return "" + this.f20197b;
    }
}
