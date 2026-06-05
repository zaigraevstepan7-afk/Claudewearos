package h4;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f7622a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f7623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7624c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7625d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7626e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f7627f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f7628g;

    public f(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f7625d = true;
        this.f7623b = iconCompatA;
        if (iconCompatA.c() == 2) {
            this.f7626e = iconCompatA.b();
        }
        this.f7627f = l.b(str);
        this.f7628g = pendingIntent;
        this.f7622a = bundle;
        this.f7624c = true;
        this.f7625d = true;
    }
}
