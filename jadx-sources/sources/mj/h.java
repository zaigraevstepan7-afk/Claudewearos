package mj;

import fj.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qi.s;

/* loaded from: classes2.dex */
public abstract class h extends j {
    public static f U(Iterator it) {
        l.f(it, "<this>");
        return new a(new i(it, 1));
    }

    public static List V(f fVar) {
        l.f(fVar, "<this>");
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return s.f13520a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return yd.f.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
