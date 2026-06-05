package m6;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzgya;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.recaptcha.internal.zzhh;
import f1.i0;
import fj.l;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kk.h;
import t.m1;
import v2.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static int a(float f10, float f11, float f12) {
        return Math.round((f10 + f11) * f12);
    }

    public static int b(int i10, int i11, int i12) {
        return zzgya.zzD(i10) + i11 + i12;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static String d(int i10, String str) {
        return str + i10;
    }

    public static String e(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String f(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String g(StringBuilder sb2, int i10, char c6) {
        sb2.append(i10);
        sb2.append(c6);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(StringBuilder sb2, String str, char c6) {
        sb2.append(str);
        sb2.append(c6);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void l(int i10, i0 i0Var, int i11, e eVar) {
        i0Var.l0(Integer.valueOf(i10));
        i0Var.b(eVar, Integer.valueOf(i11));
    }

    public static /* synthetic */ void m(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = l.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            StringBuilder sbM = m1.m("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbM.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbM.toString());
            l.j(nullPointerException, l.class.getName());
            throw nullPointerException;
        }
    }

    public static void n(int i10, String str, String str2) {
        zzea.zzf(str2, str + i10);
    }

    public static void o(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static /* synthetic */ void p(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void r(String str, String str2, String str3) {
        zzea.zzf(str3, str2.concat(String.valueOf(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(h hVar) throws Exception {
        boolean zIsTerminated;
        if (hVar instanceof AutoCloseable) {
            hVar.close();
            return;
        }
        if (!(hVar instanceof ExecutorService)) {
            if (hVar instanceof TypedArray) {
                ((TypedArray) hVar).recycle();
                return;
            } else if (hVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) hVar).release();
                return;
            } else {
                if (!(hVar instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) hVar).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) hVar;
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

    public static int t(int i10, int i11, int i12) {
        int i13 = i10 / i11;
        return i13 + i13 + i12;
    }

    public static int u(int i10, int i11, int i12, int i13) {
        return zzjj.zzA(i10) + i11 + i12 + i13;
    }

    public static int v(int i10, int i11, int i12) {
        return zzjj.zzA(i10) + i11 + i12;
    }

    public static int w(int i10, int i11, int i12, int i13) {
        return com.google.crypto.tink.shaded.protobuf.l.i0(i10) + i11 + i12 + i13;
    }

    public static int x(int i10, int i11, int i12) {
        return zzgr.zzz(i10) + i11 + i12;
    }

    public static int y(int i10, int i11, int i12) {
        return zzhh.zzy(i10) + i11 + i12;
    }

    public static int z(int i10, int i11, int i12) {
        return com.google.crypto.tink.shaded.protobuf.l.h0(i10) + i11 + i12;
    }
}
