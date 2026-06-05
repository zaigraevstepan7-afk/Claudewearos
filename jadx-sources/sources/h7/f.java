package h7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f implements e7.c {

    /* renamed from: a, reason: collision with root package name */
    public final f7.b f7683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7684b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7685c;

    public f(f7.b bVar, String str) {
        this.f7683a = bVar;
        this.f7684b = str;
    }

    public final void b() {
        if (this.f7685c) {
            uk.c.S(21, "statement is closed");
            throw null;
        }
    }

    @Override // e7.c
    public void d() {
        b();
    }

    @Override // e7.c
    public void reset() {
        b();
    }
}
