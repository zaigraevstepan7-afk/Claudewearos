package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1815c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.c f1816d;

    public e0(int i10, int i11, int i12, ej.c cVar) {
        this.f1813a = i10;
        this.f1814b = i11;
        this.f1815c = i12;
        this.f1816d = cVar;
    }

    public final int a(boolean z2) {
        if (this.f1815c == 0) {
            return 0;
        }
        return z2 ? this.f1814b : this.f1813a;
    }
}
