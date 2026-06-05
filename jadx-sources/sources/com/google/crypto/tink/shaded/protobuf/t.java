package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f4237b = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4238a;

    public /* synthetic */ t(int i10) {
        this.f4238a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final a1 a(Class cls) {
        switch (this.f4238a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (a1) w.j(cls.asSubclass(w.class)).i(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final boolean b(Class cls) {
        switch (this.f4238a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
