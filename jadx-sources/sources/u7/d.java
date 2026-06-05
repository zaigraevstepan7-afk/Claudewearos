package u7;

import ac.n;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16818a = m.l("Schedulers");

    public static void a(t7.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        n nVarW = workDatabase.w();
        workDatabase.c();
        try {
            ArrayList arrayListB = nVarW.b(bVar.f16100h);
            ArrayList arrayListA = nVarW.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListB.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListB.get(i10);
                    i10++;
                    nVarW.j(jCurrentTimeMillis, ((c8.i) obj).f3121a);
                }
            }
            workDatabase.q();
            workDatabase.h();
            if (arrayListB.size() > 0) {
                c8.i[] iVarArr = (c8.i[]) arrayListB.toArray(new c8.i[arrayListB.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.a()) {
                        cVar.d(iVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                c8.i[] iVarArr2 = (c8.i[]) arrayListA.toArray(new c8.i[arrayListA.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    if (!cVar2.a()) {
                        cVar2.d(iVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.h();
            throw th2;
        }
    }
}
