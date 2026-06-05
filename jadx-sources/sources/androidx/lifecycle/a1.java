package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1061a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1061a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
