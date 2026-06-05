package a8;

import ak.v;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import fj.l;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import og.k;
import og.m;
import og.n;
import q.p0;
import r5.u;
import r5.x;
import t.a0;
import t.q;
import t.t1;
import w5.i0;
import w5.k0;
import w5.n0;
import w5.t;
import wh.s;
import zg.p;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements Continuation, kh.b, t1, xg.b {

    /* renamed from: e, reason: collision with root package name */
    public static j f214e;

    /* renamed from: a, reason: collision with root package name */
    public Object f215a;

    /* renamed from: b, reason: collision with root package name */
    public Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public Object f217c;

    /* renamed from: d, reason: collision with root package name */
    public Object f218d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f215a = obj;
        this.f216b = obj2;
        this.f217c = obj3;
        this.f218d = obj4;
    }

    public static synchronized j A(Context context, f8.a aVar) {
        try {
            if (f214e == null) {
                j jVar = new j();
                Context applicationContext = context.getApplicationContext();
                jVar.f215a = new a(applicationContext, aVar);
                jVar.f216b = new b(applicationContext, aVar);
                jVar.f217c = new h(applicationContext, aVar);
                jVar.f218d = new i(applicationContext, aVar);
                f214e = jVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f214e;
    }

    public static n n(List list, Map map, Comparator comparator) {
        j jVar = new j();
        jVar.f215a = list;
        jVar.f216b = map;
        Collections.sort(list, comparator);
        m mVar = new m(list.size());
        int i10 = mVar.f12527b - 1;
        int size = list.size();
        while (i10 >= 0) {
            boolean z2 = (((long) (1 << i10)) & mVar.f12526a) == 0;
            int iPow = (int) Math.pow(2.0d, i10);
            i10--;
            size -= iPow;
            if (z2) {
                jVar.p(2, iPow, size);
            } else {
                jVar.p(2, iPow, size);
                size -= iPow;
                jVar.p(1, iPow, size);
            }
        }
        og.i iVar = (k) jVar.f217c;
        if (iVar == null) {
            iVar = og.h.f12518a;
        }
        return new n(iVar, comparator);
    }

    public void B(n0 n0Var) {
        t tVar = n0Var.f18698c;
        String str = tVar.f18761e;
        HashMap map = (HashMap) this.f216b;
        if (map.get(str) != null) {
            return;
        }
        map.put(tVar.f18761e, n0Var);
        if (i0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + tVar);
        }
    }

    public void C(n0 n0Var) {
        HashMap map = (HashMap) this.f216b;
        t tVar = n0Var.f18698c;
        if (tVar.V) {
            ((k0) this.f218d).h(tVar);
        }
        if (map.get(tVar.f18761e) == n0Var && ((n0) map.put(tVar.f18761e, null)) != null && i0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + tVar);
        }
    }

    public boolean D(p pVar) {
        zg.k kVar = (zg.k) this.f216b;
        return kVar.compare((p) this.f217c, pVar) <= 0 && kVar.compare(pVar, (p) this.f218d) <= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.j.E():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v3, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a8.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(vi.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f216b
            qj.r r0 = (qj.r) r0
            boolean r1 = r9 instanceof m5.l0
            if (r1 == 0) goto L17
            r1 = r9
            m5.l0 r1 = (m5.l0) r1
            int r2 = r1.f11334d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f11334d = r2
            goto L1c
        L17:
            m5.l0 r1 = new m5.l0
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.f11332b
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f11334d
            r4 = 2
            r5 = 1
            pi.o r6 = pi.o.f13011a
            r7 = 0
            if (r3 == 0) goto L44
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            yj.a r1 = r1.f11331a
            uk.c.R(r9)     // Catch: java.lang.Throwable -> L33
            goto L73
        L33:
            r9 = move-exception
            goto L7d
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            yj.a r3 = r1.f11331a
            uk.c.R(r9)
            r9 = r3
            goto L5d
        L44:
            uk.c.R(r9)
            boolean r9 = r0.M()
            if (r9 == 0) goto L4e
            return r6
        L4e:
            java.lang.Object r9 = r8.f215a
            yj.c r9 = (yj.c) r9
            r1.f11331a = r9
            r1.f11334d = r5
            java.lang.Object r3 = r9.b(r1)
            if (r3 != r2) goto L5d
            goto L71
        L5d:
            boolean r3 = r0.M()     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L67
            r9.e(r7)
            return r6
        L67:
            r1.f11331a = r9     // Catch: java.lang.Throwable -> L7a
            r1.f11334d = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r8.r(r1)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r2) goto L72
        L71:
            return r2
        L72:
            r1 = r9
        L73:
            r0.R(r6)     // Catch: java.lang.Throwable -> L33
            r1.e(r7)
            return r6
        L7a:
            r0 = move-exception
            r1 = r9
            r9 = r0
        L7d:
            r1.e(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.j.F(vi.c):java.lang.Object");
    }

    public Bundle G(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f217c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // t.q1
    public long b(t.p pVar, t.p pVar2, t.p pVar3) {
        int iB = pVar.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, ((q) this.f215a).get(i10).c(pVar.a(i10), pVar2.a(i10), pVar3.a(i10)));
        }
        return jMax;
    }

    public void c(t tVar) {
        if (((ArrayList) this.f215a).contains(tVar)) {
            throw new IllegalStateException("Fragment already added: " + tVar);
        }
        synchronized (((ArrayList) this.f215a)) {
            ((ArrayList) this.f215a).add(tVar);
        }
        tVar.D = true;
    }

    @Override // t.q1
    public t.p d(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        if (((t.p) this.f216b) == null) {
            this.f216b = pVar.c();
        }
        t.p pVar4 = (t.p) this.f216b;
        if (pVar4 == null) {
            l.l("valueVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t.p pVar5 = (t.p) this.f216b;
            if (pVar5 == null) {
                l.l("valueVector");
                throw null;
            }
            pVar5.e(((q) this.f215a).get(i10).e(j, pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        t.p pVar6 = (t.p) this.f216b;
        if (pVar6 != null) {
            return pVar6;
        }
        l.l("valueVector");
        throw null;
    }

    @Override // xg.b
    public yh.c e() {
        return (yh.c) this.f215a;
    }

    @Override // xg.b
    public boolean f() {
        return true;
    }

    @Override // oi.a
    public Object get() {
        return new jh.a((oh.b) ((ag.i) this.f215a).f449b, (oh.b) ((ag.i) this.f216b).f449b, (kg.p) ((ag.i) this.f217c).f449b, (Executor) ((ag.i) this.f218d).f449b);
    }

    @Override // xg.b
    public zg.k getIndex() {
        return (zg.k) this.f216b;
    }

    @Override // xg.b
    public zg.l h(zg.l lVar, zg.c cVar, r rVar, rg.h hVar, xg.a aVar, rg.a aVar2) {
        if (!D(new p(cVar, rVar))) {
            rVar = zg.j.f20603e;
        }
        return ((yh.c) this.f215a).h(lVar, cVar, rVar, hVar, aVar, aVar2);
    }

    @Override // xg.b
    public zg.l i(zg.l lVar, zg.l lVar2, rg.a aVar) {
        zg.l lVar3;
        if (lVar2.f20605a.n()) {
            lVar3 = new zg.l(zg.j.f20603e, (zg.k) this.f216b);
        } else {
            lVar3 = new zg.l(lVar2.f20605a.m(zg.j.f20603e), lVar2.f20607c, lVar2.f20606b);
            Iterator it = lVar2.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (!D(pVar)) {
                    lVar3 = lVar3.i(pVar.f20614a, zg.j.f20603e);
                }
            }
        }
        ((yh.c) this.f215a).i(lVar, lVar3, aVar);
        return lVar3;
    }

    @Override // t.q1
    public t.p j(t.p pVar, t.p pVar2, t.p pVar3) {
        if (((t.p) this.f218d) == null) {
            this.f218d = pVar3.c();
        }
        t.p pVar4 = (t.p) this.f218d;
        if (pVar4 == null) {
            l.l("endVelocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t.p pVar5 = (t.p) this.f218d;
            if (pVar5 == null) {
                l.l("endVelocityVector");
                throw null;
            }
            pVar5.e(((q) this.f215a).get(i10).d(pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        t.p pVar6 = (t.p) this.f218d;
        if (pVar6 != null) {
            return pVar6;
        }
        l.l("endVelocityVector");
        throw null;
    }

    @Override // t.q1
    public t.p k(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        if (((t.p) this.f217c) == null) {
            this.f217c = pVar3.c();
        }
        t.p pVar4 = (t.p) this.f217c;
        if (pVar4 == null) {
            l.l("velocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t.p pVar5 = (t.p) this.f217c;
            if (pVar5 == null) {
                l.l("velocityVector");
                throw null;
            }
            pVar5.e(((q) this.f215a).get(i10).b(j, pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        t.p pVar6 = (t.p) this.f217c;
        if (pVar6 != null) {
            return pVar6;
        }
        l.l("velocityVector");
        throw null;
    }

    public vf.k l() throws GeneralSecurityException {
        Integer num = (Integer) this.f215a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f216b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((vf.c) this.f217c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((vf.c) this.f218d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f215a));
        }
        Integer num2 = (Integer) this.f216b;
        int iIntValue = num2.intValue();
        vf.c cVar = (vf.c) this.f217c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (cVar == vf.c.f18029g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (cVar == vf.c.f18030h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (cVar == vf.c.f18031i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (cVar == vf.c.j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (cVar != vf.c.f18032k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new vf.k(((Integer) this.f215a).intValue(), ((Integer) this.f216b).intValue(), (vf.c) this.f218d, (vf.c) this.f217c);
    }

    public og.i m(int i10, int i11) {
        Map map = (Map) this.f216b;
        List list = (List) this.f215a;
        if (i11 == 0) {
            return og.h.f12518a;
        }
        if (i11 == 1) {
            Object obj = list.get(i10);
            return new og.g(obj, map.get(obj), null, null);
        }
        int i12 = i11 / 2;
        int i13 = i10 + i12;
        og.i iVarM = m(i10, i12);
        og.i iVarM2 = m(i13 + 1, i12);
        Object obj2 = list.get(i13);
        return new og.g(obj2, map.get(obj2), iVarM, iVarM2);
    }

    public void p(int i10, int i11, int i12) {
        Map map = (Map) this.f216b;
        og.i iVarM = m(i12 + 1, i11 - 1);
        Object obj = ((List) this.f215a).get(i12);
        k jVar = i10 == 1 ? new og.j(obj, map.get(obj), null, iVarM) : new og.g(obj, map.get(obj), null, iVarM);
        if (((k) this.f217c) == null) {
            this.f217c = jVar;
            this.f218d = jVar;
        } else {
            ((k) this.f218d).r(jVar);
            this.f218d = jVar;
        }
    }

    public void q(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((p0) this.f216b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                q(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(vi.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f218d
            m5.z r0 = (m5.z) r0
            boolean r1 = r7 instanceof m5.g
            if (r1 == 0) goto L17
            r1 = r7
            m5.g r1 = (m5.g) r1
            int r2 = r1.f11297c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f11297c = r2
            goto L1c
        L17:
            m5.g r1 = new m5.g
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f11295a
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f11297c
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            uk.c.R(r7)
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            uk.c.R(r7)
            goto L6a
        L3a:
            uk.c.R(r7)
            java.lang.Object r7 = r6.f217c
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L60
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4a
            goto L60
        L4a:
            m5.o0 r7 = r0.g()
            m5.j r3 = new m5.j
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.f11297c = r4
            java.lang.Object r7 = r7.b(r3, r1)
            if (r7 != r2) goto L5d
            goto L69
        L5d:
            m5.c r7 = (m5.c) r7
            goto L6c
        L60:
            r1.f11297c = r5
            r7 = 0
            java.lang.Object r7 = m5.z.f(r0, r7, r1)
            if (r7 != r2) goto L6a
        L69:
            return r2
        L6a:
            m5.c r7 = (m5.c) r7
        L6c:
            m5.a0 r0 = r0.f11413f
            r0.b(r7)
            pi.o r7 = pi.o.f13011a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.j.r(vi.c):java.lang.Object");
    }

    public t s(String str) {
        n0 n0Var = (n0) ((HashMap) this.f216b).get(str);
        if (n0Var != null) {
            return n0Var.f18698c;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        v vVar;
        v vVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f215a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f216b;
        String str = (String) this.f217c;
        yh.c cVar = (yh.c) this.f218d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        e0.i(exception);
        if (!zzach.zzc(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            vVar = firebaseAuth.j;
        }
        if (vVar == null) {
            cg.i iVar = firebaseAuth.f4252a;
            jg.t tVar = new jg.t();
            v vVar3 = new v();
            vVar3.f730a = new HashMap();
            vVar3.f732c = iVar;
            vVar3.f733d = firebaseAuth;
            vVar3.f734e = tVar;
            synchronized (firebaseAuth) {
                firebaseAuth.j = vVar3;
            }
        }
        synchronized (firebaseAuth) {
            vVar2 = firebaseAuth.j;
        }
        return vVar2.H(str, Boolean.FALSE, recaptchaAction).continueWithTask(cVar).continueWithTask(new s(str, vVar2, recaptchaAction, cVar));
    }

    public ak.t u(String str) {
        Iterator it = ((ArrayDeque) this.f217c).iterator();
        while (it.hasNext()) {
            ak.t tVar = (ak.t) it.next();
            if (tVar.f725e.f728c.f735a.f676d.equals(str)) {
                return tVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f216b).iterator();
        while (it2.hasNext()) {
            ak.t tVar2 = (ak.t) it2.next();
            if (tVar2.f725e.f728c.f735a.f676d.equals(str)) {
                return tVar2;
            }
        }
        return null;
    }

    public t v(String str) {
        for (n0 n0Var : ((HashMap) this.f216b).values()) {
            if (n0Var != null) {
                t tVarV = n0Var.f18698c;
                if (!str.equals(tVarV.f18761e)) {
                    tVarV = tVarV.O.f18643c.v(str);
                }
                if (tVarV != null) {
                    return tVarV;
                }
            }
        }
        return null;
    }

    public void w(ak.t tVar) {
        tVar.f724d.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f217c;
        synchronized (this) {
            if (!arrayDeque.remove(tVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        E();
    }

    public ArrayList x() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : ((HashMap) this.f216b).values()) {
            if (n0Var != null) {
                arrayList.add(n0Var);
            }
        }
        return arrayList;
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : ((HashMap) this.f216b).values()) {
            if (n0Var != null) {
                arrayList.add(n0Var.f18698c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List z() {
        ArrayList arrayList;
        if (((ArrayList) this.f215a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f215a)) {
            arrayList = new ArrayList((ArrayList) this.f215a);
        }
        return arrayList;
    }

    public j(wg.g gVar) {
        p pVarC;
        p pVarD;
        zg.k kVar = gVar.f19304e;
        this.f215a = new yh.c(kVar, 26);
        this.f216b = kVar;
        if (!gVar.b()) {
            pVarC = p.f20612c;
        } else {
            if (!gVar.b()) {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
            zg.c cVar = gVar.f19301b;
            cVar = cVar == null ? zg.c.f20589b : cVar;
            zg.k kVar2 = gVar.f19304e;
            if (!gVar.b()) {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
            pVarC = kVar2.c(cVar, gVar.f19300a);
        }
        this.f217c = pVarC;
        r rVar = gVar.f19302c;
        if (rVar == null) {
            pVarD = gVar.f19304e.d();
        } else {
            if (rVar == null) {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
            zg.c cVar2 = gVar.f19303d;
            cVar2 = cVar2 == null ? zg.c.f20590c : cVar2;
            zg.k kVar3 = gVar.f19304e;
            if (rVar == null) {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
            pVarD = kVar3.c(cVar2, rVar);
        }
        this.f218d = pVarD;
    }

    public j(int i10) {
        switch (i10) {
            case 4:
                this.f215a = new s4.b(10);
                this.f216b = new p0(0);
                this.f217c = new ArrayList();
                this.f218d = new HashSet();
                break;
            case 13:
                this.f215a = new ArrayList();
                this.f216b = new HashMap();
                this.f217c = new HashMap();
                break;
            default:
                this.f216b = new ArrayDeque();
                this.f217c = new ArrayDeque();
                this.f218d = new ArrayDeque();
                break;
        }
    }

    @Override // xg.b
    public zg.l g(zg.l lVar, r rVar) {
        return lVar;
    }

    public j(Typeface typeface, s5.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f218d = typeface;
        this.f215a = bVar;
        this.f217c = new u(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f14535a;
            i10 = ((ByteBuffer) bVar.f14538d).getInt(((ByteBuffer) bVar.f14538d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f216b = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f14535a;
            i11 = ((ByteBuffer) bVar.f14538d).getInt(((ByteBuffer) bVar.f14538d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            x xVar = new x(this, i16);
            s5.a aVarB = xVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f14538d).getInt(iA3 + aVarB.f14535a) : 0, (char[]) this.f216b, i16 * 2);
            s5.a aVarB2 = xVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f14535a;
                i12 = ((ByteBuffer) aVarB2.f14538d).getInt(((ByteBuffer) aVarB2.f14538d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            uk.c.n("invalid metadata codepoint length", i12 > 0);
            u uVar = (u) this.f217c;
            s5.a aVarB3 = xVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i18 = iA5 + aVarB3.f14535a;
                i13 = ((ByteBuffer) aVarB3.f14538d).getInt(((ByteBuffer) aVarB3.f14538d).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            uVar.a(xVar, 0, i13 - 1);
        }
    }

    public j(q qVar) {
        this.f215a = qVar;
    }

    public j(a0 a0Var) {
        this(new ld.i(a0Var, 21));
    }
}
