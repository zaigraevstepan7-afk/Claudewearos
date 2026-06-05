package z6;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f20436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20437b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20438c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20439d;

    public a(int i10, int i11, String str, String str2) {
        l.f(str, "from");
        l.f(str2, "to");
        this.f20436a = i10;
        this.f20437b = i11;
        this.f20438c = str;
        this.f20439d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        l.f(aVar, "other");
        int i10 = this.f20436a - aVar.f20436a;
        return i10 == 0 ? this.f20437b - aVar.f20437b : i10;
    }
}
