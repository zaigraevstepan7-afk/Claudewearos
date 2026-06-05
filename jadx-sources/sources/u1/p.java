package u1;

import android.view.accessibility.AccessibilityNodeInfo;
import d3.r;
import d3.v;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.s;
import f1.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t2.q0;
import v0.j0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16584a;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f16585b;

    public static final r8.c a(r8.g gVar, Throwable th2) {
        h8.j jVar;
        if (th2 instanceof r8.m) {
            ej.c cVar = gVar.f13880n;
            r8.e eVar = gVar.f13886t;
            jVar = (h8.j) cVar.invoke(gVar);
            if (jVar == null) {
                jVar = (h8.j) eVar.j.invoke(gVar);
            }
            if (jVar == null && (jVar = (h8.j) gVar.f13879m.invoke(gVar)) == null) {
                jVar = (h8.j) eVar.f13854i.invoke(gVar);
            }
        } else {
            jVar = (h8.j) gVar.f13879m.invoke(gVar);
            if (jVar == null) {
                jVar = (h8.j) gVar.f13886t.f13854i.invoke(gVar);
            }
        }
        return new r8.c(jVar, gVar, th2);
    }

    public static final void b(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        i0Var.c0(-1854833411);
        int i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = j0.f17407a;
                i0Var.l0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVar);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            s.M(v2.g.f17649f, i0Var, q0Var);
            s.M(v2.g.f17648e, i0Var, n1VarL);
            s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
            s.I(v2.g.f17651h, i0Var);
            s.M(v2.g.f17647d, i0Var, oVarC);
            eVar.invoke(i0Var, 6);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.l(oVar, eVar, i10, 1);
        }
    }

    public static final boolean c(y1.e eVar, long j) {
        if (!eVar.f17565a.G) {
            return false;
        }
        v2.s sVar = v2.n.y(eVar).Y.f17583c;
        if (!sVar.f17751k0.G) {
            return false;
        }
        long jQ0 = sVar.q0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ0 & 4294967295L));
        long j4 = eVar.J;
        float f10 = ((int) (j4 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j4 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    public static final boolean d(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = qi.s.f13520a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iB = yd.f.B(arrayList);
                int i10 = 0;
                while (i10 < iB) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    r rVar = (r) obj2;
                    r rVar2 = (r) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (rVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (rVar.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (rVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (rVar.g().b() & 4294967295L)));
                    arrayList2.add(new b2.b((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((b2.b) qi.l.z0(list)).f1500a;
            } else {
                if (list.isEmpty()) {
                    u3.b.c("Empty collection can't be reduced.");
                }
                Object objZ0 = qi.l.z0(list);
                int iB2 = yd.f.B(list);
                if (1 <= iB2) {
                    int i11 = 1;
                    while (true) {
                        objZ0 = new b2.b(b2.b.f(((b2.b) objZ0).f1500a, ((b2.b) list.get(i11)).f1500a));
                        if (i11 == iB2) {
                            break;
                        }
                        i11++;
                    }
                }
                j = ((b2.b) objZ0).f1500a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final a1 e(z.k kVar, i0 i0Var, int i10) {
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = s.A(Boolean.FALSE);
            i0Var.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean z2 = (((i10 & 14) ^ 6) > 4 && i0Var.f(kVar)) || (i10 & 6) == 4;
        Object objQ2 = i0Var.Q();
        if (z2 || objQ2 == fVar) {
            objQ2 = new z.g(kVar, a1Var, null, 1);
            i0Var.l0(objQ2);
        }
        s.f((ej.e) objQ2, i0Var, kVar);
        return a1Var;
    }

    public static byte[] f(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b10;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final Object g(u6.m mVar, String str, vi.c cVar) {
        Object objB = mVar.b(str, new ta.n(5), cVar);
        return objB == ui.a.f17085a ? objB : pi.o.f13011a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    public static final com.google.android.gms.common.api.internal.i0 h(String str) throws NumberFormatException, m {
        String strF;
        boolean z2;
        qi.s sVar;
        int i10;
        int i11;
        o oVar = new o();
        oVar.f16583b = str;
        char c6 = '(';
        int i12 = 1;
        String strSubstring = null;
        if (oVar.d('C')) {
            oVar.f16582a++;
            if (oVar.d('C')) {
                oVar.f16582a++;
            }
            if (oVar.d('(')) {
                oVar.f16582a++;
                strF = oVar.f(")");
                oVar.c();
                oVar.f16582a++;
                z2 = true;
            } else {
                z2 = true;
                strF = null;
            }
        } else {
            strF = null;
            z2 = false;
        }
        qi.s sVar2 = qi.s.f13520a;
        ?? arrayList = sVar2;
        while (oVar.f16582a < str.length() - i12 && Character.isLetter(str.charAt(oVar.f16582a)) && str.charAt(oVar.f16582a + i12) == c6) {
            char cCharAt = str.charAt(oVar.f16582a);
            if (cCharAt == 'N') {
                i10 = i12;
                oVar.f16582a += 2;
                arrayList = new ArrayList();
                while (!oVar.a() && !oVar.d(')')) {
                    oVar.f(":,)");
                    if (oVar.d(':')) {
                        oVar.f16582a++;
                        k(oVar.f(",)"));
                    }
                    arrayList.add(new l(arrayList.size()));
                    if (oVar.d(',')) {
                        oVar.f16582a++;
                    }
                }
                oVar.c();
                oVar.f16582a++;
            } else if (cCharAt != 'P') {
                oVar.f16582a += 2;
                int i13 = 0;
                while (true) {
                    if (i13 <= 0 && oVar.d(')')) {
                        oVar.c();
                        oVar.f16582a += i12;
                        break;
                    }
                    if (oVar.a()) {
                        oVar.g("unexpected end");
                        throw null;
                    }
                    if (oVar.d(c6)) {
                        i13++;
                    } else if (oVar.d(')')) {
                        i13--;
                    }
                    oVar.f16582a += i12;
                }
            } else {
                oVar.f16582a += 2;
                arrayList = new ArrayList();
                int i14 = 0;
                while (!oVar.a() && !oVar.d(')')) {
                    if (oVar.d('!')) {
                        oVar.f16582a += i12;
                        String strF2 = oVar.f("!,)");
                        if (strF2.length() == 0) {
                            i14 = i12;
                            i11 = i14;
                        } else {
                            int i15 = Integer.parseInt(strF2);
                            int i16 = 0;
                            while (i15 > 0) {
                                int size = arrayList.size();
                                int i17 = i12;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size) {
                                        arrayList.add(new l(i16));
                                        i15--;
                                        break;
                                    }
                                    if (((l) arrayList.get(i18)).f16578a == i16) {
                                        i16++;
                                        break;
                                    }
                                    i18++;
                                }
                                i12 = i17;
                            }
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                        int iE = oVar.e("!:,)");
                        if (oVar.d(':')) {
                            oVar.f16582a++;
                            k(oVar.f("!,)"));
                        }
                        if (i14 != 0) {
                            int i19 = 0;
                            while (i19 < iE) {
                                int size2 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= size2) {
                                        arrayList.add(new l(i19));
                                        break;
                                    }
                                    if (((l) arrayList.get(i20)).f16578a == i19) {
                                        i19++;
                                        break;
                                    }
                                    i20++;
                                }
                            }
                            i14 = 0;
                        }
                        arrayList.add(new l(iE));
                    }
                    if (oVar.d(',')) {
                        oVar.f16582a++;
                    }
                    i12 = i11;
                }
                i10 = i12;
                oVar.c();
                oVar.f16582a++;
            }
            i12 = i10;
            c6 = '(';
        }
        if (oVar.d(':')) {
            oVar.f16582a++;
            sVar = sVar2;
        } else {
            ?? arrayList2 = new ArrayList();
            while (!oVar.a() && !oVar.d(':')) {
                if (oVar.d('*')) {
                    oVar.f16582a++;
                }
                Integer numValueOf = !oVar.d('@') ? Integer.valueOf(oVar.e("@") + 1) : null;
                oVar.f16582a++;
                oVar.e("L,:");
                if (oVar.d('L')) {
                    oVar.f16582a++;
                    oVar.e(",:");
                }
                arrayList2.add(new j(numValueOf != null ? numValueOf.intValue() : -1));
                if (oVar.d(',')) {
                    oVar.f16582a++;
                }
            }
            oVar.f16582a++;
            sVar = arrayList2;
        }
        String strF3 = oVar.f("#");
        if (strF3.length() <= 0) {
            strF3 = null;
        }
        if (oVar.d('#')) {
            int i21 = oVar.f16582a + 1;
            oVar.f16582a = i21;
            strSubstring = str.substring(i21, str.length());
            fj.l.e(strSubstring, "substring(...)");
        }
        com.google.android.gms.common.api.internal.i0 i0Var = new com.google.android.gms.common.api.internal.i0();
        i0Var.f3551a = z2;
        i0Var.f3552b = strF;
        i0Var.f3553c = strF3;
        i0Var.f3554d = arrayList;
        i0Var.f3555e = strSubstring;
        i0Var.f3556f = sVar;
        return i0Var;
    }

    public static final List i(e7.c cVar) {
        int iB = d.b(cVar, "id");
        int iB2 = d.b(cVar, "seq");
        int iB3 = d.b(cVar, "from");
        int iB4 = d.b(cVar, "to");
        ri.c cVarR = yd.f.r();
        while (cVar.a0()) {
            cVarR.add(new z6.a((int) cVar.getLong(iB), (int) cVar.getLong(iB2), cVar.M(iB3), cVar.M(iB4)));
        }
        return qi.l.K0(yd.f.m(cVarR));
    }

    public static final z6.d j(e7.a aVar, String str, boolean z2) throws Exception {
        e7.c cVarD0 = aVar.d0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iB = d.b(cVarD0, "seqno");
            int iB2 = d.b(cVarD0, "cid");
            int iB3 = d.b(cVarD0, "name");
            int iB4 = d.b(cVarD0, "desc");
            if (iB != -1 && iB2 != -1 && iB3 != -1 && iB4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarD0.a0()) {
                    if (((int) cVarD0.getLong(iB2)) >= 0) {
                        int i10 = (int) cVarD0.getLong(iB);
                        String strM = cVarD0.M(iB3);
                        String str2 = cVarD0.getLong(iB4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strM);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listL0 = qi.l.L0(new ea.e(14), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(qi.m.s0(listL0));
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listR0 = qi.l.R0(arrayList);
                List listL02 = qi.l.L0(new ea.e(15), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(qi.m.s0(listL02));
                Iterator it2 = listL02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                z6.d dVar = new z6.d(str, z2, listR0, qi.l.R0(arrayList2));
                uk.c.q(cVarD0, null);
                return dVar;
            }
            uk.c.q(cVarD0, null);
            return null;
        } finally {
        }
    }

    public static final String k(String str) {
        int iI0 = nj.e.I0(str, "c#", 0, false, 2);
        return iI0 < 0 ? str : nj.e.S0(str, iI0, 2 + iI0, "androidx.compose.").toString();
    }

    public static final void l(r rVar, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        Object objG = rVar.k().f4758a.g(v.f4781f);
        if (objG == null) {
            objG = null;
        }
        d3.d dVar = (d3.d) objG;
        if (dVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar.f4714a, dVar.f4715b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = rVar.k().f4758a.g(v.f4780e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = r.j(4, rVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar2 = (r) listJ.get(i10);
                if (rVar2.k().f4758a.c(v.J)) {
                    arrayList.add(rVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zD = d(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zD ? 1 : arrayList.size(), zD ? arrayList.size() : 1, false, 0));
    }

    public static final void m(r rVar, u4.e eVar) {
        Object objG = rVar.k().f4758a.g(v.f4782g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        r rVarL = rVar.l();
        if (rVarL == null) {
            return;
        }
        Object objG2 = rVarL.k().f4758a.g(v.f4780e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = rVarL.k().f4758a.g(v.f4781f);
            d3.d dVar = (d3.d) (objG3 != null ? objG3 : null);
            if (dVar == null || (dVar.f4714a >= 0 && dVar.f4715b >= 0)) {
                if (rVar.k().f4758a.c(v.J)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = r.j(4, rVarL);
                    int size = listJ.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        r rVar2 = (r) listJ.get(i11);
                        if (rVar2.k().f4758a.c(v.J)) {
                            arrayList.add(rVar2);
                            if (rVar2.f4765c.v() < rVar.f4765c.v()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zD = d(arrayList);
                    int i12 = zD ? 0 : i10;
                    int i13 = zD ? i10 : 0;
                    Object objG4 = rVar.k().f4758a.g(v.J);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    eVar.f16615a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, i13, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }
}
