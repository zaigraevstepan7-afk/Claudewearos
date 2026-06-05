package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f6163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6164b;

    /* renamed from: c, reason: collision with root package name */
    public final u f6165c;

    public l(int i10, int i11, u uVar) {
        this.f6163a = i10;
        this.f6164b = i11;
        this.f6165c = uVar;
        if (i10 < 0) {
            a0.a.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        a0.a.a("size should be > 0");
    }
}
