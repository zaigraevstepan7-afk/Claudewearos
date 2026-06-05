package lh;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final cg.d f10979a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10980b;

    /* renamed from: c, reason: collision with root package name */
    public final oh.b f10981c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f10982d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10983e;

    public d(Context context, String str, Set set, oh.b bVar, Executor executor) {
        this.f10979a = new cg.d(context, str);
        this.f10982d = set;
        this.f10983e = executor;
        this.f10981c = bVar;
        this.f10980b = context;
    }

    public final synchronized int a() {
        boolean zB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        yh.c cVar = (yh.c) this.f10979a.get();
        synchronized (cVar) {
            zB = cVar.B(jCurrentTimeMillis);
        }
        if (!zB) {
            return 1;
        }
        synchronized (cVar) {
            String strR = cVar.r(System.currentTimeMillis());
            ((SharedPreferences) cVar.f20314b).edit().putString("last-used-date", strR).commit();
            cVar.y(strR);
        }
        return 3;
    }

    public final void b() {
        if (this.f10982d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!((UserManager) this.f10980b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f10983e, new c(this, 1));
        }
    }
}
