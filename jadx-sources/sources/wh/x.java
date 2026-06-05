package wh;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final long f19399i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19400a;

    /* renamed from: b, reason: collision with root package name */
    public final mh.d f19401b;

    /* renamed from: c, reason: collision with root package name */
    public final uf.p f19402c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f19403d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19405f;

    /* renamed from: h, reason: collision with root package name */
    public final v f19407h;

    /* renamed from: e, reason: collision with root package name */
    public final q.e f19404e = new q.e(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f19406g = false;

    public x(FirebaseMessaging firebaseMessaging, mh.d dVar, v vVar, uf.p pVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f19403d = firebaseMessaging;
        this.f19401b = dVar;
        this.f19407h = vVar;
        this.f19402c = pVar;
        this.f19400a = context;
        this.f19405f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f19403d.a();
        uf.p pVar = this.f19402c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(pVar.p(pVar.u(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f19403d.a();
        uf.p pVar = this.f19402c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(pVar.p(pVar.u(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z2) {
        this.f19406g = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.x.e():boolean");
    }

    public final void f(long j4) {
        this.f19405f.schedule(new z(this, this.f19400a, this.f19401b, Math.min(Math.max(30L, 2 * j4), f19399i)), j4, TimeUnit.SECONDS);
        d(true);
    }
}
