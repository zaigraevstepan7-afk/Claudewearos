package f0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6104a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6105b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6106c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6107d;

    public a1(int i10) {
        switch (i10) {
            case 3:
                this.f6105b = new Intent("android.intent.action.VIEW");
                this.f6106c = new h9.a(9);
                this.f6104a = true;
                break;
            default:
                this.f6105b = new Object();
                this.f6106c = new ArrayList();
                this.f6107d = new ArrayList();
                this.f6104a = true;
                break;
        }
    }

    public t0.j a() {
        Intent intent = (Intent) this.f6105b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f6104a);
        ((h9.a) this.f6106c).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i10 = Build.VERSION.SDK_INT;
        String strA = p.i.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (((ActivityOptions) this.f6107d) == null) {
                this.f6107d = p.h.a();
            }
            p.j.a((ActivityOptions) this.f6107d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f6107d;
        return new t0.j(25, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public synchronized boolean b() {
        boolean z2;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.f6104a) {
                        Boolean boolC = c();
                        this.f6106c = boolC;
                        if (boolC == null) {
                            ((kg.l) ((ih.b) this.f6105b)).a(new vf.j(5));
                        }
                        this.f6104a = true;
                    }
                } finally {
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            throw th2;
        }
        Boolean bool = (Boolean) this.f6106c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            cg.i iVar = ((FirebaseMessaging) this.f6107d).f4293a;
            iVar.b();
            th.a aVar = (th.a) iVar.f3373g.get();
            synchronized (aVar) {
                z2 = aVar.f16330a;
            }
            zBooleanValue = z2;
        }
        return zBooleanValue;
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        cg.i iVar = ((FirebaseMessaging) this.f6107d).f4293a;
        iVar.b();
        Context context = iVar.f3367a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public a1(Context context, String str, f7.c cVar, boolean z2) {
        fj.l.f(context, "context");
        fj.l.f(cVar, "callback");
        this.f6105b = context;
        this.f6106c = str;
        this.f6107d = cVar;
        this.f6104a = z2;
    }

    public a1(p.m mVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f6105b = intent;
        this.f6106c = new h9.a(9);
        this.f6104a = true;
        if (mVar != null) {
            intent.setPackage(mVar.f12586d.getPackageName());
            p.f fVar = mVar.f12585c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }
}
