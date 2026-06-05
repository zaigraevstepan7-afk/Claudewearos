package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import fj.l;
import java.util.LinkedHashMap;
import u6.h;
import u6.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1214b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final i f1215c = new i(this);

    /* renamed from: d, reason: collision with root package name */
    public final h f1216d = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f1216d;
    }
}
