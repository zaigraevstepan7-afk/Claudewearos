package z5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f20383a;

    /* renamed from: b, reason: collision with root package name */
    public final k f20384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20385c = true;

    public e(i iVar, k kVar) {
        this.f20383a = iVar;
        this.f20384b = kVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20383a);
        sb2.append(" ");
        sb2.append(!this.f20385c ? "+>" : "->");
        sb2.append(" ");
        sb2.append(this.f20384b);
        return sb2.toString();
    }
}
