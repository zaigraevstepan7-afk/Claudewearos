package r8;

import kk.q;
import qj.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final e f13845o;

    /* renamed from: a, reason: collision with root package name */
    public final kk.k f13846a;

    /* renamed from: b, reason: collision with root package name */
    public final ti.h f13847b;

    /* renamed from: c, reason: collision with root package name */
    public final ti.h f13848c;

    /* renamed from: d, reason: collision with root package name */
    public final ti.h f13849d;

    /* renamed from: e, reason: collision with root package name */
    public final b f13850e;

    /* renamed from: f, reason: collision with root package name */
    public final b f13851f;

    /* renamed from: g, reason: collision with root package name */
    public final b f13852g;

    /* renamed from: h, reason: collision with root package name */
    public final ej.c f13853h;

    /* renamed from: i, reason: collision with root package name */
    public final ej.c f13854i;
    public final ej.c j;

    /* renamed from: k, reason: collision with root package name */
    public final s8.i f13855k;

    /* renamed from: l, reason: collision with root package name */
    public final s8.g f13856l;

    /* renamed from: m, reason: collision with root package name */
    public final s8.d f13857m;

    /* renamed from: n, reason: collision with root package name */
    public final h8.i f13858n;

    static {
        q qVar = kk.k.f9707a;
        xj.e eVar = m0.f13601a;
        xj.d dVar = xj.d.f20094c;
        b bVar = b.f13823c;
        s8.e eVar2 = s8.i.f14789a;
        s8.g gVar = s8.g.f14784b;
        s8.d dVar2 = s8.d.f14780a;
        h8.i iVar = h8.i.f7702b;
        ti.i iVar2 = ti.i.f16336a;
        v8.l lVar = v8.l.f17897a;
        f13845o = new e(qVar, iVar2, dVar, dVar, bVar, bVar, bVar, lVar, lVar, lVar, eVar2, gVar, dVar2, iVar);
    }

    public e(kk.k kVar, ti.h hVar, ti.h hVar2, ti.h hVar3, b bVar, b bVar2, b bVar3, ej.c cVar, ej.c cVar2, ej.c cVar3, s8.i iVar, s8.g gVar, s8.d dVar, h8.i iVar2) {
        this.f13846a = kVar;
        this.f13847b = hVar;
        this.f13848c = hVar2;
        this.f13849d = hVar3;
        this.f13850e = bVar;
        this.f13851f = bVar2;
        this.f13852g = bVar3;
        this.f13853h = cVar;
        this.f13854i = cVar2;
        this.j = cVar3;
        this.f13855k = iVar;
        this.f13856l = gVar;
        this.f13857m = dVar;
        this.f13858n = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return fj.l.b(this.f13846a, eVar.f13846a) && fj.l.b(this.f13847b, eVar.f13847b) && fj.l.b(this.f13848c, eVar.f13848c) && fj.l.b(this.f13849d, eVar.f13849d) && this.f13850e == eVar.f13850e && this.f13851f == eVar.f13851f && this.f13852g == eVar.f13852g && fj.l.b(this.f13853h, eVar.f13853h) && fj.l.b(this.f13854i, eVar.f13854i) && fj.l.b(this.j, eVar.j) && fj.l.b(this.f13855k, eVar.f13855k) && this.f13856l == eVar.f13856l && this.f13857m == eVar.f13857m && fj.l.b(this.f13858n, eVar.f13858n);
    }

    public final int hashCode() {
        return this.f13858n.f7703a.hashCode() + ((this.f13857m.hashCode() + ((this.f13856l.hashCode() + ((this.f13855k.hashCode() + ((this.j.hashCode() + ((this.f13854i.hashCode() + ((this.f13853h.hashCode() + ((this.f13852g.hashCode() + ((this.f13851f.hashCode() + ((this.f13850e.hashCode() + ((this.f13849d.hashCode() + ((this.f13848c.hashCode() + ((this.f13847b.hashCode() + (this.f13846a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f13846a + ", interceptorCoroutineContext=" + this.f13847b + ", fetcherCoroutineContext=" + this.f13848c + ", decoderCoroutineContext=" + this.f13849d + ", memoryCachePolicy=" + this.f13850e + ", diskCachePolicy=" + this.f13851f + ", networkCachePolicy=" + this.f13852g + ", placeholderFactory=" + this.f13853h + ", errorFactory=" + this.f13854i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.f13855k + ", scale=" + this.f13856l + ", precision=" + this.f13857m + ", extras=" + this.f13858n + ')';
    }
}
