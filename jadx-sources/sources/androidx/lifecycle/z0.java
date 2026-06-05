package androidx.lifecycle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface z0 {
    default x0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default x0 c(Class cls, d6.c cVar) {
        return a(cls);
    }

    default x0 e(fj.f fVar, d6.c cVar) {
        return c(cg.b.D(fVar), cVar);
    }
}
