package t6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f15849a;

    /* renamed from: b, reason: collision with root package name */
    public int f15850b;

    /* renamed from: c, reason: collision with root package name */
    public int f15851c;

    /* renamed from: d, reason: collision with root package name */
    public int f15852d;

    /* renamed from: e, reason: collision with root package name */
    public int f15853e;

    public final boolean a() {
        int i10 = this.f15849a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f15852d;
            int i13 = this.f15850b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f15852d;
            int i15 = this.f15851c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f15853e;
            int i17 = this.f15850b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f15853e;
            int i19 = this.f15851c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
