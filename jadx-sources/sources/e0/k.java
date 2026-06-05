package e0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t0.j f5251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5253c;

    /* renamed from: d, reason: collision with root package name */
    public final j f5254d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0.j f5256f;

    public k(t0.j jVar, int i10, int i11, j jVar2, r rVar) {
        this.f5256f = jVar;
        this.f5251a = jVar;
        this.f5252b = i10;
        this.f5253c = i11;
        this.f5254d = jVar2;
        this.f5255e = rVar;
    }

    public final long a(int i10, int i11) {
        int i12;
        t0.j jVar = this.f5251a;
        int[] iArr = (int[]) jVar.f15363b;
        if (i11 == 1) {
            i12 = iArr[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr2 = (int[]) jVar.f15364c;
            i12 = (iArr2[i13] + iArr[i13]) - iArr2[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 < 0) {
            s3.i.a("width must be >= 0");
        }
        return s3.b.h(i12, i12, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final n b(int i10) {
        q qVarB = this.f5255e.b(i10);
        int i11 = qVarB.f5302a;
        List list = qVarB.f5303b;
        int size = list.size();
        int i12 = 0;
        int i13 = (size == 0 || i11 + size == this.f5252b) ? 0 : this.f5253c;
        m[] mVarArr = new m[size];
        int i14 = 0;
        while (i12 < size) {
            int i15 = (int) ((b) list.get(i12)).f5219a;
            int i16 = i13;
            m mVarT = this.f5254d.t(i11 + i12, i14, i15, a(i14, i15), i16);
            i14 += i15;
            mVarArr[i12] = mVarT;
            i12++;
            i13 = i16;
        }
        return new n(i10, mVarArr, this.f5256f, qVarB.f5303b, i13);
    }
}
