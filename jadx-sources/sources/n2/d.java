package n2;

import android.view.KeyEvent;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {
    public static final long a(int i10) {
        long j = (i10 << 32) | (0 & 4294967295L);
        int i11 = a.O;
        return j;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final o d(o oVar, ej.c cVar) {
        return oVar.c(new c(cVar, null));
    }

    public static final o e(o oVar, ej.c cVar) {
        return oVar.c(new c(null, cVar));
    }
}
