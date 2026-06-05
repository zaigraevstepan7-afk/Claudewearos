package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public enum y0 implements com.google.crypto.tink.shaded.protobuf.y {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f20586a;

    y0(int i10) {
        this.f20586a = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f20586a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
