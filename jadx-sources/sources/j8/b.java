package j8;

import fj.l;
import h8.m;
import i8.o;
import t2.i;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final r8.g f8739b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8740c;

    /* renamed from: d, reason: collision with root package name */
    public final i8.b f8741d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f8742e;

    /* renamed from: f, reason: collision with root package name */
    public final v1.c f8743f;

    /* renamed from: g, reason: collision with root package name */
    public final i f8744g;

    /* renamed from: h, reason: collision with root package name */
    public final i8.m f8745h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8746i;

    public b(r8.g gVar, m mVar, i8.b bVar, ej.c cVar, v1.c cVar2, i iVar, i8.m mVar2, String str) {
        this.f8739b = gVar;
        this.f8740c = mVar;
        this.f8741d = bVar;
        this.f8742e = cVar;
        this.f8743f = cVar2;
        this.f8744g = iVar;
        this.f8745h = mVar2;
        this.f8746i = str;
    }

    @Override // v2.x0
    public final n d() {
        i8.b bVar = this.f8741d;
        m mVar = this.f8740c;
        r8.g gVar = this.f8739b;
        i8.c cVar = new i8.c(mVar, bVar, gVar);
        i8.i iVar = new i8.i(cVar);
        iVar.F = this.f8742e;
        iVar.G = this.f8744g;
        iVar.H = 1;
        iVar.I = this.f8745h;
        iVar.m(cVar);
        s8.i iVar2 = gVar.f13881o;
        return new c(iVar, this.f8743f, this.f8744g, this.f8746i, iVar2 instanceof o ? (o) iVar2 : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8739b.equals(bVar.f8739b) && this.f8740c.equals(bVar.f8740c) && l.b(this.f8741d, bVar.f8741d) && l.b(this.f8742e, bVar.f8742e) && l.b(this.f8743f, bVar.f8743f) && l.b(this.f8744g, bVar.f8744g) && Float.compare(1.0f, 1.0f) == 0 && l.b(this.f8745h, bVar.f8745h) && l.b(this.f8746i, bVar.f8746i);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        c cVar = (c) nVar;
        long jH = cVar.N.h();
        o oVar = cVar.M;
        i8.b bVar = this.f8741d;
        m mVar = this.f8740c;
        r8.g gVar = this.f8739b;
        i8.c cVar2 = new i8.c(mVar, bVar, gVar);
        i8.i iVar = cVar.N;
        iVar.F = this.f8742e;
        i iVar2 = this.f8744g;
        iVar.G = iVar2;
        iVar.H = 1;
        iVar.I = this.f8745h;
        iVar.m(cVar2);
        boolean zA = b2.e.a(jH, iVar.h());
        cVar.H = this.f8743f;
        s8.i iVar3 = gVar.f13881o;
        cVar.M = iVar3 instanceof o ? (o) iVar3 : null;
        cVar.I = iVar2;
        cVar.J = 1.0f;
        cVar.K = true;
        String str = cVar.L;
        String str2 = this.f8746i;
        if (!l.b(str, str2)) {
            cVar.L = str2;
            v2.n.o(cVar);
        }
        boolean zB = l.b(oVar, cVar.M);
        if (!zA || !zB) {
            v2.n.n(cVar);
        }
        v2.n.m(cVar);
    }

    public final int hashCode() {
        int i10 = gk.b.i(gk.b.f(1.0f, (this.f8744g.hashCode() + ((this.f8743f.hashCode() + gk.b.g(1, (this.f8742e.hashCode() + ((this.f8741d.hashCode() + ((this.f8740c.hashCode() + (this.f8739b.hashCode() * 31)) * 31)) * 31)) * 961, 31)) * 31)) * 31, 961), 31, true);
        i8.m mVar = this.f8745h;
        int iHashCode = (i10 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.f8746i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentPainterElement(request=");
        sb2.append(this.f8739b);
        sb2.append(", imageLoader=");
        sb2.append(this.f8740c);
        sb2.append(", modelEqualityDelegate=");
        sb2.append(this.f8741d);
        sb2.append(", transform=");
        sb2.append(this.f8742e);
        sb2.append(", onState=null, filterQuality=");
        sb2.append("Low");
        sb2.append(", alignment=");
        sb2.append(this.f8743f);
        sb2.append(", contentScale=");
        sb2.append(this.f8744g);
        sb2.append(", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=");
        sb2.append(this.f8745h);
        sb2.append(", contentDescription=");
        return m6.a.j(sb2, this.f8746i, ")");
    }
}
