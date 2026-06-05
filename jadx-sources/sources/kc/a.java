package kc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9509b;

    public a(String str, boolean z2) {
        this.f9508a = str;
        this.f9509b = z2;
    }

    public final String toString() {
        String str = this.f9508a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f9509b);
        return sb2.toString();
    }
}
