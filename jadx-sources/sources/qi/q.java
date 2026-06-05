package qi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class q extends p {
    public static void u0(AbstractList abstractList, Iterable iterable) {
        fj.l.f(abstractList, "<this>");
        fj.l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static Object v0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(yd.f.B(abstractList));
    }
}
