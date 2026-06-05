package f0;

import f1.j1;
import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6152b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f6153c;

    /* renamed from: d, reason: collision with root package name */
    public int f6154d;

    public j0(int i10, int i11, int i12) {
        this.f6151a = i11;
        this.f6152b = i12;
        int i13 = (i10 / i11) * i11;
        this.f6153c = new j1(cg.b.T(Math.max(i13 - i12, 0), i13 + i11 + i12), f1.f.f6293z);
        this.f6154d = i10;
    }

    public final void b(int i10) {
        if (i10 != this.f6154d) {
            this.f6154d = i10;
            int i11 = this.f6151a;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f6152b;
            this.f6153c.setValue(cg.b.T(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    @Override // f1.q2
    public final Object getValue() {
        return (kj.h) this.f6153c.getValue();
    }
}
