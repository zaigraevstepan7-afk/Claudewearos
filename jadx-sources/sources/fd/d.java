package fd;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import mh.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final d f6729c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6731b;

    static {
        g gVar = new g(12, false);
        gVar.f11707b = Boolean.FALSE;
        f6729c = new d(gVar);
    }

    public d(g gVar) {
        this.f6730a = ((Boolean) gVar.f11707b).booleanValue();
        this.f6731b = (String) gVar.f11708c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.l(null, null) && this.f6730a == dVar.f6730a && e0.l(this.f6731b, dVar.f6731b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f6730a), this.f6731b});
    }
}
