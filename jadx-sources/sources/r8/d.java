package r8;

import android.content.Context;
import fj.y;
import java.util.Map;
import qi.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13831a;

    /* renamed from: b, reason: collision with root package name */
    public e f13832b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13833c;

    /* renamed from: d, reason: collision with root package name */
    public t8.a f13834d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f13835e;

    /* renamed from: f, reason: collision with root package name */
    public ti.h f13836f;

    /* renamed from: g, reason: collision with root package name */
    public ti.h f13837g;

    /* renamed from: h, reason: collision with root package name */
    public ti.h f13838h;

    /* renamed from: i, reason: collision with root package name */
    public final ej.c f13839i;
    public final ej.c j;

    /* renamed from: k, reason: collision with root package name */
    public final ej.c f13840k;

    /* renamed from: l, reason: collision with root package name */
    public s8.i f13841l;

    /* renamed from: m, reason: collision with root package name */
    public s8.g f13842m;

    /* renamed from: n, reason: collision with root package name */
    public s8.d f13843n;

    /* renamed from: o, reason: collision with root package name */
    public Object f13844o;

    public d(Context context) {
        this.f13831a = context;
        this.f13832b = e.f13845o;
        this.f13833c = null;
        this.f13834d = null;
        this.f13835e = t.f13521a;
        this.f13836f = null;
        this.f13837g = null;
        this.f13838h = null;
        v8.l lVar = v8.l.f17897a;
        this.f13839i = lVar;
        this.j = lVar;
        this.f13840k = lVar;
        this.f13841l = null;
        this.f13842m = null;
        this.f13843n = null;
        this.f13844o = h8.i.f7702b;
    }

    public final g a() {
        Map mapP;
        h8.i iVar;
        Object obj = this.f13833c;
        if (obj == null) {
            obj = l.f13900a;
        }
        Object obj2 = obj;
        t8.a aVar = this.f13834d;
        Boolean bool = Boolean.FALSE;
        Map map = this.f13835e;
        if (fj.l.b(map, bool)) {
            fj.l.d(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapP = u0.c.p(y.b(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapP = map;
        }
        Map map2 = mapP;
        fj.l.d(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        e eVar = this.f13832b;
        kk.k kVar = eVar.f13846a;
        b bVar = eVar.f13850e;
        b bVar2 = eVar.f13851f;
        b bVar3 = eVar.f13852g;
        ti.h hVar = this.f13836f;
        if (hVar == null) {
            hVar = eVar.f13847b;
        }
        ti.h hVar2 = hVar;
        ti.h hVar3 = this.f13837g;
        if (hVar3 == null) {
            hVar3 = eVar.f13848c;
        }
        ti.h hVar4 = hVar3;
        ti.h hVar5 = this.f13838h;
        if (hVar5 == null) {
            hVar5 = eVar.f13849d;
        }
        ti.h hVar6 = hVar5;
        ej.c cVar = this.f13839i;
        if (cVar == null) {
            cVar = eVar.f13853h;
        }
        ej.c cVar2 = cVar;
        ej.c cVar3 = this.j;
        if (cVar3 == null) {
            cVar3 = eVar.f13854i;
        }
        ej.c cVar4 = cVar3;
        ej.c cVar5 = this.f13840k;
        if (cVar5 == null) {
            cVar5 = eVar.j;
        }
        ej.c cVar6 = cVar5;
        s8.i iVar2 = this.f13841l;
        if (iVar2 == null) {
            iVar2 = eVar.f13855k;
        }
        s8.i iVar3 = iVar2;
        s8.g gVar = this.f13842m;
        if (gVar == null) {
            gVar = eVar.f13856l;
        }
        s8.g gVar2 = gVar;
        s8.d dVar = this.f13843n;
        if (dVar == null) {
            dVar = eVar.f13857m;
        }
        s8.d dVar2 = dVar;
        Object obj3 = this.f13844o;
        if (obj3 instanceof h8.h) {
            iVar = new h8.i(u0.c.p(((h8.h) obj3).f7701a));
        } else {
            if (!(obj3 instanceof h8.i)) {
                throw new AssertionError();
            }
            iVar = (h8.i) obj3;
        }
        return new g(this.f13831a, obj2, aVar, map2, kVar, hVar2, hVar4, hVar6, bVar, bVar2, bVar3, cVar2, cVar4, cVar6, iVar3, gVar2, dVar2, iVar, new f(this.f13836f, this.f13837g, this.f13838h, this.f13839i, this.j, this.f13840k, this.f13841l, this.f13842m, this.f13843n), this.f13832b);
    }

    public d(g gVar, Context context) {
        this.f13831a = context;
        this.f13832b = gVar.f13886t;
        this.f13833c = gVar.f13869b;
        this.f13834d = gVar.f13870c;
        this.f13835e = gVar.f13871d;
        f fVar = gVar.f13885s;
        this.f13836f = fVar.f13859a;
        this.f13837g = fVar.f13860b;
        this.f13838h = fVar.f13861c;
        this.f13839i = fVar.f13862d;
        this.j = fVar.f13863e;
        this.f13840k = fVar.f13864f;
        this.f13841l = fVar.f13865g;
        this.f13842m = fVar.f13866h;
        this.f13843n = fVar.f13867i;
        this.f13844o = gVar.f13884r;
    }
}
