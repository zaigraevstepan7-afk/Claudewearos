package pg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q {
    public static long G;
    public String A;
    public long F;

    /* renamed from: a, reason: collision with root package name */
    public final rg.k f12925a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.h f12926b;

    /* renamed from: c, reason: collision with root package name */
    public String f12927c;

    /* renamed from: f, reason: collision with root package name */
    public long f12930f;

    /* renamed from: g, reason: collision with root package name */
    public a f12931g;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f12935l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12936m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f12937n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f12938o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f12939p;

    /* renamed from: q, reason: collision with root package name */
    public String f12940q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12941r;

    /* renamed from: s, reason: collision with root package name */
    public String f12942s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12943t;

    /* renamed from: u, reason: collision with root package name */
    public final nc.p f12944u;

    /* renamed from: v, reason: collision with root package name */
    public final ac.l f12945v;

    /* renamed from: w, reason: collision with root package name */
    public final ac.l f12946w;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f12947x;

    /* renamed from: y, reason: collision with root package name */
    public final p1.l f12948y;

    /* renamed from: z, reason: collision with root package name */
    public final qg.a f12949z;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12928d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f12929e = true;

    /* renamed from: h, reason: collision with root package name */
    public l f12932h = l.f12906a;

    /* renamed from: i, reason: collision with root package name */
    public long f12933i = 0;
    public long j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f12934k = 0;
    public long B = 0;
    public int C = 0;
    public int D = 0;
    public ScheduledFuture E = null;

    public q(nc.p pVar, p2.h hVar, rg.k kVar) {
        this.f12925a = kVar;
        this.f12944u = pVar;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) pVar.f12161a;
        this.f12947x = scheduledExecutorService;
        this.f12945v = (ac.l) pVar.f12162b;
        this.f12946w = (ac.l) pVar.f12163c;
        this.f12926b = hVar;
        this.f12939p = new HashMap();
        this.f12935l = new HashMap();
        this.f12937n = new HashMap();
        this.f12938o = new ConcurrentHashMap();
        this.f12936m = new ArrayList();
        k4.d dVar = (k4.d) pVar.f12164d;
        this.f12949z = new qg.a(scheduledExecutorService, new p1.l(dVar, "ConnectionRetryHelper", (Object) null, 22));
        long j = G;
        G = 1 + j;
        this.f12948y = new p1.l(dVar, "PersistentConnection", m1.g(j, "pc_"), 22);
        this.A = null;
        b();
    }

    public final boolean a() {
        l lVar = this.f12932h;
        return lVar == l.f12909d || lVar == l.f12910e;
    }

    public final void b() {
        if (!d()) {
            if (this.f12928d.contains("connection_idle")) {
                hj.a.z(!d(), "", new Object[0]);
                h("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.E = this.f12947x.schedule(new ah.d(this, 21), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void c(String str) {
        p1.l lVar = this.f12948y;
        if (lVar.A()) {
            lVar.l(null, "Connection interrupted for: ".concat(str), new Object[0]);
        }
        this.f12928d.add(str);
        a aVar = this.f12931g;
        qg.a aVar2 = this.f12949z;
        if (aVar != null) {
            aVar.a(2);
            this.f12931g = null;
        } else {
            p1.l lVar2 = aVar2.f13481b;
            if (aVar2.f13487h != null) {
                lVar2.l(null, "Cancelling existing retry attempt", new Object[0]);
                aVar2.f13487h.cancel(false);
                aVar2.f13487h = null;
            } else {
                lVar2.l(null, "No existing retry attempt to cancel", new Object[0]);
            }
            aVar2.f13488i = 0L;
            this.f12932h = l.f12906a;
        }
        aVar2.j = true;
        aVar2.f13488i = 0L;
    }

    public final boolean d() {
        return this.f12939p.isEmpty() && this.f12938o.isEmpty() && this.f12935l.isEmpty() && this.f12937n.isEmpty();
    }

    public final void e(String str, ArrayList arrayList, Object obj, String str2, s sVar) {
        HashMap map = new HashMap();
        map.put("p", hj.a.E(arrayList));
        map.put("d", obj);
        if (str2 != null) {
            map.put("h", str2);
        }
        long j = this.f12933i;
        this.f12933i = 1 + j;
        Long lValueOf = Long.valueOf(j);
        o oVar = new o();
        oVar.f12919a = str;
        oVar.f12920b = map;
        oVar.f12921c = sVar;
        this.f12937n.put(lValueOf, oVar);
        if (this.f12932h == l.f12910e) {
            m(j);
        }
        this.F = System.currentTimeMillis();
        b();
    }

    public final n f(p pVar) {
        p1.l lVar = this.f12948y;
        if (lVar.A()) {
            lVar.l(null, "removing query " + pVar, new Object[0]);
        }
        HashMap map = this.f12939p;
        if (map.containsKey(pVar)) {
            n nVar = (n) map.get(pVar);
            map.remove(pVar);
            b();
            return nVar;
        }
        if (lVar.A()) {
            lVar.l(null, "Trying to remove listener for QuerySpec " + pVar + " but no listener exists.", new Object[0]);
        }
        return null;
    }

    public final void g() {
        l lVar = this.f12932h;
        int i10 = 0;
        hj.a.z(lVar == l.f12910e, "Should be connected if we're restoring state, but we are: %s", lVar);
        p1.l lVar2 = this.f12948y;
        if (lVar2.A()) {
            lVar2.l(null, "Restoring outstanding listens", new Object[0]);
        }
        for (n nVar : this.f12939p.values()) {
            if (lVar2.A()) {
                lVar2.l(null, "Restoring listen " + nVar.f12916b, new Object[0]);
            }
            l(nVar);
        }
        if (lVar2.A()) {
            lVar2.l(null, "Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f12937n.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            m(((Long) obj).longValue());
        }
        ArrayList arrayList2 = this.f12936m;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        arrayList2.clear();
        if (lVar2.A()) {
            lVar2.l(null, "Restoring reads.", new Object[0]);
        }
        ArrayList arrayList3 = new ArrayList(this.f12938o.keySet());
        Collections.sort(arrayList3);
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            k((Long) obj2);
        }
    }

    public final void h(String str) {
        p1.l lVar = this.f12948y;
        if (lVar.A()) {
            lVar.l(null, "Connection no longer interrupted for: ".concat(str), new Object[0]);
        }
        HashSet hashSet = this.f12928d;
        hashSet.remove(str);
        if (hashSet.size() == 0 && this.f12932h == l.f12906a) {
            o();
        }
    }

    public final void i(final boolean z2) {
        if (this.f12942s == null) {
            g();
            return;
        }
        hj.a.z(a(), "Must be connected to send auth, but was: %s", this.f12932h);
        p1.l lVar = this.f12948y;
        if (lVar.A()) {
            lVar.l(null, "Sending app check.", new Object[0]);
        }
        k kVar = new k() { // from class: pg.d
            @Override // pg.k
            public final void a(Map map) {
                String str = (String) map.get("s");
                boolean zEquals = str.equals("ok");
                q qVar = this.f12890a;
                if (zEquals) {
                    qVar.D = 0;
                } else {
                    qVar.f12942s = null;
                    qVar.f12943t = true;
                    qVar.f12948y.l(null, m1.k("App check failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
                }
                if (z2) {
                    qVar.g();
                }
            }
        };
        HashMap map = new HashMap();
        hj.a.z(this.f12942s != null, "App check token must be set!", new Object[0]);
        map.put("token", this.f12942s);
        n("appcheck", true, map, kVar);
    }

    public final void j(boolean z2) {
        hj.a.z(a(), "Must be connected to send auth, but was: %s", this.f12932h);
        p1.l lVar = this.f12948y;
        mh.g gVar = null;
        if (lVar.A()) {
            lVar.l(null, "Sending auth.", new Object[0]);
        }
        k fVar = new f(this, z2);
        HashMap map = new HashMap();
        String str = this.f12940q;
        if (str.startsWith("gauth|")) {
            try {
                HashMap mapQ = a.a.Q(str.substring(6));
                gVar = new mh.g(3, (String) mapQ.get("token"), (Map) mapQ.get("auth"));
            } catch (IOException e10) {
                throw new RuntimeException("Failed to parse gauth token", e10);
            }
        }
        if (gVar == null) {
            map.put("cred", this.f12940q);
            n("auth", true, map, fVar);
            return;
        }
        map.put("cred", (String) gVar.f11707b);
        Map map2 = (Map) gVar.f11708c;
        if (map2 != null) {
            map.put("authvar", map2);
        }
        n("gauth", true, map, fVar);
    }

    public final void k(Long l10) {
        hj.a.z(this.f12932h == l.f12910e, "sendGet called when we can't send gets", new Object[0]);
        m mVar = (m) this.f12938o.get(l10);
        if (mVar.f12914c) {
            p1.l lVar = this.f12948y;
            if (lVar.A()) {
                lVar.l(null, "get" + l10 + " cancelled, ignoring.", new Object[0]);
                return;
            }
        } else {
            mVar.f12914c = true;
        }
        n("g", false, mVar.f12912a, new h(this, l10, mVar));
    }

    public final void l(n nVar) {
        q5.b bVar;
        HashMap map = new HashMap();
        map.put("p", hj.a.E(nVar.f12916b.f12923a));
        Long l10 = nVar.f12918d;
        if (l10 != null) {
            map.put("q", nVar.f12916b.f12924b);
            map.put("t", l10);
        }
        wg.i iVar = (wg.i) nVar.f12917c.f14419a;
        map.put("h", ((wg.a) iVar.f19309c.f13236c).f19286a.f20605a.v());
        if (u2.b.g(((wg.a) iVar.f19309c.f13236c).f19286a.f20605a) > 1024) {
            zg.r rVar = ((wg.a) iVar.f19309c.f13236c).f19286a.f20605a;
            ug.f fVar = new ug.f();
            fVar.f17074a = Math.max(512L, (long) Math.sqrt(u2.b.g(rVar) * 100));
            if (rVar.isEmpty()) {
                bVar = new q5.b(Collections.EMPTY_LIST, Collections.singletonList(""));
            } else {
                q2.d dVar = new q2.d(fVar);
                ArrayList arrayList = (ArrayList) dVar.f13194g;
                q5.b.v(rVar, dVar);
                ug.l.b("Can't finish hashing in the middle processing a child", dVar.f13189b == 0);
                if (((StringBuilder) dVar.f13191d) != null) {
                    dVar.d();
                }
                arrayList.add("");
                bVar = new q5.b((ArrayList) dVar.f13193f, arrayList);
            }
            List listUnmodifiableList = Collections.unmodifiableList((List) bVar.f13235b);
            ArrayList arrayList2 = new ArrayList(listUnmodifiableList.size());
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((rg.h) it.next()).b());
            }
            List listUnmodifiableList2 = Collections.unmodifiableList((List) bVar.f13236c);
            if (arrayList2.size() != listUnmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(hj.a.E((List) it2.next()));
            }
            HashMap map2 = new HashMap();
            map2.put("hs", Collections.unmodifiableList(listUnmodifiableList2));
            map2.put("ps", arrayList3);
            map.put("ch", map2);
        }
        n("q", false, map, new i(this, nVar));
    }

    public final void m(long j) {
        hj.a.z(this.f12932h == l.f12910e, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        o oVar = (o) this.f12937n.get(Long.valueOf(j));
        s sVar = oVar.f12921c;
        String str = oVar.f12919a;
        oVar.f12922d = true;
        n(str, false, oVar.f12920b, new g(this, str, j, oVar, sVar));
    }

    public final void n(String str, boolean z2, Map map, k kVar) {
        String[] strArr;
        long j = this.f12934k;
        this.f12934k = 1 + j;
        HashMap map2 = new HashMap();
        map2.put("r", Long.valueOf(j));
        map2.put("a", str);
        map2.put("b", map);
        a aVar = this.f12931g;
        aVar.getClass();
        HashMap map3 = new HashMap();
        map3.put("t", "d");
        map3.put("d", map2);
        p1.l lVar = (p1.l) aVar.f12886e;
        if (aVar.f12882a != 2) {
            lVar.l(null, "Tried to send on an unconnected connection", new Object[0]);
        } else {
            if (z2) {
                lVar.l(null, "Sending data (contents hidden)", new Object[0]);
            } else {
                lVar.l(null, "Sending data: %s", map3);
            }
            v vVar = (v) aVar.f12884c;
            vVar.e();
            try {
                String strT = a.a.T(map3);
                if (strT.length() <= 16384) {
                    strArr = new String[]{strT};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < strT.length()) {
                        int i11 = i10 + 16384;
                        arrayList.add(strT.substring(i10, Math.min(i11, strT.length())));
                        i10 = i11;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    vVar.f12958a.t("" + strArr.length);
                }
                for (String str2 : strArr) {
                    vVar.f12958a.t(str2);
                }
            } catch (IOException e10) {
                vVar.j.o("Failed to serialize message: " + map3.toString(), e10);
                vVar.f();
            }
        }
        this.f12935l.put(Long.valueOf(j), kVar);
    }

    public final void o() {
        if (this.f12928d.size() == 0) {
            l lVar = this.f12932h;
            hj.a.z(lVar == l.f12906a, "Not in disconnected state: %s", lVar);
            boolean z2 = this.f12941r;
            boolean z10 = this.f12943t;
            this.f12948y.l(null, "Scheduling connection attempt", new Object[0]);
            this.f12941r = false;
            this.f12943t = false;
            c cVar = new c(this, z2, z10);
            qg.a aVar = this.f12949z;
            p1.l lVar2 = aVar.f13481b;
            a8.e eVar = new a8.e(21, aVar, cVar);
            if (aVar.f13487h != null) {
                lVar2.l(null, "Cancelling previous scheduled retry", new Object[0]);
                aVar.f13487h.cancel(false);
                aVar.f13487h = null;
            }
            long jNextDouble = 0;
            if (!aVar.j) {
                long j = aVar.f13488i;
                if (j == 0) {
                    aVar.f13488i = aVar.f13482c;
                } else {
                    aVar.f13488i = Math.min((long) (j * aVar.f13485f), aVar.f13483d);
                }
                double d10 = aVar.f13484e;
                double d11 = aVar.f13488i;
                jNextDouble = (long) ((aVar.f13486g.nextDouble() * d10 * d11) + ((1.0d - d10) * d11));
            }
            aVar.j = false;
            lVar2.l(null, "Scheduling retry in %dms", Long.valueOf(jNextDouble));
            aVar.f13487h = aVar.f13480a.schedule(eVar, jNextDouble, TimeUnit.MILLISECONDS);
        }
    }
}
