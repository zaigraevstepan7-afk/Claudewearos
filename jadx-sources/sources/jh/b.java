package jh;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.e0;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8932b;

    public /* synthetic */ b(Context context, int i10) {
        this.f8931a = i10;
        this.f8932b = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        int i10 = this.f8931a;
        Context context = this.f8932b;
        switch (i10) {
            case 0:
                lh.e eVar = new lh.e();
                nd.f fVar = he.a.f7887a;
                e0.j(context, "Context must not be null");
                e0.d("Must be called on the UI thread");
                new he.b(context, eVar).execute(new Void[0]);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b(context, 2));
                break;
            default:
                r6.d.t(context, new n.a(1), r6.d.f13795a, false);
                break;
        }
    }
}
