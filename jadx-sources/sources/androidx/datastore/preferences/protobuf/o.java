package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f977a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f978b;

    static {
        o oVar = new o();
        Map map = Collections.EMPTY_MAP;
        f978b = oVar;
    }

    public static o a() {
        o oVar;
        u0 u0Var = u0.f1025c;
        o oVar2 = f977a;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f977a;
                if (oVar == null) {
                    Class cls = n.f974a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f978b;
                    f977a = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }
}
