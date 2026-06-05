package ab;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f359a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f360b;

    public x(String str, c0 c0Var) {
        this.f359a = str;
        this.f360b = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return fj.l.b(this.f359a, xVar.f359a) && this.f360b == xVar.f360b;
    }

    public final int hashCode() {
        return this.f360b.hashCode() + (this.f359a.hashCode() * 31);
    }

    public final String toString() {
        return "ContextMenuShortcutItem(label=" + this.f359a + ", iconType=" + this.f360b + ")";
    }
}
