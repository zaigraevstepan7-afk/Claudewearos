package d8;

import android.content.ComponentName;
import android.content.Context;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5002a = t7.m.l("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z2) {
        String str = f5002a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            t7.m.g().c(str, cls.getName() + " " + (z2 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            t7.m.g().c(str, m1.w(cls.getName(), " could not be ", z2 ? "enabled" : "disabled"), e10);
        }
    }
}
