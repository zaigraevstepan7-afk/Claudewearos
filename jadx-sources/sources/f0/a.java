package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6099a;

    /* renamed from: b, reason: collision with root package name */
    public long f6100b;

    public final long a() {
        if (this.f6099a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f6100b - System.nanoTime());
    }
}
