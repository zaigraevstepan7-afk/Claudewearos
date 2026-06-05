package zg;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final j f20603e = new j();

    @Override // zg.f, java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        return rVar.isEmpty() ? 0 : -1;
    }

    @Override // zg.f, zg.r
    public final r d(c cVar, r rVar) {
        if (!rVar.isEmpty()) {
            c cVar2 = c.f20591d;
            if (!cVar.equals(cVar2)) {
                og.c bVar = new og.b(f.f20596d);
                boolean zEquals = cVar.equals(cVar2);
                j jVar = f20603e;
                if (!zEquals) {
                    if (bVar.b(cVar)) {
                        bVar = bVar.B(cVar);
                    }
                    if (!rVar.isEmpty()) {
                        bVar = bVar.A(rVar, cVar);
                    }
                    if (!bVar.isEmpty()) {
                        return new f(bVar, jVar);
                    }
                } else if (!bVar.isEmpty()) {
                    return new f(bVar, rVar);
                }
                return jVar;
            }
        }
        return this;
    }

    @Override // zg.f
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.isEmpty() && equals(rVar.c());
    }

    @Override // zg.f, zg.r
    public final String g(int i10) {
        return "";
    }

    @Override // zg.f, zg.r
    public final Object getValue() {
        return null;
    }

    @Override // zg.f, zg.r
    public final boolean h(c cVar) {
        return false;
    }

    @Override // zg.f
    public final int hashCode() {
        return 0;
    }

    @Override // zg.f, zg.r
    public final boolean isEmpty() {
        return true;
    }

    @Override // zg.f, java.lang.Iterable
    public final Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // zg.f, zg.r
    public final int j() {
        return 0;
    }

    @Override // zg.f, zg.r
    public final r k(rg.h hVar, r rVar) {
        return hVar.isEmpty() ? rVar : d(hVar.z(), k(hVar.C(), rVar));
    }

    @Override // zg.f, zg.r
    public final c q(c cVar) {
        return null;
    }

    @Override // zg.f, zg.r
    public final Object s(boolean z2) {
        return null;
    }

    @Override // zg.f
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // zg.f, zg.r
    public final Iterator u() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // zg.f, zg.r
    public final String v() {
        return "";
    }

    @Override // zg.f, zg.r
    public final r c() {
        return this;
    }

    @Override // zg.f, zg.r
    public final r l(rg.h hVar) {
        return this;
    }

    @Override // zg.f, zg.r
    public final r m(r rVar) {
        return this;
    }

    @Override // zg.f, zg.r
    public final r t(c cVar) {
        return this;
    }
}
