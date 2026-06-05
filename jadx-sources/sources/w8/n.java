package w8;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzr;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18973b;

    public /* synthetic */ n(q qVar, int i10) {
        this.f18972a = qVar;
        this.f18973b = i10;
    }

    public final void a(zzr zzrVar) {
        q qVar = this.f18972a;
        int i10 = this.f18973b;
        try {
            if (qVar.B == null) {
                throw null;
            }
            qVar.B.zza(qVar.f18976z.getPackageName(), i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "QUERY_SKU_DETAILS_ASYNC" : "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new p(zzrVar));
        } catch (Exception e10) {
            qVar.z(107, 28, u.f18994r);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzrVar.zzb(0);
        }
    }
}
