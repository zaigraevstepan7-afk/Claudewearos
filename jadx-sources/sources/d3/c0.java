package d3;

import c2.x0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f4712a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f4713b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new b0(new b0(i10 == 0 ? h.f4717c : h.f4716b), 1);
            i10++;
        }
        f4712a = comparatorArr;
        f4713b = l.O;
    }

    public static final void a(r rVar, ArrayList arrayList, x0 x0Var, x0 x0Var2, q.v vVar) {
        n nVar = rVar.f4766d;
        Object objG = nVar.f4758a.g(v.f4788n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) x0Var2.invoke(rVar)).booleanValue()) && ((Boolean) x0Var.invoke(rVar)).booleanValue()) {
            arrayList.add(rVar);
        }
        if (zBooleanValue) {
            vVar.i(rVar.f4768f, b(rVar, x0Var, x0Var2, r.j(7, rVar)));
            return;
        }
        List listJ = r.j(7, rVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((r) listJ.get(i10), arrayList, x0Var, x0Var2, vVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(d3.r r17, c2.x0 r18, c2.x0 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.c0.b(d3.r, c2.x0, c2.x0, java.util.List):java.util.ArrayList");
    }
}
