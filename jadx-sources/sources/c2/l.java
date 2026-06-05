package c2;

import android.graphics.Path;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l {
    public static final j a() {
        return new j(new Path());
    }

    public static final Path.Direction b(o0 o0Var) {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        throw new b3.e();
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
