package wh;

import android.content.Context;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.a1;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tj.r0;
import zf.e1;
import zf.q1;
import zf.y0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s implements wb.b, Continuation, rc.g, w1.g {

    /* renamed from: e, reason: collision with root package name */
    public static s f19378e;

    /* renamed from: a, reason: collision with root package name */
    public Object f19379a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19380b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19381c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19382d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f19379a = obj;
        this.f19380b = obj2;
        this.f19381c = obj3;
        this.f19382d = obj4;
    }

    public static void a(s sVar, j6.d dVar) {
        sVar.getClass();
        fj.l.f(dVar, "handler");
        if (((LinkedHashSet) sVar.f19381c).add(dVar)) {
            j6.g gVar = (j6.g) sVar.f19380b;
            gVar.getClass();
            if (dVar.f8704c == null) {
                gVar.f8713e.addFirst(dVar);
                dVar.f8704c = sVar;
                gVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + dVar + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public static synchronized s i() {
        try {
            if (f19378e == null) {
                f19378e = new s(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19378e;
    }

    public void b(j6.f fVar) {
        if (((LinkedHashSet) this.f19382d).add(fVar)) {
            ((j6.g) this.f19380b).a(this, fVar, -1);
        }
    }

    public void c(j6.k kVar, int i10) {
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.f19382d).add(kVar)) {
            ((j6.g) this.f19380b).a(this, kVar, i10);
        }
    }

    public void d(Object obj, Object obj2, e1 e1Var, boolean z2) {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f19380b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (e1Var.D() != y0.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f19380b;
        Integer numValueOf = Integer.valueOf(e1Var.B());
        if (e1Var.C() == q1.RAW) {
            numValueOf = null;
        }
        nf.b bVarA = uf.i.f17042b.a(uf.p.m(e1Var.A().B(), e1Var.A().C(), e1Var.A().A(), e1Var.C(), numValueOf));
        int iOrdinal = e1Var.C().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(e1Var.B()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e1Var.B()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e1Var.B()).array();
        } else {
            bArrArray = nf.b.f12312a;
        }
        nf.k kVar = new nf.k(obj, obj2, bArrArray, e1Var.D(), e1Var.C(), e1Var.B(), e1Var.A().B(), bVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        byte[] bArr = kVar.f12326c;
        nf.l lVar = new nf.l(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(kVar);
            concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList2));
        }
        if (z2) {
            if (((nf.k) this.f19381c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f19381c = kVar;
        }
    }

    public IOException e(boolean z2, boolean z10, IOException iOException) {
        ak.j jVar = (ak.j) this.f19380b;
        if (iOException != null) {
            s(iOException);
        }
        if (z10) {
            if (iOException != null) {
                jVar.getClass();
            } else {
                jVar.getClass();
            }
        }
        if (z2) {
            if (iOException != null) {
                jVar.getClass();
            } else {
                jVar.getClass();
            }
        }
        return ((dk.k) this.f19379a).c(this, z10, z2, iOException);
    }

    @Override // rc.g
    public void f(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.f19379a;
        String str2 = (String) this.f19380b;
        Map map = (Map) this.f19381c;
        byte[] bArr = (byte[]) this.f19382d;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        rc.h.e(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public void g(j6.f fVar, j6.b bVar) {
        j6.g gVar = (j6.g) this.f19380b;
        gVar.getClass();
        if (gVar.f8715g != 0) {
            return;
        }
        j6.d dVarC = gVar.c(-1);
        gVar.f8714f = dVarC;
        gVar.f8715g = -1;
        gVar.f8716h = fVar;
        if (bVar != null) {
            if (dVarC != null) {
                dVarC.d(bVar);
            }
            r0 r0Var = gVar.f8709a;
            j6.i iVar = new j6.i(bVar);
            r0Var.getClass();
            r0Var.k(null, iVar);
        }
    }

    @Override // oi.a
    public Object get() {
        return new a8.j((Executor) ((oi.a) this.f19379a).get(), (bc.d) ((oi.a) this.f19380b).get(), (ac.d) ((p1.l) this.f19381c).get(), (cc.c) ((oi.a) this.f19382d).get());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void h(p2.n nVar, boolean z2) {
        p2.d0 d0Var = (p2.d0) this.f19382d;
        ?? r12 = nVar.f12734a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p2.w) r12.get(i10)).b()) {
                r(nVar);
                return;
            }
        }
        t2.w wVar = (t2.w) this.f19379a;
        if (wVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        p2.v.i(nVar, wVar.q0(0L), new c2.p(4, this, d0Var), false);
        if (((p2.b0) this.f19380b) == p2.b0.f12670b) {
            if (z2) {
                int size2 = r12.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((p2.w) r12.get(i11)).a();
                }
            }
            p2.h hVar = nVar.f12735b;
            if (hVar != null) {
                hVar.f12699b = !d0Var.f12690d;
            }
        }
    }

    public x0 j(fj.f fVar, String str) {
        x0 x0Var;
        x0 x0VarA;
        fj.l.f(str, "key");
        synchronized (((lh.e) this.f19382d)) {
            try {
                a1 a1Var = (a1) this.f19379a;
                a1Var.getClass();
                x0Var = (x0) a1Var.f1061a.get(str);
                if (fVar.d(x0Var)) {
                    z0 z0Var = (z0) this.f19380b;
                    if (z0Var instanceof u0) {
                        u0 u0Var = (u0) z0Var;
                        fj.l.c(x0Var);
                        u0Var.getClass();
                        androidx.lifecycle.v vVar = u0Var.f1137d;
                        if (vVar != null) {
                            mh.g gVar = u0Var.f1138e;
                            fj.l.c(gVar);
                            androidx.lifecycle.r0.a(x0Var, gVar, vVar);
                        }
                    }
                    fj.l.d(x0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    d6.c cVar = new d6.c((d6.b) this.f19381c);
                    cVar.f4977a.put(androidx.lifecycle.r0.f1126e, str);
                    z0 z0Var2 = (z0) this.f19380b;
                    fj.l.f(z0Var2, "factory");
                    try {
                        try {
                            x0VarA = z0Var2.e(fVar, cVar);
                        } catch (AbstractMethodError unused) {
                            x0VarA = z0Var2.a(cg.b.D(fVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        x0VarA = z0Var2.c(cg.b.D(fVar), cVar);
                    }
                    x0Var = x0VarA;
                    a1 a1Var2 = (a1) this.f19379a;
                    a1Var2.getClass();
                    fj.l.f(x0Var, "viewModel");
                    x0 x0Var2 = (x0) a1Var2.f1061a.put(str, x0Var);
                    if (x0Var2 != null) {
                        x0Var2.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x0Var;
    }

    public boolean k(Context context) {
        if (((Boolean) this.f19381c) == null) {
            this.f19381c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f19380b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f19381c).booleanValue();
    }

    public boolean l(Context context) {
        if (((Boolean) this.f19380b) == null) {
            this.f19380b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f19380b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f19380b).booleanValue();
    }

    public ak.y m(boolean z2) throws IOException {
        try {
            ak.y yVarE = ((ek.b) this.f19382d).e(z2);
            if (yVarE == null) {
                return yVarE;
            }
            ak.j.f658c.getClass();
            yVarE.f756m = this;
            return yVarE;
        } catch (IOException e10) {
            ((ak.j) this.f19380b).getClass();
            s(e10);
            throw e10;
        }
    }

    public void n(uf.a aVar) throws GeneralSecurityException {
        aVar.getClass();
        uf.r rVar = new uf.r(uf.p.class, aVar.f17032a);
        HashMap map = (HashMap) this.f19380b;
        if (!map.containsKey(rVar)) {
            map.put(rVar, aVar);
            return;
        }
        uf.a aVar2 = (uf.a) map.get(rVar);
        if (aVar2.equals(aVar) && aVar.equals(aVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + rVar);
    }

    public void o(uf.c cVar) throws GeneralSecurityException {
        uf.s sVar = new uf.s(cVar.f17034a, uf.p.class);
        HashMap map = (HashMap) this.f19379a;
        if (!map.containsKey(sVar)) {
            map.put(sVar, cVar);
            return;
        }
        uf.c cVar2 = (uf.c) map.get(sVar);
        if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + sVar);
    }

    public void p(uf.j jVar) throws GeneralSecurityException {
        jVar.getClass();
        uf.r rVar = new uf.r(uf.q.class, jVar.f17044a);
        HashMap map = (HashMap) this.f19382d;
        if (!map.containsKey(rVar)) {
            map.put(rVar, jVar);
            return;
        }
        uf.j jVar2 = (uf.j) map.get(rVar);
        if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + rVar);
    }

    public void q(uf.k kVar) throws GeneralSecurityException {
        uf.s sVar = new uf.s(kVar.f17045a, uf.q.class);
        HashMap map = (HashMap) this.f19381c;
        if (!map.containsKey(sVar)) {
            map.put(sVar, kVar);
            return;
        }
        uf.k kVar2 = (uf.k) map.get(sVar);
        if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + sVar);
    }

    public void r(p2.n nVar) {
        if (((p2.b0) this.f19380b) == p2.b0.f12670b) {
            t2.w wVar = (t2.w) this.f19379a;
            if (wVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            p2.v.i(nVar, wVar.q0(0L), new p2.c0((p2.d0) this.f19382d, 1), true);
        }
        this.f19380b = p2.b0.f12671c;
    }

    public void s(IOException iOException) {
        dk.d dVar = (dk.d) this.f19381c;
        synchronized (dVar.f5161c) {
            dVar.f5166h = true;
        }
        dk.e eVarF = ((ek.b) this.f19382d).f();
        synchronized (eVarF.f5168b) {
            try {
                if (iOException instanceof gk.b0) {
                    int i10 = ((gk.b0) iOException).f7438a;
                    if (i10 == 5) {
                        int i11 = eVarF.f5179n + 1;
                        eVarF.f5179n = i11;
                        if (i11 > 1) {
                            eVarF.f5176k = true;
                            eVarF.f5177l++;
                        }
                    } else if (i10 != 6) {
                        eVarF.f5176k = true;
                        eVarF.f5177l++;
                    }
                } else {
                    if (!(eVarF.f5174h != null) || (iOException instanceof gk.a)) {
                        eVarF.f5176k = true;
                        if (eVarF.f5178m == 0) {
                            if (iOException != null) {
                                eVarF.f5168b.a(eVarF.f5169c, iOException);
                            }
                            eVarF.f5177l++;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        String str = (String) this.f19379a;
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        e0.i(exception);
        if (!zzach.zzb(exception)) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((ak.v) this.f19380b).H(str, Boolean.TRUE, (RecaptchaAction) this.f19381c).continueWithTask((yh.c) this.f19382d);
    }

    public s(a1 a1Var, z0 z0Var, d6.b bVar) {
        fj.l.f(a1Var, "store");
        fj.l.f(z0Var, "factory");
        fj.l.f(bVar, "defaultExtras");
        this.f19379a = a1Var;
        this.f19380b = z0Var;
        this.f19381c = bVar;
        this.f19382d = new lh.e();
    }

    public s(uf.t tVar) {
        this.f19379a = new HashMap(tVar.f17063a);
        this.f19380b = new HashMap(tVar.f17064b);
        this.f19381c = new HashMap(tVar.f17065c);
        this.f19382d = new HashMap(tVar.f17066d);
    }

    public s(int i10) {
        switch (i10) {
            case 7:
                this.f19379a = new q.e(0);
                this.f19380b = new SparseArray();
                this.f19381c = new q.p((Object) null);
                this.f19382d = new q.e(0);
                break;
            case 11:
                this.f19379a = new HashMap();
                this.f19380b = new HashMap();
                this.f19381c = new HashMap();
                this.f19382d = new HashMap();
                break;
            default:
                this.f19379a = null;
                this.f19380b = null;
                this.f19381c = null;
                this.f19382d = new ArrayDeque();
                break;
        }
    }
}
