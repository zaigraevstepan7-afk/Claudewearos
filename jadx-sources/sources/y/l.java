package y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f20152b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f20153c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20154a;

    public /* synthetic */ l(int i10) {
        this.f20154a = i10;
    }

    @Override // y.m
    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f20154a) {
            case 0:
                return (((i10 - i12) - i13) / 2) - (i11 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f20154a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
