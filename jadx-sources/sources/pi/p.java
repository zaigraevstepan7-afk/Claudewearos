package pi;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public ej.a f13012a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13013b;

    @Override // pi.e
    public final Object getValue() {
        if (this.f13013b == n.f13010a) {
            ej.a aVar = this.f13012a;
            fj.l.c(aVar);
            this.f13013b = aVar.a();
            this.f13012a = null;
        }
        return this.f13013b;
    }

    public final String toString() {
        return this.f13013b != n.f13010a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
