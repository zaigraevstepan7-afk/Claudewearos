package rc;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzfnt;
import com.google.android.gms.internal.ads.zzfrn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final zzfrn f14331b = new zzfrn(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final String f14332c = fc.i.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f14333d = sc.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f14334e = gc.b.class.getName();

    /* renamed from: f, reason: collision with root package name */
    public static final String f14335f = gc.c.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f14336g = zzfnt.class.getName();

    /* renamed from: h, reason: collision with root package name */
    public static final String f14337h = fc.f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f14338a;

    public static final void a(Context context, String str, Bundle bundle, d dVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            nd.f.f12280b.getClass();
            str = gk.b.m(nd.f.a(context), ".252130000");
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        dVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int b(Context context, int i10) {
        return m(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || n()) {
            string = "emulator";
        }
        return d(string, "MD5");
    }

    public static String d(String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbfl.zzd.zze());
    }

    public static final int m(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final boolean n() {
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlG)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public final JSONArray e(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void f(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(e((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(i((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void g(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzp)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), e((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, e(Arrays.asList((Object[]) obj)));
            return;
        }
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i10 < length) {
                numArr[i10] = Integer.valueOf(iArr[i10]);
                i10++;
            }
            jSONObject.put(str, i(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i10 < length2) {
                dArr2[i10] = Double.valueOf(dArr[i10]);
                i10++;
            }
            jSONObject.put(str, i(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i10 < length3) {
                lArr[i10] = Long.valueOf(jArr[i10]);
                i10++;
            }
            jSONObject.put(str, i(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i10 < length4) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
            i10++;
        }
        jSONObject.put(str, i(boolArr));
    }

    public final int h(Context context, int i10) {
        if (this.f14338a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f14338a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f14338a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i10 / this.f14338a);
    }

    public final JSONArray i(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            f(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject j(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            g(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject k(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                g(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
