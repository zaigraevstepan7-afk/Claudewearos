package u3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import com.anonlab.voidlauncher.R;
import ej.e;
import fj.l;
import fj.y;
import i2.f;
import java.util.Collection;
import k0.t0;
import t2.w;
import ti.h;
import ti.i;
import u1.d;
import v0.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f16590a;

    /* renamed from: b, reason: collision with root package name */
    public static f f16591b;

    /* renamed from: c, reason: collision with root package name */
    public static f f16592c;

    /* renamed from: d, reason: collision with root package name */
    public static f f16593d;

    /* JADX WARN: Multi-variable type inference failed */
    public static ti.c a(e eVar, ti.c cVar, ti.c cVar2) {
        l.f(eVar, "<this>");
        if (eVar instanceof vi.a) {
            return ((vi.a) eVar).create(cVar, cVar2);
        }
        h context = cVar2.getContext();
        return context == i.f16336a ? new ui.b(eVar, cVar2, cVar) : new ui.c(cVar2, context, eVar, cVar);
    }

    public static final boolean b(String str, String str2) {
        l.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    l.e(strSubstring, "substring(...)");
                    return l.b(nj.e.a1(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            cg.i.e();
            cg.i iVarE = cg.i.e();
            iVarE.b();
            Context context = iVarE.f3367a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final String d(Collection collection) {
        l.f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return nj.f.s0(qi.l.E0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static float e(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y4.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final ViewParent f(View view) {
        l.f(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static ti.c g(ti.c cVar) {
        ti.c cVarIntercepted;
        l.f(cVar, "<this>");
        vi.c cVar2 = cVar instanceof vi.c ? (vi.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static final boolean h(u0 u0Var, boolean z2) {
        w wVarC;
        t0 t0Var = u0Var.f17489d;
        if (t0Var == null || (wVarC = t0Var.c()) == null) {
            return false;
        }
        b2.c cVarI = d.i(wVarC);
        long jL = u0Var.l(z2);
        float f10 = cVarI.f1502a;
        float f11 = cVarI.f1504c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f10 > fIntBitsToFloat || fIntBitsToFloat > f11) {
            return false;
        }
        float f12 = cVarI.f1503b;
        float f13 = cVarI.f1505d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f12 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f13;
    }

    public static final String i(Collection collection) {
        return nj.f.s0(qi.l.E0(collection, ",", null, null, null, 62)) + nj.f.s0(" }");
    }

    public static final String j(Collection collection) {
        return nj.f.s0(qi.l.E0(collection, ",", null, null, null, 62)) + nj.f.s0("},");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(android.content.Intent r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.k(android.content.Intent):void");
    }

    public static void l(Bundle bundle, String str) {
        try {
            cg.i.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = ld.i.O(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (cg.i.e().c(fg.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static float m(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y4.c.c(edgeEffect, f10, f11);
        }
        y4.b.a(edgeEffect, f10, f11);
        return f10;
    }

    public static boolean n(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final void o(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static Object p(e eVar, Object obj, ti.c cVar) {
        l.f(eVar, "<this>");
        h context = cVar.getContext();
        Object dVar = context == i.f16336a ? new ui.d(cVar) : new ui.e(cVar, context);
        y.c(2, eVar);
        return eVar.invoke(obj, dVar);
    }
}
