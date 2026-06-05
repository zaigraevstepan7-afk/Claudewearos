package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: b, reason: collision with root package name */
    public final int f12667b;

    public a(int i10) {
        this.f12667b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fj.l.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f12667b == ((a) obj).f12667b;
    }

    public final int hashCode() {
        return this.f12667b;
    }

    public final String toString() {
        return m6.a.g(new StringBuilder("AndroidPointerIcon(type="), this.f12667b, ')');
    }
}
