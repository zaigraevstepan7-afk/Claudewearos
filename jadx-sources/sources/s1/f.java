package s1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1.l;
import q.g0;
import q.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f14726a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f14727b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f14728c;

    public f(Map map, ej.c cVar) {
        g0 g0Var;
        this.f14726a = cVar;
        if (map == null || map.isEmpty()) {
            g0Var = null;
        } else {
            g0Var = new g0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                g0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f14727b = g0Var;
    }

    @Override // s1.e
    public final boolean b(Object obj) {
        return ((Boolean) this.f14726a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // s1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.f.c():java.util.Map");
    }

    @Override // s1.e
    public final Object d(String str) {
        g0 g0Var = this.f14727b;
        List list = g0Var != null ? (List) g0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && g0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = g0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = g0Var.f13075c;
            Object obj = objArr[iF];
            g0Var.f13074b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // s1.e
    public final d e(String str, ej.a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!x8.a.O(str.charAt(i10))) {
                g0 g0Var = this.f14728c;
                if (g0Var == null) {
                    long[] jArr = n0.f13108a;
                    g0Var = new g0();
                    this.f14728c = g0Var;
                }
                Object objG = g0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    g0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new l(g0Var, str, aVar, 4);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
