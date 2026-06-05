package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f1014b = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1015a;

    public /* synthetic */ t(int i10) {
        this.f1015a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        switch (this.f1015a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (w0) w.d(cls.asSubclass(w.class)).c(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        switch (this.f1015a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
