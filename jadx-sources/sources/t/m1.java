package t;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m1 {
    public static /* synthetic */ String A(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "VALUE" : "CHILD_CHANGED" : "CHILD_MOVED" : "CHILD_ADDED" : "CHILD_REMOVED";
    }

    public static final void a(int i10, View view, ViewGroup viewGroup) {
        fj.l.f(view, "view");
        fj.l.f(viewGroup, "container");
        if (w5.i0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iB = y3.e.b(i10);
        if (iB == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (w5.i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (w5.i0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (w5.i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iB == 2) {
            if (w5.i0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iB != 3) {
            return;
        }
        if (w5.i0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final boolean b(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 6;
    }

    public static int c(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static int d(g3.n0 n0Var, int i10, int i11) {
        return (n0Var.hashCode() + i10) * i11;
    }

    public static b3.e e(String str) {
        s2.a.c(str);
        return new b3.e();
    }

    public static ClassCastException f(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String g(long j, String str) {
        return str + j;
    }

    public static String h(Class cls, StringBuilder sb2) {
        sb2.append(cls.getCanonicalName());
        return sb2.toString();
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder l(String str, String str2, long j) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static HashMap n(Class cls, hh.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map o(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static z.k p(f1.i0 i0Var) {
        z.k kVar = new z.k();
        i0Var.l0(kVar);
        return kVar;
    }

    public static void q(long j, StringBuilder sb2, String str) {
        sb2.append((Object) c2.w.j(j));
        sb2.append(str);
    }

    public static void r(ac.d dVar, long j) {
        dVar.h().q();
        dVar.Q(j);
    }

    public static void s(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(k8.o oVar) throws Exception {
        boolean zIsTerminated;
        if (oVar instanceof AutoCloseable) {
            oVar.close();
            return;
        }
        if (!(oVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) oVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z2 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    executorService.shutdownNow();
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public static void u(ud.b bVar, Bundle bundle, String str) {
        bVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static String v(String str, String str2) {
        return str + str2;
    }

    public static String w(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String x(int i10) {
        switch (i10) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i10) {
        switch (i10) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }
}
