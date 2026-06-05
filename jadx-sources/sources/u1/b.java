package u1;

import android.content.Context;
import android.view.View;
import c2.w;
import c2.z0;
import com.google.android.gms.tasks.Task;
import f1.a1;
import f1.d2;
import f1.f0;
import f1.i0;
import g0.h0;
import g3.j0;
import g3.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import q.b0;
import q.v;
import qi.s;
import u6.q;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16561a;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f16562b;

    /* renamed from: c, reason: collision with root package name */
    public static i2.f f16563c;

    public static final Object c(Task task, vi.c cVar) throws Exception {
        if (!task.isComplete()) {
            qj.l lVar = new qj.l(1, u3.a.g(cVar));
            lVar.p();
            task.addOnCompleteListener(zj.a.f20646a, new yh.c(lVar, 28));
            Object objO = lVar.o();
            ui.a aVar = ui.a.f17085a;
            return objO;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.lifecycle.v r6, vi.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof v8.g
            if (r0 == 0) goto L13
            r0 = r7
            v8.g r0 = (v8.g) r0
            int r1 = r0.f17892d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17892d = r1
            goto L18
        L13:
            v8.g r0 = new v8.g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17891c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f17892d
            pi.o r3 = pi.o.f13011a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            fj.v r6 = r0.f17890b
            androidx.lifecycle.v r0 = r0.f17889a
            uk.c.R(r7)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L2d:
            r7 = move-exception
            goto L7e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            uk.c.R(r7)
            androidx.lifecycle.o r7 = r6.f1141c
            androidx.lifecycle.o r2 = androidx.lifecycle.o.f1114d
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L45
            return r3
        L45:
            fj.v r7 = new fj.v
            r7.<init>()
            r0.f17889a = r6     // Catch: java.lang.Throwable -> L79
            r0.f17890b = r7     // Catch: java.lang.Throwable -> L79
            r0.f17892d = r4     // Catch: java.lang.Throwable -> L79
            qj.l r2 = new qj.l     // Catch: java.lang.Throwable -> L79
            ti.c r0 = u3.a.g(r0)     // Catch: java.lang.Throwable -> L79
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L79
            r2.p()     // Catch: java.lang.Throwable -> L79
            v8.h r0 = new v8.h     // Catch: java.lang.Throwable -> L79
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L79
            r7.f6807a = r0     // Catch: java.lang.Throwable -> L79
            r6.a(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r2.o()     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
            r6 = r7
        L6f:
            java.lang.Object r6 = r6.f6807a
            androidx.lifecycle.s r6 = (androidx.lifecycle.s) r6
            if (r6 == 0) goto L78
            r0.f(r6)
        L78:
            return r3
        L79:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L7e:
            java.lang.Object r6 = r6.f6807a
            androidx.lifecycle.s r6 = (androidx.lifecycle.s) r6
            if (r6 == 0) goto L87
            r0.f(r6)
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.f(androidx.lifecycle.v, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f0.i0, u1.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [i1.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List i(i1.k kVar, Integer num, int i10, Integer num2) {
        int iE;
        int iS;
        b0 b0Var;
        if (kVar.f8157w || kVar.p() == 0) {
            return s.f13520a;
        }
        ?? nVar = new n(kVar, 1);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = kVar.f8156v;
            if (iE < 0) {
                iE = kVar.E(kVar.f8137b, i10);
            }
        }
        if (num == 0) {
            int iN = kVar.f8144i - kVar.N(kVar.f8137b, kVar.r(i10));
            v vVar = kVar.f8153s;
            num = Integer.valueOf(iN + ((vVar == null || (b0Var = (b0) vVar.b(i10)) == null) ? 0 : b0Var.f13034b));
        }
        int iR = kVar.r(i10) * 5;
        int[] iArr = kVar.f8137b;
        if (iR < iArr.length) {
            iS = kVar.s(i10);
        } else {
            int iE2 = iE >= 0 ? kVar.E(iArr, iE) : iE;
            iS = kVar.s(iE);
            int i11 = iE;
            iE = iE2;
            i10 = i11;
        }
        while (i10 >= 0) {
            nVar.n(iS, (kVar.f8137b[(kVar.r(i10) * 5) + 1] & 536870912) != 0 ? kVar.t(i10) : f1.m.f6385a, kVar.O(i10), num);
            num = kVar.b(i10);
            if (iE >= 0) {
                int iE3 = kVar.E(kVar.f8137b, iE);
                iS = kVar.s(iE);
                int i12 = iE;
                iE = iE3;
                i10 = i12;
            } else {
                i10 = iE;
            }
        }
        return (ArrayList) nVar.f6149a;
    }

    public static final a1 j(z.k kVar, i0 i0Var, int i10) {
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = f1.s.A(Boolean.FALSE);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean z2 = (((i10 & 14) ^ 6) > 4 && i0Var.f(kVar)) || (i10 & 6) == 4;
        Object objQ2 = i0Var.Q();
        if (z2 || objQ2 == fVar) {
            objQ2 = new z.g(kVar, a1Var, null, 0);
            i0Var.l0(objQ2);
        }
        f1.s.f((ej.e) objQ2, i0Var, kVar);
        return a1Var;
    }

    public static final q k(Context context, Class cls, String str) {
        fj.l.f(context, "context");
        if (nj.e.K0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q(context, cls, str);
    }

    public static final float l(h0 h0Var) {
        return h0Var.k().f6998e == o1.f19665b ? Float.intBitsToFloat((int) (h0Var.p() >> 32)) : Float.intBitsToFloat((int) (h0Var.p() & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:41:0x0092 BREAK  A[LOOP:0: B:11:0x001a->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m(ag.i r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            fj.l.f(r9, r0)
            java.lang.Object r9 = r9.f449b
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            if (r10 != r11) goto Le
            qi.s r9 = qi.s.f13520a
            return r9
        Le:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto L14
            r2 = r1
            goto L15
        L14:
            r2 = r0
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            if (r2 == 0) goto L1f
            if (r10 >= r11) goto L93
            goto L21
        L1f:
            if (r10 <= r11) goto L93
        L21:
            r4 = 0
            if (r2 == 0) goto L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L32
        L30:
            r7 = r4
            goto L52
        L32:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            pi.h r7 = new pi.h
            r7.<init>(r5, r6)
            goto L52
        L3c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L49
            goto L30
        L49:
            java.util.Set r6 = r5.keySet()
            pi.h r7 = new pi.h
            r7.<init>(r5, r6)
        L52:
            if (r7 != 0) goto L55
            goto L92
        L55:
            java.lang.Object r5 = r7.f13000a
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.f13001b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L7a
            int r8 = r10 + 1
            if (r8 > r7) goto L61
            if (r7 > r11) goto L61
            goto L7e
        L7a:
            if (r11 > r7) goto L61
            if (r7 >= r10) goto L61
        L7e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            fj.l.c(r10)
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L90
        L8f:
            r5 = r0
        L90:
            if (r5 != 0) goto L1a
        L92:
            return r4
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.b.m(ag.i, int, int):java.util.List");
    }

    public static final Integer n(i1.g gVar, f1.p pVar, int i10, int i11) {
        Integer numN;
        int[] iArr = gVar.f8114b;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int i12 = iArr[(i10 * 5) + 3] + i10;
            if (gVar.j(i10) && gVar.i(i10) == 206 && fj.l.b(gVar.p(iArr, i10), f1.n.f6399e)) {
                Object objH = gVar.h(i10, 0);
                d2 d2Var = objH instanceof d2 ? (d2) objH : null;
                Object objA = d2Var != null ? d2Var.a() : null;
                f0 f0Var = objA instanceof f0 ? (f0) objA : null;
                if (f0Var != null && f0Var.f6295a.equals(pVar)) {
                    return Integer.valueOf(i10);
                }
            }
            if (gVar.d(i10) && (numN = n(gVar, pVar, i10 + 1, i12)) != null) {
                return Integer.valueOf(numN.intValue());
            }
            i10 = i12;
        }
    }

    public static final i2.f o() {
        i2.f fVar = f16561a;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = i2.h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        eVar2.x(19.0f, 11.0f);
        eVar2.t(7.83f);
        eVar2.w(4.88f, -4.88f);
        eVar2.o(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        eVar2.o(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        eVar2.w(-6.59f, 6.59f);
        eVar2.o(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        eVar2.w(6.59f, 6.59f);
        eVar2.o(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        eVar2.o(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        eVar2.v(7.83f, 13.0f);
        eVar2.t(19.0f);
        eVar2.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar2.D(-0.45f, -1.0f, -1.0f, -1.0f);
        eVar2.k();
        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
        i2.f fVarB = eVar.b();
        f16561a = fVarB;
        return fVarB;
    }

    public static final i2.f p() {
        i2.f fVar = f16562b;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i2.h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        eVar2.x(19.0f, 6.41f);
        eVar2.v(17.59f, 5.0f);
        eVar2.v(12.0f, 10.59f);
        eVar2.v(6.41f, 5.0f);
        eVar2.v(5.0f, 6.41f);
        eVar2.v(10.59f, 12.0f);
        eVar2.v(5.0f, 17.59f);
        eVar2.v(6.41f, 19.0f);
        eVar2.v(12.0f, 13.41f);
        eVar2.v(17.59f, 19.0f);
        eVar2.v(19.0f, 17.59f);
        eVar2.v(13.41f, 12.0f);
        eVar2.v(19.0f, 6.41f);
        eVar2.k();
        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
        i2.f fVarB = eVar.b();
        f16562b = fVarB;
        return fVarB;
    }

    public static final r3.j q(k0 k0Var, int i10) {
        j0 j0Var = k0Var.f7128a;
        g3.o oVar = k0Var.f7129b;
        if (j0Var.f7117a.f7081b.length() != 0) {
            int iD = oVar.d(i10);
            if ((i10 != 0 && iD == oVar.d(i10 - 1)) || (i10 != j0Var.f7117a.f7081b.length() && iD == oVar.d(i10 + 1))) {
                return k0Var.a(i10);
            }
        }
        return k0Var.g(i10);
    }

    public static final boolean r(u6.a aVar, int i10, int i11) {
        fj.l.f(aVar, "<this>");
        if (i10 > i11 && aVar.f16671l) {
            return false;
        }
        Set set = aVar.f16672m;
        return aVar.f16670k && (set == null || !set.contains(Integer.valueOf(i10)));
    }

    public static final boolean s(h0 h0Var, float f10) {
        h0Var.k().getClass();
        return !(((h0Var.q() ? -f10 : l(h0Var)) > 0.0f ? 1 : ((h0Var.q() ? -f10 : l(h0Var)) == 0.0f ? 0 : -1)) > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f0.i0, u1.n] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList v(i1.g gVar, int i10, Integer num) {
        ?? nVar = new n(gVar, 0);
        int iQ = gVar.q(i10);
        i1.b bVarA = gVar.a(i10);
        while (i10 >= 0) {
            nVar.n(gVar.i(i10), gVar.k(i10) ? gVar.p(gVar.f8114b, i10) : f1.m.f6385a, gVar.f8113a.z(i10), num);
            if (iQ >= 0) {
                i1.b bVar = bVarA;
                bVarA = gVar.a(iQ);
                i10 = iQ;
                iQ = gVar.q(iQ);
                num = bVar;
            } else {
                i10 = iQ;
                num = bVarA;
            }
        }
        return (ArrayList) nVar.f6149a;
    }

    public abstract View t(int i10);

    public abstract boolean u();
}
