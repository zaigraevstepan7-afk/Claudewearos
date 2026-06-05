package m9;

import android.content.Context;
import android.content.pm.PackageManager;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f11432a;

    public a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        l.e(packageManager, "getPackageManager(...)");
        this.f11432a = packageManager;
    }
}
