package oj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f12546b = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12547a;

    public /* synthetic */ f(int i10) {
        this.f12547a = i10;
    }

    @Override // oj.g
    public e a() {
        return new e(d.b());
    }

    public String toString() {
        switch (this.f12547a) {
            case 0:
                int i10 = d.f12544b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }
}
