package th;

import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f16331a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return e0.l(this.f16331a, ((b) obj).f16331a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16331a});
    }

    public final String toString() {
        j jVar = new j(this);
        jVar.g(this.f16331a, "token");
        return jVar.toString();
    }
}
