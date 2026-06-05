package r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements j {
    public uk.c A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13755a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.c f13756b;

    /* renamed from: c, reason: collision with root package name */
    public final lh.e f13757c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13758d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f13759e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13760f;

    /* renamed from: z, reason: collision with root package name */
    public ThreadPoolExecutor f13761z;

    public s(Context context, q4.c cVar) {
        uk.c.p(context, "Context cannot be null");
        this.f13755a = context.getApplicationContext();
        this.f13756b = cVar;
        this.f13757c = t.f13762d;
    }

    @Override // r5.j
    public final void a(uk.c cVar) {
        synchronized (this.f13758d) {
            this.A = cVar;
        }
        synchronized (this.f13758d) {
            try {
                if (this.A == null) {
                    return;
                }
                if (this.f13760f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13761z = threadPoolExecutor;
                    this.f13760f = threadPoolExecutor;
                }
                this.f13760f.execute(new ac.o(this, 17));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f13758d) {
            try {
                this.A = null;
                Handler handler = this.f13759e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13759e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13761z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13760f = null;
                this.f13761z = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q4.h c() {
        try {
            lh.e eVar = this.f13757c;
            Context context = this.f13755a;
            q4.c cVar = this.f13756b;
            eVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e0.q qVarA = q4.b.a(context, Collections.unmodifiableList(arrayList));
            int i10 = qVarA.f5302a;
            if (i10 != 0) {
                throw new RuntimeException(m6.a.e(i10, "fetchFonts failed (", ")"));
            }
            q4.h[] hVarArr = (q4.h[]) qVarA.f5303b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
