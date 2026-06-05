package g0;

import java.util.List;
import t2.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f6915a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6916b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6917c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6918d;

    /* renamed from: e, reason: collision with root package name */
    public final v1.f f6919e;

    /* renamed from: f, reason: collision with root package name */
    public final s3.m f6920f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6921g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6922h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f6923i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f6924k;

    public i(int i10, int i11, List list, long j, Object obj, v1.f fVar, s3.m mVar) {
        o1 o1Var = o1.f19664a;
        this.f6915a = i10;
        this.f6916b = list;
        this.f6917c = j;
        this.f6918d = obj;
        this.f6919e = fVar;
        this.f6920f = mVar;
        o1 o1Var2 = o1.f19664a;
        this.f6921g = false;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            f1 f1Var = (f1) list.get(i12);
            iMax = Math.max(iMax, !this.f6921g ? f1Var.f15551b : f1Var.f15550a);
        }
        this.f6922h = iMax;
        this.f6923i = new int[this.f6916b.size() * 2];
        this.f6924k = Integer.MIN_VALUE;
    }

    public final void a(int i10) {
        this.j += i10;
        int[] iArr = this.f6923i;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z2 = this.f6921g;
            if ((z2 && i11 % 2 == 1) || (!z2 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        this.j = i10;
        boolean z2 = this.f6921g;
        this.f6924k = z2 ? i12 : i11;
        List list = this.f6916b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            f1 f1Var = (f1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f6923i;
            if (z2) {
                iArr[i15] = m6.a.a(1, this.f6920f != s3.m.f14752a ? 0.0f * (-1) : 0.0f, (i11 - f1Var.f15550a) / 2.0f);
                iArr[i15 + 1] = i10;
                i13 = f1Var.f15551b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                v1.f fVar = this.f6919e;
                if (fVar == null) {
                    a0.a.b("null verticalAlignment");
                    throw new b3.e();
                }
                iArr[i16] = fVar.a(f1Var.f15551b, i12);
                i13 = f1Var.f15550a;
            }
            i10 += i13;
        }
    }
}
