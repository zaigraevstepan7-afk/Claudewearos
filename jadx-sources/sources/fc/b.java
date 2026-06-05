package fc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f6690a;

    b(int i10) {
        this.f6690a = i10;
    }

    public static b a(int i10) {
        for (b bVar : values()) {
            if (bVar.f6690a == i10) {
                return bVar;
            }
        }
        return null;
    }
}
