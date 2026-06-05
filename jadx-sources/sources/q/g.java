package q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13069a;

    /* renamed from: b, reason: collision with root package name */
    public int f13070b;

    /* renamed from: c, reason: collision with root package name */
    public int f13071c;

    /* renamed from: d, reason: collision with root package name */
    public int f13072d;

    public g() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f13072d = iHighestOneBit - 1;
        this.f13069a = new int[iHighestOneBit];
    }

    public final void a(int i10) {
        int[] iArr = this.f13069a;
        int i11 = this.f13071c;
        iArr[i11] = i10;
        int i12 = this.f13072d & (i11 + 1);
        this.f13071c = i12;
        int i13 = this.f13070b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            qi.k.e0(0, i13, length, iArr, iArr2);
            qi.k.e0(i14, 0, this.f13070b, this.f13069a, iArr2);
            this.f13069a = iArr2;
            this.f13070b = 0;
            this.f13071c = length;
            this.f13072d = i15 - 1;
        }
    }
}
