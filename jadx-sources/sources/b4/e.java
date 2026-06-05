package b4;

import android.content.Context;
import android.content.Intent;
import f0.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import qi.v;
import u6.p;
import u6.r;
import u6.s;
import u6.t;
import u6.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1532a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1534c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1535d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1536e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1537f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1538g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1539h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1540i;

    public /* synthetic */ e() {
    }

    public static final void a(e eVar, e7.a aVar) throws Exception {
        Object objR;
        r5.g gVar = (r5.g) eVar.f1536e;
        f(aVar);
        u6.a aVar2 = (u6.a) eVar.f1535d;
        s sVar = aVar2.f16667g;
        s sVar2 = s.f16786c;
        if (sVar == sVar2) {
            uk.c.y(aVar, "PRAGMA journal_mode = WAL");
        } else {
            uk.c.y(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f16667g == sVar2) {
            uk.c.y(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            uk.c.y(aVar, "PRAGMA synchronous = FULL");
        }
        e7.c cVarD0 = aVar.d0("PRAGMA user_version");
        try {
            cVarD0.a0();
            int i10 = (int) cVarD0.getLong(0);
            uk.c.q(cVarD0, null);
            int i11 = gVar.f13730a;
            if (i10 != i11) {
                uk.c.y(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i10 == 0) {
                        eVar.j(aVar);
                    } else {
                        eVar.k(aVar, i10, i11);
                    }
                    uk.c.y(aVar, "PRAGMA user_version = " + i11);
                    objR = pi.o.f13011a;
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                if (!(objR instanceof pi.j)) {
                    uk.c.y(aVar, "END TRANSACTION");
                }
                Throwable thA = pi.k.a(objR);
                if (thA != null) {
                    uk.c.y(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            eVar.l(aVar);
        } finally {
        }
    }

    public static void f(e7.a aVar) throws Exception {
        e7.c cVarD0 = aVar.d0("PRAGMA busy_timeout");
        try {
            cVarD0.a0();
            long j = cVarD0.getLong(0);
            uk.c.q(cVarD0, null);
            if (j < 3000) {
                uk.c.y(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                uk.c.q(cVarD0, th2);
                throw th3;
            }
        }
    }

    public void b(f fVar, int i10, ArrayList arrayList, l lVar) {
        o oVar = fVar.f1544d;
        l lVar2 = oVar.f1567c;
        f fVar2 = oVar.f1573i;
        f fVar3 = oVar.f1572h;
        if (lVar2 == null) {
            a4.e eVar = (a4.e) this.f1535d;
            if (oVar == eVar.f107d || oVar == eVar.f109e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f1555a = null;
                lVar.f1556b = new ArrayList();
                lVar.f1555a = oVar;
                arrayList.add(lVar);
            }
            oVar.f1567c = lVar;
            lVar.f1556b.add(oVar);
            ArrayList arrayList2 = fVar3.f1550k;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    b((f) dVar, i10, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f1550k;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    b((f) dVar2, i10, arrayList, lVar);
                }
            }
            if (i10 == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f1557k.f1550k;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        b((f) dVar3, i10, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f1551l;
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList5.get(i15);
                i15++;
                b((f) obj4, i10, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f1551l;
            int size5 = arrayList6.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                b((f) obj5, i10, arrayList, lVar);
            }
            if (i10 == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f1557k.f1551l;
                int size6 = arrayList7.size();
                while (i11 < size6) {
                    Object obj6 = arrayList7.get(i11);
                    i11++;
                    b((f) obj6, i10, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(a4.e r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.c(a4.e):void");
    }

    public void d() {
        a4.e eVar = (a4.e) this.f1535d;
        ArrayList arrayList = (ArrayList) this.f1538g;
        ArrayList arrayList2 = (ArrayList) this.f1537f;
        arrayList2.clear();
        a4.e eVar2 = (a4.e) this.f1536e;
        eVar2.f107d.f();
        eVar2.f109e.f();
        arrayList2.add(eVar2.f107d);
        arrayList2.add(eVar2.f109e);
        ArrayList arrayList3 = eVar2.f141p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a4.d dVar = (a4.d) obj;
            if (dVar instanceof a4.h) {
                i iVar = new i(dVar);
                dVar.f107d.f();
                dVar.f109e.f();
                iVar.f1570f = ((a4.h) dVar).f174t0;
                arrayList2.add(iVar);
            } else {
                if (dVar.u()) {
                    if (dVar.f103b == null) {
                        dVar.f103b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f103b);
                } else {
                    arrayList2.add(dVar.f107d);
                }
                if (dVar.v()) {
                    if (dVar.f105c == null) {
                        dVar.f105c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f105c);
                } else {
                    arrayList2.add(dVar.f109e);
                }
                if (dVar instanceof a4.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            o oVar = (o) obj3;
            if (oVar.f1566b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        g(eVar.f107d, 0, arrayList);
        g(eVar.f109e, 1, arrayList);
        this.f1533b = false;
    }

    public int e(a4.e eVar, int i10) {
        ArrayList arrayList;
        int i11;
        long jMax;
        float f10;
        a4.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f1538g;
        int size = arrayList2.size();
        long j = 0;
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            o oVar = ((l) arrayList2.get(i12)).f1555a;
            if (!(oVar instanceof c) ? !(i10 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f1570f != i10) {
                f fVar = (i10 == 0 ? eVar2.f107d : eVar2.f109e).f1572h;
                f fVar2 = (i10 == 0 ? eVar2.f107d : eVar2.f109e).f1573i;
                f fVar3 = oVar.f1572h;
                f fVar4 = oVar.f1573i;
                boolean zContains = fVar3.f1551l.contains(fVar);
                boolean zContains2 = fVar4.f1551l.contains(fVar2);
                long j4 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j);
                    long jA = l.a(fVar4, j);
                    long j10 = jB - j4;
                    int i13 = fVar4.f1546f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j10 >= (-i13)) {
                        j10 += i13;
                    }
                    long j11 = fVar3.f1546f;
                    long j12 = ((-jA) - j4) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    a4.d dVar = oVar.f1566b;
                    if (i10 == 0) {
                        f10 = dVar.f106c0;
                    } else if (i10 == 1) {
                        f10 = dVar.f108d0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j10 / (1.0f - f10)) + (j12 / f10)) : 0L;
                    jMax = (fVar3.f1546f + ((((long) ((f11 * f10) + 0.5f)) + j4) + ((long) gk.b.e(1.0f, f10, f11, 0.5f)))) - fVar4.f1546f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    jMax = zContains ? Math.max(l.b(fVar3, fVar3.f1546f), fVar3.f1546f + j4) : zContains2 ? Math.max(-l.a(fVar4, fVar4.f1546f), (-fVar4.f1546f) + j4) : (oVar.j() + fVar3.f1546f) - fVar4.f1546f;
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i12++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i11;
            j = 0;
        }
        return (int) jMax2;
    }

    public void g(o oVar, int i10, ArrayList arrayList) {
        f fVar = oVar.f1572h;
        f fVar2 = oVar.f1573i;
        ArrayList arrayList2 = fVar.f1550k;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                b((f) dVar, i10, arrayList, null);
            } else if (dVar instanceof o) {
                b(((o) dVar).f1572h, i10, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f1550k;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                b((f) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof o) {
                b(((o) dVar2).f1573i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            ArrayList arrayList4 = ((m) oVar).f1557k.f1550k;
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    b((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13, a4.d dVar) {
        b bVar = (b) this.f1540i;
        bVar.f1521a = i10;
        bVar.f1522b = i12;
        bVar.f1523c = i11;
        bVar.f1524d = i13;
        ((d4.f) this.f1539h).b(dVar, bVar);
        dVar.J(bVar.f1525e);
        dVar.G(bVar.f1526f);
        dVar.D = bVar.f1528h;
        dVar.D(bVar.f1527g);
    }

    public void i() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = ((a4.e) eVar.f1535d).f141p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            a4.d dVar = (a4.d) arrayList.get(i10);
            if (!dVar.f101a) {
                int[] iArr = dVar.f129o0;
                int i12 = iArr[0];
                int i13 = iArr[1];
                int i14 = dVar.f131q;
                int i15 = dVar.f132r;
                boolean z2 = i12 == 2 || (i12 == 3 && i14 == 1);
                boolean z10 = i13 == 2 || (i13 == 3 && i15 == 1);
                g gVar = dVar.f107d.f1569e;
                boolean z11 = gVar.j;
                g gVar2 = dVar.f109e.f1569e;
                boolean z12 = gVar2.j;
                boolean z13 = z2;
                if (z11 && z12) {
                    eVar.h(1, gVar.f1547g, 1, gVar2.f1547g, dVar);
                    dVar.f101a = true;
                } else if (z11 && z10) {
                    h(1, gVar.f1547g, 2, gVar2.f1547g, dVar);
                    if (i13 == 3) {
                        dVar.f109e.f1569e.f1552m = dVar.k();
                    } else {
                        dVar.f109e.f1569e.d(dVar.k());
                        dVar.f101a = true;
                    }
                } else if (z12 && z13) {
                    h(2, gVar.f1547g, 1, gVar2.f1547g, dVar);
                    if (i12 == 3) {
                        dVar.f107d.f1569e.f1552m = dVar.n();
                    } else {
                        dVar.f107d.f1569e.d(dVar.n());
                        dVar.f101a = true;
                    }
                }
                if (dVar.f101a && (aVar = dVar.f109e.f1558l) != null) {
                    aVar.d(dVar.Z);
                }
                eVar = this;
            }
            i10 = i11;
        }
    }

    public void j(e7.a aVar) throws Exception {
        r5.g gVar = (r5.g) this.f1536e;
        fj.l.f(aVar, "connection");
        e7.c cVarD0 = aVar.d0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (cVarD0.a0()) {
                if (cVarD0.getLong(0) == 0) {
                    z2 = true;
                }
            }
            uk.c.q(cVarD0, null);
            gVar.a(aVar);
            if (!z2) {
                x xVarV = gVar.v(aVar);
                if (!xVarV.f16799a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + xVarV.f16800b).toString());
                }
            }
            uk.c.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            uk.c.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f13731b) + "')");
            gVar.r(aVar);
            Iterator it = ((List) this.f1537f).iterator();
            while (it.hasNext()) {
                ((r) it.next()).getClass();
                if (aVar instanceof h7.a) {
                    fj.l.f(((h7.a) aVar).f7669a, "db");
                }
            }
        } finally {
        }
    }

    public void k(e7.a aVar, int i10, int i11) throws Exception {
        r5.g gVar = (r5.g) this.f1536e;
        fj.l.f(aVar, "connection");
        u6.a aVar2 = (u6.a) this.f1535d;
        List<x6.a> listM = u1.b.m(aVar2.f16664d, i10, i11);
        if (listM != null) {
            gVar.u(aVar);
            for (x6.a aVar3 : listM) {
                aVar3.getClass();
                if (!(aVar instanceof h7.a)) {
                    throw new pi.g("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar3.a(((h7.a) aVar).f7669a);
            }
            x xVarV = gVar.v(aVar);
            if (!xVarV.f16799a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + xVarV.f16800b).toString());
            }
            gVar.t(aVar);
            uk.c.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            uk.c.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f13731b) + "')");
            return;
        }
        if (u1.b.r(aVar2, i10, i11)) {
            throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar2.f16678s) {
            e7.c cVarD0 = aVar.d0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ri.c cVarR = yd.f.r();
                while (cVarD0.a0()) {
                    String strM = cVarD0.M(0);
                    if (!nj.l.A0(strM, "sqlite_") && !strM.equals("android_metadata")) {
                        cVarR.add(new pi.h(strM, Boolean.valueOf(fj.l.b(cVarD0.M(1), "view"))));
                    }
                }
                ri.c cVarM = yd.f.m(cVarR);
                uk.c.q(cVarD0, null);
                ListIterator listIterator = cVarM.listIterator(0);
                while (true) {
                    ri.a aVar4 = (ri.a) listIterator;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    pi.h hVar = (pi.h) aVar4.next();
                    String str = (String) hVar.f13000a;
                    if (((Boolean) hVar.f13001b).booleanValue()) {
                        uk.c.y(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        uk.c.y(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            gVar.c(aVar);
        }
        Iterator it = ((List) this.f1537f).iterator();
        while (it.hasNext()) {
            ((r) it.next()).getClass();
            if (aVar instanceof h7.a) {
                fj.l.f(((h7.a) aVar).f7669a, "db");
            }
        }
        gVar.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(e7.a r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.l(e7.a):void");
    }

    public String toString() {
        switch (this.f1532a) {
            case 1:
                Map map = (Map) this.f1540i;
                Long l10 = (Long) this.f1539h;
                Long l11 = (Long) this.f1538g;
                Long l12 = (Long) this.f1537f;
                Long l13 = (Long) this.f1536e;
                ArrayList arrayList = new ArrayList();
                if (this.f1533b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f1534c) {
                    arrayList.add("isDirectory");
                }
                if (l13 != null) {
                    arrayList.add("byteCount=" + l13);
                }
                if (l12 != null) {
                    arrayList.add("createdAt=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("lastAccessedAt=" + l10);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return qi.l.E0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(u6.a aVar, q0.i iVar, t tVar) {
        s sVar = aVar.f16667g;
        this.f1535d = aVar;
        this.f1536e = new u6.n(-1, "", "");
        List list = aVar.f16665e;
        qi.s sVar2 = qi.s.f13520a;
        this.f1537f = list == null ? sVar2 : list;
        ArrayList arrayListJ0 = qi.l.J0(list == null ? sVar2 : list, new p(new q0.i(this, 9)));
        Context context = aVar.f16661a;
        String str = aVar.f16662b;
        f7.d dVar = aVar.f16663c;
        ag.i iVar2 = aVar.f16664d;
        boolean z2 = aVar.f16666f;
        Executor executor = aVar.f16668h;
        Executor executor2 = aVar.f16669i;
        Intent intent = aVar.j;
        boolean z10 = aVar.f16670k;
        boolean z11 = aVar.f16671l;
        Set set = aVar.f16672m;
        String str2 = aVar.f16673n;
        File file = aVar.f16674o;
        Callable callable = aVar.f16675p;
        List list2 = aVar.f16676q;
        List list3 = aVar.f16677r;
        boolean z12 = aVar.f16678s;
        e7.b bVar = aVar.f16679t;
        ti.h hVar = aVar.f16680u;
        fj.l.f(context, "context");
        fj.l.f(iVar2, "migrationContainer");
        fj.l.f(executor, "queryExecutor");
        fj.l.f(executor2, "transactionExecutor");
        fj.l.f(list2, "typeConverters");
        fj.l.f(list3, "autoMigrationSpecs");
        u6.a aVar2 = new u6.a(context, str, dVar, iVar2, arrayListJ0, z2, sVar, executor, executor2, intent, z10, z11, set, str2, file, callable, list2, list3, z12, bVar, hVar);
        aVar2.f16681v = aVar.f16681v;
        f7.e eVar = (f7.e) iVar.invoke(aVar2);
        this.f1539h = eVar;
        ag.i iVar3 = new ag.i(eVar);
        String str3 = aVar.f16662b;
        this.f1538g = new w6.o(iVar3, str3 == null ? ":memory:" : str3, tVar);
        boolean z13 = sVar == s.f16786c;
        if (eVar != null) {
            eVar.setWriteAheadLoggingEnabled(z13);
        }
    }

    public e(u6.a aVar, r5.g gVar, t tVar) {
        int i10;
        Object eVar;
        s sVar = aVar.f16667g;
        f7.d dVar = aVar.f16663c;
        e7.b bVar = aVar.f16679t;
        String str = aVar.f16662b;
        this.f1535d = aVar;
        this.f1536e = gVar;
        Object obj = aVar.f16665e;
        this.f1537f = obj == null ? qi.s.f13520a : obj;
        if (bVar != null) {
            this.f1539h = null;
            if (bVar.w()) {
                eVar = new w6.o(new qh.c(this, bVar), str == null ? ":memory:" : str, tVar);
            } else if (str == null) {
                eVar = new w6.e(new qh.c(this, bVar));
            } else {
                qh.c cVar = new qh.c(this, bVar);
                int iOrdinal = sVar.ordinal();
                if (iOrdinal == 1) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + sVar + '\'').toString());
                    }
                    i10 = 4;
                }
                int iOrdinal2 = sVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + sVar + '\'').toString());
                }
                eVar = new w6.e(cVar, str, i10);
            }
            this.f1538g = eVar;
        } else if (dVar != null) {
            Context context = aVar.f16661a;
            fj.l.f(context, "context");
            f7.e eVarE = dVar.e(new a1(context, str, new u6.o(this, gVar.f13730a), false));
            this.f1539h = eVarE;
            this.f1538g = new w6.o(new ag.i(eVarE), str == null ? ":memory:" : str, tVar);
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z2 = sVar == s.f16786c;
        f7.e eVar2 = (f7.e) this.f1539h;
        if (eVar2 != null) {
            eVar2.setWriteAheadLoggingEnabled(z2);
        }
    }

    public e(boolean z2, boolean z10, kk.t tVar, Long l10, Long l11, Long l12, Long l13, Map map) {
        fj.l.f(map, "extras");
        this.f1533b = z2;
        this.f1534c = z10;
        this.f1535d = tVar;
        this.f1536e = l10;
        this.f1537f = l11;
        this.f1538g = l12;
        this.f1539h = l13;
        this.f1540i = v.m0(map);
    }

    public /* synthetic */ e(boolean z2, boolean z10, kk.t tVar, Long l10, Long l11, Long l12, Long l13) {
        this(z2, z10, tVar, l10, l11, l12, l13, qi.t.f13521a);
    }
}
