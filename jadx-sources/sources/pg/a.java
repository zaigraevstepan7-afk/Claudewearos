package pg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rg.a0;
import rg.w;
import rg.z;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static long f12881f;

    /* renamed from: a, reason: collision with root package name */
    public int f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12883b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12885d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12886e;

    public a(nc.p pVar, p2.h hVar, String str, q qVar, String str2, String str3) {
        long j = f12881f;
        f12881f = 1 + j;
        this.f12883b = hVar;
        this.f12885d = qVar;
        this.f12886e = new p1.l((k4.d) pVar.f12164d, "Connection", m1.g(j, "conn_"), 22);
        this.f12882a = 1;
        this.f12884c = new v(pVar, hVar, str, str3, this, str2);
    }

    public void a(int i10) {
        String str;
        p1.l lVar = (p1.l) this.f12886e;
        if (this.f12882a != 3) {
            boolean z2 = false;
            if (lVar.A()) {
                lVar.l(null, "closing realtime connection", new Object[0]);
            }
            this.f12882a = 3;
            v vVar = (v) this.f12884c;
            if (vVar != null) {
                vVar.c();
                this.f12884c = null;
            }
            q qVar = (q) this.f12885d;
            p1.l lVar2 = qVar.f12948y;
            if (lVar2.A()) {
                if (i10 == 1) {
                    str = "SERVER_RESET";
                } else {
                    if (i10 != 2) {
                        throw null;
                    }
                    str = "OTHER";
                }
                lVar2.l(null, "Got on disconnect due to ".concat(str), new Object[0]);
            }
            qVar.f12932h = l.f12906a;
            qVar.f12931g = null;
            qVar.f12935l.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = qVar.f12937n.entrySet().iterator();
            while (it.hasNext()) {
                o oVar = (o) ((Map.Entry) it.next()).getValue();
                if (oVar.f12920b.containsKey("h") && oVar.f12922d) {
                    arrayList.add(oVar);
                    it.remove();
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((o) obj).f12921c.b("disconnected", null);
            }
            if (qVar.f12928d.size() == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = qVar.f12930f;
                long j4 = jCurrentTimeMillis - j;
                if (j > 0 && j4 > 30000) {
                    z2 = true;
                }
                if (i10 == 1 || z2) {
                    qg.a aVar = qVar.f12949z;
                    aVar.j = true;
                    aVar.f13488i = 0L;
                }
                qVar.o();
            }
            qVar.f12930f = 0L;
            rg.k kVar = qVar.f12925a;
            kVar.getClass();
            kVar.l(rg.c.f14387d, Boolean.FALSE);
            cg.b.C(kVar.f14432b);
            ArrayList arrayList2 = new ArrayList();
            p9.a aVar2 = kVar.f14435e;
            rg.h hVar = rg.h.f14414d;
            aVar2.getClass();
            kVar.f14435e = new p9.a(11);
            kVar.g(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12886e
            p1.l r0 = (p1.l) r0
            boolean r1 = r0.A()
            if (r1 == 0) goto L13
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "Connection shutdown command received. Shutting down..."
            r0.l(r2, r3, r1)
        L13:
            java.lang.Object r0 = r7.f12885d
            pg.q r0 = (pg.q) r0
            p1.l r1 = r0.f12948y
            java.lang.String r2 = "Invalid appcheck token"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L49
            int r2 = r0.D
            long r3 = (long) r2
            r5 = 3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L49
            int r2 = r2 + 1
            r0.D = r2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "Detected invalid AppCheck token. Reconnecting ("
            r8.<init>(r2)
            int r0 = r0.D
            long r2 = (long) r0
            long r5 = r5 - r2
            r8.append(r5)
            java.lang.String r0 = " attempts remaining)"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r1.J(r8)
            goto L57
        L49:
            java.lang.String r2 = "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: "
            java.lang.String r8 = r2.concat(r8)
            r1.J(r8)
            java.lang.String r8 = "server_kill"
            r0.c(r8)
        L57:
            r8 = 2
            r7.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.a.b(java.lang.String):void");
    }

    public void c(Map map) {
        p1.l lVar = (p1.l) this.f12886e;
        if (lVar.A()) {
            lVar.l(null, "Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (lVar.A()) {
                    lVar.l(null, "Got invalid control message: " + map.toString(), new Object[0]);
                }
                a(2);
                return;
            }
            if (str.equals("s")) {
                b((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                g((String) map.get("d"));
            } else if (str.equals("h")) {
                e((Map) map.get("d"));
            } else if (lVar.A()) {
                lVar.l(null, "Ignoring unknown control message: ".concat(str), new Object[0]);
            }
        } catch (ClassCastException e10) {
            if (lVar.A()) {
                lVar.l(null, "Failed to parse control message: " + e10.toString(), new Object[0]);
            }
            a(2);
        }
    }

    public void d(Map map) {
        List listF;
        wg.i iVarD;
        List listF2;
        p1.l lVar = (p1.l) this.f12886e;
        ArrayList arrayList = null;
        int i10 = 0;
        if (lVar.A()) {
            lVar.l(null, "received data message: " + map.toString(), new Object[0]);
        }
        q qVar = (q) this.f12885d;
        p1.l lVar2 = qVar.f12948y;
        if (map.containsKey("r")) {
            k kVar = (k) qVar.f12935l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (kVar != null) {
                kVar.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        if (!map.containsKey("a")) {
            if (lVar2.A()) {
                lVar2.l(null, "Ignoring unknown message: " + map, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        rg.k kVar2 = qVar.f12925a;
        if (lVar2.A()) {
            lVar2.l(null, "handleServerMessage: " + str + " " + map2, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean zEquals = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long lValueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (zEquals && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (lVar2.A()) {
                    lVar2.l(null, m1.i("ignoring empty merge for path ", str2), new Object[0]);
                    return;
                }
                return;
            }
            ArrayList arrayListO = hj.a.O(str2);
            kVar2.getClass();
            rg.h hVar = new rg.h(arrayListO);
            p1.l lVar3 = kVar2.f14439i;
            if (lVar3.A()) {
                lVar3.l(null, "onDataUpdate: " + hVar, new Object[0]);
            }
            if (kVar2.f14440k.A()) {
                lVar3.l(null, "onDataUpdate: " + hVar + " " + obj, new Object[0]);
            }
            try {
                if (lValueOf != null) {
                    a0 a0Var = new a0(lValueOf.longValue());
                    if (zEquals) {
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            map3.put(new rg.h((String) entry.getKey()), u0.c.b(entry.getValue(), zg.j.f20603e));
                        }
                        z zVar = kVar2.f14443n;
                        listF = (List) zVar.f14496g.c(new rg.p(zVar, a0Var, hVar, map3, 0));
                    } else {
                        zg.r rVarB = u0.c.b(obj, zg.j.f20603e);
                        z zVar2 = kVar2.f14443n;
                        listF = (List) zVar2.f14496g.c(new rg.p(zVar2, a0Var, hVar, rVarB, 1));
                    }
                } else if (zEquals) {
                    HashMap map4 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        map4.put(new rg.h((String) entry2.getKey()), u0.c.b(entry2.getValue(), zg.j.f20603e));
                    }
                    z zVar3 = kVar2.f14443n;
                    listF = (List) zVar3.f14496g.c(new w(zVar3, map4, hVar));
                } else {
                    listF = kVar2.f14443n.f(hVar, u0.c.b(obj, zg.j.f20603e));
                }
                if (listF.size() > 0) {
                    kVar2.i(hVar);
                }
                kVar2.g(listF);
                return;
            } catch (mg.c e10) {
                lVar3.o("FIREBASE INTERNAL ERROR", e10);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (!str.equals("c")) {
                if (str.equals("ac")) {
                    lVar2.l(null, m1.k("Auth token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                    qVar.f12940q = null;
                    qVar.f12941r = true;
                    kVar2.getClass();
                    kVar2.l(rg.c.f14386c, Boolean.FALSE);
                    qVar.f12931g.a(2);
                    return;
                }
                if (str.equals("apc")) {
                    lVar2.l(null, m1.k("App check token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), new Object[0]);
                    qVar.f12942s = null;
                    qVar.f12943t = true;
                    return;
                } else if (!str.equals("sd")) {
                    if (lVar2.A()) {
                        lVar2.l(null, "Unrecognized action from server: ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                } else {
                    String str3 = (String) map2.get("msg");
                    k4.d dVar = (k4.d) lVar2.f12660b;
                    String str4 = (String) lVar2.f12661c;
                    String strG = lVar2.G(str3, new Object[0]);
                    System.currentTimeMillis();
                    dVar.g(2, str4, strG);
                    return;
                }
            }
            ArrayList arrayListO2 = hj.a.O((String) map2.get("p"));
            HashMap map5 = qVar.f12939p;
            if (lVar2.A()) {
                lVar2.l(null, "removing all listens at path " + arrayListO2, new Object[0]);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry3 : map5.entrySet()) {
                p pVar = (p) entry3.getKey();
                n nVar = (n) entry3.getValue();
                if (pVar.f12923a.equals(arrayListO2)) {
                    arrayList2.add(nVar);
                }
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                map5.remove(((n) obj3).f12916b);
            }
            qVar.b();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                ((n) obj4).f12915a.b("permission_denied", null);
            }
            return;
        }
        String str5 = (String) map2.get("p");
        ArrayList arrayListO3 = hj.a.O(str5);
        Object obj5 = map2.get("d");
        Object obj6 = map2.get("t");
        Long lValueOf2 = obj6 instanceof Integer ? Long.valueOf(((Integer) obj6).intValue()) : obj6 instanceof Long ? (Long) obj6 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map6 : (List) obj5) {
            String str6 = (String) map6.get("s");
            String str7 = (String) map6.get("e");
            arrayList3.add(new r(str6 != null ? hj.a.O(str6) : arrayList, str7 != null ? hj.a.O(str7) : arrayList, map6.get("m")));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (lVar2.A()) {
                lVar2.l(null, "Ignoring empty range merge for path ".concat(str5), new Object[0]);
                return;
            }
            return;
        }
        kVar2.getClass();
        rg.h hVar2 = new rg.h(arrayListO3);
        p1.l lVar4 = kVar2.f14439i;
        if (lVar4.A()) {
            lVar4.l(null, "onRangeMergeUpdate: " + hVar2, new Object[0]);
        }
        if (kVar2.f14440k.A()) {
            lVar4.l(null, "onRangeMergeUpdate: " + hVar2 + " " + arrayList3, new Object[0]);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj7 = arrayList3.get(i12);
            i12++;
            arrayList4.add(new zg.t((r) obj7));
        }
        if (lValueOf2 != null) {
            z zVar4 = kVar2.f14443n;
            a0 a0Var2 = new a0(lValueOf2.longValue());
            wg.h hVar3 = (wg.h) zVar4.f14492c.get(a0Var2);
            if (hVar3 != null) {
                rg.h hVar4 = hVar3.f19305a;
                ug.l.c(hVar2.equals(hVar4));
                rg.o oVar = (rg.o) zVar4.f14490a.i(hVar4);
                ug.l.b("Missing sync point for query tag that we're tracking", oVar != null);
                wg.i iVarH = oVar.h(hVar3);
                ug.l.b("Missing view for query tag that we're tracking", iVarH != null);
                zg.r rVar = ((wg.a) iVarH.f19309c.f13236c).f19286a.f20605a;
                int size4 = arrayList4.size();
                zg.r rVarA = rVar;
                while (i10 < size4) {
                    Object obj8 = arrayList4.get(i10);
                    i10++;
                    zg.t tVar = (zg.t) obj8;
                    tVar.getClass();
                    rVarA = tVar.a(rg.h.f14414d, rVarA, tVar.f20620c);
                }
                listF2 = (List) zVar4.f14496g.c(new rg.p(zVar4, a0Var2, hVar2, rVarA, 1));
            } else {
                listF2 = Collections.EMPTY_LIST;
            }
        } else {
            z zVar5 = kVar2.f14443n;
            rg.o oVar2 = (rg.o) zVar5.f14490a.i(hVar2);
            if (oVar2 == null || (iVarD = oVar2.d()) == null) {
                listF2 = Collections.EMPTY_LIST;
            } else {
                zg.r rVarA2 = ((wg.a) iVarD.f19309c.f13236c).f19286a.f20605a;
                int size5 = arrayList4.size();
                while (i10 < size5) {
                    Object obj9 = arrayList4.get(i10);
                    i10++;
                    zg.t tVar2 = (zg.t) obj9;
                    tVar2.getClass();
                    rVarA2 = tVar2.a(rg.h.f14414d, rVarA2, tVar2.f20620c);
                }
                listF2 = zVar5.f(hVar2, rVarA2);
            }
        }
        if (listF2.size() > 0) {
            kVar2.i(hVar2);
        }
        kVar2.g(listF2);
    }

    public void e(Map map) {
        long jLongValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        q qVar = (q) this.f12885d;
        qVar.f12927c = str;
        String str2 = (String) map.get("s");
        if (this.f12882a == 1) {
            ((v) this.f12884c).getClass();
            p1.l lVar = (p1.l) this.f12886e;
            if (lVar.A()) {
                lVar.l(null, "realtime connection established", new Object[0]);
            }
            this.f12882a = 2;
            rg.k kVar = qVar.f12925a;
            p1.l lVar2 = qVar.f12948y;
            if (lVar2.A()) {
                lVar2.l(null, "onReady", new Object[0]);
            }
            qVar.f12930f = System.currentTimeMillis();
            if (lVar2.A()) {
                lVar2.l(null, "handling timestamp", new Object[0]);
            }
            long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
            HashMap map2 = new HashMap();
            map2.put("serverTimeOffset", Long.valueOf(jCurrentTimeMillis));
            kVar.getClass();
            for (Map.Entry entry : map2.entrySet()) {
                kVar.l(zg.c.b((String) entry.getKey()), entry.getValue());
            }
            if (qVar.f12929e) {
                HashMap map3 = new HashMap();
                qVar.f12944u.getClass();
                map3.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (lVar2.A()) {
                    lVar2.l(null, "Sending first connection stats", new Object[0]);
                }
                if (!map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    map4.put("c", map3);
                    qVar.n("s", false, map4, new j(qVar));
                } else if (lVar2.A()) {
                    lVar2.l(null, "Not sending stats because stats are empty", new Object[0]);
                }
            }
            if (lVar2.A()) {
                lVar2.l(null, "calling restore tokens", new Object[0]);
            }
            l lVar3 = qVar.f12932h;
            hj.a.z(lVar3 == l.f12908c, "Wanted to restore tokens, but was in wrong state: %s", lVar3);
            if (qVar.f12940q != null) {
                if (lVar2.A()) {
                    lVar2.l(null, "Restoring auth.", new Object[0]);
                }
                qVar.f12932h = l.f12909d;
                qVar.j(true);
            } else {
                if (lVar2.A()) {
                    lVar2.l(null, "Not restoring auth because auth token is null.", new Object[0]);
                }
                qVar.f12932h = l.f12910e;
                qVar.i(true);
            }
            qVar.f12929e = false;
            qVar.A = str2;
            kVar.l(rg.c.f14387d, Boolean.TRUE);
        }
    }

    public void f(HashMap map) {
        p1.l lVar = (p1.l) this.f12886e;
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (lVar.A()) {
                    lVar.l(null, "Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                a(2);
                return;
            }
            if (str.equals("d")) {
                d((Map) map.get("d"));
            } else if (str.equals("c")) {
                c((Map) map.get("d"));
            } else if (lVar.A()) {
                lVar.l(null, "Ignoring unknown server message type: ".concat(str), new Object[0]);
            }
        } catch (ClassCastException e10) {
            if (lVar.A()) {
                lVar.l(null, "Failed to parse server message: " + e10.toString(), new Object[0]);
            }
            a(2);
        }
    }

    public void g(String str) {
        p1.l lVar = (p1.l) this.f12886e;
        if (lVar.A()) {
            lVar.l(null, "Got a reset; killing connection to " + ((String) ((p2.h) this.f12883b).f12700c) + "; Updating internalHost to " + str, new Object[0]);
        }
        ((q) this.f12885d).f12927c = str;
        a(1);
    }

    public void h(int i10) {
        int[] iArr = (int[]) this.f12885d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (z5.e eVar : ((z5.e[][]) this.f12884c)[i10]) {
            h(eVar.f20383a.f20415b);
            z5.e[] eVarArr = (z5.e[]) this.f12883b;
            int i11 = this.f12882a;
            this.f12882a = i11 - 1;
            eVarArr[i11] = eVar;
        }
        iArr[i10] = 2;
    }

    public a(z5.g gVar, z5.e[] eVarArr) {
        this.f12886e = gVar;
        int length = eVarArr.length;
        this.f12883b = new z5.e[length];
        this.f12882a = length - 1;
        int iF = gVar.f() + 1;
        z5.e[][] eVarArr2 = new z5.e[iF][];
        int[] iArr = new int[iF];
        for (z5.e eVar : eVarArr) {
            int i10 = eVar.f20383a.f20414a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < iF; i11++) {
            eVarArr2[i11] = new z5.e[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (z5.e eVar2 : eVarArr) {
            int i12 = eVar2.f20383a.f20414a;
            z5.e[] eVarArr3 = eVarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            eVarArr3[i13] = eVar2;
        }
        this.f12884c = eVarArr2;
        this.f12885d = new int[((z5.g) this.f12886e).f() + 1];
    }
}
