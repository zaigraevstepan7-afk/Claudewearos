package lb;

import android.content.Context;
import android.widget.Toast;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o3 extends fc.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fj.r f10551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10554d;

    public o3(fj.r rVar, Context context, f1.a1 a1Var, f1.a1 a1Var2) {
        this.f10551a = rVar;
        this.f10552b = context;
        this.f10553c = a1Var;
        this.f10554d = a1Var2;
    }

    @Override // fc.l
    public final void a() {
        boolean z2 = this.f10551a.f6803a;
        Context context = this.f10552b;
        if (!z2) {
            Toast.makeText(context, "You need to finish the rewarded ad to switch the graphic preset.", 0).show();
        }
        q3.J(context, this.f10553c, this.f10554d, true);
    }

    @Override // fc.l
    public final void b(fc.a aVar) {
        this.f10551a.f6803a = false;
        f1.a1 a1Var = this.f10554d;
        Context context = this.f10552b;
        q3.J(context, this.f10553c, a1Var, true);
        Toast.makeText(context, "Rewarded ad could not be shown right now.", 0).show();
    }
}
