package ak;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import c1.r3;
import c1.s3;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import g3.n0;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import t.m1;
import tj.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements g3.s, kg.e, zzgcx, wb.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f730a;

    /* renamed from: b, reason: collision with root package name */
    public Object f731b;

    /* renamed from: c, reason: collision with root package name */
    public Object f732c;

    /* renamed from: d, reason: collision with root package name */
    public Object f733d;

    /* renamed from: e, reason: collision with root package name */
    public Object f734e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f730a = obj;
        this.f731b = obj2;
        this.f732c = obj3;
        this.f733d = obj4;
        this.f734e = obj5;
    }

    public static v m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        v vVar = new v();
        vVar.f733d = new ArrayDeque();
        vVar.f730a = sharedPreferences;
        vVar.f731b = "topic_operation_queue";
        vVar.f732c = ",";
        vVar.f734e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) vVar.f733d)) {
            try {
                ((ArrayDeque) vVar.f733d).clear();
                String string = ((SharedPreferences) vVar.f730a).getString((String) vVar.f731b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) vVar.f732c)) {
                    String[] strArrSplit = string.split((String) vVar.f732c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) vVar.f733d).add(str);
                        }
                    }
                    return vVar;
                }
                return vVar;
            } finally {
            }
        }
    }

    public void A(t6.a aVar) {
        yh.c cVar = (yh.c) this.f733d;
        ((ArrayList) this.f732c).add(aVar);
        int i10 = aVar.f15819a;
        if (i10 == 1) {
            cVar.v(aVar.f15820b, aVar.f15821c);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.f15820b;
            int i12 = aVar.f15821c;
            RecyclerView recyclerView = (RecyclerView) cVar.f20314b;
            recyclerView.N(i11, i12, false);
            recyclerView.z0 = true;
            return;
        }
        if (i10 == 4) {
            cVar.t(aVar.f15820b, aVar.f15821c);
        } else if (i10 == 8) {
            cVar.w(aVar.f15820b, aVar.f15821c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void B(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            t6.a aVar = (t6.a) arrayList.get(i10);
            aVar.getClass();
            ((s4.b) this.f730a).c(aVar);
        }
        arrayList.clear();
    }

    public void C(String str) {
        ((yh.c) this.f732c).x(str);
    }

    public void D(rb.a aVar) {
        l7.n nVar = new l7.n(23);
        ub.p pVar = (ub.p) this.f734e;
        ub.i iVar = (ub.i) this.f730a;
        String str = (String) this.f731b;
        rb.e eVar = (rb.e) this.f733d;
        rb.c cVar = (rb.c) this.f732c;
        zb.b bVar = pVar.f16980c;
        p1.l lVarA = ub.i.a();
        lVarA.D(iVar.f16961a);
        lVarA.f12662d = rb.d.f14317a;
        lVarA.f12661c = iVar.f16962b;
        ub.i iVarF = lVarA.f();
        uf.p pVar2 = new uf.p();
        pVar2.f17056e = new HashMap();
        pVar2.f17054c = Long.valueOf(pVar.f16978a.a());
        pVar2.f17055d = Long.valueOf(pVar.f16979b.a());
        pVar2.f17052a = str;
        pVar2.f17053b = new ub.l(cVar, (byte[]) eVar.apply(aVar.f14313a));
        pVar2.f17057f = null;
        zb.a aVar2 = (zb.a) bVar;
        aVar2.f20488b.execute(new p0.g(aVar2, iVarF, nVar, pVar2.l()));
    }

    public void E(Object obj, String str) {
        fj.l.f(str, "key");
        ((LinkedHashMap) this.f730a).put(str, obj);
        tj.b0 b0Var = (tj.b0) ((LinkedHashMap) this.f732c).get(str);
        if (b0Var != null) {
            ((r0) b0Var).j(obj);
        }
        tj.b0 b0Var2 = (tj.b0) ((LinkedHashMap) this.f733d).get(str);
        if (b0Var2 != null) {
            ((r0) b0Var2).j(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.tasks.Task F() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.v.F():com.google.android.gms.tasks.Task");
    }

    public int G(int i10, int i11) {
        int i12;
        int i13;
        s4.b bVar = (s4.b) this.f730a;
        ArrayList arrayList = (ArrayList) this.f732c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t6.a aVar = (t6.a) arrayList.get(size);
            int i14 = aVar.f15819a;
            if (i14 == 8) {
                int i15 = aVar.f15820b;
                int i16 = aVar.f15821c;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f15820b = i15 + 1;
                            aVar.f15821c = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f15820b = i15 - 1;
                            aVar.f15821c = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.f15821c = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f15821c = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f15820b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f15820b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f15820b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f15821c;
                    } else if (i14 == 2) {
                        i10 += aVar.f15821c;
                    }
                } else if (i11 == 1) {
                    aVar.f15820b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f15820b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            t6.a aVar2 = (t6.a) arrayList.get(size2);
            if (aVar2.f15819a == 8) {
                int i18 = aVar2.f15821c;
                if (i18 == aVar2.f15820b || i18 < 0) {
                    arrayList.remove(size2);
                    bVar.c(aVar2);
                }
            } else if (aVar2.f15821c <= 0) {
                arrayList.remove(size2);
                bVar.c(aVar2);
            }
        }
        return i10;
    }

    public Task H(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        HashMap map = (HashMap) this.f730a;
        if (zzah.zzc(str)) {
            str = "*";
        }
        Task task = (Task) map.get(str);
        if (bool.booleanValue() || task == null) {
            String str2 = zzah.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (taskContinueWithTask = (Task) map.get(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f733d;
                taskContinueWithTask = firebaseAuth.f4256e.zza(firebaseAuth.f4260i, "RECAPTCHA_ENTERPRISE").continueWithTask(new mh.g(16, this, str2, false));
            }
            task = taskContinueWithTask;
        }
        return task.continueWithTask(new d8.e(recaptchaAction));
    }

    @Override // g3.s
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f734e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g3.r) arrayList.get(i10)).f7173a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pi.e] */
    @Override // g3.s
    public float b() {
        return ((Number) this.f732c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pi.e] */
    @Override // g3.s
    public float c() {
        return ((Number) this.f733d.getValue()).floatValue();
    }

    public void d(m8.a aVar, fj.f fVar) {
        ((ArrayList) this.f733d).add(new s3(9, aVar, fVar));
    }

    public void e(p8.a aVar, fj.f fVar) {
        ((ArrayList) this.f731b).add(new pi.h(aVar, fVar));
    }

    @Override // kg.e
    public Object f(uf.p pVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((kg.r) this.f730a, (kg.r) this.f731b, (kg.r) this.f732c, (kg.r) this.f733d, (kg.r) this.f734e, pVar);
    }

    public f1.g g(p1.b bVar, ej.a aVar) {
        int i10;
        int i11;
        int i12;
        fj.t tVar = new fj.t();
        tVar.f6805a = -1;
        synchronized (this.f730a) {
            Throwable th2 = (Throwable) this.f731b;
            if (th2 != null) {
                bVar.b(th2);
                return f1.f.f6288b;
            }
            p1.a aVar2 = (p1.a) this.f732c;
            do {
                i10 = aVar2.get();
                i11 = i10 + 1;
            } while (!aVar2.compareAndSet(i10, i11));
            boolean z2 = (134217727 & i11) == 1;
            tVar.f6805a = (i11 >>> 27) & 15;
            ((q.b0) this.f733d).a(bVar);
            if (z2 && aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th3) {
                    synchronized (this.f730a) {
                        try {
                            if (((Throwable) this.f731b) == null) {
                                this.f731b = th3;
                                q.b0 b0Var = (q.b0) this.f733d;
                                Object[] objArr = b0Var.f13033a;
                                int i13 = b0Var.f13034b;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    ((p1.b) objArr[i14]).b(th3);
                                }
                                ((q.b0) this.f733d).d();
                                p1.a aVar3 = (p1.a) this.f732c;
                                do {
                                    i12 = aVar3.get();
                                } while (!aVar3.compareAndSet(i12, ((((i12 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            return new t0.j(new r3(bVar, this, tVar, 13));
        }
    }

    @Override // oi.a
    public Object get() {
        return new zb.a((Executor) ((oi.a) this.f730a).get(), (vb.d) ((oi.a) this.f731b).get(), (ac.d) ((p1.l) this.f732c).get(), (bc.d) ((oi.a) this.f733d).get(), (cc.c) ((oi.a) this.f734e).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi h(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f730a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f731b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f732c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f733d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f734e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.u(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f734e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f734e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.v.h(int):java.text.Bidi");
    }

    public w i() {
        if (((n) this.f730a) != null) {
            return new w(this);
        }
        throw new IllegalStateException("url == null");
    }

    public boolean j(int i10) {
        ArrayList arrayList = (ArrayList) this.f732c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            t6.a aVar = (t6.a) arrayList.get(i11);
            int i12 = aVar.f15819a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.f15820b;
                    int i14 = aVar.f15821c + i13;
                    while (i13 < i14) {
                        if (p(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (p(aVar.f15821c, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k() {
        yh.c cVar = (yh.c) this.f733d;
        ArrayList arrayList = (ArrayList) this.f732c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((yh.c) this.f733d).m((t6.a) arrayList.get(i10));
        }
        B(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f731b;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            t6.a aVar = (t6.a) arrayList2.get(i11);
            int i12 = aVar.f15819a;
            if (i12 == 1) {
                cVar.m(aVar);
                cVar.v(aVar.f15820b, aVar.f15821c);
            } else if (i12 == 2) {
                cVar.m(aVar);
                int i13 = aVar.f15820b;
                int i14 = aVar.f15821c;
                RecyclerView recyclerView = (RecyclerView) cVar.f20314b;
                recyclerView.N(i13, i14, true);
                recyclerView.z0 = true;
                recyclerView.w0.f15998c += i14;
            } else if (i12 == 4) {
                cVar.m(aVar);
                cVar.t(aVar.f15820b, aVar.f15821c);
            } else if (i12 == 8) {
                cVar.m(aVar);
                cVar.w(aVar.f15820b, aVar.f15821c);
            }
        }
        B(arrayList2);
    }

    public void l() {
        ef.f fVar = (ef.f) this.f730a;
        fVar.e("Create eager instances ...");
        long jB = oj.d.b();
        ac.d dVar = (ac.d) this.f733d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.f375d;
        int i10 = 0;
        uk.d[] dVarArr = (uk.d[]) concurrentHashMap.values().toArray(new uk.d[0]);
        ArrayList arrayListG = yd.f.g(Arrays.copyOf(dVarArr, dVarArr.length));
        concurrentHashMap.clear();
        v vVar = (v) dVar.f373b;
        v vVar2 = new v((ef.f) vVar.f730a, ((al.a) vVar.f732c).f768d, fj.w.a(uk.c.class), null);
        int size = arrayListG.size();
        while (i10 < size) {
            Object obj = arrayListG.get(i10);
            i10++;
            ((uk.d) obj).b(vVar2);
        }
        long jA = oj.e.a(jB);
        StringBuilder sb2 = new StringBuilder("Created eager instances in ");
        oj.f fVar2 = oj.a.f12531b;
        sb2.append(oj.a.p(jA, oj.c.f12537c) / 1000.0d);
        sb2.append(" ms");
        fVar.e(sb2.toString());
    }

    public void n(t6.a aVar) {
        int i10;
        s4.b bVar = (s4.b) this.f730a;
        int i11 = aVar.f15819a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iG = G(aVar.f15820b, i11);
        int i12 = aVar.f15820b;
        int i13 = aVar.f15819a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.f15821c; i15++) {
            int iG2 = G((i10 * i15) + aVar.f15820b, aVar.f15819a);
            int i16 = aVar.f15819a;
            if (i16 == 2 ? iG2 != iG : !(i16 == 4 && iG2 == iG + 1)) {
                t6.a aVarZ = z(i16, iG, i14);
                o(aVarZ, i12);
                bVar.c(aVarZ);
                if (aVar.f15819a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iG = iG2;
            } else {
                i14++;
            }
        }
        bVar.c(aVar);
        if (i14 > 0) {
            t6.a aVarZ2 = z(aVar.f15819a, iG, i14);
            o(aVarZ2, i12);
            bVar.c(aVarZ2);
        }
    }

    public void o(t6.a aVar, int i10) {
        yh.c cVar = (yh.c) this.f733d;
        cVar.m(aVar);
        int i11 = aVar.f15819a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            cVar.t(i10, aVar.f15821c);
        } else {
            int i12 = aVar.f15821c;
            RecyclerView recyclerView = (RecyclerView) cVar.f20314b;
            recyclerView.N(i10, i12, true);
            recyclerView.z0 = true;
            recyclerView.w0.f15998c += i12;
        }
    }

    public int p(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f732c;
        int size = arrayList.size();
        while (i11 < size) {
            t6.a aVar = (t6.a) arrayList.get(i11);
            int i12 = aVar.f15819a;
            if (i12 == 8) {
                int i13 = aVar.f15820b;
                if (i13 == i10) {
                    i10 = aVar.f15821c;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f15821c <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f15820b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f15821c;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f15821c;
                }
            }
            i11++;
        }
        return i10;
    }

    public void q(ej.c cVar) {
        int i10;
        synchronized (this.f730a) {
            try {
                q.b0 b0Var = (q.b0) this.f733d;
                this.f733d = (q.b0) this.f734e;
                this.f734e = b0Var;
                p1.a aVar = (p1.a) this.f732c;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
                int i11 = b0Var.f13034b;
                for (int i12 = 0; i12 < i11; i12++) {
                    cVar.invoke(b0Var.f(i12));
                }
                b0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float r(int i10, boolean z2) {
        Layout layout = (Layout) this.f730a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z2 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public float s(int i10, boolean z2, boolean z10) {
        int i11;
        int i12;
        int iW = i10;
        Layout layout = (Layout) this.f730a;
        if (!z10) {
            return r(i10, z2);
        }
        int iD = h3.g.d(layout, iW, z10);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (iW != lineStart && iW != lineEnd) {
            return r(i10, z2);
        }
        if (iW == 0 || iW == layout.getText().length()) {
            return r(i10, z2);
        }
        int iT = t(iW, z10);
        boolean z11 = layout.getParagraphDirection(layout.getLineForOffset(u(iT))) == -1;
        int iW2 = w(lineEnd, lineStart);
        int iU = u(iT);
        int i13 = lineStart - iU;
        int i14 = iW2 - iU;
        Bidi bidiH = h(iT);
        Bidi bidiCreateLineBidi = bidiH != null ? bidiH.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z2 || z11 == zIsRtlCharAt) {
                z11 = !z11;
            }
            return iW == lineStart ? z11 : !z11 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        h3.e[] eVarArr = new h3.e[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            eVarArr[i15] = new h3.e(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, eVarArr, 0, runCount);
        if (iW == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (eVarArr[i17].f7587a == iW) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z12 = (z2 || z11 == eVarArr[i12].f7589c) ? !z11 : z11;
            return (i12 == 0 && z12) ? layout.getLineLeft(iD) : (i12 != runCount - 1 || z12) ? z12 ? layout.getPrimaryHorizontal(eVarArr[i12 - 1].f7587a) : layout.getPrimaryHorizontal(eVarArr[i12 + 1].f7587a) : layout.getLineRight(iD);
        }
        if (iW > iW2) {
            iW = w(iW, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (eVarArr[i18].f7588b == iW) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z13 = (z2 || z11 == eVarArr[i11].f7589c) ? z11 : !z11;
        return (i11 == 0 && z13) ? layout.getLineLeft(iD) : (i11 != runCount - 1 || z13) ? z13 ? layout.getPrimaryHorizontal(eVarArr[i11 - 1].f7588b) : layout.getPrimaryHorizontal(eVarArr[i11 + 1].f7588b) : layout.getLineRight(iD);
    }

    public int t(int i10, boolean z2) {
        ArrayList arrayList = (ArrayList) this.f731b;
        int iK = yd.f.k(arrayList, Integer.valueOf(i10));
        int i11 = iK < 0 ? -(iK + 1) : iK + 1;
        if (z2 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public int u(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f731b).get(i10 - 1)).intValue();
    }

    public boolean v() {
        return ((ArrayList) this.f731b).size() > 0;
    }

    public int w(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f730a).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\u1680' && ((fj.l.h(cCharAt, 8192) < 0 || fj.l.h(cCharAt, 8202) > 0 || cCharAt == '\u2007') && cCharAt != '\u205f' && cCharAt != '\u3000')) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public void x(List list, boolean z2) throws a5.a {
        Object next;
        LinkedHashSet<wk.a> linkedHashSet = new LinkedHashSet();
        qi.j jVar = new qi.j(new qi.x(list));
        while (!jVar.isEmpty()) {
            wk.a aVar = (wk.a) jVar.removeLast();
            if (linkedHashSet.add(aVar)) {
                ArrayList arrayList = aVar.f19422e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    wk.a aVar2 = (wk.a) obj;
                    if (!linkedHashSet.contains(aVar2)) {
                        jVar.addLast(aVar2);
                    }
                }
            }
        }
        ac.d dVar = (ac.d) this.f733d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.f375d;
        for (wk.a aVar3 : linkedHashSet) {
            for (Map.Entry entry : aVar3.f19420c.entrySet()) {
                String str = (String) entry.getKey();
                uk.b bVar = (uk.b) entry.getValue();
                ef.f fVar = (ef.f) ((v) dVar.f373b).f730a;
                fj.l.f(str, "mapping");
                fj.l.f(bVar, "factory");
                sk.a aVar4 = bVar.f17136a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) dVar.f374c;
                if (((uk.b) concurrentHashMap2.get(str)) != null) {
                    if (!z2) {
                        String str2 = "Already existing definition for " + aVar4 + " at " + str;
                        fj.l.f(str2, "msg");
                        throw new a5.a(str2);
                    }
                    String str3 = "(+) override index '" + str + "' -> '" + aVar4 + '\'';
                    fVar.getClass();
                    fj.l.f(str3, "msg");
                    fVar.i(vk.a.f18136c, str3);
                    Iterator it = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((uk.d) next).f17136a.equals(aVar4)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((uk.d) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar4.hashCode()));
                    }
                }
                fVar.e("(+) index '" + str + "' -> '" + aVar4 + '\'');
                concurrentHashMap2.put(str, bVar);
            }
            for (uk.d dVar2 : aVar3.f19419b) {
                concurrentHashMap.put(Integer.valueOf(dVar2.f17136a.hashCode()), dVar2);
            }
        }
        al.a aVar5 = (al.a) this.f732c;
        aVar5.getClass();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            aVar5.f766b.addAll(((wk.a) it2.next()).f19421d);
        }
    }

    public void y(String str, x xVar) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (xVar != null && !hj.a.F(str)) {
            throw new IllegalArgumentException(m1.j("method ", str, " must not have a request body."));
        }
        if (xVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(m1.j("method ", str, " must have a request body."));
        }
        this.f731b = str;
        this.f733d = xVar;
    }

    public t6.a z(int i10, int i11, int i12) {
        t6.a aVar = (t6.a) ((s4.b) this.f730a).a();
        if (aVar != null) {
            aVar.f15819a = i10;
            aVar.f15820b = i11;
            aVar.f15821c = i12;
            return aVar;
        }
        t6.a aVar2 = new t6.a();
        aVar2.f15819a = i10;
        aVar2.f15820b = i11;
        aVar2.f15821c = i12;
        return aVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhU)).booleanValue()) {
            mc.n.D.f11582h.zzv(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            mc.n.D.f11582h.zzw(th2, "SignalGeneratorImpl.generateSignals");
        }
        zzfhm zzfhmVarC = xc.l.C((mf.a) this.f730a, (zzbzc) this.f731b);
        if (((Boolean) zzbev.zze.zze()).booleanValue() && zzfhmVarC != null) {
            zzfhb zzfhbVar = (zzfhb) this.f733d;
            zzfhbVar.zzh(th2);
            zzfhbVar.zzg(false);
            zzfhmVarC.zza(zzfhbVar);
            zzfhmVarC.zzh();
        }
        zzbyv zzbyvVar = (zzbyv) this.f732c;
        if (zzbyvVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            zzbyvVar.zzb(message);
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            rc.k.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public void zzb(Object obj) {
        zzbyv zzbyvVar = (zzbyv) this.f732c;
        zzfhb zzfhbVar = (zzfhb) this.f733d;
        xc.v vVar = (xc.v) obj;
        zzfhm zzfhmVarC = xc.l.C((mf.a) this.f730a, (zzbzc) this.f731b);
        xc.l lVar = (xc.l) this.f734e;
        lVar.U.set(true);
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhO)).booleanValue()) {
            if (zzbyvVar != null) {
                try {
                    zzbyvVar.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e10) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e10.toString());
                    int i10 = l0.f13401b;
                    rc.k.d(strConcat);
                }
            }
            if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                return;
            }
            zzfhbVar.zzc("QueryInfo generation has been disabled.");
            zzfhbVar.zzg(false);
            zzfhmVarC.zza(zzfhbVar);
            zzfhmVarC.zzh();
            return;
        }
        try {
            try {
                if (vVar == null) {
                    if (zzbyvVar != null) {
                        zzbyvVar.zzc(null, null, null);
                    }
                    zzfhbVar.zzg(true);
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                        return;
                    }
                    zzfhmVarC.zza(zzfhbVar);
                    zzfhmVarC.zzh();
                    return;
                }
                try {
                    String str = vVar.f20024a;
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(vVar.f20026c) ? new JSONObject(vVar.f20026c) : new JSONObject(vVar.f20025b)).optString("request_id", ""))) {
                        int i11 = l0.f13401b;
                        rc.k.g("The request ID is empty in request JSON.");
                        if (zzbyvVar != null) {
                            zzbyvVar.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfhbVar.zzc("Request ID empty");
                        zzfhbVar.zzg(false);
                        if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                            return;
                        }
                        zzfhmVarC.zza(zzfhbVar);
                        zzfhmVarC.zzh();
                        return;
                    }
                    Bundle bundle = vVar.f20029f;
                    boolean z2 = lVar.I;
                    String str2 = lVar.J;
                    String str3 = lVar.K;
                    if (z2 && bundle != null && bundle.getInt(str3, -1) == -1) {
                        bundle.putInt(str3, lVar.L.get());
                    }
                    if (lVar.H && bundle != null && TextUtils.isEmpty(bundle.getString(str2))) {
                        if (TextUtils.isEmpty(lVar.N)) {
                            lVar.N = mc.n.D.f11577c.y(lVar.f19962b, lVar.M.f14321a);
                        }
                        bundle.putString(str2, lVar.N);
                    }
                    if (zzbyvVar != null) {
                        if (TextUtils.isEmpty(vVar.f20026c)) {
                            zzbyvVar.zzc(str, vVar.f20025b, bundle);
                        } else {
                            zzbyvVar.zzc(str, vVar.f20026c, bundle);
                        }
                    }
                    zzfhbVar.zzg(true);
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                        return;
                    }
                    zzfhmVarC.zza(zzfhbVar);
                    zzfhmVarC.zzh();
                } catch (JSONException e11) {
                    int i12 = l0.f13401b;
                    rc.k.g("Failed to create JSON object from the request string.");
                    if (zzbyvVar != null) {
                        zzbyvVar.zzb("Internal error for request JSON: " + e11.toString());
                    }
                    zzfhbVar.zzh(e11);
                    zzfhbVar.zzg(false);
                    mc.n.D.f11582h.zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                        return;
                    }
                    zzfhmVarC.zza(zzfhbVar);
                    zzfhmVarC.zzh();
                }
            } catch (Throwable th2) {
                if (((Boolean) zzbev.zze.zze()).booleanValue() && zzfhmVarC != null) {
                    zzfhmVarC.zza(zzfhbVar);
                    zzfhmVarC.zzh();
                }
                throw th2;
            }
        } catch (RemoteException e12) {
            zzfhbVar.zzh(e12);
            zzfhbVar.zzg(false);
            int i13 = l0.f13401b;
            rc.k.e("", e12);
            mc.n.D.f11582h.zzw(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
            if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarC == null) {
                return;
            }
            zzfhmVarC.zza(zzfhbVar);
            zzfhmVarC.zzh();
        }
    }

    public v(Map map) {
        fj.l.f(map, "initialState");
        this.f730a = qi.v.n0(map);
        this.f731b = new LinkedHashMap();
        this.f732c = new LinkedHashMap();
        this.f733d = new LinkedHashMap();
        this.f734e = new c.g(this, 1);
    }

    public v(ef.f fVar, cl.a aVar, fj.f fVar2, yk.a aVar2) {
        fj.l.f(fVar, "logger");
        fj.l.f(aVar, "scope");
        this.f730a = fVar;
        this.f732c = aVar;
        this.f733d = fVar2;
        this.f734e = aVar2;
        this.f731b = "t:'" + dl.a.a(fVar2) + "' - q:'null'";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    public v(g3.f fVar, n0 n0Var, List list, s3.c cVar, k3.i iVar) {
        int i10;
        String strSubstring;
        ArrayList arrayList;
        String str;
        List list2;
        g3.f fVar2 = fVar;
        n0 n0Var2 = n0Var;
        this.f730a = fVar2;
        this.f731b = list;
        pi.f fVar3 = pi.f.f12998b;
        final int i11 = 0;
        this.f732c = u6.v.P(fVar3, new ej.a(this) { // from class: g3.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ak.v f7164b;

            {
                this.f7164b = this;
            }

            @Override // ej.a
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f7164b.f734e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fB = ((r) obj3).f7173a.b();
                            int iB = yd.f.B(arrayList2);
                            int i12 = 1;
                            if (1 <= iB) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i12);
                                    float fB2 = ((r) obj4).f7173a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i12 != iB) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        return Float.valueOf(rVar != null ? rVar.f7173a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f7164b.f734e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((r) obj5).f7173a.B.c();
                            int iB2 = yd.f.B(arrayList3);
                            int i13 = 1;
                            if (1 <= iB2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((r) obj6).f7173a.B.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iB2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        return Float.valueOf(rVar2 != null ? rVar2.f7173a.B.c() : 0.0f);
                }
            }
        });
        final int i12 = 1;
        this.f733d = u6.v.P(fVar3, new ej.a(this) { // from class: g3.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ak.v f7164b;

            {
                this.f7164b = this;
            }

            @Override // ej.a
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f7164b.f734e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fB = ((r) obj3).f7173a.b();
                            int iB = yd.f.B(arrayList2);
                            int i122 = 1;
                            if (1 <= iB) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i122);
                                    float fB2 = ((r) obj4).f7173a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i122 != iB) {
                                        i122++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        return Float.valueOf(rVar != null ? rVar.f7173a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f7164b.f734e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((r) obj5).f7173a.B.c();
                            int iB2 = yd.f.B(arrayList3);
                            int i13 = 1;
                            if (1 <= iB2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((r) obj6).f7173a.B.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iB2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        return Float.valueOf(rVar2 != null ? rVar2.f7173a.B.c() : 0.0f);
                }
            }
        });
        g3.t tVar = n0Var2.f7152b;
        g3.f fVar4 = g3.g.f7099a;
        ArrayList arrayList2 = fVar2.f7083d;
        String str2 = fVar2.f7081b;
        qi.s sVar = qi.s.f13520a;
        List listL0 = arrayList2 != null ? qi.l.L0(new g3.e(i12), arrayList2) : sVar;
        ArrayList arrayList3 = new ArrayList();
        qi.j jVar = new qi.j();
        int size = listL0.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            g3.d dVar = (g3.d) listL0.get(i13);
            g3.d dVarA = g3.d.a(dVar, tVar.a((g3.t) dVar.f7045a), i11, 14);
            Object obj = dVarA.f7045a;
            int i15 = dVarA.f7047c;
            int i16 = dVarA.f7046b;
            while (i14 < i16 && !jVar.isEmpty()) {
                g3.d dVar2 = (g3.d) jVar.last();
                List list3 = listL0;
                int i17 = dVar2.f7047c;
                qi.s sVar2 = sVar;
                Object obj2 = dVar2.f7045a;
                if (i16 < i17) {
                    arrayList3.add(new g3.d(i14, i16, obj2));
                    i14 = i16;
                    listL0 = list3;
                    sVar = sVar2;
                } else {
                    int i18 = size;
                    arrayList3.add(new g3.d(i14, i17, obj2));
                    i14 = dVar2.f7047c;
                    while (!jVar.isEmpty() && i14 == ((g3.d) jVar.last()).f7047c) {
                        jVar.removeLast();
                    }
                    listL0 = list3;
                    sVar = sVar2;
                    size = i18;
                }
            }
            List list4 = listL0;
            qi.s sVar3 = sVar;
            int i19 = size;
            if (i14 < i16) {
                arrayList3.add(new g3.d(i14, i16, tVar));
                i14 = i16;
            }
            g3.d dVar3 = (g3.d) jVar.z();
            if (dVar3 != null) {
                int i20 = dVar3.f7047c;
                Object obj3 = dVar3.f7045a;
                int i21 = dVar3.f7046b;
                if (i21 == i16 && i20 == i15) {
                    jVar.removeLast();
                    jVar.addLast(new g3.d(i16, i15, ((g3.t) obj3).a((g3.t) obj)));
                } else if (i21 == i20) {
                    arrayList3.add(new g3.d(i21, i20, obj3));
                    jVar.removeLast();
                    jVar.addLast(new g3.d(i16, i15, obj));
                } else if (i20 >= i15) {
                    jVar.addLast(new g3.d(i16, i15, ((g3.t) obj3).a((g3.t) obj)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                jVar.addLast(new g3.d(i16, i15, obj));
            }
            i13++;
            listL0 = list4;
            sVar = sVar3;
            size = i19;
            i11 = 0;
        }
        qi.s sVar4 = sVar;
        while (i14 <= str2.length() && !jVar.isEmpty()) {
            g3.d dVar4 = (g3.d) jVar.last();
            Object obj4 = dVar4.f7045a;
            int i22 = dVar4.f7047c;
            arrayList3.add(new g3.d(i14, i22, obj4));
            while (!jVar.isEmpty() && i22 == ((g3.d) jVar.last()).f7047c) {
                jVar.removeLast();
            }
            i14 = i22;
        }
        if (i14 < str2.length()) {
            arrayList3.add(new g3.d(i14, str2.length(), tVar));
        }
        if (arrayList3.isEmpty()) {
            i10 = 0;
            arrayList3.add(new g3.d(0, 0, tVar));
        } else {
            i10 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i23 = i10;
        while (i23 < size2) {
            g3.d dVar5 = (g3.d) arrayList3.get(i23);
            int i24 = dVar5.f7046b;
            int i25 = dVar5.f7047c;
            if (i24 != i25) {
                strSubstring = str2.substring(i24, i25);
                fj.l.e(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = g3.g.a(fVar2, i24, i25, new fb.e(2));
            g3.f fVar5 = new g3.f(strSubstring, listA == null ? sVar4 : listA);
            g3.t tVar2 = (g3.t) dVar5.f7045a;
            if (tVar2.f7177b == 0) {
                arrayList = arrayList3;
                str = str2;
                tVar2 = new g3.t(tVar2.f7176a, tVar.f7177b, tVar2.f7178c, tVar2.f7179d, tVar2.f7180e, tVar2.f7181f, tVar2.f7182g, tVar2.f7183h, tVar2.f7184i);
            } else {
                arrayList = arrayList3;
                str = str2;
            }
            n0 n0Var3 = new n0(n0Var2.f7151a, tVar.a(tVar2));
            ?? r52 = fVar5.f7080a;
            qi.s sVar5 = r52 == 0 ? sVar4 : r52;
            List list5 = (List) this.f731b;
            ArrayList arrayList5 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i26 = 0;
            while (i26 < size3) {
                g3.d dVar6 = (g3.d) list5.get(i26);
                int i27 = dVar6.f7046b;
                g3.t tVar3 = tVar;
                int i28 = dVar6.f7047c;
                if (g3.g.b(i24, i25, i27, i28)) {
                    if (i24 > i27 || i28 > i25) {
                        m3.a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList5.add(new g3.d(i27 - i24, i28 - i24, dVar6.f7045a));
                } else {
                    list2 = list5;
                }
                i26++;
                list5 = list2;
                tVar = tVar3;
            }
            arrayList4.add(new g3.r(new o3.c(strSubstring, n0Var3, sVar5, arrayList5, iVar, cVar), i24, i25));
            i23++;
            fVar2 = fVar;
            n0Var2 = n0Var;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f734e = arrayList4;
    }

    public v(int i10) {
        switch (i10) {
            case 9:
                this.f730a = new Object();
                this.f732c = new p1.a(0);
                this.f733d = new q.b0();
                this.f734e = new q.b0();
                break;
            case 10:
                vk.a aVar = vk.a.f18134a;
                this.f730a = new ef.f();
                this.f731b = new mh.g(this);
                this.f732c = new al.a(this);
                this.f733d = new ac.d(this);
                new ConcurrentHashMap();
                new HashMap();
                this.f734e = new d8.e(2);
                break;
            default:
                this.f734e = Collections.EMPTY_MAP;
                this.f731b = "GET";
                this.f732c = new yh.c(2);
                break;
        }
    }
}
