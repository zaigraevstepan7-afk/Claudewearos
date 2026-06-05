package ac;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f0.a1;
import f0.z0;
import f1.h2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import nb.q;
import nb.w;
import qi.s;
import rg.b0;
import tj.r0;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements cc.b, SuccessContinuation, Continuation, bc.f, kg.e, h2, oh.a, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f402c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f400a = i10;
        this.f401b = obj;
        this.f402c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v2, types: [ai.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(com.google.android.gms.tasks.Task r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.l.e(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    @Override // oh.a
    public void a(oh.b bVar) {
        jg.o oVar;
        switch (this.f400a) {
            case 11:
                oh.a aVar = (oh.a) this.f401b;
                oh.a aVar2 = (oh.a) this.f402c;
                aVar.a(bVar);
                aVar2.a(bVar);
                return;
            default:
                ExecutorService executorService = (ExecutorService) this.f401b;
                b0 b0Var = (b0) this.f402c;
                jg.a aVar3 = (jg.a) bVar.get();
                ng.a aVar4 = new ng.a(executorService, b0Var);
                FirebaseAuth firebaseAuth = (FirebaseAuth) aVar3;
                firebaseAuth.getClass();
                firebaseAuth.f4254c.add(aVar4);
                synchronized (firebaseAuth) {
                    if (firebaseAuth.f4268r == null) {
                        cg.i iVar = firebaseAuth.f4252a;
                        e0.i(iVar);
                        firebaseAuth.f4268r = new jg.o(iVar);
                    }
                    oVar = firebaseAuth.f4268r;
                }
                int size = firebaseAuth.f4254c.size();
                if (size > 0 && oVar.f8898a == 0) {
                    oVar.f8898a = size;
                    if (oVar.f8898a > 0 && !oVar.f8900c) {
                        oVar.f8899b.a();
                    }
                } else if (size == 0 && oVar.f8898a != 0) {
                    jg.g gVar = oVar.f8899b;
                    gVar.f8890d.removeCallbacks(gVar.f8891e);
                }
                oVar.f8898a = size;
                return;
        }
    }

    @Override // bc.f
    public Object apply(Object obj) {
        bc.h hVar = (bc.h) this.f401b;
        ub.i iVar = (ub.i) this.f402c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        bc.a aVar = hVar.f1739d;
        ArrayList arrayListL = hVar.l(sQLiteDatabase, iVar, aVar.f1724b);
        for (rb.d dVar : rb.d.values()) {
            if (dVar != iVar.f16963c) {
                int size = aVar.f1724b - arrayListL.size();
                if (size <= 0) {
                    break;
                }
                p1.l lVarA = ub.i.a();
                lVarA.D(iVar.f16961a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                lVarA.f12662d = dVar;
                lVarA.f12661c = iVar.f16962b;
                arrayListL.addAll(hVar.l(sQLiteDatabase, lVarA.f(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListL.size(); i10++) {
            sb2.append(((bc.b) arrayListL.get(i10)).f1728a);
            if (i10 < arrayListL.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new bc.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListL.listIterator();
        while (listIterator.hasNext()) {
            bc.b bVar = (bc.b) listIterator.next();
            long j4 = bVar.f1728a;
            if (map.containsKey(Long.valueOf(j4))) {
                p pVarC = bVar.f1730c.c();
                for (bc.g gVar : (Set) map.get(Long.valueOf(j4))) {
                    pVarC.j(gVar.f1733a, gVar.f1734b);
                }
                listIterator.set(new bc.b(j4, bVar.f1729b, pVarC.l()));
            }
        }
        return arrayListL;
    }

    @Override // f1.h2
    public boolean b() {
        z0 z0Var = (z0) this.f401b;
        f0.c cVar = (f0.c) this.f402c;
        if (!z0Var.f6241q) {
            z0Var.j();
            cVar.f6115a = f0.c.a(z0Var.f6239o, cVar.f6115a);
            z0Var.f6241q = !z0Var.i(z0Var.f6238n, r2 + cVar.f6116b);
        }
        return z0Var.f6241q;
    }

    @Override // cc.b
    public Object c() {
        switch (this.f400a) {
            case 0:
                n nVar = (n) this.f401b;
                Iterable iterable = (Iterable) this.f402c;
                bc.h hVar = (bc.h) ((bc.d) nVar.f408c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + bc.h.t(iterable)).execute();
                    break;
                }
                break;
            default:
                n nVar2 = (n) this.f401b;
                for (Map.Entry entry : ((HashMap) this.f402c).entrySet()) {
                    ((bc.h) ((bc.c) nVar2.f414i)).n(((Integer) entry.getValue()).intValue(), xb.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    public void d(w8.c cVar, ArrayList arrayList) {
        String str;
        Object next;
        String str2;
        q qVar = (q) this.f401b;
        Activity activity = (Activity) this.f402c;
        r0 r0Var = nb.o.f12042r;
        fj.l.f(cVar, "billingResult");
        if (cVar.f18942a != 0 || arrayList.isEmpty()) {
            w wVar = new w("Product not found in Play Store.");
            r0Var.getClass();
            r0Var.k(null, wVar);
            return;
        }
        w8.g gVar = (w8.g) qi.l.z0(arrayList);
        fj.l.c(gVar);
        int iOrdinal = qVar.ordinal();
        boolean z2 = true;
        if (iOrdinal == 0) {
            str = "monthly";
        } else if (iOrdinal == 1) {
            str = "yearly";
        } else {
            if (iOrdinal != 2) {
                throw new b3.e();
            }
            str = "dev-test";
        }
        Iterable iterable = gVar.f18957h;
        if (iterable == null) {
            iterable = s.f13520a;
        }
        Iterable iterable2 = iterable;
        Log.d("ProManager", "Available subscription offers: " + qi.l.E0(iterable2, null, null, null, new la.a(17), 31));
        Iterator it = iterable2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (fj.l.b(((w8.f) next).f18947a, str)) {
                    break;
                }
            }
        }
        w8.f fVar = (w8.f) next;
        String str3 = fVar != null ? fVar.f18949c : null;
        if (str3 == null) {
            w wVar2 = new w("Selected subscription plan is not available.");
            r0Var.getClass();
            r0Var.k(null, wVar2);
            return;
        }
        q5.b bVar = new q5.b(18);
        bVar.f13235b = gVar;
        if (gVar.a() != null) {
            gVar.a().getClass();
            String str4 = gVar.a().f18944a;
            if (str4 != null) {
                bVar.f13236c = str4;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("offerToken can not be empty");
        }
        bVar.f13236c = str3;
        zzbe.zzc((w8.g) bVar.f13235b, "ProductDetails is required for constructing ProductDetailsParams.");
        if (((w8.g) bVar.f13235b).f18957h != null) {
            zzbe.zzc((String) bVar.f13236c, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        ArrayList arrayList2 = new ArrayList(yd.f.K(new w8.b(bVar)));
        boolean zIsEmpty = arrayList2.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        arrayList2.forEach(new w8.o());
        a1 a1Var = new a1();
        a1Var.f6104a = (zIsEmpty || ((w8.b) arrayList2.get(0)).f18940a.f18951b.optString("packageName").isEmpty()) ? false : true;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
            z2 = false;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z2 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        a1Var.f6105b = new x9.b(15);
        a1Var.f6107d = new ArrayList();
        a1Var.f6106c = zzco.zzk(arrayList2);
        w8.a aVar = nb.o.f12050z;
        w8.c cVarD = aVar != null ? aVar.d(activity, a1Var) : null;
        if (cVarD == null || cVarD.f18942a != 0) {
            if (cVarD == null || (str2 = cVarD.f18943b) == null) {
                str2 = "unknown error";
            }
            w wVar3 = new w("Could not open Play purchase dialog: ".concat(str2));
            r0Var.getClass();
            r0Var.k(null, wVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // kg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(uf.p r4) {
        /*
            r3 = this;
            int r0 = r3.f400a
            switch(r0) {
                case 7: goto L98;
                case 8: goto L5;
                case 9: goto L8b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f401b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f402c
            b0.b r1 = (b0.b) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r4 = r4.a(r2)
            android.content.Context r4 = (android.content.Context) r4
            int r1 = r1.f1279a
            switch(r1) {
                case 4: goto L79;
                case 5: goto L6c;
                case 6: goto L30;
                default: goto L1a;
            }
        L1a:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = r1.getInstallerPackageName(r4)
            if (r4 == 0) goto L2d
            java.lang.String r4 = com.google.firebase.FirebaseCommonRegistrar.a(r4)
            goto L85
        L2d:
            java.lang.String r4 = ""
            goto L85
        L30:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.television"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L3f
            java.lang.String r4 = "tv"
            goto L85
        L3f:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L4e
            java.lang.String r4 = "watch"
            goto L85
        L4e:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.automotive"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L5d
            java.lang.String r4 = "auto"
            goto L85
        L5d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r4 = r4.hasSystemFeature(r1)
            if (r4 == 0) goto L2d
            java.lang.String r4 = "embedded"
            goto L85
        L6c:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L2d
            int r4 = r4.minSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L85
        L79:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L2d
            int r4 = r4.targetSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L85:
            yh.a r1 = new yh.a
            r1.<init>(r0, r4)
            return r1
        L8b:
            java.lang.Object r0 = r3.f401b
            kg.r r0 = (kg.r) r0
            java.lang.Object r1 = r3.f402c
            kg.r r1 = (kg.r) r1
            jh.f r4 = com.google.firebase.functions.FunctionsRegistrar.a(r0, r1, r4)
            return r4
        L98:
            java.lang.Object r0 = r3.f401b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f402c
            kg.b r1 = (kg.b) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lad
            kg.e r0 = r1.f9613f     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r4 = r0.f(r4)     // Catch: java.lang.Throwable -> Lad
            android.os.Trace.endSection()
            return r4
        Lad:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.l.f(uf.p):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((wh.g) this.f401b).a((Intent) this.f402c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ai.e eVar = (ai.e) this.f401b;
        ai.g gVar = (ai.g) this.f402c;
        synchronized (eVar) {
            eVar.f508c = Tasks.forResult(gVar);
        }
        return Tasks.forResult(gVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f400a) {
            case 3:
                return ((ai.j) this.f401b).b(task, 0L, (HashMap) this.f402c);
            case 4:
                ai.j jVar = (ai.j) this.f401b;
                Date date = (Date) this.f402c;
                jVar.getClass();
                if (task.isSuccessful()) {
                    ai.m mVar = jVar.f538g;
                    synchronized (mVar.f551b) {
                        mVar.f550a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof zh.e) {
                            ai.m mVar2 = jVar.f538g;
                            synchronized (mVar2.f551b) {
                                mVar2.f550a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            ai.m mVar3 = jVar.f538g;
                            synchronized (mVar3.f551b) {
                                mVar3.f550a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                }
                return task;
            case 5:
                return e(task);
            default:
                wh.i iVar = (wh.i) this.f401b;
                String str = (String) this.f402c;
                synchronized (iVar) {
                    ((q.e) iVar.f19359b).remove(str);
                }
                return task;
        }
    }
}
