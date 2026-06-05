package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final int f8439d;

    public l0(int i10) {
        this.f8439d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f8439d == ((l0) obj).f8439d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8439d);
    }

    public final String toString() {
        return m6.a.e(this.f8439d, "FolderAppClicked(appId=", ")");
    }
}
