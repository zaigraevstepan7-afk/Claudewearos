package wh;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import w2.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f19334a;

    public b0(s1 s1Var) {
        this.f19334a = s1Var;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c0Var.f19336a;
        g gVar = (g) this.f19334a.f18374b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f19348a.execute(new p0.g(gVar, intent, taskCompletionSource, 3));
        taskCompletionSource.getTask().addOnCompleteListener(new n.a(1), new t1.f(c0Var, 6));
    }
}
