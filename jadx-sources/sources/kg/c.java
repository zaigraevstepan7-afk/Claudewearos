package kg;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public interface c {
    default Object a(Class cls) {
        return f(r.a(cls));
    }

    default oh.b b(Class cls) {
        return e(r.a(cls));
    }

    p d(r rVar);

    oh.b e(r rVar);

    default Object f(r rVar) {
        oh.b bVarE = e(rVar);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    default Set g(r rVar) {
        return (Set) h(rVar).get();
    }

    oh.b h(r rVar);

    default p i(Class cls) {
        return d(r.a(cls));
    }
}
