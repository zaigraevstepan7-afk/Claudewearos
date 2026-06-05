package k0;

import android.os.Build;
import android.os.Trace;
import f1.r2;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f9236a = new r2(new jb.e(7));

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f9237b;

    public static final void a(final g3.f fVar, final g3.n0 n0Var, final k3.i iVar, final List list, f1.i0 i0Var) {
        Executor executor = (Executor) i0Var.j(f9236a);
        if (executor == null || !b(fVar.f7081b.length())) {
            i0Var.b0(-517090505);
            i0Var.p(false);
            return;
        }
        i0Var.b0(-518737659);
        final s3.m mVar = (s3.m) i0Var.j(w2.f1.f18267n);
        final s3.c cVar = (s3.c) i0Var.j(w2.f1.f18262h);
        try {
            executor.execute(new Runnable() { // from class: k0.o
                @Override // java.lang.Runnable
                public final void run() {
                    t1.b bVarC;
                    g3.n0 n0Var2 = n0Var;
                    s3.m mVar2 = mVar;
                    g3.f fVar2 = fVar;
                    s3.c cVar2 = cVar;
                    k3.i iVar2 = iVar;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        t1.g gVarJ = t1.m.j();
                        t1.b bVar = gVarJ instanceof t1.b ? (t1.b) gVarJ : null;
                        if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            t1.g gVarJ2 = bVarC.j();
                            try {
                                g3.n0 n0VarH = g3.e0.h(n0Var2, mVar2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = qi.s.f13520a;
                                }
                                ak.v vVar = new ak.v(fVar2, n0VarH, list2, cVar2, iVar2);
                                vVar.c();
                                vVar.b();
                                t1.g.q(gVarJ2);
                                bVarC.w().e();
                            } catch (Throwable th2) {
                                t1.g.q(gVarJ2);
                                throw th2;
                            }
                        } finally {
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        i0Var.p(false);
    }

    public static final boolean b(int i10) {
        if (Build.VERSION.SDK_INT >= 28 && i10 >= 8 && i10 < 1000) {
            if (f9237b == null) {
                f9237b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f9237b;
            fj.l.c(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
