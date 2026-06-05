package ra;

import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.g7;
import c1.k7;
import c1.l6;
import c1.p7;
import c1.r3;
import c1.v3;
import c1.v7;
import c1.x5;
import f1.q2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lb.b2;
import lb.d2;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.d f14113a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0.d f14114b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0.d f14115c;

    static {
        float f10 = 20;
        f14113a = j0.e.a(f10);
        f14114b = j0.e.a(f10);
        f14115c = j0.e.a(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [int] */
    /* JADX WARN: Type inference failed for: r5v36 */
    public static final void a(final c cVar, final boolean z2, final long j, final long j4, final long j10, final mg.d dVar, final String str, final boolean z10, final ej.e eVar, f1.i0 i0Var, final int i10) {
        f1.i0 i0Var2;
        SimpleDateFormat simpleDateFormat;
        Object pVar;
        k2.a aVar;
        f1.a1 a1Var;
        Object g0Var;
        f1.a1 a1Var2;
        f1.a1 a1Var3;
        SimpleDateFormat simpleDateFormat2;
        ej.c cVar2;
        String str2;
        f1.f fVar;
        v1.l lVar;
        boolean z11;
        float f10;
        long j11;
        boolean z12;
        f1.a1 a1Var4;
        f1.f fVar2;
        boolean z13;
        f1.a1 a1Var5;
        final f1.a1 a1Var6;
        f1.a1 a1Var7;
        f1.f fVar3;
        f1.f fVar4;
        t1.t tVar;
        k2.a aVar2;
        f1.a1 a1Var8;
        f1.f fVar5;
        final t1.t tVar2;
        List list;
        final String str3;
        final k2.a aVar3;
        f1.a1 a1Var9;
        f1.a1 a1Var10;
        mg.d dVar2 = dVar;
        f1.i0 i0Var3 = i0Var;
        i0Var3.c0(-811609666);
        int i11 = i10 | (i0Var3.h(cVar) ? 4 : 2) | (i0Var3.g(z2) ? 32 : 16) | (i0Var3.e(j) ? 256 : 128) | (i0Var3.h(dVar2) ? 131072 : 65536) | (i0Var3.f(str) ? 1048576 : 524288) | (i0Var3.g(z10) ? 8388608 : 4194304);
        if (i0Var3.T(i11 & 1, (i11 & 38347923) != 38347922)) {
            Object objQ = i0Var3.Q();
            f1.f fVar6 = f1.m.f6385a;
            if (objQ == fVar6) {
                objQ = new SimpleDateFormat("MMM d, yyyy \u00b7 h:mm a", Locale.getDefault());
                i0Var3.l0(objQ);
            }
            SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) objQ;
            Object objQ2 = i0Var3.Q();
            if (objQ2 == fVar6) {
                objQ2 = f1.s.A(new s0());
                i0Var3.l0(objQ2);
            }
            f1.a1 a1Var11 = (f1.a1) objQ2;
            Object objQ3 = i0Var3.Q();
            if (objQ3 == fVar6) {
                objQ3 = f1.s.o(i0Var3);
                i0Var3.l0(objQ3);
            }
            k2.a aVar4 = (k2.a) i0Var3.j(w2.f1.f18265l);
            long jD = z2 ? c2.e0.d(4281084974L) : c2.e0.d(4294111991L);
            long jD2 = z2 ? c2.e0.d(4281874490L) : c2.e0.d(4293256682L);
            if (z2) {
                c2.e0.d(4281874490L);
            } else {
                c2.e0.d(4293256682L);
            }
            String str4 = cVar.f13948a;
            String str5 = cVar.f13951d;
            LinkedHashMap linkedHashMap = cVar.f13952e;
            boolean zF = i0Var3.f(str4);
            Object objQ4 = i0Var3.Q();
            Object obj = objQ4;
            if (zF || objQ4 == fVar6) {
                t1.t tVar3 = new t1.t();
                tVar3.putAll(linkedHashMap);
                i0Var3.l0(tVar3);
                obj = tVar3;
            }
            t1.t tVar4 = (t1.t) obj;
            boolean zF2 = i0Var3.f(tVar4) | i0Var3.h(cVar);
            Object objQ5 = i0Var3.Q();
            ti.c cVar3 = null;
            if (zF2 || objQ5 == fVar6) {
                simpleDateFormat = simpleDateFormat3;
                objQ5 = new ab.r(tVar4, cVar, cVar3, 13);
                i0Var3.l0(objQ5);
            } else {
                simpleDateFormat = simpleDateFormat3;
            }
            f1.s.f((ej.e) objQ5, i0Var3, linkedHashMap);
            int i12 = i11 & 3670016;
            boolean zH = i0Var3.h(dVar2) | i0Var3.h(cVar) | (i12 == 1048576);
            Object objQ6 = i0Var3.Q();
            if (zH || objQ6 == fVar6) {
                aVar = aVar4;
                a1Var = a1Var11;
                pVar = new ab.p(dVar2, cVar, str, cVar3, 9);
                dVar2 = dVar2;
                i0Var3.l0(pVar);
            } else {
                aVar = aVar4;
                pVar = objQ6;
                a1Var = a1Var11;
            }
            f1.s.g(str4, str, (ej.e) pVar, i0Var3);
            boolean zF3 = i0Var3.f(str4);
            Object objQ7 = i0Var3.Q();
            if (zF3 || objQ7 == fVar6) {
                objQ7 = f1.s.A(Boolean.FALSE);
                i0Var3.l0(objQ7);
            }
            f1.a1 a1Var12 = (f1.a1) objQ7;
            boolean zH2 = i0Var3.h(dVar2) | i0Var3.h(cVar) | (i12 == 1048576) | i0Var3.f(a1Var12);
            Object objQ8 = i0Var3.Q();
            if (zH2 || objQ8 == fVar6) {
                a1Var2 = a1Var12;
                a1Var3 = a1Var;
                simpleDateFormat2 = simpleDateFormat;
                cVar2 = null;
                g0Var = new k0.g0(dVar, cVar, str, a1Var2, null, 4);
                str2 = str;
                i0Var3.l0(g0Var);
            } else {
                g0Var = objQ8;
                str2 = str;
                a1Var2 = a1Var12;
                a1Var3 = a1Var;
                simpleDateFormat2 = simpleDateFormat;
                cVar2 = null;
            }
            f1.s.g(str4, str2, (ej.e) g0Var, i0Var3);
            Object objQ9 = i0Var3.Q();
            if (objQ9 == fVar6) {
                objQ9 = f1.s.A(Boolean.FALSE);
                i0Var3.l0(objQ9);
            }
            f1.a1 a1Var13 = (f1.a1) objQ9;
            x5 x5VarF = v3.f(cVar2, i0Var3, 6, 2);
            Object objQ10 = i0Var3.Q();
            if (objQ10 == fVar6) {
                objQ10 = f1.s.A("");
                i0Var3.l0(objQ10);
            }
            f1.a1 a1Var14 = (f1.a1) objQ10;
            v1.l lVar2 = v1.l.f17564b;
            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, lVar2), 16, 14);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var3, 0);
            int iHashCode = Long.hashCode(i0Var3.T);
            f1.n1 n1VarL = i0Var3.l();
            v1.o oVarC = v1.a.c(i0Var3, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar7 = v2.g.f17645b;
            i0Var3.e0();
            if (i0Var3.S) {
                i0Var3.k(fVar7);
            } else {
                i0Var3.o0();
            }
            v2.e eVar2 = v2.g.f17649f;
            f1.s.M(eVar2, i0Var3, b0VarA);
            v2.e eVar3 = v2.g.f17648e;
            f1.s.M(eVar3, i0Var3, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar4 = v2.g.f17650g;
            f1.s.w(i0Var3, numValueOf, eVar4);
            v2.d dVar3 = v2.g.f17651h;
            f1.s.I(dVar3, i0Var3);
            v2.e eVar5 = v2.g.f17647d;
            f1.s.M(eVar5, i0Var3, oVarC);
            String str6 = simpleDateFormat2.format(new Date(cVar.f13949b));
            fj.l.e(str6, "format(...)");
            v7.a(str6, null, j4, hj.a.x(12), k3.s.f9400z, null, hj.a.w(0.1d), null, 0L, 0, false, 0, 0, null, i0Var3, 102261120, 0, 261802);
            b0.d.e(i0Var3, b0.t1.e(8, lVar2));
            c cVar4 = cVar;
            int i13 = i11 << 9;
            mg.d dVar4 = dVar;
            f1.a1 a1Var15 = a1Var2;
            int i14 = i12;
            t1.t tVar5 = tVar4;
            c(cVar4.f13950c, j, j4, j10, z2, i0Var3, ((i11 >> 3) & 8176) | (i13 & 57344));
            f1.i0 i0Var4 = i0Var3;
            if (str5 == null || nj.e.K0(str5)) {
                fVar = fVar6;
                lVar = lVar2;
                z11 = false;
                f10 = 1.0f;
                i0Var4.b0(-219619302);
                i0Var4.p(false);
            } else {
                i0Var4.b0(-220661026);
                lVar = lVar2;
                b0.d.e(i0Var4, b0.t1.e(12, lVar));
                r8.d dVar5 = new r8.d((Context) i0Var4.j(AndroidCompositionLocals_androidKt.f838b));
                dVar5.f13833c = str5;
                r8.h.a(dVar5, true);
                r8.g gVarA = dVar5.a();
                f10 = 1.0f;
                v1.o oVarE = b0.t1.e(200, b0.t1.c(1.0f, lVar));
                Object objQ11 = i0Var4.Q();
                fVar = fVar6;
                if (objQ11 == fVar) {
                    a1Var10 = a1Var3;
                    objQ11 = new ab.i(a1Var10, 25);
                    i0Var4.l0(objQ11);
                } else {
                    a1Var10 = a1Var3;
                }
                v1.o oVarM = t2.z.m(oVarE, (ej.c) objQ11);
                boolean z14 = (i11 & 29360128) == 8388608;
                Object objQ12 = i0Var4.Q();
                if (z14 || objQ12 == fVar) {
                    objQ12 = new ej.c() { // from class: ra.u0
                        @Override // ej.c
                        public final Object invoke(Object obj2) {
                            c2.f0 f0Var = (c2.f0) obj2;
                            fj.l.f(f0Var, "$this$graphicsLayer");
                            f0Var.m(z10 ? 0.0f : 1.0f);
                            return pi.o.f13011a;
                        }
                    };
                    i0Var4.l0(objQ12);
                }
                v1.o oVarC2 = z1.h.c(c2.e0.q(oVarM, (ej.c) objQ12), f14114b);
                Object objQ13 = i0Var4.Q();
                if (objQ13 == fVar) {
                    objQ13 = t.m1.p(i0Var4);
                }
                z.k kVar = (z.k) objQ13;
                boolean zH3 = i0Var4.h(cVar4);
                Object objQ14 = i0Var4.Q();
                if (zH3 || objQ14 == fVar) {
                    objQ14 = new r3(eVar, cVar4, a1Var10, 16);
                    i0Var4.l0(objQ14);
                }
                i8.k.a(gVarA, "Dev log image", v.n.k(oVarC2, kVar, null, false, null, (ej.a) objQ14, 28), i0Var4, 1572912);
                z11 = false;
                i0Var4.p(false);
            }
            b0.d.e(i0Var4, b0.t1.e(10, lVar));
            v1.o oVarC3 = b0.t1.c(f10, lVar);
            b0.q1 q1VarA = b0.o1.a(b0.j.g(6), v1.b.D, i0Var4, 54);
            int iHashCode2 = Long.hashCode(i0Var4.T);
            f1.n1 n1VarL2 = i0Var4.l();
            v1.o oVarC4 = v1.a.c(i0Var4, oVarC3);
            i0Var4.e0();
            if (i0Var4.S) {
                i0Var4.k(fVar7);
            } else {
                i0Var4.o0();
            }
            f1.s.M(eVar2, i0Var4, q1VarA);
            f1.s.M(eVar3, i0Var4, n1VarL2);
            gk.b.t(iHashCode2, i0Var4, eVar4, i0Var4, dVar3);
            f1.s.M(eVar5, i0Var4, oVarC4);
            List listC0 = qi.k.c0(new String[]{"\u1f44d", "\u274c", "\u1f525"});
            i0Var4.b0(-1442449574);
            Iterator it = listC0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str7 = (String) it.next();
                Long l10 = (Long) tVar5.get(str7);
                long jLongValue = l10 != null ? l10.longValue() : 0L;
                boolean z15 = !((Boolean) a1Var15.getValue()).booleanValue();
                final f1.a1 a1Var16 = a1Var15;
                boolean zF4 = i0Var4.f(a1Var16) | i0Var4.h(aVar) | i0Var4.f(tVar5) | i0Var4.h(dVar4) | i0Var4.h(cVar4) | (i14 == 1048576 ? true : z11) | i0Var4.f(str7);
                Object objQ15 = i0Var4.Q();
                if (zF4 || objQ15 == fVar) {
                    final int i15 = 0;
                    fVar5 = fVar;
                    final mg.d dVar6 = dVar4;
                    final c cVar5 = cVar4;
                    tVar2 = tVar5;
                    list = listC0;
                    str3 = str7;
                    aVar3 = aVar;
                    objQ15 = new ej.a() { // from class: ra.v0
                        @Override // ej.a
                        public final Object a() {
                            int i16 = i15;
                            String str8 = str;
                            f1.a1 a1Var17 = a1Var16;
                            switch (i16) {
                                case 0:
                                    o1.b(aVar3, tVar2, dVar6, cVar5, str8, a1Var17, str3);
                                    break;
                                default:
                                    o1.b(aVar3, tVar2, dVar6, cVar5, str8, a1Var17, str3);
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    a1Var9 = a1Var16;
                    i0Var4.l0(objQ15);
                } else {
                    list = listC0;
                    str3 = str7;
                    fVar5 = fVar;
                    a1Var9 = a1Var16;
                    tVar2 = tVar5;
                    aVar3 = aVar;
                }
                a1Var15 = a1Var9;
                f1.i0 i0Var5 = i0Var4;
                List list2 = list;
                d(str3, jLongValue, z2, jD, jD2, j, j4, z15, (ej.a) objQ15, i0Var5, ((i11 << 3) & 896) | (i13 & 458752) | 1572864);
                cVar4 = cVar;
                dVar4 = dVar;
                i0Var4 = i0Var5;
                aVar = aVar3;
                tVar5 = tVar2;
                i14 = i14;
                listC0 = list2;
                lVar = lVar;
                fVar = fVar5;
                z11 = false;
            }
            boolean z16 = z11;
            List list3 = listC0;
            f1.f fVar8 = fVar;
            v1.l lVar3 = lVar;
            t1.t tVar6 = tVar5;
            int i16 = i14;
            long j12 = jD2;
            k2.a aVar5 = aVar;
            f1.i0 i0Var6 = i0Var4;
            long j13 = jD;
            i0Var6.p(z16);
            i0Var6.b0(-1442431737);
            final t1.t tVar7 = tVar6;
            t1.n nVar = tVar7.f15489b;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = nVar.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Map.Entry entry = (Map.Entry) next;
                List list4 = list3;
                if (!list4.contains(entry.getKey()) && ((Number) entry.getValue()).longValue() > 0) {
                    arrayList.add(next);
                }
                list3 = list4;
            }
            int size = arrayList.size();
            ?? r52 = z16;
            Object obj2 = arrayList;
            while (r52 < size) {
                int i17 = r52 + 1;
                Map.Entry entry2 = (Map.Entry) obj2.get(r52);
                final String str8 = (String) entry2.getKey();
                long jLongValue2 = ((Number) entry2.getValue()).longValue();
                boolean z17 = !((Boolean) a1Var15.getValue()).booleanValue();
                final f1.a1 a1Var17 = a1Var15;
                final k2.a aVar6 = aVar5;
                int i18 = i16;
                boolean zF5 = i0Var6.f(a1Var17) | i0Var6.h(aVar6) | i0Var6.f(tVar7) | i0Var6.h(dVar) | i0Var6.h(cVar) | (i18 == 1048576 ? true : z16) | i0Var6.f(str8);
                Object objQ16 = i0Var6.Q();
                if (zF5) {
                    fVar3 = fVar8;
                } else {
                    f1.f fVar9 = fVar8;
                    if (objQ16 == fVar9) {
                        fVar3 = fVar9;
                    } else {
                        fVar4 = fVar9;
                        aVar2 = aVar6;
                        tVar = tVar7;
                        a1Var8 = a1Var17;
                        i16 = i18;
                        long j14 = j12;
                        long j15 = j13;
                        d(str8, jLongValue2, z2, j15, j14, j, j4, z17, (ej.a) objQ16, i0Var6, ((i11 << 3) & 896) | (i13 & 458752) | 1572864);
                        j13 = j15;
                        obj2 = obj2;
                        r52 = i17;
                        size = size;
                        a1Var15 = a1Var8;
                        aVar5 = aVar2;
                        tVar7 = tVar;
                        fVar8 = fVar4;
                        z16 = false;
                        j12 = j14;
                    }
                }
                final int i19 = 1;
                i16 = i18;
                fVar4 = fVar3;
                ej.a aVar7 = new ej.a() { // from class: ra.v0
                    @Override // ej.a
                    public final Object a() {
                        int i162 = i19;
                        String str82 = str;
                        f1.a1 a1Var172 = a1Var17;
                        switch (i162) {
                            case 0:
                                o1.b(aVar6, tVar7, dVar, cVar, str82, a1Var172, str8);
                                break;
                            default:
                                o1.b(aVar6, tVar7, dVar, cVar, str82, a1Var172, str8);
                                break;
                        }
                        return pi.o.f13011a;
                    }
                };
                aVar2 = aVar6;
                tVar = tVar7;
                a1Var8 = a1Var17;
                i0Var6.l0(aVar7);
                objQ16 = aVar7;
                long j142 = j12;
                long j152 = j13;
                d(str8, jLongValue2, z2, j152, j142, j, j4, z17, (ej.a) objQ16, i0Var6, ((i11 << 3) & 896) | (i13 & 458752) | 1572864);
                j13 = j152;
                obj2 = obj2;
                r52 = i17;
                size = size;
                a1Var15 = a1Var8;
                aVar5 = aVar2;
                tVar7 = tVar;
                fVar8 = fVar4;
                z16 = false;
                j12 = j142;
            }
            final t1.t tVar8 = tVar7;
            long j16 = j13;
            boolean z18 = z16;
            final f1.a1 a1Var18 = a1Var15;
            final k2.a aVar8 = aVar5;
            f1.f fVar10 = fVar8;
            i0Var6.p(z18);
            if (((Boolean) a1Var18.getValue()).booleanValue()) {
                j11 = j16;
                z12 = z18;
                a1Var4 = a1Var13;
                fVar2 = fVar10;
                z13 = true;
                i0Var6.b0(-1764680290);
                i0Var6.p(z12);
            } else {
                i0Var6.b0(-1765252085);
                v1.o oVarF = v.n.f(z1.h.c(b0.t1.k(32, lVar3), j0.e.f8605a), j16, c2.e0.f2986b);
                Object objQ17 = i0Var6.Q();
                if (objQ17 == fVar10) {
                    objQ17 = t.m1.p(i0Var6);
                }
                z.k kVar2 = (z.k) objQ17;
                Object objQ18 = i0Var6.Q();
                if (objQ18 == fVar10) {
                    a1Var7 = a1Var13;
                    objQ18 = new r0.d(a1Var7, 16);
                    i0Var6.l0(objQ18);
                } else {
                    a1Var7 = a1Var13;
                }
                v1.o oVarK = v.n.k(oVarF, kVar2, null, false, null, (ej.a) objQ18, 28);
                t2.q0 q0VarD = b0.r.d(v1.b.f17551e, z18);
                int iHashCode3 = Long.hashCode(i0Var6.T);
                f1.n1 n1VarL3 = i0Var6.l();
                v1.o oVarC5 = v1.a.c(i0Var6, oVarK);
                v2.h.f17668w.getClass();
                v2.f fVar11 = v2.g.f17645b;
                i0Var6.e0();
                if (i0Var6.S) {
                    i0Var6.k(fVar11);
                } else {
                    i0Var6.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var6, q0VarD);
                f1.s.M(v2.g.f17648e, i0Var6, n1VarL3);
                f1.s.w(i0Var6, Integer.valueOf(iHashCode3), v2.g.f17650g);
                f1.s.I(v2.g.f17651h, i0Var6);
                f1.s.M(v2.g.f17647d, i0Var6, oVarC5);
                j11 = j16;
                fVar2 = fVar10;
                a1Var4 = a1Var7;
                v7.a("\uff0b", null, j4, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262122);
                i0Var6 = i0Var;
                z13 = true;
                i0Var6.p(true);
                z12 = false;
                i0Var6.p(false);
            }
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            b0.d.e(i0Var6, new b0.y0(1.0f, z13));
            v7.a(cVar.f13953f + " views", null, j4, hj.a.x(11), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597824, 0, 262058);
            i0Var.p(true);
            i0Var.p(true);
            if (((Boolean) a1Var4.getValue()).booleanValue()) {
                i0Var.b0(2009115286);
                Object objQ19 = i0Var.Q();
                if (objQ19 == fVar2) {
                    a1Var5 = a1Var4;
                    a1Var6 = a1Var14;
                    objQ19 = new jb.a(a1Var5, a1Var6, 9);
                    i0Var.l0(objQ19);
                } else {
                    a1Var5 = a1Var4;
                    a1Var6 = a1Var14;
                }
                final f1.a1 a1Var19 = a1Var5;
                final long j17 = j11;
                v3.a((ej.a) objQ19, null, x5VarF, 0.0f, false, null, z2 ? c2.e0.d(4280032286L) : c2.e0.d(4294111991L), 0L, 0.0f, 0L, p1.j.d(1796541432, new ej.e() { // from class: ra.w0
                    @Override // ej.e
                    public final Object invoke(Object obj3, Object obj4) {
                        f1.i0 i0Var7 = (f1.i0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (i0Var7.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            c1.t.f2691a.a(null, 0.0f, 0.0f, null, c2.e0.d(z2 ? 4282927178L : 4291282892L), i0Var7, 196608, 15);
                        } else {
                            i0Var7.W();
                        }
                        return pi.o.f13011a;
                    }
                }, i0Var), null, null, p1.j.d(-172321307, new ej.f() { // from class: ra.x0
                    @Override // ej.f
                    public final Object c(Object obj3, Object obj4, Object obj5) {
                        final f1.a1 a1Var20;
                        final mg.d dVar7;
                        final long j18;
                        final f1.a1 a1Var21;
                        final k2.a aVar9;
                        final t1.t tVar9;
                        f1.i0 i0Var7 = (f1.i0) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        fj.l.f((b0.c0) obj3, "$this$ModalBottomSheet");
                        if (i0Var7.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            v1.l lVar4 = v1.l.f17564b;
                            v1.o oVarX = b0.d.x(b0.d.v(b0.t1.c(1.0f, lVar4), 24, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32, 7);
                            b0.b0 b0VarA2 = b0.z.a(b0.j.f1361c, v1.b.F, i0Var7, 48);
                            int iHashCode4 = Long.hashCode(i0Var7.T);
                            f1.n1 n1VarL4 = i0Var7.l();
                            v1.o oVarC6 = v1.a.c(i0Var7, oVarX);
                            v2.h.f17668w.getClass();
                            v2.f fVar12 = v2.g.f17645b;
                            i0Var7.e0();
                            if (i0Var7.S) {
                                i0Var7.k(fVar12);
                            } else {
                                i0Var7.o0();
                            }
                            f1.s.M(v2.g.f17649f, i0Var7, b0VarA2);
                            f1.s.M(v2.g.f17648e, i0Var7, n1VarL4);
                            f1.s.w(i0Var7, Integer.valueOf(iHashCode4), v2.g.f17650g);
                            f1.s.I(v2.g.f17651h, i0Var7);
                            f1.s.M(v2.g.f17647d, i0Var7, oVarC6);
                            k3.s sVar = k3.s.A;
                            long jX = hj.a.x(17);
                            long j19 = j;
                            v7.a("React", null, j19, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var7, 1597446, 0, 262058);
                            float f11 = 16;
                            b0.d.e(i0Var7, b0.t1.e(f11, lVar4));
                            final List listC02 = qi.k.c0(new String[]{"\u1f44d", "\u274c", "\u1f525", "\u1f62e", "\u1f389", "\u1f602", "\u1f622", "\u1f440", "\u1f4af", "\u1f680", "\u2728", "\u1f64c"});
                            e0.a aVar10 = new e0.a(6);
                            v1.o oVarF2 = b0.t1.f(b0.t1.c(1.0f, lVar4), 0.0f, 200, 1);
                            float f12 = 8;
                            b0.h hVarG = b0.j.g(f12);
                            b0.h hVarG2 = b0.j.g(f12);
                            long j20 = j17;
                            boolean zE = i0Var7.e(j20);
                            f1.a1 a1Var22 = a1Var18;
                            boolean zF6 = zE | i0Var7.f(a1Var22);
                            k2.a aVar11 = aVar8;
                            boolean zH4 = zF6 | i0Var7.h(aVar11);
                            t1.t tVar10 = tVar8;
                            boolean zF7 = zH4 | i0Var7.f(tVar10);
                            mg.d dVar8 = dVar;
                            boolean zH5 = zF7 | i0Var7.h(dVar8);
                            final c cVar6 = cVar;
                            boolean zH6 = zH5 | i0Var7.h(cVar6);
                            final String str9 = str;
                            boolean zF8 = zH6 | i0Var7.f(str9);
                            Object objQ20 = i0Var7.Q();
                            final f1.a1 a1Var23 = a1Var19;
                            f1.a1 a1Var24 = a1Var6;
                            f1.f fVar13 = f1.m.f6385a;
                            if (zF8 || objQ20 == fVar13) {
                                a1Var20 = a1Var24;
                                dVar7 = dVar8;
                                j18 = j20;
                                a1Var21 = a1Var22;
                                aVar9 = aVar11;
                                tVar9 = tVar10;
                                objQ20 = new ej.c() { // from class: ra.a1
                                    @Override // ej.c
                                    public final Object invoke(Object obj6) {
                                        e0.g gVar = (e0.g) obj6;
                                        fj.l.f(gVar, "$this$LazyVerticalGrid");
                                        List list5 = listC02;
                                        gVar.p(list5.size(), null, new i1(0, list5), new p1.e(new j1(list5, j18, a1Var21, aVar9, tVar9, dVar7, cVar6, str9, a1Var23, a1Var20), true, -1117249557));
                                        return pi.o.f13011a;
                                    }
                                };
                                i0Var7.l0(objQ20);
                            } else {
                                a1Var20 = a1Var24;
                                dVar7 = dVar8;
                                j18 = j20;
                                a1Var21 = a1Var22;
                                aVar9 = aVar11;
                                tVar9 = tVar10;
                            }
                            f1.a1 a1Var25 = a1Var21;
                            k2.a aVar12 = aVar9;
                            t1.t tVar11 = tVar9;
                            mg.d dVar9 = dVar7;
                            hj.a.b(aVar10, oVarF2, null, null, hVarG2, hVarG, null, false, null, (ej.c) objQ20, i0Var7, 1769520, 924);
                            b0.d.e(i0Var7, b0.t1.e(f11, lVar4));
                            String str10 = (String) a1Var20.getValue();
                            k7 k7Var = k7.f2344a;
                            long j21 = c2.w.f3057g;
                            long j22 = j18;
                            g7 g7VarC = k7.c(j19, j19, j22, j22, j10, j21, j21, 0L, 0L, i0Var7, 2147477196);
                            j0.d dVarA = j0.e.a(14);
                            v1.o oVarC7 = b0.t1.c(1.0f, lVar4);
                            boolean zF9 = i0Var7.f(a1Var25) | i0Var7.h(aVar12) | i0Var7.f(tVar11) | i0Var7.h(dVar9) | i0Var7.h(cVar6) | i0Var7.f(str9);
                            Object objQ21 = i0Var7.Q();
                            if (zF9 || objQ21 == fVar13) {
                                objQ21 = new c1.l0(aVar12, tVar11, dVar9, cVar6, str9, a1Var25, a1Var23, a1Var20);
                                i0Var7.l0(objQ21);
                            }
                            p7.a(str10, (ej.c) objQ21, oVarC7, false, null, p1.j.d(1736563926, new b1(j4, 0), i0Var7), null, null, null, true, 0, 0, dVarA, g7VarC, i0Var7, 12583296);
                            i0Var7.p(true);
                        } else {
                            i0Var7.W();
                        }
                        return pi.o.f13011a;
                    }
                }, i0Var), i0Var, 6, 3078, 7098);
                f1.i0 i0Var7 = i0Var;
                i0Var7.p(false);
                i0Var2 = i0Var7;
            } else {
                f1.i0 i0Var8 = i0Var;
                i0Var8.b0(2012480708);
                i0Var8.p(false);
                i0Var2 = i0Var8;
            }
        } else {
            i0Var3.W();
            i0Var2 = i0Var3;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(z2, j, j4, j10, dVar, str, z10, eVar, i10) { // from class: ra.y0
                public final /* synthetic */ boolean A;
                public final /* synthetic */ ej.e B;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f14283b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f14284c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f14285d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f14286e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ mg.d f14287f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ String f14288z;

                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    o1.a(this.f14282a, this.f14283b, this.f14284c, this.f14285d, this.f14286e, this.f14287f, this.f14288z, this.A, this.B, (f1.i0) obj3, f1.s.O(100690945));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(k2.a aVar, t1.t tVar, mg.d dVar, c cVar, String str, f1.a1 a1Var, String str2) {
        if (nj.e.K0(str2) || ((Boolean) a1Var.getValue()).booleanValue()) {
            return;
        }
        String string = nj.e.a1(str2).toString();
        ((k2.c) aVar).a(0);
        Boolean bool = Boolean.TRUE;
        a1Var.setValue(bool);
        Long l10 = (Long) tVar.get(string);
        tVar.put(string, Long.valueOf((l10 != null ? l10.longValue() : 0L) + 1));
        mg.d dVarB = dVar.b("devlogs").b(cVar.f13948a);
        dVarB.b("userReactions").b(str).g(bool);
        mg.d dVarB2 = dVarB.b("reactions").b(string);
        dVarB2.c().addOnSuccessListener(new ac.h(new q0.i(dVarB2, 4), 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final void c(final String str, final long j, final long j4, final long j10, final boolean z2, f1.i0 i0Var, final int i10) {
        f1.i0 i0Var2;
        boolean z10;
        ?? T0;
        f1.i0 i0Var3;
        boolean z11;
        f1.i0 i0Var4 = i0Var;
        i0Var4.c0(-1296104252);
        int i11 = (i10 & 6) == 0 ? (i0Var4.f(str) ? 4 : 2) | i10 : i10;
        long j11 = j;
        if ((i10 & 48) == 0) {
            i11 |= i0Var4.e(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var4.e(j4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var4.e(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var4.g(z2) ? 16384 : 8192;
        }
        if (i0Var4.T(i11 & 1, (i11 & 9363) != 9362)) {
            long jD = c2.e0.d(z2 ? 4281084974L : 4293256682L);
            String[] strArr = {"\n"};
            fj.l.f(str, "<this>");
            String str2 = strArr[0];
            if (str2.length() == 0) {
                z10 = true;
                mj.k kVar = new mj.k(new mj.d(str, new b2(1, qi.k.c0(strArr))));
                T0 = new ArrayList(qi.m.s0(kVar));
                Iterator it = kVar.iterator();
                while (true) {
                    i1.l lVar = (i1.l) it;
                    if (!lVar.hasNext()) {
                        break;
                    }
                    kj.h hVar = (kj.h) lVar.next();
                    fj.l.f(hVar, "range");
                    T0.add(str.subSequence(hVar.f9665a, hVar.f9666b + 1).toString());
                }
            } else {
                z10 = true;
                T0 = nj.e.T0(str, str2);
            }
            float f10 = 4;
            b0.b0 b0VarA = b0.z.a(b0.j.g(f10), v1.b.E, i0Var4, 6);
            int iHashCode = Long.hashCode(i0Var4.T);
            f1.n1 n1VarL = i0Var4.l();
            v1.l lVar2 = v1.l.f17564b;
            v1.o oVarC = v1.a.c(i0Var4, lVar2);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var4.e0();
            List<String> list = T0;
            if (i0Var4.S) {
                i0Var4.k(fVar);
            } else {
                i0Var4.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var4, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var4, n1VarL);
            f1.s.w(i0Var4, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var4);
            f1.s.M(v2.g.f17647d, i0Var4, oVarC);
            i0Var4.b0(-1532060713);
            for (String str3 : list) {
                if (nj.l.A0(str3, "# ")) {
                    i0Var4.b0(-1532059490);
                    f1.i0 i0Var5 = i0Var4;
                    z11 = z10;
                    v7.a(nj.e.R0(str3, "# "), null, j11, hj.a.x(22), k3.s.B, null, hj.a.w(-0.3d), null, hj.a.x(28), 0, false, 0, 0, null, i0Var5, ((i11 << 3) & 896) | 1597440, 48, 259754);
                    i0Var3 = i0Var5;
                    i0Var3.p(false);
                } else {
                    i0Var3 = i0Var4;
                    z11 = z10;
                    if (nj.l.A0(str3, "## ")) {
                        i0Var3.b0(-1532050860);
                        j11 = j;
                        v7.a(nj.e.R0(str3, "## "), null, j11, hj.a.x(18), k3.s.A, null, 0L, null, hj.a.x(24), 0, false, 0, 0, null, i0Var3, ((i11 << 3) & 896) | 1597440, 48, 260010);
                        i0Var3.p(false);
                    } else if (nj.l.A0(str3, "### ")) {
                        i0Var3.b0(-1532043499);
                        j11 = j;
                        v7.a(nj.e.R0(str3, "### "), null, j11, hj.a.x(16), k3.s.A, null, 0L, null, hj.a.x(22), 0, false, 0, 0, null, i0Var3, ((i11 << 3) & 896) | 1597440, 48, 260010);
                        i0Var3.p(false);
                    } else if (nj.l.A0(nj.e.b1(str3).toString(), "- ") || nj.l.A0(nj.e.b1(str3).toString(), "\u2022 ")) {
                        i0Var3.b0(-248421275);
                        int length = str3.length() - nj.e.b1(str3).toString().length();
                        String strR0 = nj.e.R0(nj.e.R0(nj.e.b1(str3).toString(), "- "), "\u2022 ");
                        v1.l lVar3 = lVar2;
                        v1.o oVarX = b0.d.x(lVar3, length * 8, 0.0f, 0.0f, 0.0f, 14);
                        b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.C, i0Var3, 0);
                        int iHashCode2 = Long.hashCode(i0Var3.T);
                        f1.n1 n1VarL2 = i0Var3.l();
                        v1.o oVarC2 = v1.a.c(i0Var3, oVarX);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(fVar2);
                        } else {
                            i0Var3.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var3, q1VarA);
                        f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                        f1.s.w(i0Var3, Integer.valueOf(iHashCode2), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var3);
                        f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                        v7.a("\u2022", b0.d.x(lVar3, 0.0f, 0.0f, 8, 0.0f, 11), j4, hj.a.x(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, (i11 & 896) | 24630, 0, 262120);
                        v7.b(g(strR0, j, j10, jD), null, 0L, hj.a.x(15), 0L, null, hj.a.x(22), 0, false, 0, 0, null, null, null, i0Var, 24576, 522222);
                        i0Var3 = i0Var;
                        i0Var3.p(z11);
                        i0Var3.p(false);
                        j11 = j;
                        z10 = z11;
                        lVar2 = lVar3;
                        i0Var4 = i0Var3;
                    } else if (nj.e.K0(str3)) {
                        i0Var3.b0(-1532016137);
                        b0.d.e(i0Var3, b0.t1.e(f10, lVar2));
                        i0Var3.p(false);
                    } else {
                        i0Var3.b0(-1532014330);
                        v7.b(g(str3, j, j10, jD), null, 0L, hj.a.x(15), 0L, null, hj.a.x(22), 0, false, 0, 0, null, null, null, i0Var3, 24576, 522222);
                        i0Var3.p(false);
                    }
                    z10 = z11;
                    i0Var4 = i0Var3;
                }
                j11 = j;
                z10 = z11;
                i0Var4 = i0Var3;
            }
            i0Var2 = i0Var4;
            i0Var2.p(false);
            i0Var2.p(z10);
        } else {
            i0Var2 = i0Var4;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: ra.d1
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    o1.c(str, j, j4, j10, z2, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void d(final String str, final long j, final boolean z2, final long j4, final long j10, final long j11, final long j12, final boolean z10, final ej.a aVar, f1.i0 i0Var, final int i10) {
        int i11;
        v1.o oVarK;
        i0Var.c0(-2085355290);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.e(j) ? 32 : 16;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.e(j4) ? 2048 : 1024;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.e(j12) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= i0Var.g(z10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= i0Var.h(aVar) ? 67108864 : 33554432;
        }
        if (i0Var.T(i11 & 1, (38274067 & i11) != 38274066)) {
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = t.d.a(1.0f, 0.01f);
                i0Var.l0(objQ);
            }
            t.c cVar = (t.c) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.o(i0Var);
                i0Var.l0(objQ2);
            }
            qj.z zVar = (qj.z) objQ2;
            boolean zH = i0Var.h(cVar) | ((i11 & 29360128) == 8388608);
            Object objQ3 = i0Var.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new l6(cVar, z10, 3);
                i0Var.l0(objQ3);
            }
            v1.l lVar = v1.l.f17564b;
            v1.o oVarF = v.n.f(z1.h.c(c2.e0.q(lVar, (ej.c) objQ3), j0.e.f8605a), j4, c2.e0.f2986b);
            if (z10) {
                i0Var.b0(1723313775);
                Object objQ4 = i0Var.Q();
                if (objQ4 == obj) {
                    objQ4 = t.m1.p(i0Var);
                }
                z.k kVar = (z.k) objQ4;
                boolean zH2 = ((i11 & 234881024) == 67108864) | i0Var.h(zVar) | i0Var.h(cVar);
                Object objQ5 = i0Var.Q();
                if (zH2 || objQ5 == obj) {
                    objQ5 = new r3(zVar, aVar, cVar);
                    i0Var.l0(objQ5);
                }
                oVarK = v.n.k(lVar, kVar, null, false, null, (ej.a) objQ5, 28);
                i0Var.p(false);
            } else {
                i0Var.b0(1723325166);
                i0Var.p(false);
                oVarK = lVar;
            }
            v1.o oVarU = b0.d.u(oVarF.c(oVarK), 10, 5);
            b0.q1 q1VarA = b0.o1.a(b0.j.g(4), v1.b.D, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarU);
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            v7.a(str, null, 0L, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 24576, 0, 262126);
            if (j > 0) {
                i0Var.b0(-663857586);
                v7.a(String.valueOf(j), null, j12, hj.a.x(12), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, ((i11 >> 12) & 896) | 1597440, 0, 262058);
                i0Var.p(false);
            } else {
                i0Var.b0(-663655776);
                i0Var.p(false);
            }
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: ra.z0
                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(i10 | 1);
                    o1.d(str, j, z2, j4, j10, j11, j12, z10, aVar, (f1.i0) obj2, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v25 */
    public static final void e(final ej.a aVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2;
        boolean z2;
        ti.c cVar;
        t.c cVar2;
        long j;
        v1.l lVar;
        f1.a1 a1Var;
        v1.g gVar;
        ej.a aVar2;
        v2.e eVar;
        v2.e eVar2;
        v2.e eVar3;
        v2.d dVar;
        v2.e eVar4;
        c2.q0 q0Var;
        boolean z10;
        ?? r2;
        float f10;
        f1.i0 i0Var3;
        f1.a1 a1Var2;
        ej.a aVar3;
        float f11;
        NetworkCapabilities networkCapabilities;
        i0Var.c0(-1101598673);
        int i11 = i10 | (i0Var.h(aVar) ? 4 : 2);
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            boolean zR = v.n.r(i0Var);
            f1.q1 q1Var = AndroidCompositionLocals_androidKt.f838b;
            Context context = (Context) i0Var.j(q1Var);
            k2.a aVar4 = (k2.a) i0Var.j(w2.f1.f18265l);
            Configuration configuration = (Configuration) i0Var.j(AndroidCompositionLocals_androidKt.f837a);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = Settings.Secure.getString(context.getContentResolver(), "android_id");
                i0Var.l0(objQ);
            }
            final String str = (String) objQ;
            long jD = zR ? c2.e0.d(4278190080L) : c2.e0.d(4294967295L);
            final long jD2 = zR ? c2.e0.d(4294967295L) : c2.e0.d(4278190080L);
            final long jD3 = c2.e0.d(4287532691L);
            final long jD4 = c2.e0.d(zR ? 4281874490L : 4293256682L);
            final long jD5 = c2.e0.d(4278221567L);
            final long jD6 = zR ? c2.e0.d(4280032286L) : c2.e0.d(4294967295L);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.A(Boolean.TRUE);
                i0Var.l0(objQ2);
            }
            f1.a1 a1Var3 = (f1.a1) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj) {
                objQ3 = new t1.q();
                i0Var.l0(objQ3);
            }
            final t1.q qVar = (t1.q) objQ3;
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                objQ4 = mg.f.c(cg.i.e(), "https://voidlauncher2anonlab-default-rtdb.europe-west1.firebasedatabase.app").d();
                i0Var.l0(objQ4);
            }
            final mg.d dVar2 = (mg.d) objQ4;
            fj.l.c(dVar2);
            boolean zH = i0Var.h(dVar2);
            Object objQ5 = i0Var.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new ab.m(dVar2, a1Var3, qVar, 17);
                i0Var.l0(objQ5);
            }
            pi.o oVar = pi.o.f13011a;
            f1.s.c(oVar, (ej.c) objQ5, i0Var);
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj) {
                Object systemService = context.getSystemService("connectivity");
                fj.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                Network activeNetwork = connectivityManager.getActiveNetwork();
                objQ6 = Boolean.valueOf((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12));
                i0Var.l0(objQ6);
            }
            boolean z11 = !((Boolean) objQ6).booleanValue() && ((Boolean) a1Var3.getValue()).booleanValue();
            final d0.u uVarA = d0.w.a(i0Var);
            v.v1 v1VarS = v.n.s(i0Var);
            Object objQ7 = i0Var.Q();
            if (objQ7 == obj) {
                objQ7 = t.d.a(0.0f, 0.01f);
                i0Var.l0(objQ7);
            }
            t.c cVar3 = (t.c) objQ7;
            Object objQ8 = i0Var.Q();
            if (objQ8 == obj) {
                objQ8 = y8.f.a(0.0f, i0Var);
            }
            final f1.f1 f1Var = (f1.f1) objQ8;
            Object objQ9 = i0Var.Q();
            if (objQ9 == obj) {
                objQ9 = y8.f.a(1.0f, i0Var);
            }
            final f1.f1 f1Var2 = (f1.f1) objQ9;
            Object objQ10 = i0Var.Q();
            if (objQ10 == obj) {
                z2 = zR;
                objQ10 = new t.s(0.5f, 0.5f, 1.0f, 0.25f);
                i0Var.l0(objQ10);
            } else {
                z2 = zR;
            }
            t.s sVar = (t.s) objQ10;
            Object objQ11 = i0Var.Q();
            if (objQ11 == obj) {
                objQ11 = t.d.s(0.0f, 200.0f, null, 5);
                i0Var.l0(objQ11);
            }
            t.u0 u0Var = (t.u0) objQ11;
            f1.q1 q1Var2 = w2.f1.f18262h;
            s3.c cVar4 = (s3.c) i0Var.j(q1Var2);
            boolean zF = i0Var.f(cVar4);
            Object objQ12 = i0Var.Q();
            if (zF || objQ12 == obj) {
                objQ12 = Float.valueOf(cVar4.w0(250));
                i0Var.l0(objQ12);
            }
            float fFloatValue = ((Number) objQ12).floatValue();
            Object objQ13 = i0Var.Q();
            if (objQ13 == obj) {
                objQ13 = f1.s.o(i0Var);
                i0Var.l0(objQ13);
            }
            qj.z zVar = (qj.z) objQ13;
            boolean zH2 = i0Var.h(cVar3);
            Object objQ14 = i0Var.Q();
            if (zH2 || objQ14 == obj) {
                objQ14 = new bb.f(cVar3, sVar, f1Var2, f1Var, null, 1);
                i0Var.l0(objQ14);
            }
            f1.s.f((ej.e) objQ14, i0Var, oVar);
            Boolean boolValueOf = Boolean.valueOf(v1VarS.f17313g.a());
            boolean zF2 = i0Var.f(v1VarS) | i0Var.h(cVar3);
            Object objQ15 = i0Var.Q();
            if (zF2 || objQ15 == obj) {
                cVar = null;
                objQ15 = new ab.s((Object) v1VarS, cVar3, (Object) u0Var, cVar, 19);
                i0Var.l0(objQ15);
            } else {
                cVar = null;
            }
            f1.s.f((ej.e) objQ15, i0Var, boolValueOf);
            Boolean boolValueOf2 = Boolean.valueOf(uVarA.f4448i.a());
            boolean zF3 = i0Var.f(uVarA) | i0Var.h(cVar3);
            Object objQ16 = i0Var.Q();
            if (zF3 || objQ16 == obj) {
                cVar2 = cVar3;
                objQ16 = new ab.s((Object) uVarA, cVar2, (Object) u0Var, cVar, 20);
                i0Var.l0(objQ16);
            } else {
                cVar2 = cVar3;
            }
            f1.s.f((ej.e) objQ16, i0Var, boolValueOf2);
            boolean zF4 = i0Var.f(zVar) | i0Var.c(fFloatValue);
            Object objQ17 = i0Var.Q();
            if (zF4 || objQ17 == obj) {
                j = jD;
                Object n1Var = new n1(fFloatValue, cVar2, zVar, u0Var, aVar4);
                i0Var.l0(n1Var);
                objQ17 = n1Var;
            } else {
                j = jD;
            }
            final n1 n1Var2 = (n1) objQ17;
            Object objQ18 = i0Var.Q();
            if (objQ18 == obj) {
                objQ18 = f1.s.A(cVar);
                i0Var.l0(objQ18);
            }
            final f1.a1 a1Var4 = (f1.a1) objQ18;
            Object objQ19 = i0Var.Q();
            if (objQ19 == obj) {
                objQ19 = f1.s.A(new s0());
                i0Var.l0(objQ19);
            }
            final f1.a1 a1Var5 = (f1.a1) objQ19;
            Object objQ20 = i0Var.Q();
            if (objQ20 == obj) {
                objQ20 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ20);
            }
            final f1.a1 a1Var6 = (f1.a1) objQ20;
            float f12 = ((Boolean) a1Var6.getValue()).booleanValue() ? 1.0f : 0.0f;
            t.o1 o1VarT = t.d.t(500, 0, t.y.f15326a, 2);
            Object objQ21 = i0Var.Q();
            if (objQ21 == obj) {
                objQ21 = new ab.i(a1Var4, 26);
                i0Var.l0(objQ21);
            }
            final q2 q2VarB = t.e.b(f12, o1VarT, "sharedElement", (ej.c) objQ21, i0Var, 27648, 4);
            b0.i0 i0Var4 = b0.t1.f1433c;
            c2.q0 q0Var2 = c2.e0.f2986b;
            v1.o oVarF = v.n.f(i0Var4, j, q0Var2);
            v1.g gVar2 = v1.b.f17547a;
            t2.q0 q0VarD = b0.r.d(gVar2, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            ej.a aVar5 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar5);
            } else {
                i0Var.o0();
            }
            v2.e eVar5 = v2.g.f17649f;
            f1.s.M(eVar5, i0Var, q0VarD);
            v2.e eVar6 = v2.g.f17648e;
            f1.s.M(eVar6, i0Var, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar7 = v2.g.f17650g;
            f1.s.w(i0Var, numValueOf, eVar7);
            v2.d dVar3 = v2.g.f17651h;
            f1.s.I(dVar3, i0Var);
            v2.e eVar8 = v2.g.f17647d;
            f1.s.M(eVar8, i0Var, oVarC);
            final boolean z12 = z2;
            f1.s.a(v.l1.f17243a.a(null), p1.j.d(1001288437, new ej.e() { // from class: ra.c1
                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    f1.i0 i0Var5 = (f1.i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i0Var5.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b0.i0 i0Var6 = b0.t1.f1433c;
                        Object objQ22 = i0Var5.Q();
                        f1.f fVar = f1.m.f6385a;
                        if (objQ22 == fVar) {
                            objQ22 = new m(f1Var2, 3);
                            i0Var5.l0(objQ22);
                        }
                        v1.o oVarA = o2.f.a(t2.z.n(i0Var6, (ej.c) objQ22), n1Var2, null);
                        Object objQ23 = i0Var5.Q();
                        if (objQ23 == fVar) {
                            objQ23 = new m(f1Var, 4);
                            i0Var5.l0(objQ23);
                        }
                        v1.o oVarO = b0.d.o(oVarA, (ej.c) objQ23);
                        t2.q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                        int iHashCode2 = Long.hashCode(i0Var5.T);
                        f1.n1 n1VarL2 = i0Var5.l();
                        v1.o oVarC2 = v1.a.c(i0Var5, oVarO);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var5.e0();
                        if (i0Var5.S) {
                            i0Var5.k(fVar2);
                        } else {
                            i0Var5.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var5, q0VarD2);
                        f1.s.M(v2.g.f17648e, i0Var5, n1VarL2);
                        f1.s.w(i0Var5, Integer.valueOf(iHashCode2), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var5);
                        f1.s.M(v2.g.f17647d, i0Var5, oVarC2);
                        b0.k1 k1VarD = b0.d.d(0.0f, 0.0f, 48, 7);
                        final ej.a aVar6 = aVar;
                        boolean zF5 = i0Var5.f(aVar6);
                        final long j4 = jD2;
                        boolean zE = zF5 | i0Var5.e(j4);
                        final long j10 = jD6;
                        boolean zE2 = zE | i0Var5.e(j10);
                        final boolean z13 = z12;
                        boolean zG = zE2 | i0Var5.g(z13);
                        final mg.d dVar4 = dVar2;
                        boolean zH3 = zG | i0Var5.h(dVar4);
                        final q2 q2Var = q2VarB;
                        boolean zF6 = zH3 | i0Var5.f(q2Var);
                        final long j11 = jD4;
                        boolean zE3 = zF6 | i0Var5.e(j11);
                        Object objQ24 = i0Var5.Q();
                        if (zE3 || objQ24 == fVar) {
                            final long j12 = jD5;
                            final long j13 = jD3;
                            final t1.q qVar2 = qVar;
                            final String str2 = str;
                            final f1.a1 a1Var7 = a1Var6;
                            final f1.a1 a1Var8 = a1Var4;
                            final f1.a1 a1Var9 = a1Var5;
                            ej.c cVar5 = new ej.c() { // from class: ra.e1
                                @Override // ej.c
                                public final Object invoke(Object obj4) {
                                    d0.h hVar = (d0.h) obj4;
                                    fj.l.f(hVar, "$this$LazyColumn");
                                    final ej.a aVar7 = aVar6;
                                    final long j14 = j12;
                                    final long j15 = j4;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: ra.f1
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            f1.i0 i0Var7 = (f1.i0) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            if (i0Var7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                v1.l lVar2 = v1.l.f17564b;
                                                float f13 = 8;
                                                v1.o oVarU = b0.d.u(b0.d.C(b0.t1.c(1.0f, lVar2), b0.d.f1295e), f13, f13);
                                                b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.D, i0Var7, 48);
                                                int iHashCode3 = Long.hashCode(i0Var7.T);
                                                f1.n1 n1VarL3 = i0Var7.l();
                                                v1.o oVarC3 = v1.a.c(i0Var7, oVarU);
                                                v2.h.f17668w.getClass();
                                                v2.f fVar3 = v2.g.f17645b;
                                                i0Var7.e0();
                                                if (i0Var7.S) {
                                                    i0Var7.k(fVar3);
                                                } else {
                                                    i0Var7.o0();
                                                }
                                                f1.s.M(v2.g.f17649f, i0Var7, q1VarA);
                                                f1.s.M(v2.g.f17648e, i0Var7, n1VarL3);
                                                f1.s.w(i0Var7, Integer.valueOf(iHashCode3), v2.g.f17650g);
                                                f1.s.I(v2.g.f17651h, i0Var7);
                                                f1.s.M(v2.g.f17647d, i0Var7, oVarC3);
                                                i2.f fVarB = u3.a.f16590a;
                                                if (fVarB == null) {
                                                    i2.e eVar9 = new i2.e("AutoMirrored.Outlined.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                                                    int i12 = i2.h0.f8270a;
                                                    c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                                                    d8.e eVar10 = new d8.e(9);
                                                    eVar10.x(20.0f, 11.0f);
                                                    eVar10.t(7.83f);
                                                    eVar10.w(5.59f, -5.59f);
                                                    eVar10.v(12.0f, 4.0f);
                                                    eVar10.w(-8.0f, 8.0f);
                                                    eVar10.w(8.0f, 8.0f);
                                                    eVar10.w(1.41f, -1.41f);
                                                    eVar10.v(7.83f, 13.0f);
                                                    eVar10.t(20.0f);
                                                    eVar10.H(-2.0f);
                                                    eVar10.k();
                                                    i2.e.a(eVar9, (ArrayList) eVar10.f5001a, z0Var);
                                                    fVarB = eVar9.b();
                                                    u3.a.f16590a = fVarB;
                                                }
                                                float f14 = 36;
                                                v1.o oVarC4 = z1.h.c(b0.t1.k(f14, lVar2), j0.e.a(10));
                                                Object objQ25 = i0Var7.Q();
                                                if (objQ25 == f1.m.f6385a) {
                                                    objQ25 = t.m1.p(i0Var7);
                                                }
                                                c1.a2.b(fVarB, "Back", b0.d.t(6, v.n.k(oVarC4, (z.k) objQ25, null, false, null, aVar7, 28)), j14, i0Var7, 3120, 0);
                                                long jX = hj.a.x(18);
                                                k3.s sVar2 = k3.s.A;
                                                if (1.0f <= 0.0d) {
                                                    c0.a.a("invalid weight; must be greater than zero");
                                                }
                                                v7.a("Dev Logs", new b0.y0(1.0f, true), j15, jX, sVar2, null, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var7, 1597446, 0, 261032);
                                                b0.d.e(i0Var7, b0.t1.k(f14, lVar2));
                                                i0Var7.p(true);
                                            } else {
                                                i0Var7.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, 248457232));
                                    final long j16 = j13;
                                    d0.h.p(hVar, new p1.e(new g1(j16, 0), true, -582284025));
                                    final t1.q qVar3 = qVar2;
                                    final long j17 = j10;
                                    final boolean z14 = z13;
                                    final mg.d dVar5 = dVar4;
                                    final String str3 = str2;
                                    final long j18 = j11;
                                    final f1.a1 a1Var10 = a1Var7;
                                    final q2 q2Var2 = q2Var;
                                    final f1.a1 a1Var11 = a1Var8;
                                    final f1.a1 a1Var12 = a1Var9;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: ra.t0
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            v1.l lVar2;
                                            float f13;
                                            c cVar6;
                                            long j19;
                                            boolean z15;
                                            c2.q0 q0Var3;
                                            v1.l lVar3;
                                            boolean z16;
                                            f1.i0 i0Var7 = (f1.i0) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            j0.d dVar6 = o1.f14113a;
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            boolean z17 = (iIntValue2 & 17) != 16;
                                            f2 f2Var = i0Var7.f6313a;
                                            if (i0Var7.T(iIntValue2 & 1, z17)) {
                                                t1.q qVar4 = qVar3;
                                                boolean zIsEmpty = qVar4.isEmpty();
                                                c2.q0 q0Var4 = c2.e0.f2986b;
                                                v1.l lVar4 = v1.l.f17564b;
                                                long j20 = j17;
                                                long j21 = j16;
                                                float f14 = 0.0f;
                                                if (zIsEmpty) {
                                                    i0Var7.b0(-1322272673);
                                                    float f15 = 16;
                                                    v1.o oVarU = b0.d.u(v.n.f(z1.h.c(b0.t1.c(1.0f, b0.d.v(lVar4, f15, 0.0f, 2)), dVar6), j20, q0Var4), f15, 20);
                                                    t2.q0 q0VarD3 = b0.r.d(v1.b.f17551e, false);
                                                    int iHashCode3 = Long.hashCode(i0Var7.T);
                                                    f1.n1 n1VarL3 = i0Var7.l();
                                                    v1.o oVarC3 = v1.a.c(i0Var7, oVarU);
                                                    v2.h.f17668w.getClass();
                                                    v2.f fVar3 = v2.g.f17645b;
                                                    i0Var7.e0();
                                                    if (i0Var7.S) {
                                                        i0Var7.k(fVar3);
                                                    } else {
                                                        i0Var7.o0();
                                                    }
                                                    f1.s.M(v2.g.f17649f, i0Var7, q0VarD3);
                                                    f1.s.M(v2.g.f17648e, i0Var7, n1VarL3);
                                                    f1.s.w(i0Var7, Integer.valueOf(iHashCode3), v2.g.f17650g);
                                                    f1.s.I(v2.g.f17651h, i0Var7);
                                                    f1.s.M(v2.g.f17647d, i0Var7, oVarC3);
                                                    v7.a("No entries yet", null, j21, hj.a.x(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var7, 24966, 0, 262122);
                                                    i0Var7 = i0Var7;
                                                    i0Var7.p(true);
                                                    i0Var7.p(false);
                                                    lVar2 = lVar4;
                                                } else {
                                                    boolean z18 = true;
                                                    boolean z19 = false;
                                                    i0Var7.b0(-1321561781);
                                                    List listL0 = qi.l.L0(new ea.e(11), qVar4);
                                                    float f16 = 16;
                                                    v1.l lVar5 = lVar4;
                                                    v1.o oVarF2 = v.n.f(z1.h.c(b0.d.v(lVar5, f16, 0.0f, 2), dVar6), j20, q0Var4);
                                                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var7, 0);
                                                    int iHashCode4 = Long.hashCode(i0Var7.T);
                                                    f1.n1 n1VarL4 = i0Var7.l();
                                                    v1.o oVarC4 = v1.a.c(i0Var7, oVarF2);
                                                    v2.h.f17668w.getClass();
                                                    v2.f fVar4 = v2.g.f17645b;
                                                    i0Var7.e0();
                                                    if (i0Var7.S) {
                                                        i0Var7.k(fVar4);
                                                    } else {
                                                        i0Var7.o0();
                                                    }
                                                    f1.s.M(v2.g.f17649f, i0Var7, b0VarA);
                                                    f1.s.M(v2.g.f17648e, i0Var7, n1VarL4);
                                                    f1.s.w(i0Var7, Integer.valueOf(iHashCode4), v2.g.f17650g);
                                                    f1.s.I(v2.g.f17651h, i0Var7);
                                                    f1.s.M(v2.g.f17647d, i0Var7, oVarC4);
                                                    i0Var7.b0(582387114);
                                                    int i12 = 0;
                                                    for (Object obj8 : listL0) {
                                                        int i13 = i12 + 1;
                                                        if (i12 < 0) {
                                                            yd.f.i0();
                                                            throw null;
                                                        }
                                                        c cVar7 = (c) obj8;
                                                        String str4 = str3;
                                                        fj.l.c(str4);
                                                        f1.a1 a1Var13 = a1Var10;
                                                        boolean zBooleanValue = ((Boolean) a1Var13.getValue()).booleanValue();
                                                        float f17 = f14;
                                                        f1.a1 a1Var14 = a1Var11;
                                                        if ((zBooleanValue || o1.f(q2Var2) > f17) && fj.l.b((String) a1Var14.getValue(), cVar7.f13951d) && cVar7.f13951d != null) {
                                                            f13 = f16;
                                                            cVar6 = cVar7;
                                                            j19 = j21;
                                                            z15 = z18;
                                                        } else {
                                                            f13 = f16;
                                                            cVar6 = cVar7;
                                                            j19 = j21;
                                                            z15 = z19;
                                                        }
                                                        Object objQ25 = i0Var7.Q();
                                                        if (objQ25 == f1.m.f6385a) {
                                                            objQ25 = new d2(a1Var13, a1Var12, a1Var14, 1);
                                                            i0Var7.l0(objQ25);
                                                        }
                                                        int i14 = i12;
                                                        v1.l lVar6 = lVar5;
                                                        List list = listL0;
                                                        c2.q0 q0Var5 = q0Var4;
                                                        o1.a(cVar6, z14, j15, j19, j14, dVar5, str4, z15, (ej.e) objQ25, i0Var7, 100690944);
                                                        long j22 = j19;
                                                        if (i14 < yd.f.B(list)) {
                                                            i0Var7.b0(636265487);
                                                            lVar3 = lVar6;
                                                            q0Var3 = q0Var5;
                                                            z16 = false;
                                                            b0.r.a(v.n.f(b0.t1.e((float) 0.5d, b0.d.x(b0.t1.c(1.0f, lVar3), f13, 0.0f, 0.0f, 0.0f, 14)), j18, q0Var3), i0Var7, 0);
                                                            i0Var7.p(false);
                                                        } else {
                                                            q0Var3 = q0Var5;
                                                            lVar3 = lVar6;
                                                            z16 = false;
                                                            i0Var7.b0(636708508);
                                                            i0Var7.p(false);
                                                        }
                                                        lVar5 = lVar3;
                                                        j21 = j22;
                                                        listL0 = list;
                                                        z19 = z16;
                                                        q0Var4 = q0Var3;
                                                        f14 = f17;
                                                        f16 = f13;
                                                        i12 = i13;
                                                        z18 = true;
                                                    }
                                                    boolean z20 = z19;
                                                    lVar2 = lVar5;
                                                    i0Var7.p(z20);
                                                    i0Var7.p(true);
                                                    i0Var7.p(z20);
                                                }
                                                b0.d.e(i0Var7, b0.t1.e(32, lVar2));
                                            } else {
                                                i0Var7.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, -531599032));
                                    return pi.o.f13011a;
                                }
                            };
                            i0Var5.l0(cVar5);
                            objQ24 = cVar5;
                        }
                        x8.a.g(390, 504, null, k1VarD, uVarA, (ej.c) objQ24, i0Var5, null, null, i0Var6, null, false);
                        i0Var5.p(true);
                    } else {
                        i0Var5.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 56);
            v1.l lVar2 = v1.l.f17564b;
            if (z11) {
                i0Var.b0(371547363);
                v1.o oVarX = b0.d.x(b0.d.C(b0.w.f1450a.b(lVar2, v1.b.f17548b), b0.d.f1295e), 0.0f, 10, 0.0f, 0.0f, 13);
                t2.q0 q0VarD2 = b0.r.d(gVar2, false);
                int iHashCode2 = Long.hashCode(i0Var.T);
                f1.n1 n1VarL2 = i0Var.l();
                v1.o oVarC2 = v1.a.c(i0Var, oVarX);
                i0Var.e0();
                if (i0Var.S) {
                    aVar3 = aVar5;
                    i0Var.k(aVar3);
                } else {
                    aVar3 = aVar5;
                    i0Var.o0();
                }
                f1.s.M(eVar5, i0Var, q0VarD2);
                f1.s.M(eVar6, i0Var, n1VarL2);
                gk.b.t(iHashCode2, i0Var, eVar7, i0Var, dVar3);
                f1.s.M(eVar8, i0Var, oVarC2);
                v1.o oVarU = b0.d.u(v.n.f(z1.h.c(lVar2, f14115c), c2.e0.d(z2 ? 4282003456L : 4294964173L), q0Var2), 14, 7);
                b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.D, i0Var, 48);
                int iHashCode3 = Long.hashCode(i0Var.T);
                f1.n1 n1VarL3 = i0Var.l();
                v1.o oVarC3 = v1.a.c(i0Var, oVarU);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar3);
                } else {
                    i0Var.o0();
                }
                f1.s.M(eVar5, i0Var, q1VarA);
                f1.s.M(eVar6, i0Var, n1VarL3);
                gk.b.t(iHashCode3, i0Var, eVar7, i0Var, dVar3);
                f1.s.M(eVar8, i0Var, oVarC3);
                i2.f fVarB = u3.c.f16596c;
                if (fVarB != null) {
                    f11 = 2.0f;
                } else {
                    i2.e eVar9 = new i2.e("Outlined.WifiOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = i2.h0.f8270a;
                    c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                    d8.e eVar10 = new d8.e(9);
                    eVar10.x(21.0f, 11.0f);
                    eVar10.w(2.0f, -2.0f);
                    eVar10.o(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f);
                    eVar10.w(2.58f, 2.58f);
                    eVar10.o(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f);
                    eVar10.k();
                    eVar10.x(19.0f, 13.0f);
                    eVar10.o(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f);
                    eVar10.w(3.02f, 3.02f);
                    eVar10.w(0.7f, -0.69f);
                    eVar10.k();
                    eVar10.x(9.0f, 17.0f);
                    eVar10.w(3.0f, 3.0f);
                    eVar10.w(3.0f, -3.0f);
                    eVar10.o(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                    eVar10.k();
                    eVar10.x(3.41f, 1.64f);
                    eVar10.v(2.0f, 3.05f);
                    eVar10.v(5.05f, 6.1f);
                    eVar10.n(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f);
                    eVar10.w(2.0f, 2.0f);
                    eVar10.o(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f);
                    eVar10.w(2.24f, 2.24f);
                    eVar10.n(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f);
                    f11 = 2.0f;
                    eVar10.w(2.0f, 2.0f);
                    eVar10.o(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f);
                    eVar10.w(7.08f, 7.08f);
                    eVar10.w(1.41f, -1.41f);
                    eVar10.v(3.41f, 1.64f);
                    eVar10.k();
                    i2.e.a(eVar9, (ArrayList) eVar10.f5001a, z0Var);
                    fVarB = eVar9.b();
                    u3.c.f16596c = fVarB;
                }
                c1.a2.b(fVarB, null, b0.t1.k(15, lVar2), z2 ? c2.e0.d(4294956554L) : c2.e0.d(4286931972L), i0Var, 432, 0);
                b0.d.e(i0Var, b0.t1.o(6, lVar2));
                lVar = lVar2;
                a1Var = a1Var6;
                gVar = gVar2;
                aVar2 = aVar3;
                eVar = eVar5;
                eVar2 = eVar6;
                eVar3 = eVar7;
                dVar = dVar3;
                eVar4 = eVar8;
                q0Var = q0Var2;
                f10 = f11;
                v7.a("No Internet", null, z2 ? c2.e0.d(4294956554L) : c2.e0.d(4286931972L), hj.a.x(13), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597446, 0, 262058);
                f1.i0 i0Var5 = i0Var;
                z10 = true;
                i0Var5.p(true);
                i0Var5.p(true);
                r2 = 0;
                i0Var5.p(false);
                i0Var3 = i0Var5;
            } else {
                lVar = lVar2;
                f1.i0 i0Var6 = i0Var;
                a1Var = a1Var6;
                gVar = gVar2;
                aVar2 = aVar5;
                eVar = eVar5;
                eVar2 = eVar6;
                eVar3 = eVar7;
                dVar = dVar3;
                eVar4 = eVar8;
                q0Var = q0Var2;
                z10 = true;
                r2 = 0;
                f10 = 2.0f;
                i0Var6.b0(372725549);
                i0Var6.p(false);
                i0Var3 = i0Var6;
            }
            if (((String) a1Var4.getValue()) != null) {
                i0Var3.b0(372906589);
                String str2 = (String) a1Var4.getValue();
                Object objQ22 = i0Var3.Q();
                if (objQ22 == obj) {
                    a1Var2 = a1Var;
                    objQ22 = new lb.q0(3, a1Var2, null);
                    i0Var3.l0(objQ22);
                } else {
                    a1Var2 = a1Var;
                }
                f1.s.f((ej.e) objQ22, i0Var3, str2);
                s3.c cVar5 = (s3.c) i0Var3.j(q1Var2);
                float fW0 = cVar5.w0(configuration.screenWidthDp);
                float fW02 = (cVar5.w0(configuration.screenHeightDp) - fW0) / f10;
                float fL0 = cVar5.l0((f(q2VarB) * (fW0 - Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14181b >> 32)))) + Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14181b >> 32)));
                float fL02 = cVar5.l0((((Number) q2VarB.getValue()).floatValue() * (fW0 - Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14181b & 4294967295L)))) + Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14181b & 4294967295L)));
                float fL03 = cVar5.l0((((Number) q2VarB.getValue()).floatValue() * (0.0f - Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14180a >> 32)))) + Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14180a >> 32)));
                float fL04 = cVar5.l0((((Number) q2VarB.getValue()).floatValue() * (fW02 - Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14180a & 4294967295L)))) + Float.intBitsToFloat((int) (((s0) a1Var5.getValue()).f14180a & 4294967295L)));
                float fFloatValue2 = (((Number) q2VarB.getValue()).floatValue() * (-20.0f)) + 20.0f;
                Object objQ23 = i0Var3.Q();
                if (objQ23 == obj) {
                    objQ23 = t.m1.p(i0Var3);
                }
                z.k kVar = (z.k) objQ23;
                Object objQ24 = i0Var3.Q();
                if (objQ24 == obj) {
                    objQ24 = new r0.d(a1Var2, 17);
                    i0Var3.l0(objQ24);
                }
                v1.o oVarK = v.n.k(i0Var4, kVar, null, false, null, (ej.a) objQ24, 28);
                t2.q0 q0VarD3 = b0.r.d(gVar, r2);
                int iHashCode4 = Long.hashCode(i0Var3.T);
                f1.n1 n1VarL4 = i0Var3.l();
                v1.o oVarC4 = v1.a.c(i0Var3, oVarK);
                i0Var3.e0();
                if (i0Var3.S) {
                    i0Var3.k(aVar2);
                } else {
                    i0Var3.o0();
                }
                f1.s.M(eVar, i0Var3, q0VarD3);
                f1.s.M(eVar2, i0Var3, n1VarL4);
                gk.b.t(iHashCode4, i0Var3, eVar3, i0Var3, dVar);
                f1.s.M(eVar4, i0Var3, oVarC4);
                b0.r.a(v.n.f(i0Var4, c2.w.c(c2.w.f3052b, ((Number) q2VarB.getValue()).floatValue() * 0.5f), q0Var), i0Var3, r2);
                r8.d dVar4 = new r8.d((Context) i0Var3.j(q1Var));
                dVar4.f13833c = (String) a1Var4.getValue();
                r8.h.a(dVar4, r2);
                i8.k.a(dVar4.a(), "Fullscreen preview", z1.h.c(b0.t1.l(b0.d.p(lVar, fL03, fL04), fL0, fL02), j0.e.a(fFloatValue2)), i0Var3, 1572912);
                i0Var3.p(z10);
                i0Var3.p(r2);
            } else {
                i0Var3.b0(374828589);
                i0Var3.p(r2);
            }
            i0Var3.p(z10);
            i0Var2 = i0Var3;
        } else {
            f1.i0 i0Var7 = i0Var;
            i0Var7.W();
            i0Var2 = i0Var7;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new cb.b(i10, 6, aVar);
        }
    }

    public static final float f(q2 q2Var) {
        return ((Number) q2Var.getValue()).floatValue();
    }

    public static final g3.f g(String str, long j, long j4, long j10) {
        int iD;
        int iH0;
        g3.c cVar = new g3.c();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            StringBuilder sb2 = cVar.f7040a;
            if (i11 < length && str.charAt(i10) == '*' && str.charAt(i11) == '*') {
                int i12 = i10 + 2;
                int iI0 = nj.e.I0(str, "**", i12, false, 4);
                if (iI0 != -1) {
                    iD = cVar.d(new g3.f0(j, 0L, k3.s.B, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65530));
                    try {
                        String strSubstring = str.substring(i12, iI0);
                        fj.l.e(strSubstring, "substring(...)");
                        cVar.b(strSubstring);
                        cVar.c(iD);
                        i10 = iI0 + 2;
                    } finally {
                    }
                } else {
                    iD = cVar.d(new g3.f0(j, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65534));
                    try {
                        sb2.append(str.charAt(i10));
                        cVar.c(iD);
                        i10 = i11;
                    } finally {
                    }
                }
            } else if (str.charAt(i10) == '*') {
                iH0 = nj.e.H0(str, '*', i11, 4);
                if (iH0 != -1) {
                    iD = cVar.d(new g3.f0(j, 0L, (k3.s) null, new k3.o(1), (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65526));
                    try {
                        String strSubstring2 = str.substring(i11, iH0);
                        fj.l.e(strSubstring2, "substring(...)");
                        cVar.b(strSubstring2);
                        i10 = iH0 + 1;
                    } finally {
                    }
                } else {
                    iD = cVar.d(new g3.f0(j, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65534));
                    try {
                        sb2.append(str.charAt(i10));
                        cVar.c(iD);
                        i10 = i11;
                    } finally {
                    }
                }
            } else {
                if (str.charAt(i10) == '`') {
                    iH0 = nj.e.H0(str, '`', i11, 4);
                    if (iH0 != -1) {
                        iD = cVar.d(new g3.f0(j4, hj.a.x(14), (k3.s) null, (k3.o) null, (k3.p) null, k3.j.f9379c, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, j10, (r3.l) null, (c2.v0) null, 63452));
                        try {
                            String strSubstring3 = str.substring(i11, iH0);
                            fj.l.e(strSubstring3, "substring(...)");
                            cVar.b(" " + strSubstring3 + " ");
                            cVar.c(iD);
                            i10 = iH0 + 1;
                        } finally {
                        }
                    } else {
                        iD = cVar.d(new g3.f0(j, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65534));
                        try {
                            sb2.append(str.charAt(i10));
                            cVar.c(iD);
                        } finally {
                        }
                    }
                } else {
                    iD = cVar.d(new g3.f0(j, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (c2.v0) null, 65534));
                    try {
                        sb2.append(str.charAt(i10));
                        cVar.c(iD);
                    } finally {
                    }
                }
                i10 = i11;
            }
        }
        return cVar.e();
    }
}
