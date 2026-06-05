package u6;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final fj.f f16766a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16768c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16769d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16770e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f16771f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f16772g;

    /* renamed from: h, reason: collision with root package name */
    public k3.a f16773h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16774i;
    public final s j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16775k;

    /* renamed from: l, reason: collision with root package name */
    public final ag.i f16776l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f16777m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f16778n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f16779o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16780p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16781q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16782r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f16783s;

    public q(Context context, Class cls, String str) {
        fj.l.f(context, "context");
        this.f16769d = new ArrayList();
        this.f16770e = new ArrayList();
        this.j = s.f16784a;
        this.f16775k = -1L;
        this.f16776l = new ag.i(27);
        this.f16777m = new LinkedHashSet();
        this.f16778n = new LinkedHashSet();
        this.f16779o = new ArrayList();
        this.f16780p = true;
        this.f16783s = true;
        this.f16766a = fj.w.a(cls);
        this.f16767b = context;
        this.f16768c = str;
    }

    public final void a(x6.a... aVarArr) {
        for (x6.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.f19837a);
            LinkedHashSet linkedHashSet = this.f16778n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f19838b));
        }
        x6.a[] aVarArr2 = (x6.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        ag.i iVar = this.f16776l;
        iVar.getClass();
        fj.l.f(aVarArr2, "migrations");
        for (x6.a aVar2 : aVarArr2) {
            iVar.z(aVar2);
        }
    }

    public final u b() throws ClassNotFoundException {
        String name;
        r5.g gVar;
        f7.e eVarB;
        f7.e eVarB2;
        boolean zContainsKey;
        Executor executor = this.f16771f;
        if (executor == null && this.f16772g == null) {
            n.a aVar = n.b.f11834d;
            this.f16772g = aVar;
            this.f16771f = aVar;
        } else if (executor != null && this.f16772g == null) {
            this.f16772g = executor;
        } else if (executor == null) {
            this.f16771f = this.f16772g;
        }
        LinkedHashSet linkedHashSet = this.f16778n;
        fj.l.f(linkedHashSet, "migrationStartAndEndVersions");
        LinkedHashSet linkedHashSet2 = this.f16777m;
        fj.l.f(linkedHashSet2, "migrationsNotRequiredFrom");
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(m6.a.d(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        f7.d bVar = this.f16773h;
        if (bVar == null) {
            bVar = new x9.b(5);
        }
        f7.d dVar = bVar;
        if (this.f16775k > 0) {
            if (this.f16768c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z2 = this.f16774i;
        s sVar = this.j;
        sVar.getClass();
        Context context = this.f16767b;
        fj.l.f(context, "context");
        if (sVar == s.f16784a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            sVar = (activityManager == null || activityManager.isLowRamDevice()) ? s.f16785b : s.f16786c;
        }
        Executor executor2 = this.f16771f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f16772g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a aVar2 = new a(context, this.f16768c, dVar, this.f16776l, this.f16769d, z2, sVar, executor2, executor3, null, this.f16780p, this.f16781q, linkedHashSet2, null, null, null, this.f16770e, this.f16779o, this.f16782r, null, null);
        aVar2.f16681v = this.f16783s;
        Class clsD = cg.b.D(this.f16766a);
        Package r52 = clsD.getPackage();
        if (r52 == null || (name = r52.getName()) == null) {
            name = "";
        }
        String canonicalName = clsD.getCanonicalName();
        fj.l.c(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            fj.l.e(canonicalName, "substring(...)");
        }
        String strReplace = canonicalName.replace('.', '_');
        fj.l.e(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader());
            fj.l.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            u uVar = (u) cls.getDeclaredConstructor(null).newInstance(null);
            uVar.getClass();
            uVar.j = aVar2.f16681v;
            try {
                r5.g gVarF = uVar.f();
                fj.l.d(gVarF, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                gVar = gVarF;
            } catch (pi.g unused) {
                gVar = null;
            }
            uVar.f16791d = gVar == null ? new b4.e(aVar2, new q0.i(uVar, 10), new t(2, uVar, v.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 0)) : new b4.e(aVar2, gVar, new t(2, uVar, v.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 1));
            uVar.f16792e = uVar.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setK = uVar.k();
            List list = aVar2.f16677r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setK.iterator();
            while (true) {
                int i10 = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i11 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                break;
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size2 = i11;
                        }
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    for (x6.a aVar3 : uVar.d(linkedHashMap)) {
                        int i12 = aVar3.f19837a;
                        int i13 = aVar3.f19838b;
                        ag.i iVar = aVar2.f16664d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) iVar.f449b;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = qi.t.f13521a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i13));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            iVar.z(aVar3);
                        }
                    }
                    LinkedHashMap linkedHashMapL = uVar.l();
                    List list2 = aVar2.f16676q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapL.entrySet()) {
                        lj.b bVar2 = (lj.b) entry.getKey();
                        for (lj.b bVar3 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i14 = size3 - 1;
                                    if (((fj.f) bVar3).d(list2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size3 = i14;
                                }
                                size3 = -1;
                            } else {
                                size3 = -1;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((fj.f) bVar3).b() + ") for " + ((fj.f) bVar2).b() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size3);
                            fj.l.f(bVar3, "kclass");
                            fj.l.f(obj, "converter");
                            uVar.f16796i.put(bVar3, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i15 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size4 = i15;
                        }
                    }
                    uVar.f16789b = aVar2.f16668h;
                    uVar.f16790c = new d0(aVar2.f16669i);
                    Executor executor4 = uVar.f16789b;
                    if (executor4 == null) {
                        fj.l.l("internalQueryExecutor");
                        throw null;
                    }
                    vj.d dVarB = qj.b0.b(yd.f.W(qj.b0.l(executor4), qj.b0.c()));
                    uVar.f16788a = dVarB;
                    ti.h hVar = dVarB.f18092a;
                    d0 d0Var = uVar.f16790c;
                    if (d0Var == null) {
                        fj.l.l("internalTransactionExecutor");
                        throw null;
                    }
                    hVar.V(qj.b0.l(d0Var));
                    uVar.f16794g = aVar2.f16666f;
                    b4.e eVar = uVar.f16791d;
                    if (eVar == null) {
                        fj.l.l("connectionManager");
                        throw null;
                    }
                    f7.e eVar2 = (f7.e) eVar.f1539h;
                    if (eVar2 == null) {
                        eVarB = null;
                        break;
                    }
                    eVarB = eVar2;
                    while (!(eVarB instanceof y6.b)) {
                        if (!(eVarB instanceof b)) {
                            eVarB = null;
                            break;
                        }
                        eVarB = ((b) eVarB).b();
                    }
                    b4.e eVar3 = uVar.f16791d;
                    if (eVar3 == null) {
                        fj.l.l("connectionManager");
                        throw null;
                    }
                    f7.e eVar4 = (f7.e) eVar3.f1539h;
                    if (eVar4 == null) {
                        eVarB2 = null;
                        break;
                    }
                    eVarB2 = eVar4;
                    while (!(eVarB2 instanceof y6.a)) {
                        if (!(eVarB2 instanceof b)) {
                            eVarB2 = null;
                            break;
                        }
                        eVarB2 = ((b) eVarB2).b();
                    }
                    return uVar;
                }
                lj.b bVar4 = (lj.b) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i16 = size5 - 1;
                        if (((fj.f) bVar4).d(list.get(size5))) {
                            zArr[size5] = true;
                            i10 = size5;
                            break;
                        }
                        if (i16 < 0) {
                            break;
                        }
                        size5 = i16;
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + ((fj.f) bVar4).b() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(bVar4, list.get(i10));
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(m1.h(clsD, new StringBuilder("Cannot access the constructor ")), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(m1.h(clsD, new StringBuilder("Failed to create an instance of ")), e12);
        }
    }
}
