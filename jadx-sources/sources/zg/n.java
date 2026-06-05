package zg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f20609a;

    /* renamed from: b, reason: collision with root package name */
    public String f20610b;

    public n(r rVar) {
        this.f20609a = rVar;
    }

    public abstract int b(n nVar);

    @Override // zg.r
    public final r c() {
        return this.f20609a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        if (rVar.isEmpty()) {
            return 1;
        }
        if (rVar instanceof f) {
            return -1;
        }
        ug.l.b("Node is not leaf node!", rVar.n());
        if ((this instanceof o) && (rVar instanceof i)) {
            return Double.valueOf(((o) this).f20611c).compareTo(((i) rVar).f20602c);
        }
        if ((this instanceof i) && (rVar instanceof o)) {
            return Double.valueOf(((o) rVar).f20611c).compareTo(((i) this).f20602c) * (-1);
        }
        n nVar = (n) rVar;
        int iE = e();
        int iE2 = nVar.e();
        if (y3.e.a(iE, iE2)) {
            return b(nVar);
        }
        if (iE == 0 || iE2 == 0) {
            throw null;
        }
        return iE - iE2;
    }

    @Override // zg.r
    public final r d(c cVar, r rVar) {
        return cVar.equals(c.f20591d) ? m(rVar) : rVar.isEmpty() ? this : j.f20603e.d(cVar, rVar).m(this.f20609a);
    }

    public abstract int e();

    @Override // zg.r
    public final boolean h(c cVar) {
        return false;
    }

    public final String i(int i10) {
        int iB = y3.e.b(i10);
        if (iB != 0 && iB != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(y8.f.d(i10)));
        }
        r rVar = this.f20609a;
        if (rVar.isEmpty()) {
            return "";
        }
        return "priority:" + rVar.g(i10) + ":";
    }

    @Override // zg.r
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // zg.r
    public final int j() {
        return 0;
    }

    @Override // zg.r
    public final r k(rg.h hVar, r rVar) {
        c cVarZ = hVar.z();
        if (cVarZ == null) {
            return rVar;
        }
        boolean zIsEmpty = rVar.isEmpty();
        c cVar = c.f20591d;
        if (zIsEmpty && !cVarZ.equals(cVar)) {
            return this;
        }
        boolean zEquals = hVar.z().equals(cVar);
        boolean z2 = true;
        if (zEquals && hVar.size() != 1) {
            z2 = false;
        }
        ug.l.c(z2);
        return d(cVarZ, j.f20603e.k(hVar.C(), rVar));
    }

    @Override // zg.r
    public final r l(rg.h hVar) {
        return hVar.isEmpty() ? this : hVar.z().equals(c.f20591d) ? this.f20609a : j.f20603e;
    }

    @Override // zg.r
    public final boolean n() {
        return true;
    }

    @Override // zg.r
    public final c q(c cVar) {
        return null;
    }

    @Override // zg.r
    public final Object s(boolean z2) {
        if (z2) {
            r rVar = this.f20609a;
            if (!rVar.isEmpty()) {
                HashMap map = new HashMap();
                map.put(".value", getValue());
                map.put(".priority", rVar.getValue());
                return map;
            }
        }
        return getValue();
    }

    @Override // zg.r
    public final r t(c cVar) {
        return cVar.equals(c.f20591d) ? this.f20609a : j.f20603e;
    }

    public final String toString() {
        String string = s(true).toString();
        if (string.length() <= 100) {
            return string;
        }
        return string.substring(0, 100) + "...";
    }

    @Override // zg.r
    public final Iterator u() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // zg.r
    public final String v() {
        if (this.f20610b == null) {
            this.f20610b = ug.l.e(g(1));
        }
        return this.f20610b;
    }
}
