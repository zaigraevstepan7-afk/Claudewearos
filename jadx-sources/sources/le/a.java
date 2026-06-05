package le;

import android.os.Bundle;
import java.util.Set;
import qi.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10926a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f10927b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10928c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10929d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10930e;

    public a(String str) {
        Bundle bundleI = mk.b.I(str);
        Bundle bundleI2 = mk.b.I(str);
        this.f10926a = bundleI;
        this.f10927b = bundleI2;
        this.f10928c = u.f13522a;
        bundleI.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundleI2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundleI.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        bundleI2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        this.f10929d = "738896392656-0mnh9vjtba4b3bkvovg32tbmm8v14enn.apps.googleusercontent.com";
        this.f10930e = str;
    }
}
