package v8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import h8.o;
import h8.p;
import h8.r;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final double f17881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.i f17882b;

    public a(b1.i iVar, r rVar) {
        this.f17882b = iVar;
        p pVar = rVar.f7726a;
        gf.f fVar = o.f7708a;
        Object obj = pVar.f7713b.f13858n.f7703a.get(o.f7711d);
        this.f17881a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d10 = this.f17881a;
        if (d10 == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        fj.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        b1.i iVar = this.f17882b;
        r rVar = (r) ((WeakReference) iVar.f1488b).get();
        if (rVar == null) {
            iVar.b();
            return;
        }
        q8.c cVarC = rVar.c();
        if (cVarC != null) {
            synchronized (cVarC.f13299c) {
                j = cVarC.f13297a.f13182a;
            }
            cVarC.a((long) (d10 * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.f17881a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        fj.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        b1.i iVar = this.f17882b;
        r rVar = (r) ((WeakReference) iVar.f1488b).get();
        if (rVar == null) {
            iVar.b();
            return;
        }
        q8.c cVarC = rVar.c();
        if (cVarC != null) {
            synchronized (cVarC.f13299c) {
                j = cVarC.f13297a.f13182a;
            }
            cVarC.a(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
