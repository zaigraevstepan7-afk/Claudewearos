package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface m extends o {
    @Override // v1.o
    default boolean a(ej.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    @Override // v1.o
    default Object b(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }
}
