package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface g1 {
    default boolean a(Enum r2, Enum r32) {
        return r2.equals(b()) && r32.equals(c());
    }

    Object b();

    Object c();
}
