package ua;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import pi.o;
import qi.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.c f16924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f16925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xa.f f16926c;

    public i(ej.c cVar, Set set, xa.f fVar) {
        this.f16924a = cVar;
        this.f16925b = set;
        this.f16926c = fVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        LinkedHashSet linkedHashSet;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Set set = this.f16925b;
        if (set instanceof Collection) {
            linkedHashSet = new LinkedHashSet(set);
        } else {
            linkedHashSet = new LinkedHashSet();
            l.P0(set, linkedHashSet);
        }
        String str = this.f16926c.f19863b;
        if (zBooleanValue) {
            linkedHashSet.add(str);
        } else {
            linkedHashSet.remove(str);
        }
        this.f16924a.invoke(linkedHashSet);
        return o.f13011a;
    }
}
