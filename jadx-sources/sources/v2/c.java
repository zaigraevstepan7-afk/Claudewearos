package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements a2.s {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17590a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f17591b;

    @Override // a2.s
    public final boolean b() {
        Boolean bool = f17591b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw t.m1.e("canFocus is read before it is written");
    }

    @Override // a2.s
    public final void e(boolean z2) {
        f17591b = Boolean.valueOf(z2);
    }
}
