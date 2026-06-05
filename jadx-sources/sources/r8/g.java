package r8;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13868a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13869b;

    /* renamed from: c, reason: collision with root package name */
    public final t8.a f13870c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f13871d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.k f13872e;

    /* renamed from: f, reason: collision with root package name */
    public final ti.h f13873f;

    /* renamed from: g, reason: collision with root package name */
    public final ti.h f13874g;

    /* renamed from: h, reason: collision with root package name */
    public final ti.h f13875h;

    /* renamed from: i, reason: collision with root package name */
    public final b f13876i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f13877k;

    /* renamed from: l, reason: collision with root package name */
    public final ej.c f13878l;

    /* renamed from: m, reason: collision with root package name */
    public final ej.c f13879m;

    /* renamed from: n, reason: collision with root package name */
    public final ej.c f13880n;

    /* renamed from: o, reason: collision with root package name */
    public final s8.i f13881o;

    /* renamed from: p, reason: collision with root package name */
    public final s8.g f13882p;

    /* renamed from: q, reason: collision with root package name */
    public final s8.d f13883q;

    /* renamed from: r, reason: collision with root package name */
    public final h8.i f13884r;

    /* renamed from: s, reason: collision with root package name */
    public final f f13885s;

    /* renamed from: t, reason: collision with root package name */
    public final e f13886t;

    public g(Context context, Object obj, t8.a aVar, Map map, kk.k kVar, ti.h hVar, ti.h hVar2, ti.h hVar3, b bVar, b bVar2, b bVar3, ej.c cVar, ej.c cVar2, ej.c cVar3, s8.i iVar, s8.g gVar, s8.d dVar, h8.i iVar2, f fVar, e eVar) {
        this.f13868a = context;
        this.f13869b = obj;
        this.f13870c = aVar;
        this.f13871d = map;
        this.f13872e = kVar;
        this.f13873f = hVar;
        this.f13874g = hVar2;
        this.f13875h = hVar3;
        this.f13876i = bVar;
        this.j = bVar2;
        this.f13877k = bVar3;
        this.f13878l = cVar;
        this.f13879m = cVar2;
        this.f13880n = cVar3;
        this.f13881o = iVar;
        this.f13882p = gVar;
        this.f13883q = dVar;
        this.f13884r = iVar2;
        this.f13885s = fVar;
        this.f13886t = eVar;
    }

    public static d a(g gVar) {
        Context context = gVar.f13868a;
        gVar.getClass();
        return new d(gVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return fj.l.b(this.f13868a, gVar.f13868a) && this.f13869b.equals(gVar.f13869b) && fj.l.b(this.f13870c, gVar.f13870c) && this.f13871d.equals(gVar.f13871d) && fj.l.b(this.f13872e, gVar.f13872e) && fj.l.b(this.f13873f, gVar.f13873f) && fj.l.b(this.f13874g, gVar.f13874g) && fj.l.b(this.f13875h, gVar.f13875h) && this.f13876i == gVar.f13876i && this.j == gVar.j && this.f13877k == gVar.f13877k && fj.l.b(this.f13878l, gVar.f13878l) && fj.l.b(this.f13879m, gVar.f13879m) && fj.l.b(this.f13880n, gVar.f13880n) && fj.l.b(this.f13881o, gVar.f13881o) && this.f13882p == gVar.f13882p && this.f13883q == gVar.f13883q && this.f13884r.equals(gVar.f13884r) && this.f13885s.equals(gVar.f13885s) && fj.l.b(this.f13886t, gVar.f13886t);
    }

    public final int hashCode() {
        int iHashCode = (this.f13869b.hashCode() + (this.f13868a.hashCode() * 31)) * 31;
        t8.a aVar = this.f13870c;
        return this.f13886t.hashCode() + ((this.f13885s.hashCode() + ((this.f13884r.f7703a.hashCode() + ((this.f13883q.hashCode() + ((this.f13882p.hashCode() + ((this.f13881o.hashCode() + ((this.f13880n.hashCode() + ((this.f13879m.hashCode() + ((this.f13878l.hashCode() + ((this.f13877k.hashCode() + ((this.j.hashCode() + ((this.f13876i.hashCode() + ((this.f13875h.hashCode() + ((this.f13874g.hashCode() + ((this.f13873f.hashCode() + ((this.f13872e.hashCode() + ((this.f13871d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f13868a + ", data=" + this.f13869b + ", target=" + this.f13870c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.f13871d + ", diskCacheKey=null, fileSystem=" + this.f13872e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f13873f + ", fetcherCoroutineContext=" + this.f13874g + ", decoderCoroutineContext=" + this.f13875h + ", memoryCachePolicy=" + this.f13876i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.f13877k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f13878l + ", errorFactory=" + this.f13879m + ", fallbackFactory=" + this.f13880n + ", sizeResolver=" + this.f13881o + ", scale=" + this.f13882p + ", precision=" + this.f13883q + ", extras=" + this.f13884r + ", defined=" + this.f13885s + ", defaults=" + this.f13886t + ')';
    }
}
