package sf;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import nf.n;
import of.f;
import of.h;
import t.m1;
import zf.f0;
import zf.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15024a = 0;

    static {
        f[] fVarArr = {new f(nf.c.class, 9)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f12453a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f12453a;
        Collections.unmodifiableMap(map);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            n.h(c.f15029b);
            if (rf.a.a()) {
                return;
            }
            n.f(new h(f0.class, new f[]{new f(nf.c.class, 9)}, 8), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
