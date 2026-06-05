package rg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f14447b = new m();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14448a = new HashMap();

    public static k a(e eVar, l lVar) {
        k kVar;
        m mVar = f14447b;
        mVar.getClass();
        synchronized (eVar) {
            if (!eVar.j) {
                eVar.j = true;
                eVar.c();
            }
        }
        String str = "https://" + lVar.f14444a + "/" + lVar.f14446c;
        synchronized (mVar.f14448a) {
            try {
                if (!mVar.f14448a.containsKey(eVar)) {
                    mVar.f14448a.put(eVar, new HashMap());
                }
                Map map = (Map) mVar.f14448a.get(eVar);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                kVar = new k(eVar, lVar);
                map.put(str, kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
