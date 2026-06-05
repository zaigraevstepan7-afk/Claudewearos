package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class n0 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1109b = 0;

    /* renamed from: a, reason: collision with root package name */
    public ld.i f1110a;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final m0 Companion = new m0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            fj.l.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            fj.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            fj.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            fj.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            fj.l.f(activity, "activity");
            int i10 = n0.f1109b;
            k0.a(activity, n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            fj.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            fj.l.f(activity, "activity");
            fj.l.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            fj.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            fj.l.f(activity, "activity");
        }
    }

    public final void a(n nVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            fj.l.e(activity, "getActivity(...)");
            k0.a(activity, nVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(n.ON_DESTROY);
        this.f1110a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ld.i iVar = this.f1110a;
        if (iVar != null) {
            ((g0) iVar.f10924b).b();
        }
        a(n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ld.i iVar = this.f1110a;
        if (iVar != null) {
            g0 g0Var = (g0) iVar.f10924b;
            int i10 = g0Var.f1083a + 1;
            g0Var.f1083a = i10;
            if (i10 == 1 && g0Var.f1086d) {
                g0Var.f1088f.d(n.ON_START);
                g0Var.f1086d = false;
            }
        }
        a(n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(n.ON_STOP);
    }
}
