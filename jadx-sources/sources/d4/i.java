package d4;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4878a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4879b;

    /* renamed from: c, reason: collision with root package name */
    public int f4880c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4881d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4882e;

    /* renamed from: f, reason: collision with root package name */
    public int f4883f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4884g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4885h;

    /* renamed from: i, reason: collision with root package name */
    public int f4886i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4887k;

    /* renamed from: l, reason: collision with root package name */
    public int f4888l;

    public final void a(float f10, int i10) {
        int i11 = this.f4883f;
        int[] iArr = this.f4881d;
        if (i11 >= iArr.length) {
            this.f4881d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4882e;
            this.f4882e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4881d;
        int i12 = this.f4883f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f4882e;
        this.f4883f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f4880c;
        int[] iArr = this.f4878a;
        if (i12 >= iArr.length) {
            this.f4878a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4879b;
            this.f4879b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4878a;
        int i13 = this.f4880c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f4879b;
        this.f4880c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f4886i;
        int[] iArr = this.f4884g;
        if (i11 >= iArr.length) {
            this.f4884g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4885h;
            this.f4885h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4884g;
        int i12 = this.f4886i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f4885h;
        this.f4886i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z2) {
        int i11 = this.f4888l;
        int[] iArr = this.j;
        if (i11 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4887k;
            this.f4887k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i12 = this.f4888l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f4887k;
        this.f4888l = i12 + 1;
        zArr2[i12] = z2;
    }
}
