package qc;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcgh;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdpf;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzfvv;
import com.google.android.gms.internal.ads.zzhgo;
import f0.a1;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f13445l = new m0(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public String f13452g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f13453h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f13446a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f13447b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f13448c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13449d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f13450e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13451f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f13454i = false;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f13455k = Executors.newSingleThreadExecutor();

    public static int D(Context context, Uri uri) {
        if (context == null) {
            l0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        zzbct zzbctVar = zzbdc.zzeO;
        nc.t tVar = nc.t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            t0.j jVarA = new a1(mc.n.D.f11587n.zza()).a();
            Intent intent2 = (Intent) jVarA.f15363b;
            if (((Boolean) zzbdaVar2.zzb(zzbdc.zzfa)).booleanValue()) {
                rc.e eVar = nc.s.f12202f.f12203a;
                if (rc.e.n()) {
                    return 5;
                }
            }
            intent2.setPackage(zzhgo.zza(context));
            intent2.setData(uri);
            i4.c.startActivity(context, intent2, (Bundle) jVarA.f15364c);
            return 5;
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzeM)).booleanValue()) {
            zzbed zzbedVar = new zzbed();
            zzbedVar.zze(new p1.l(zzbedVar, context, uri, 2));
            zzbedVar.zzb((Activity) context);
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(uri);
        intent3.addFlags(268435456);
        context.startActivity(intent3);
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean E(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.r0.E(android.view.View):boolean");
    }

    public static final void F(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String G(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return v(u(context));
    }

    public static final String H() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String I() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : m1.w(str, " ", str2);
    }

    public static final HashMap J(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e10) {
            mc.n.D.f11582h.zzw(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long K(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final a0 a(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return iInterfaceQueryLocalInterface instanceof a0 ? (a0) iInterfaceQueryLocalInterface : new z(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            }
            int i10 = l0.f13401b;
            rc.k.d("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e10) {
            mc.n.D.f11582h.zzw(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean b(Context context, String str) {
        Context contextZza = zzbvy.zza(context);
        return wd.b.a(contextZza).f9352a.getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean c(Context context) {
        try {
            if (ud.c.f16990h == null) {
                ud.c.f16990h = Boolean.valueOf(ud.c.k() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return ud.c.f16990h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean d(String str) {
        if (!rc.h.c()) {
            return false;
        }
        zzbct zzbctVar = zzbdc.zzfq;
        nc.t tVar = nc.t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) tVar.f12230c.zzb(zzbdc.zzfs);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) nc.t.f12227d.f12230c.zzb(zzbdc.zzfr);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            int i10 = l0.f13401b;
            rc.k.e("Error loading class.", th2);
            mc.n.D.f11582h.zzw(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            Bundle bundleU = u(context);
            String string = bundleU.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(v(bundleU))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void i(View view, int i10) {
        String strZza;
        int i11;
        int iHeight;
        int iWidth;
        String str;
        zzfbt zzfbtVarZzD;
        zzfbw zzfbwVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpf) {
                childAt = ((zzdpf) childAt).getChildAt(0);
            }
            if (childAt instanceof wc.i) {
                strZza = "NATIVE";
                i11 = 1;
            } else {
                strZza = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            r0 r0Var = mc.n.D.f11577c;
            long jK = K(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcgh) || (zzfbwVarZzR = ((zzcgh) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfbwVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzcev) && (zzfbtVarZzD = ((zzcev) childAt).zzD()) != null) {
                strZza = zzfbt.zza(zzfbtVarZzD.zzb);
                i11 = zzfbtVarZzD.zze;
                str2 = zzfbtVarZzD.zzE;
            }
            Locale locale = Locale.US;
            String str3 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i11 + ", class=" + childAt.getClass().getName() + ", x=" + i12 + ", y=" + i13 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jK + ", state=" + Integer.toString(i10, 2) + ">";
            int i14 = l0.f13401b;
            rc.k.f(str3);
        } catch (Exception e10) {
            int i15 = l0.f13401b;
            rc.k.e("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        t0 t0Var = mc.n.D.f11580f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final boolean k(zzfbt zzfbtVar) {
        return ((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzny)).booleanValue() && zzfbtVar != null && zzfbtVar.zze == 4;
    }

    public static final int l(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String strConcat = "Could not parse value:".concat(e10.toString());
            int i10 = l0.f13401b;
            rc.k.g(strConcat);
            return 0;
        }
    }

    public static final HashMap m(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzq)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i10 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i10);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i10);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i10, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i10 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] n(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] o(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        nc.s sVar = nc.s.f12202f;
        return new int[]{sVar.f12203a.h(activity, iArr[0]), sVar.f12203a.h(activity, iArr[1])};
    }

    public static final boolean p(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z2 = mc.n.D.f11577c.f13450e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || E(view);
        long jK = K(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z2)) {
            zzbct zzbctVar = zzbdc.zzbw;
            nc.t tVar = nc.t.f12227d;
            zzbda zzbdaVar = tVar.f12230c;
            zzbda zzbdaVar2 = tVar.f12230c;
            if ((!((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) zzbdaVar2.zzb(zzbdc.zzkP)).booleanValue() || jK >= ((Integer) zzbdaVar2.zzb(zzbdc.zzkR)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void q(Context context, Intent intent) {
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlm)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e10) {
            int i10 = l0.f13401b;
            rc.k.h("", e10);
            mc.n.D.f11582h.zzw(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void r(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            F(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String str = "Opening " + uri.toString() + " in a new browser.";
            int i10 = l0.f13401b;
            rc.k.b(str);
        } catch (ActivityNotFoundException e10) {
            int i11 = l0.f13401b;
            rc.k.e("No browser is found.", e10);
        }
    }

    public static final void s(Context context, Intent intent, zzdsc zzdscVar, String str) {
        zzbct zzbctVar = zzbdc.zznm;
        nc.t tVar = nc.t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || !(context instanceof zzcgx)) {
            q(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) tVar.f12230c.zzb(zzbdc.zzno))) {
                    ((zzcgx) context).zzc(intent, 236);
                    if (!((Boolean) tVar.f12230c.zzb(zzbdc.zznn)).booleanValue() || zzdscVar == null) {
                        return;
                    }
                    zzdsb zzdsbVarZza = zzdscVar.zza();
                    zzdsbVarZza.zzb("action", "hila");
                    zzdsbVarZza.zzb("gqi", zzfvv.zzc(str));
                    zzdsbVarZza.zzi();
                    return;
                }
            }
            q(context, intent);
        } catch (ActivityNotFoundException e10) {
            e = e10;
            int i10 = l0.f13401b;
            rc.k.e("Error occurred while starting activity for result", e);
            mc.n.D.f11582h.zzw(e, "AdUtil.startActivityForResult");
            q(context, intent);
        } catch (SecurityException e11) {
            e = e11;
            int i102 = l0.f13401b;
            rc.k.e("Error occurred while starting activity for result", e);
            mc.n.D.f11582h.zzw(e, "AdUtil.startActivityForResult");
            q(context, intent);
        } catch (Exception e12) {
            int i11 = l0.f13401b;
            rc.k.e("Error occurred while starting activity for result", e12);
            mc.n.D.f11582h.zzw(e12, "AdUtil.startActivityForResult");
            q(context, intent);
        }
    }

    public static int t(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        String strE = m6.a.e(i10, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i11 = l0.f13401b;
        rc.k.g(strE);
        return 60000;
    }

    public static Bundle u(Context context) {
        try {
            return wd.b.a(context).b(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            l0.l("Error getting metadata", e10);
            return null;
        }
    }

    public static String v(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String x(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            return H();
        }
        String strH = null;
        try {
            boolean z2 = false;
            if (p7.k.f12811c == null) {
                p7.k.f12811c = new p7.k(20, z2);
            }
            p7.k kVar = p7.k.f12811c;
            if (TextUtils.isEmpty((String) kVar.f12813b)) {
                AtomicBoolean atomicBoolean = nd.i.f12283a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                kVar.f12813b = (String) u6.v.m0(context, new mc.g(1, contextCreatePackageContext, context, z2));
            }
            strH = (String) kVar.f12813b;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strH)) {
            strH = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strH)) {
            strH = H();
        }
        String strW = m1.w(strH, " (Mobile; ", str);
        try {
            if (wd.b.a(context).f()) {
                strW = strW + ";aia";
            }
        } catch (Exception e10) {
            mc.n.D.f11582h.zzw(e10, "AdUtil.getUserAgent");
        }
        return strW.concat(")");
    }

    public static ArrayList z() {
        zzbct zzbctVar = zzbdc.zza;
        List listZzb = nc.t.f12227d.f12228a.zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfvt.zzb(zzfup.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    l0.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final void A(Context context, String str, HttpURLConnection httpURLConnection, int i10) {
        int iT = t(i10);
        String strE = m6.a.e(iT, "HTTP timeout: ", " milliseconds.");
        int i11 = l0.f13401b;
        rc.k.f(strE);
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", y(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void B(Context context) {
        if (this.j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbdc.zza(context);
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new q0(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new q0(), intentFilter, 4);
        }
        this.j = true;
    }

    public final void C(Context context) {
        if (this.f13454i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbdc.zza(context);
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new a8.c(this, 3), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new a8.c(this, 3), intentFilter, 4);
        }
        this.f13454i = true;
    }

    public final String y(Context context, String str) {
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzly)).booleanValue()) {
            if (this.f13453h != null) {
                return this.f13453h;
            }
            this.f13453h = x(context, str);
            return this.f13453h;
        }
        synchronized (this.f13451f) {
            try {
                String str2 = this.f13452g;
                if (str2 != null) {
                    return str2;
                }
                String strX = x(context, str);
                this.f13452g = strX;
                return strX;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
