package g6;

import ag.i;
import ak.v;
import androidx.lifecycle.c0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import r4.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7216a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7217b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7218c;

    public boolean a() {
        return this.f7217b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f7218c
            r4.e r0 = (r4.e) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.a()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            g6.b r5 = r4.f.f13717a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.a()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.b.b(java.lang.CharSequence, int):boolean");
    }

    public void c(zzlk zzlkVar) {
        if (this.f7217b) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((v) this.f7218c).D(new rb.a(zzlkVar, null));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    @Override // androidx.lifecycle.c0
    public void t(Object obj) {
        i iVar = (i) this.f7218c;
        iVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.f449b;
        signInHubActivity.setResult(signInHubActivity.U, signInHubActivity.V);
        signInHubActivity.finish();
        this.f7217b = true;
    }

    public String toString() {
        switch (this.f7216a) {
            case 0:
                return ((i) this.f7218c).toString();
            default:
                return super.toString();
        }
    }

    public b(e eVar, boolean z2) {
        this.f7216a = 1;
        this.f7216a = 1;
        this.f7218c = eVar;
        this.f7217b = z2;
    }

    public b(ld.d dVar, i iVar) {
        this.f7216a = 0;
        this.f7217b = false;
        this.f7218c = iVar;
    }

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f7216a = 2;
        this.f7218c = bottomSheetBehavior;
        this.f7217b = z2;
    }
}
