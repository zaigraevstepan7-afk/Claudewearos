package vj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements ti.g {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f18127a;

    public v(ThreadLocal threadLocal) {
        this.f18127a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && fj.l.b(this.f18127a, ((v) obj).f18127a);
    }

    public final int hashCode() {
        return this.f18127a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f18127a + ')';
    }
}
