package f7;

import java.io.Closeable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface e extends Closeable {
    b H();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z2);
}
