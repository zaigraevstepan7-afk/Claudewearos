package t1;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y implements Map.Entry, gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15517a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f15519c;

    public y(z zVar) {
        this.f15519c = zVar;
        Map.Entry entry = zVar.f15523d;
        fj.l.c(entry);
        this.f15517a = entry.getKey();
        Map.Entry entry2 = zVar.f15523d;
        fj.l.c(entry2);
        this.f15518b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15517a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15518b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        z zVar = this.f15519c;
        if (zVar.f15520a.c().f15487d != zVar.f15522c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f15518b;
        zVar.f15520a.put(this.f15517a, obj);
        this.f15518b = obj;
        return obj2;
    }
}
