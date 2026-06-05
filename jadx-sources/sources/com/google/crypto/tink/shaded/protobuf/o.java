package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f4208a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f4209b;

    static {
        o oVar = new o();
        Map map = Collections.EMPTY_MAP;
        f4209b = oVar;
    }

    public static o a() {
        o oVar;
        o oVar2 = f4208a;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f4208a;
                if (oVar == null) {
                    Class cls = n.f4200a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f4209b;
                    f4208a = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }
}
