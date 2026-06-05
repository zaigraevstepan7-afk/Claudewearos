package xc;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f19950a;

    public j0(l0 l0Var) {
        this.f19950a = l0Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        l0 l0Var = this.f19950a;
        synchronized (l0Var) {
            try {
                if (size() <= l0Var.f19968a) {
                    return false;
                }
                l0Var.f19973f.add(new Pair((String) entry.getKey(), ((k0) entry.getValue()).f19956b));
                return size() > l0Var.f19968a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
