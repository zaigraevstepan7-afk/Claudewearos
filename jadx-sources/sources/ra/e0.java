package ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lb.g f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ja.k f13979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib.g f13980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f13981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f13982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f13983f;

    public e0(lb.g gVar, ja.k kVar, ib.g gVar2, ej.a aVar, f1.a1 a1Var, f1.a1 a1Var2) {
        this.f13978a = gVar;
        this.f13979b = kVar;
        this.f13980c = gVar2;
        this.f13981d = aVar;
        this.f13982e = a1Var;
        this.f13983f = a1Var2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fj.l.f(context, "context");
        fj.l.f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            ej.a aVar = this.f13981d;
            ib.g gVar = this.f13980c;
            if (iHashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF") && gVar.f8428i) {
                    aVar.a();
                    return;
                }
                return;
            }
            if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON") && this.f13978a.f10289a.getBoolean("lock_screen_enabled", false) && this.f13979b.a()) {
                this.f13982e.setValue(Boolean.TRUE);
                b.m(this.f13983f, false);
                if (gVar.f8428i) {
                    aVar.a();
                }
            }
        }
    }
}
