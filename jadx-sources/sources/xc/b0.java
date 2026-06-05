package xc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzfyk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19904a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f19905b;

    /* renamed from: c, reason: collision with root package name */
    public final List f19906c;

    /* renamed from: d, reason: collision with root package name */
    public final rc.a f19907d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f19908e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f19909f = new AtomicBoolean(false);

    public b0(Context context, List list, rc.a aVar) {
        this.f19904a = context;
        this.f19905b = context.getApplicationInfo();
        this.f19906c = list;
        this.f19907d = aVar;
    }

    public final JSONObject a() throws JSONException {
        if (!this.f19909f.get()) {
            b(null);
        }
        return this.f19908e;
    }

    public final void b(WebView webView) throws JSONException {
        if (this.f19909f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoD = null;
        ApplicationInfo applicationInfo = this.f19905b;
        if (applicationInfo != null) {
            try {
                packageInfoD = wd.b.a(this.f19904a).d(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f19908e;
        if (packageInfoD != null) {
            try {
                jSONObject.put("vc", packageInfoD.versionCode);
                jSONObject.put("vnm", packageInfoD.versionName);
            } catch (JSONException e10) {
                mc.n.D.f11582h.zzw(e10, "PawAppSignalGenerator.initialize");
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        List list = this.f19906c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) nc.t.f12227d.f12230c.zzb(zzbdc.zzka)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        jSONObject.put("js", this.f19907d.f14321a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzbfh.zzb.zze()).booleanValue() && mk.b.w("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) nc.t.f12227d.f12230c.zzb(zzbdc.zzjZ), a());
            zzfyk zzfykVarZzo = zzfyk.zzo("*");
            int i10 = o7.e.f12424a;
            if (!p7.n.f12818d.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }
}
