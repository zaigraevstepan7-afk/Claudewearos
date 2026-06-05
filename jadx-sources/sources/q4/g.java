package q4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import e0.q;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.p0;
import q.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final r f13222a = new r(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f13223b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13224c;

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f13225d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13223b = threadPoolExecutor;
        f13224c = new Object();
        f13225d = new p0(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((c) list.get(i11)).f13212g);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static f b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceT;
        r rVar = f13222a;
        Trace.beginSection(yd.f.l0("getFontSync"));
        try {
            Typeface typeface = (Typeface) rVar.get(str);
            if (typeface != null) {
                return new f(typeface);
            }
            q qVarA = b.a(context, list);
            List list2 = qVarA.f5303b;
            int i12 = qVarA.f5302a;
            if (i12 != 0) {
                i11 = i12 != 1 ? -3 : -2;
            } else {
                h[] hVarArr = (h[]) list2.get(0);
                if (hVarArr == null || hVarArr.length == 0) {
                    i11 = 1;
                } else {
                    int length = hVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i11 = 0;
                            break;
                        }
                        int i14 = hVarArr[i13].f13231f;
                        if (i14 == 0) {
                            i13++;
                        } else if (i14 >= 0) {
                            i11 = i14;
                        }
                    }
                }
            }
            if (i11 != 0) {
                return new f(i11);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                h[] hVarArr2 = (h[]) list2.get(0);
                uk.c cVar = l4.f.f9974a;
                Trace.beginSection(yd.f.l0("TypefaceCompat.createFromFontInfo"));
                typefaceT = l4.f.f9974a.t(context, hVarArr2, i10);
                Trace.endSection();
            } else {
                uk.c cVar2 = l4.f.f9974a;
                Trace.beginSection(yd.f.l0("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceT = l4.f.f9974a.u(context, list2, i10);
                Trace.endSection();
            }
            if (typefaceT == null) {
                return new f(-3);
            }
            rVar.put(str, typefaceT);
            return new f(typefaceT);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }
}
