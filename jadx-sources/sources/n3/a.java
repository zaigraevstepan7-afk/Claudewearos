package n3;

import fj.l;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f11895a;

    public a(Locale locale) {
        this.f11895a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.b(this.f11895a.toLanguageTag(), ((a) obj).f11895a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f11895a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f11895a.toLanguageTag();
    }
}
