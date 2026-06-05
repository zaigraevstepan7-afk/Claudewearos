package kk;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9726b;

    /* renamed from: a, reason: collision with root package name */
    public final i f9727a;

    static {
        String str = File.separator;
        fj.l.e(str, "separator");
        f9726b = str;
    }

    public t(i iVar) {
        fj.l.f(iVar, "bytes");
        this.f9727a = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = lk.c.a(this);
        i iVar = this.f9727a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < iVar.e() && iVar.r(iA) == 92) {
            iA++;
        }
        int iE = iVar.e();
        int i10 = iA;
        while (iA < iE) {
            if (iVar.r(iA) == 47 || iVar.r(iA) == 92) {
                arrayList.add(iVar.A(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < iVar.e()) {
            arrayList.add(iVar.A(i10, iVar.e()));
        }
        return arrayList;
    }

    public final String b() {
        i iVar = lk.c.f11002a;
        i iVarB = this.f9727a;
        int iX = i.x(iVarB, iVar);
        if (iX == -1) {
            iX = i.x(iVarB, lk.c.f11003b);
        }
        if (iX != -1) {
            iVarB = i.B(iVarB, iX + 1, 0, 2);
        } else if (i() != null && iVarB.e() == 2) {
            iVarB = i.f9700d;
        }
        return iVarB.D();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t tVar = (t) obj;
        fj.l.f(tVar, "other");
        return this.f9727a.compareTo(tVar.f9727a);
    }

    public final t e(t tVar) {
        fj.l.f(tVar, "other");
        i iVar = tVar.f9727a;
        int iA = lk.c.a(this);
        i iVar2 = this.f9727a;
        t tVar2 = iA == -1 ? null : new t(iVar2.A(0, iA));
        int iA2 = lk.c.a(tVar);
        if (!fj.l.b(tVar2, iA2 != -1 ? new t(iVar.A(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + tVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = tVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && fj.l.b(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && iVar2.e() == iVar.e()) {
            return lh.e.f(".");
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(lk.c.f11006e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + tVar).toString());
        }
        if (fj.l.b(iVar, lk.c.f11005d)) {
            return this;
        }
        f fVar = new f();
        i iVarC = lk.c.c(tVar);
        if (iVarC == null && (iVarC = lk.c.c(this)) == null) {
            iVarC = lk.c.f(f9726b);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            fVar.T(lk.c.f11006e);
            fVar.T(iVarC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            fVar.T((i) arrayListA.get(i10));
            fVar.T(iVarC);
            i10++;
        }
        return lk.c.d(fVar, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && fj.l.b(((t) obj).f9727a, this.f9727a);
    }

    public final t f(String str) {
        fj.l.f(str, "child");
        f fVar = new f();
        fVar.h0(str);
        return lk.c.b(this, lk.c.d(fVar, false), false);
    }

    public final int hashCode() {
        return this.f9727a.hashCode();
    }

    public final Character i() {
        i iVar = lk.c.f11002a;
        i iVar2 = this.f9727a;
        if (i.o(iVar2, iVar) != -1 || iVar2.e() < 2 || iVar2.r(1) != 58) {
            return null;
        }
        char cR = (char) iVar2.r(0);
        if (('a' > cR || cR >= '{') && ('A' > cR || cR >= '[')) {
            return null;
        }
        return Character.valueOf(cR);
    }

    public final File toFile() {
        return new File(this.f9727a.D());
    }

    public final String toString() {
        return this.f9727a.D();
    }
}
