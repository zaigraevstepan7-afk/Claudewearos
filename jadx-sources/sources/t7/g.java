package t7;

import android.app.Notification;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f16116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16117b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f16118c;

    public g(int i10, Notification notification, int i11) {
        this.f16116a = i10;
        this.f16118c = notification;
        this.f16117b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f16116a == gVar.f16116a && this.f16117b == gVar.f16117b) {
            return this.f16118c.equals(gVar.f16118c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16118c.hashCode() + (((this.f16116a * 31) + this.f16117b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16116a + ", mForegroundServiceType=" + this.f16117b + ", mNotification=" + this.f16118c + '}';
    }
}
