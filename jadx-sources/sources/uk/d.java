package uk;

import ak.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public Object f17140b;

    @Override // uk.b
    public final Object a(v vVar) {
        Object obj = this.f17140b;
        if (obj == null) {
            return super.a(vVar);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // uk.b
    public final Object b(v vVar) {
        synchronized (this) {
            if (this.f17140b == null) {
                this.f17140b = a(vVar);
            }
        }
        Object obj = this.f17140b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
