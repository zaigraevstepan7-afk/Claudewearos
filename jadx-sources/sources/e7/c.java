package e7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    String M(int i10);

    boolean a0();

    void d();

    int getColumnCount();

    String getColumnName(int i10);

    long getLong(int i10);

    boolean isNull(int i10);

    void reset();

    default boolean x() {
        return getLong(0) != 0;
    }
}
