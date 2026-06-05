package e0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final m[] f5293b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.j f5294c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5298g;

    public n(int i10, m[] mVarArr, t0.j jVar, List list, int i11) {
        this.f5292a = i10;
        this.f5293b = mVarArr;
        this.f5294c = jVar;
        this.f5295d = list;
        this.f5296e = i11;
        int iMax = 0;
        for (m mVar : mVarArr) {
            iMax = Math.max(iMax, mVar.f5284k);
        }
        this.f5297f = iMax;
        int i12 = iMax + this.f5296e;
        this.f5298g = i12 >= 0 ? i12 : 0;
    }

    public final m[] a(int i10, int i11, int i12) {
        m[] mVarArr = this.f5293b;
        int length = mVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            m mVar = mVarArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) ((b) this.f5295d.get(i14)).f5219a;
            mVar.k(i10, ((int[]) this.f5294c.f15364c)[i15], i11, i12, this.f5292a, i15);
            i15 += i17;
            i13++;
            i14 = i16;
        }
        return mVarArr;
    }
}
