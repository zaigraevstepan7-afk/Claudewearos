package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends h {
    final /* synthetic */ g0 this$0;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class a extends h {
        final /* synthetic */ g0 this$0;

        public a(g0 g0Var) {
            this.this$0 = g0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            fj.l.f(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            fj.l.f(activity, "activity");
            g0 g0Var = this.this$0;
            int i10 = g0Var.f1083a + 1;
            g0Var.f1083a = i10;
            if (i10 == 1 && g0Var.f1086d) {
                g0Var.f1088f.d(n.ON_START);
                g0Var.f1086d = false;
            }
        }
    }

    public f0(g0 g0Var) {
        this.this$0 = g0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        fj.l.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = n0.f1109b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fj.l.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((n0) fragmentFindFragmentByTag).f1110a = this.this$0.A;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        fj.l.f(activity, "activity");
        g0 g0Var = this.this$0;
        int i10 = g0Var.f1084b - 1;
        g0Var.f1084b = i10;
        if (i10 == 0) {
            Handler handler = g0Var.f1087e;
            fj.l.c(handler);
            handler.postDelayed(g0Var.f1089z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        fj.l.f(activity, "activity");
        e0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        fj.l.f(activity, "activity");
        g0 g0Var = this.this$0;
        int i10 = g0Var.f1083a - 1;
        g0Var.f1083a = i10;
        if (i10 == 0 && g0Var.f1085c) {
            g0Var.f1088f.d(n.ON_STOP);
            g0Var.f1086d = true;
        }
    }
}
