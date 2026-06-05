package q9;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13310a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13311b = new LinkedHashMap();

    public a(Context context) {
        this.f13310a = context;
    }

    public final c a(String str) {
        LinkedHashMap linkedHashMap = this.f13311b;
        Object cVar = linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new c(this.f13310a, str);
            linkedHashMap.put(str, cVar);
        }
        return (c) cVar;
    }
}
