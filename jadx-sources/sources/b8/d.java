package b8;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1622a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f1625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1626e;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f1626e = systemForegroundService;
        this.f1623b = i10;
        this.f1625d = notification;
        this.f1624c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1622a) {
            case 0:
                Notification notification = (Notification) this.f1625d;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f1626e;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = this.f1623b;
                if (i10 < 29) {
                    systemForegroundService.startForeground(i11, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i11, notification, this.f1624c);
                    break;
                }
            default:
                ((p.f) this.f1626e).f12580b.onActivityResized(this.f1623b, this.f1624c, (Bundle) this.f1625d);
                break;
        }
    }

    public d(p.f fVar, int i10, int i11, Bundle bundle) {
        this.f1626e = fVar;
        this.f1623b = i10;
        this.f1624c = i11;
        this.f1625d = bundle;
    }
}
