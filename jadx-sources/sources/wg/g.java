package wg;

import java.util.HashMap;
import zg.k;
import zg.r;
import zg.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final g f19299f = new g();

    /* renamed from: a, reason: collision with root package name */
    public final r f19300a = null;

    /* renamed from: b, reason: collision with root package name */
    public final zg.c f19301b = null;

    /* renamed from: c, reason: collision with root package name */
    public final r f19302c = null;

    /* renamed from: d, reason: collision with root package name */
    public final zg.c f19303d = null;

    /* renamed from: e, reason: collision with root package name */
    public final k f19304e = s.f20617a;

    public final HashMap a() {
        HashMap map = new HashMap();
        if (b()) {
            map.put("sp", this.f19300a.getValue());
            zg.c cVar = this.f19301b;
            if (cVar != null) {
                map.put("sn", cVar.f20592a);
            }
        }
        r rVar = this.f19302c;
        if (rVar != null) {
            map.put("ep", rVar.getValue());
            zg.c cVar2 = this.f19303d;
            if (cVar2 != null) {
                map.put("en", cVar2.f20592a);
            }
        }
        if (!this.f19304e.equals(s.f20617a)) {
            map.put("i", this.f19304e.a());
        }
        return map;
    }

    public final boolean b() {
        return this.f19300a != null;
    }

    public final boolean c() {
        return b();
    }

    public final boolean d() {
        return !b() && this.f19302c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f19304e.equals(gVar.f19304e)) {
            return false;
        }
        zg.c cVar = this.f19303d;
        if (cVar == null ? gVar.f19303d != null : !cVar.equals(gVar.f19303d)) {
            return false;
        }
        r rVar = this.f19302c;
        if (rVar == null ? gVar.f19302c != null : !rVar.equals(gVar.f19302c)) {
            return false;
        }
        zg.c cVar2 = this.f19301b;
        if (cVar2 == null ? gVar.f19301b != null : !cVar2.equals(gVar.f19301b)) {
            return false;
        }
        r rVar2 = this.f19300a;
        if (rVar2 == null ? gVar.f19300a == null : rVar2.equals(gVar.f19300a)) {
            return c() == gVar.c();
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((0 * 31) + (c() ? 1231 : 1237)) * 31;
        r rVar = this.f19300a;
        int iHashCode = (i10 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        zg.c cVar = this.f19301b;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.f20592a.hashCode() : 0)) * 31;
        r rVar2 = this.f19302c;
        int iHashCode3 = (iHashCode2 + (rVar2 != null ? rVar2.hashCode() : 0)) * 31;
        zg.c cVar2 = this.f19303d;
        return ((iHashCode3 + (cVar2 != null ? cVar2.f20592a.hashCode() : 0)) * 31) + this.f19304e.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
