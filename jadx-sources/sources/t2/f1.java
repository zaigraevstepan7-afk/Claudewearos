package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public int f15550a;

    /* renamed from: b, reason: collision with root package name */
    public int f15551b;

    /* renamed from: c, reason: collision with root package name */
    public long f15552c;

    /* renamed from: d, reason: collision with root package name */
    public long f15553d = h1.f15574a;

    /* renamed from: e, reason: collision with root package name */
    public long f15554e = 0;

    public f1() {
        long j = 0;
        this.f15552c = (j & 4294967295L) | (j << 32);
    }

    public final void F0() {
        this.f15550a = cg.b.p((int) (this.f15552c >> 32), s3.a.j(this.f15553d), s3.a.h(this.f15553d));
        this.f15551b = cg.b.p((int) (this.f15552c & 4294967295L), s3.a.i(this.f15553d), s3.a.g(this.f15553d));
        int i10 = this.f15550a;
        long j = this.f15552c;
        this.f15554e = (((i10 - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void G0(long j, float f10, ej.c cVar);

    public final void M0(long j) {
        if (s3.l.b(this.f15552c, j)) {
            return;
        }
        this.f15552c = j;
        F0();
    }

    public final void N0(long j) {
        if (s3.a.b(this.f15553d, j)) {
            return;
        }
        this.f15553d = j;
        F0();
    }

    public Object c0() {
        return null;
    }

    public abstract int x0(a aVar);

    public int y0() {
        return (int) (this.f15552c & 4294967295L);
    }

    public int z0() {
        return (int) (this.f15552c >> 32);
    }
}
