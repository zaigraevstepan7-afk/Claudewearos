package zg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class f implements r {

    /* renamed from: d, reason: collision with root package name */
    public static final ea.e f20596d = new ea.e(19);

    /* renamed from: a, reason: collision with root package name */
    public final og.c f20597a;

    /* renamed from: b, reason: collision with root package name */
    public final r f20598b;

    /* renamed from: c, reason: collision with root package name */
    public String f20599c;

    public f() {
        this.f20599c = null;
        this.f20597a = new og.b(f20596d);
        this.f20598b = j.f20603e;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(r rVar) {
        if (isEmpty()) {
            return rVar.isEmpty() ? 0 : -1;
        }
        if (rVar.n() || rVar.isEmpty()) {
            return 1;
        }
        return rVar == r.f20616y ? -1 : 0;
    }

    @Override // zg.r
    public r c() {
        return this.f20598b;
    }

    @Override // zg.r
    public r d(c cVar, r rVar) {
        if (cVar.equals(c.f20591d)) {
            return m(rVar);
        }
        og.c cVarA = this.f20597a;
        if (cVarA.b(cVar)) {
            cVarA = cVarA.B(cVar);
        }
        if (!rVar.isEmpty()) {
            cVarA = cVarA.A(rVar, cVar);
        }
        return cVarA.isEmpty() ? j.f20603e : new f(cVarA, this.f20598b);
    }

    public final void e(e eVar, boolean z2) {
        og.c cVar = this.f20597a;
        if (!z2 || c().isEmpty()) {
            cVar.z(eVar);
        } else {
            cVar.z(new d(this, eVar));
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        og.c cVar = fVar.f20597a;
        if (!c().equals(fVar.c())) {
            return false;
        }
        og.c cVar2 = this.f20597a;
        if (cVar2.size() != cVar.size()) {
            return false;
        }
        Iterator it = cVar2.iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((c) entry.getKey()).equals(entry2.getKey()) || !((r) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // zg.r
    public String g(int i10) {
        boolean z2;
        if (i10 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb2 = new StringBuilder();
        r rVar = this.f20598b;
        if (!rVar.isEmpty()) {
            sb2.append("priority:");
            sb2.append(rVar.g(1));
            sb2.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        int i11 = 0;
        loop0: while (true) {
            z2 = false;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                arrayList.add(pVar);
                if (z2 || !pVar.f20615b.c().isEmpty()) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Collections.sort(arrayList, s.f20617a);
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            p pVar2 = (p) obj;
            String strV = pVar2.f20615b.v();
            if (!strV.equals("")) {
                sb2.append(":");
                sb2.append(pVar2.f20614a.f20592a);
                sb2.append(":");
                sb2.append(strV);
            }
        }
        return sb2.toString();
    }

    @Override // zg.r
    public Object getValue() {
        return s(false);
    }

    @Override // zg.r
    public boolean h(c cVar) {
        return !t(cVar).isEmpty();
    }

    public int hashCode() {
        Iterator it = iterator();
        int iC = 0;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            iC = m1.c(iC * 31, 17, pVar.f20614a.f20592a) + pVar.f20615b.hashCode();
        }
        return iC;
    }

    public final void i(int i10, StringBuilder sb2) {
        int i11;
        og.c cVar = this.f20597a;
        boolean zIsEmpty = cVar.isEmpty();
        r rVar = this.f20598b;
        if (zIsEmpty && rVar.isEmpty()) {
            sb2.append("{ }");
            return;
        }
        sb2.append("{\n");
        Iterator it = cVar.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i12 = i10 + 2;
            while (i11 < i12) {
                sb2.append(" ");
                i11++;
            }
            sb2.append(((c) entry.getKey()).f20592a);
            sb2.append("=");
            if (entry.getValue() instanceof f) {
                ((f) entry.getValue()).i(i12, sb2);
            } else {
                sb2.append(((r) entry.getValue()).toString());
            }
            sb2.append("\n");
        }
        if (!rVar.isEmpty()) {
            int i13 = i10 + 2;
            for (int i14 = 0; i14 < i13; i14++) {
                sb2.append(" ");
            }
            sb2.append(".priority=");
            sb2.append(rVar.toString());
            sb2.append("\n");
        }
        while (i11 < i10) {
            sb2.append(" ");
            i11++;
        }
        sb2.append("}");
    }

    @Override // zg.r
    public boolean isEmpty() {
        return this.f20597a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new og.e(this.f20597a.iterator(), 1);
    }

    @Override // zg.r
    public int j() {
        return this.f20597a.size();
    }

    @Override // zg.r
    public r k(rg.h hVar, r rVar) {
        c cVarZ = hVar.z();
        if (cVarZ == null) {
            return rVar;
        }
        if (!cVarZ.equals(c.f20591d)) {
            return d(cVarZ, t(cVarZ).k(hVar.C(), rVar));
        }
        ug.l.c(u0.l.j(rVar));
        return m(rVar);
    }

    @Override // zg.r
    public r l(rg.h hVar) {
        c cVarZ = hVar.z();
        return cVarZ == null ? this : t(cVarZ).l(hVar.C());
    }

    @Override // zg.r
    public r m(r rVar) {
        og.c cVar = this.f20597a;
        return cVar.isEmpty() ? j.f20603e : new f(cVar, rVar);
    }

    @Override // zg.r
    public boolean n() {
        return false;
    }

    @Override // zg.r
    public c q(c cVar) {
        return (c) this.f20597a.y(cVar);
    }

    @Override // zg.r
    public Object s(boolean z2) {
        Integer numG;
        if (isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        boolean z10 = true;
        int i10 = 0;
        int iIntValue = 0;
        for (Map.Entry entry : this.f20597a) {
            String str = ((c) entry.getKey()).f20592a;
            map.put(str, ((r) entry.getValue()).s(z2));
            i10++;
            if (z10) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (numG = ug.l.g(str)) == null || numG.intValue() < 0) {
                    z10 = false;
                } else if (numG.intValue() > iIntValue) {
                    iIntValue = numG.intValue();
                }
            }
        }
        if (z2 || !z10 || iIntValue >= i10 * 2) {
            if (z2) {
                r rVar = this.f20598b;
                if (!rVar.isEmpty()) {
                    map.put(".priority", rVar.getValue());
                }
            }
            return map;
        }
        ArrayList arrayList = new ArrayList(iIntValue + 1);
        for (int i11 = 0; i11 <= iIntValue; i11++) {
            arrayList.add(map.get("" + i11));
        }
        return arrayList;
    }

    @Override // zg.r
    public r t(c cVar) {
        if (cVar.equals(c.f20591d)) {
            r rVar = this.f20598b;
            if (!rVar.isEmpty()) {
                return rVar;
            }
        }
        og.c cVar2 = this.f20597a;
        return cVar2.b(cVar) ? (r) cVar2.e(cVar) : j.f20603e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        i(0, sb2);
        return sb2.toString();
    }

    @Override // zg.r
    public Iterator u() {
        return new og.e(this.f20597a.u(), 1);
    }

    @Override // zg.r
    public String v() {
        if (this.f20599c == null) {
            String strG = g(1);
            this.f20599c = strG.isEmpty() ? "" : ug.l.e(strG);
        }
        return this.f20599c;
    }

    public f(og.c cVar, r rVar) {
        this.f20599c = null;
        if (cVar.isEmpty() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f20598b = rVar;
        this.f20597a = cVar;
    }
}
