package of;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final j f12490c;

    public q(int i10, j jVar) {
        this.f12489b = i10;
        this.f12490c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f12489b == this.f12489b && qVar.f12490c == this.f12490c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12489b), this.f12490c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.f12490c);
        sb2.append(", ");
        return m6.a.h(sb2, this.f12489b, "-byte key)");
    }
}
