package n6;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {
    public static final a a(Context context) {
        l.f(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i10 = Build.VERSION.SDK_INT;
        l6.a aVar = l6.a.f10013a;
        sb2.append(i10 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        p6.b bVar = (i10 >= 30 ? aVar.a() : 0) >= 5 ? new p6.b(context) : null;
        if (bVar != null) {
            return new a(bVar);
        }
        return null;
    }

    public abstract mf.a b(Uri uri, InputEvent inputEvent);
}
