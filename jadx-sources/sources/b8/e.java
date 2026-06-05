package b8;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import w7.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1628b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1629c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1630d;

    public /* synthetic */ e(Object obj, int i10, int i11, Object obj2) {
        this.f1627a = i11;
        this.f1629c = obj;
        this.f1630d = obj2;
        this.f1628b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1627a) {
            case 0:
                ((SystemForegroundService) this.f1630d).f1257e.notify(this.f1628b, (Notification) this.f1629c);
                break;
            case 1:
                ((TextView) this.f1629c).setTypeface((Typeface) this.f1630d, this.f1628b);
                break;
            case 2:
                ((p.f) this.f1630d).f12580b.onNavigationEvent(this.f1628b, (Bundle) this.f1629c);
                break;
            case 3:
                ((BottomSheetBehavior) this.f1630d).E((View) this.f1629c, this.f1628b, false);
                break;
            default:
                ((g) this.f1629c).a(this.f1628b, (Intent) this.f1630d);
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i10, Parcelable parcelable, int i11) {
        this.f1627a = i11;
        this.f1630d = obj;
        this.f1628b = i10;
        this.f1629c = parcelable;
    }

    public e(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f1627a = 3;
        this.f1630d = bottomSheetBehavior;
        this.f1629c = view;
        this.f1628b = i10;
    }
}
