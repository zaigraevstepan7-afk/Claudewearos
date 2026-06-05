package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements j7.b {
    @Override // j7.b
    public final List a() {
        return qi.s.f13520a;
    }

    @Override // j7.b
    public final Object b(Context context) {
        fj.l.f(context, "context");
        j7.a aVarC = j7.a.c(context);
        fj.l.e(aVarC, "getInstance(...)");
        if (!aVarC.f8734b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!q.f1121a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            fj.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new p());
        }
        g0 g0Var = g0.B;
        g0Var.getClass();
        g0Var.f1087e = new Handler();
        g0Var.f1088f.d(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        fj.l.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new f0(g0Var));
        return g0Var;
    }
}
