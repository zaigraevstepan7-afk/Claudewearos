package n1;

import fj.l;
import java.util.Iterator;
import k1.e;
import m1.m;
import qi.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends h implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f11856d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11857a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11858b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.c f11859c;

    static {
        o1.b bVar = o1.b.f12370a;
        f11856d = new b(bVar, bVar, m1.c.f11225c);
    }

    public b(Object obj, Object obj2, m1.c cVar) {
        this.f11857a = obj;
        this.f11858b = obj2;
        this.f11859c = cVar;
    }

    @Override // qi.a
    public final int b() {
        m1.c cVar = this.f11859c;
        cVar.getClass();
        return cVar.f11227b;
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11859c.containsKey(obj);
    }

    public final b e(Object obj) {
        m1.c cVar = this.f11859c;
        if (cVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, cVar.b(obj, new a()));
        }
        Object obj2 = this.f11858b;
        Object obj3 = cVar.get(obj2);
        l.c(obj3);
        return new b(this.f11857a, obj, cVar.b(obj2, new a(((a) obj3).f11854a, obj)).b(obj, new a(obj2)));
    }

    public final b i(Object obj) {
        m1.c cVarB = this.f11859c;
        a aVar = (a) cVarB.get(obj);
        if (aVar == null) {
            return this;
        }
        Object obj2 = aVar.f11854a;
        Object obj3 = aVar.f11855b;
        m mVar = cVarB.f11226a;
        m mVarV = mVar.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (mVar != mVarV) {
            cVarB = mVarV == null ? m1.c.f11225c : new m1.c(mVarV, cVarB.f11227b - 1);
        }
        o1.b bVar = o1.b.f12370a;
        if (obj2 != bVar) {
            Object obj4 = cVarB.get(obj2);
            l.c(obj4);
            cVarB = cVarB.b(obj2, new a(((a) obj4).f11854a, obj3));
        }
        if (obj3 != bVar) {
            Object obj5 = cVarB.get(obj3);
            l.c(obj5);
            cVarB = cVarB.b(obj3, new a(obj2, ((a) obj5).f11855b));
        }
        Object obj6 = obj2 != bVar ? this.f11857a : obj3;
        if (obj3 != bVar) {
            obj2 = this.f11858b;
        }
        return new b(obj6, obj2, cVarB);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mj.e(this.f11857a, this.f11859c);
    }
}
