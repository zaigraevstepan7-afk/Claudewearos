package o;

import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f12351e = new HashMap();

    @Override // o.f
    public final c b(Object obj) {
        return (c) this.f12351e.get(obj);
    }

    @Override // o.f
    public final Object e(Object obj) {
        Object objE = super.e(obj);
        this.f12351e.remove(obj);
        return objE;
    }
}
