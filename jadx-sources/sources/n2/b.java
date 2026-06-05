package n2;

import android.view.KeyEvent;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f11892a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.b(this.f11892a, ((b) obj).f11892a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11892a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f11892a + ')';
    }
}
