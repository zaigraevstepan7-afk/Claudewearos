package r8;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13901a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.h f13902b;

    /* renamed from: c, reason: collision with root package name */
    public final s8.g f13903c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.d f13904d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13905e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.k f13906f;

    /* renamed from: g, reason: collision with root package name */
    public final b f13907g;

    /* renamed from: h, reason: collision with root package name */
    public final b f13908h;

    /* renamed from: i, reason: collision with root package name */
    public final b f13909i;
    public final h8.i j;

    public n(Context context, s8.h hVar, s8.g gVar, s8.d dVar, String str, kk.k kVar, b bVar, b bVar2, b bVar3, h8.i iVar) {
        this.f13901a = context;
        this.f13902b = hVar;
        this.f13903c = gVar;
        this.f13904d = dVar;
        this.f13905e = str;
        this.f13906f = kVar;
        this.f13907g = bVar;
        this.f13908h = bVar2;
        this.f13909i = bVar3;
        this.j = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return fj.l.b(this.f13901a, nVar.f13901a) && fj.l.b(this.f13902b, nVar.f13902b) && this.f13903c == nVar.f13903c && this.f13904d == nVar.f13904d && fj.l.b(this.f13905e, nVar.f13905e) && fj.l.b(this.f13906f, nVar.f13906f) && this.f13907g == nVar.f13907g && this.f13908h == nVar.f13908h && this.f13909i == nVar.f13909i && fj.l.b(this.j, nVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f13904d.hashCode() + ((this.f13903c.hashCode() + ((this.f13902b.hashCode() + (this.f13901a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f13905e;
        return this.j.f7703a.hashCode() + ((this.f13909i.hashCode() + ((this.f13908h.hashCode() + ((this.f13907g.hashCode() + ((this.f13906f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f13901a + ", size=" + this.f13902b + ", scale=" + this.f13903c + ", precision=" + this.f13904d + ", diskCacheKey=" + this.f13905e + ", fileSystem=" + this.f13906f + ", memoryCachePolicy=" + this.f13907g + ", diskCachePolicy=" + this.f13908h + ", networkCachePolicy=" + this.f13909i + ", extras=" + this.j + ')';
    }
}
