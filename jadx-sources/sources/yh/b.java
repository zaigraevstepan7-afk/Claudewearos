package yh;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20310a;

    /* renamed from: b, reason: collision with root package name */
    public final c f20311b;

    public b(Set set, c cVar) {
        this.f20310a = b(set);
        this.f20311b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f20308a);
            sb2.append('/');
            sb2.append(aVar.f20309b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f20310a;
        c cVar = this.f20311b;
        synchronized (((HashSet) cVar.f20314b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f20314b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f20314b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f20314b);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
