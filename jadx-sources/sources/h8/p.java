package h8;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7712a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.e f7713b;

    /* renamed from: c, reason: collision with root package name */
    public final pi.m f7714c;

    /* renamed from: d, reason: collision with root package name */
    public final pi.m f7715d;

    /* renamed from: e, reason: collision with root package name */
    public final pi.m f7716e;

    /* renamed from: f, reason: collision with root package name */
    public final d f7717f;

    public p(Context context, r8.e eVar, pi.m mVar, pi.m mVar2, pi.m mVar3, d dVar) {
        this.f7712a = context;
        this.f7713b = eVar;
        this.f7714c = mVar;
        this.f7715d = mVar2;
        this.f7716e = mVar3;
        this.f7717f = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!fj.l.b(this.f7712a, pVar.f7712a) || !this.f7713b.equals(pVar.f7713b) || !this.f7714c.equals(pVar.f7714c) || !this.f7715d.equals(pVar.f7715d) || !this.f7716e.equals(pVar.f7716e)) {
            return false;
        }
        Object obj2 = g.f7700a;
        return obj2.equals(obj2) && this.f7717f.equals(pVar.f7717f);
    }

    public final int hashCode() {
        return (this.f7717f.hashCode() + ((g.f7700a.hashCode() + ((this.f7716e.hashCode() + ((this.f7715d.hashCode() + ((this.f7714c.hashCode() + ((this.f7713b.hashCode() + (this.f7712a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f7712a + ", defaults=" + this.f7713b + ", mainCoroutineContextLazy=" + this.f7714c + ", memoryCacheLazy=" + this.f7715d + ", diskCacheLazy=" + this.f7716e + ", eventListenerFactory=" + g.f7700a + ", componentRegistry=" + this.f7717f + ", logger=null)";
    }
}
