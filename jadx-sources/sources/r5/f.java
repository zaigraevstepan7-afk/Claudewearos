package r5;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f13727a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13728b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f13729c;

    public /* synthetic */ f(Object obj) {
        this.f13728b = obj;
    }

    public boolean a() {
        Context context = (Context) this.f13728b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e10) {
            zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }
}
