package p4;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f12793b = new e(new f(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final f f12794a;

    public e(f fVar) {
        this.f12794a = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f12794a.equals(((e) obj).f12794a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12794a.f12795a.hashCode();
    }

    public final String toString() {
        return this.f12794a.f12795a.toString();
    }
}
