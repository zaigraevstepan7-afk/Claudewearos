package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1075b;

    public c(int i10, Method method) throws SecurityException {
        this.f1074a = i10;
        this.f1075b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1074a == cVar.f1074a && this.f1075b.getName().equals(cVar.f1075b.getName());
    }

    public final int hashCode() {
        return this.f1075b.getName().hashCode() + (this.f1074a * 31);
    }
}
