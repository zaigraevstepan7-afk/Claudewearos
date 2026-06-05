package qj;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient l1 f13573a;

    public f1(String str, Throwable th2, l1 l1Var) {
        super(str);
        this.f13573a = l1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (!fj.l.b(f1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = f1Var.f13573a;
        if (obj2 == null) {
            obj2 = o1.f13607b;
        }
        Object obj3 = this.f13573a;
        if (obj3 == null) {
            obj3 = o1.f13607b;
        }
        return fj.l.b(obj2, obj3) && fj.l.b(f1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        fj.l.c(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f13573a;
        if (obj == null) {
            obj = o1.f13607b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f13573a;
        if (obj == null) {
            obj = o1.f13607b;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
