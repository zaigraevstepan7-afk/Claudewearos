package u0;

import android.database.Cursor;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.w;
import c2.z0;
import f1.a1;
import f1.g0;
import f1.i0;
import f1.n1;
import f1.s;
import f1.t1;
import g3.e0;
import g3.k0;
import g3.m0;
import g3.n0;
import i2.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t2.q0;
import w2.f1;
import w3.t;
import w3.u;
import w3.v;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16482a;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f16483b;

    public static final void a(ej.a aVar, u uVar, p1.e eVar, i0 i0Var, int i10, int i11) {
        int i12;
        u uVar2;
        int i13;
        u uVar3;
        i0Var.c0(826668973);
        if ((i10 & 6) == 0) {
            i12 = i10 | (i0Var.h(aVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i13 = i12 | 48;
            uVar2 = uVar;
        } else {
            uVar2 = uVar;
            i13 = i12 | (i0Var.f(uVar2) ? 32 : 16);
        }
        int i15 = i13;
        if (i0Var.T(i15 & 1, (i15 & 147) != 146)) {
            uVar3 = i14 != 0 ? new u() : uVar2;
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
            s3.c cVar = (s3.c) i0Var.j(f1.f18262h);
            s3.m mVar = (s3.m) i0Var.j(f1.f18267n);
            g0 g0VarJ = s.J(i0Var);
            a1 a1VarK = s.K(eVar, i0Var);
            Object[] objArr = new Object[0];
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = w3.d.f18485b;
                i0Var.l0(objQ);
            }
            UUID uuid = (UUID) s1.k.c(objArr, (ej.a) objQ, i0Var);
            boolean zF = i0Var.f(view) | i0Var.f(cVar) | i0Var.d(uVar3.f18542g) | i0Var.f(null);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj) {
                v vVar = new v(aVar, uVar3, view, mVar, cVar, uuid);
                p1.e eVar2 = new p1.e(new s.f(a1VarK, 5), true, -1338939603);
                t tVar = vVar.A;
                tVar.setParentCompositionContext(g0VarJ);
                tVar.D.setValue(eVar2);
                tVar.H = true;
                tVar.d();
                i0Var.l0(vVar);
                objQ2 = vVar;
            }
            v vVar2 = (v) objQ2;
            boolean zH = i0Var.h(vVar2);
            Object objQ3 = i0Var.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new w3.a(vVar2, 0);
                i0Var.l0(objQ3);
            }
            s.c(vVar2, (ej.c) objQ3, i0Var);
            boolean zH2 = i0Var.h(vVar2) | ((i15 & 14) == 4) | ((i15 & 112) == 32) | i0Var.d(mVar.ordinal());
            Object objQ4 = i0Var.Q();
            if (zH2 || objQ4 == obj) {
                objQ4 = new w3.b(vVar2, aVar, uVar3, mVar);
                i0Var.l0(objQ4);
            }
            s.j((ej.a) objQ4, i0Var);
        } else {
            i0Var.W();
            uVar3 = uVar2;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new v3.k(aVar, uVar3, eVar, i10, i11);
        }
    }

    public static r b(Object obj, r rVar) {
        HashMap map;
        try {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".priority")) {
                    rVar = l.m(null, map2.get(".priority"));
                }
                if (map2.containsKey(".value")) {
                    obj = map2.get(".value");
                }
            }
            if (obj == null) {
                return zg.j.f20603e;
            }
            if (obj instanceof String) {
                return new zg.u((String) obj, rVar);
            }
            if (obj instanceof Long) {
                return new zg.o((Long) obj, rVar);
            }
            if (obj instanceof Integer) {
                return new zg.o(Long.valueOf(((Integer) obj).intValue()), rVar);
            }
            if (obj instanceof Double) {
                return new zg.i((Double) obj, rVar);
            }
            if (obj instanceof Boolean) {
                return new zg.a((Boolean) obj, rVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new mg.c("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map3 = (Map) obj;
                if (map3.containsKey(".sv")) {
                    return new zg.h(map3, rVar);
                }
                map = new HashMap(map3.size());
                for (String str : map3.keySet()) {
                    if (!str.startsWith(".")) {
                        r rVarB = b(map3.get(str), zg.j.f20603e);
                        if (!rVarB.isEmpty()) {
                            map.put(zg.c.b(str), rVarB);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                map = new HashMap(list.size());
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String str2 = "" + i10;
                    r rVarB2 = b(list.get(i10), zg.j.f20603e);
                    if (!rVarB2.isEmpty()) {
                        map.put(zg.c.b(str2), rVarB2);
                    }
                }
            }
            if (map.isEmpty()) {
                return zg.j.f20603e;
            }
            ea.e eVar = zg.f.f20596d;
            return new zg.f(map.size() < 25 ? og.b.C(new ArrayList(map.keySet()), map, eVar) : a8.j.n(new ArrayList(map.keySet()), map, eVar), rVar);
        } catch (ClassCastException e10) {
            throw new mg.c("Failed to parse node", e10);
        }
    }

    public static final void c(v1.o oVar, ej.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(1090521195);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = w3.e.f18496b;
                i0Var.l0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVar);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            int i12 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            eVar.invoke(i0Var, Integer.valueOf((i12 >> 6) & 14));
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new w3.f(oVar, eVar, i10);
        }
    }

    public static final v0.u d(p2.h hVar, v0.h hVar2) {
        v0.i iVarB = hVar.b();
        androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) hVar.f12701d;
        boolean z2 = iVarB == v0.i.f17401a;
        return new v0.u(f(kVar, z2, true, hVar2), f(kVar, z2, false, hVar2), z2);
    }

    public static final v0.t e(final p2.h hVar, final androidx.datastore.preferences.protobuf.k kVar, v0.t tVar) {
        int i10 = kVar.f955c;
        int i11 = kVar.f954b;
        boolean z2 = hVar.f12699b;
        final int i12 = z2 ? i11 : i10;
        k0 k0Var = (k0) kVar.f957e;
        int i13 = kVar.f956d;
        pi.f fVar = pi.f.f12998b;
        final pi.e eVarP = u6.v.P(fVar, new g0.i0(i12, kVar));
        final int i14 = z2 ? i10 : i11;
        pi.e eVarP2 = u6.v.P(fVar, new ej.a() { // from class: v0.w
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pi.e] */
            @Override // ej.a
            public final Object a() {
                androidx.datastore.preferences.protobuf.k kVar2 = kVar;
                g3.k0 k0Var2 = (g3.k0) kVar2.f957e;
                int iIntValue = ((Number) eVarP.getValue()).intValue();
                p2.h hVar2 = hVar;
                boolean z10 = hVar2.f12699b;
                boolean z11 = hVar2.b() == i.f17401a;
                int i15 = i12;
                long jI = k0Var2.i(i15);
                g3.o oVar = k0Var2.f7129b;
                int i16 = g3.m0.f7144c;
                int iF = (int) (jI >> 32);
                int iD = oVar.d(iF);
                int i17 = oVar.f7159f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i17 ? k0Var2.f(i17 - 1) : k0Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (oVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i17 ? oVar.c(i17 - 1, false) : oVar.c(iIntValue, false);
                }
                int i18 = i14;
                if (iF == i18) {
                    return kVar2.b(iC);
                }
                if (iC == i18) {
                    return kVar2.b(iF);
                }
                if (!(z10 ^ z11) ? i15 >= iF : i15 > iC) {
                    iF = iC;
                }
                return kVar2.b(iF);
            }
        });
        if (1 != tVar.f17478c) {
            return (v0.t) eVarP2.getValue();
        }
        if (i12 == i13) {
            return tVar;
        }
        if (((Number) eVarP.getValue()).intValue() != k0Var.f7129b.d(i13)) {
            return (v0.t) eVarP2.getValue();
        }
        int i15 = tVar.f17477b;
        long jI = k0Var.i(i15);
        if (i13 != -1) {
            if (i12 != i13) {
                if (!(((i11 < i10 ? v0.i.f17402b : i11 > i10 ? v0.i.f17401a : v0.i.f17403c) == v0.i.f17401a) ^ z2)) {
                }
            }
            return kVar.b(i12);
        }
        int i16 = m0.f7144c;
        return (i15 == ((int) (jI >> 32)) || i15 == ((int) (4294967295L & jI))) ? (v0.t) eVarP2.getValue() : kVar.b(i12);
    }

    public static final v0.t f(androidx.datastore.preferences.protobuf.k kVar, boolean z2, boolean z10, v0.h hVar) {
        long j;
        long jA = hVar.a(z10 ? kVar.f954b : kVar.f955c, kVar);
        if (z2 ^ z10) {
            int i10 = m0.f7144c;
            j = jA >> 32;
        } else {
            int i11 = m0.f7144c;
            j = 4294967295L & jA;
        }
        return kVar.b((int) j);
    }

    public static final v0.t g(v0.t tVar, androidx.datastore.preferences.protobuf.k kVar, int i10) {
        return new v0.t(((k0) kVar.f957e).a(i10), i10, tVar.f17478c);
    }

    public static void h(Object obj, String str, String str2) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static void i(Exception exc, String str, String str2) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static final wi.b j(Enum[] enumArr) {
        fj.l.f(enumArr, "entries");
        return new wi.b(enumArr);
    }

    public static d k(d dVar, s3.m mVar, n0 n0Var, s3.c cVar, k3.i iVar) {
        if (dVar != null && mVar == dVar.f16485a && e0.h(n0Var, mVar).equals(dVar.f16486b) && cVar.e() == dVar.f16487c.f14737a && iVar == dVar.f16488d) {
            return dVar;
        }
        d dVar2 = d.f16484h;
        if (dVar2 != null && mVar == dVar2.f16485a && e0.h(n0Var, mVar).equals(dVar2.f16486b) && cVar.e() == dVar2.f16487c.f14737a && iVar == dVar2.f16488d) {
            return dVar2;
        }
        d dVar3 = new d(mVar, e0.h(n0Var, mVar), new s3.d(cVar.e(), cVar.r0()), iVar);
        d.f16484h = dVar3;
        return dVar3;
    }

    public static final i2.f l() {
        i2.f fVar = f16482a;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Outlined.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new i2.n(9.0f, 16.17f));
        arrayList.add(new i2.m(4.83f, 12.0f));
        arrayList.add(new i2.u(-1.42f, 1.41f));
        arrayList.add(new i2.m(9.0f, 19.0f));
        arrayList.add(new i2.m(21.0f, 7.0f));
        arrayList.add(new i2.u(-1.41f, -1.41f));
        arrayList.add(new i2.m(9.0f, 16.17f));
        arrayList.add(i2.j.f8278c);
        i2.e.a(eVar, arrayList, z0Var);
        i2.f fVarB = eVar.b();
        f16482a = fVarB;
        return fVarB;
    }

    public static final int m(Cursor cursor, String str) {
        String strS0;
        fj.l.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            fj.l.e(columnNames, "getColumnNames(...)");
            strS0 = qi.k.s0(columnNames, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strS0 = "unknown";
        }
        throw new IllegalArgumentException(y8.f.b("column '", str, "' does not exist. Available columns: ", strS0));
    }

    public static final int n(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static final List o(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(qi.l.z0(list)) : qi.s.f13520a;
    }

    public static final Map p(Map map) {
        int size = map.size();
        if (size == 0) {
            return qi.t.f13521a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) qi.l.y0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
