package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13615a;

    /* renamed from: b, reason: collision with root package name */
    public final j f13616b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.f f13617c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13618d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f13619e;

    public s(Object obj, j jVar, ej.f fVar, Object obj2, Throwable th2) {
        this.f13615a = obj;
        this.f13616b = jVar;
        this.f13617c = fVar;
        this.f13618d = obj2;
        this.f13619e = th2;
    }

    public static s a(s sVar, j jVar, Throwable th2, int i10) {
        Object obj = sVar.f13615a;
        if ((i10 & 2) != 0) {
            jVar = sVar.f13616b;
        }
        j jVar2 = jVar;
        ej.f fVar = sVar.f13617c;
        Object obj2 = sVar.f13618d;
        if ((i10 & 16) != 0) {
            th2 = sVar.f13619e;
        }
        return new s(obj, jVar2, fVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return fj.l.b(this.f13615a, sVar.f13615a) && fj.l.b(this.f13616b, sVar.f13616b) && fj.l.b(this.f13617c, sVar.f13617c) && fj.l.b(this.f13618d, sVar.f13618d) && fj.l.b(this.f13619e, sVar.f13619e);
    }

    public final int hashCode() {
        Object obj = this.f13615a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f13616b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        ej.f fVar = this.f13617c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f13618d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f13619e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f13615a + ", cancelHandler=" + this.f13616b + ", onCancellation=" + this.f13617c + ", idempotentResume=" + this.f13618d + ", cancelCause=" + this.f13619e + ')';
    }

    public /* synthetic */ s(Object obj, j jVar, ej.f fVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : fVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
