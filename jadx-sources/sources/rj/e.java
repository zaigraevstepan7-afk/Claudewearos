package rj;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.lifecycle.h0;
import java.lang.reflect.InvocationTargetException;
import pi.j;
import qj.l;
import qj.m0;
import vj.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14556a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objR;
        try {
            objR = new d(b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objR = uk.c.r(th2);
        }
        if (objR instanceof j) {
            objR = null;
        }
    }

    public static final void a(l lVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            fj.l.c(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new r6.e(lVar));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            fj.l.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object c(h0 h0Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            l lVar = new l(1, u3.a.g(h0Var));
            lVar.p();
            choreographer2.postFrameCallback(new r6.e(lVar));
            Object objO = lVar.o();
            ui.a aVar = ui.a.f17085a;
            return objO;
        }
        l lVar2 = new l(1, u3.a.g(h0Var));
        lVar2.p();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(lVar2);
        } else {
            xj.e eVar = m0.f13601a;
            n.f18117a.e0(lVar2.f13597e, new ah.d(lVar2, 26));
        }
        Object objO2 = lVar2.o();
        ui.a aVar2 = ui.a.f17085a;
        return objO2;
    }
}
